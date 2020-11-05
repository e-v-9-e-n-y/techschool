import java.io.IOException;

public abstract class AccountService {
    public abstract Account getAccount(int accountId) throws IOException, UnknownAccountException;

    public abstract void setAccount(Account account);

    public abstract void init();

    // снять указанную сумму
    public void withdraw(int accountId, int amount) throws NotEnoughMoneyException, UnknownAccountException {
        try {
            Account account = getAccount(accountId);
            int balance = account.getAmount();
            if (balance < amount) {
                throw new NotEnoughMoneyException();
            } else {
                account.setAmount(balance - amount);
                setAccount(account);
            }
        } catch (IOException e) {
            throw new UnknownAccountException(e.getMessage());
        }
    }

    // запрос баланса
    public void balance(int accountId) throws UnknownAccountException {
        try {
            Account account = getAccount(accountId);
            System.out.println(account.getAmount());
        } catch (Exception e) {
            throw new UnknownAccountException(e.getMessage());
        }
    }

    // положить на счёт указанную сумму
    public void deposit(int accountId, int amount) throws NotEnoughMoneyException, UnknownAccountException {
        try {
            Account account = getAccount(accountId);
            int balance = account.getAmount();
            account.setAmount(balance + amount);
            setAccount(account);
        } catch (IOException e) {
            throw new UnknownAccountException(e.getMessage());
        }
    }

    // перевести указанную сумму
    public void transfer(int from, int to, int amount) throws NotEnoughMoneyException, UnknownAccountException {
        if (from == to) {
            System.out.println("Перевод само себе запрещён!");
        } else {
            try {
                Account accountFrom = getAccount(from);
                Account accountTo = getAccount(to);
                int balance = accountFrom.getAmount();
                if (balance < amount) {
                    throw new NotEnoughMoneyException();
                } else {
                    accountFrom.setAmount(balance - amount);
                    accountTo.setAmount(balance + amount);
                    setAccount(accountTo);
                    setAccount(accountFrom);
                }
            } catch (IOException e) {
                throw new UnknownAccountException(e.getMessage());
            }
        }
    }
}

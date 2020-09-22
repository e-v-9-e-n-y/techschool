import Common.ConsoleReader;

public class UserService {
    private AccountService accountService;

    public UserService(AccountService accountService) {
        this.accountService = accountService;
    }

    public void run() {
        while (true) {
            String cmd = ConsoleReader.ReadString("Input command");
            if (cmd.equals("exit")) {
                break;
            } else {
                try {
                    processCommand(cmd);
                } catch (UnknownAccountException e) {
                    e.printStackTrace();
                } catch (NotEnoughMoneyException e) {
                    e.printStackTrace();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private void processCommand(String cmd) throws UnknownAccountException, NotEnoughMoneyException {
        String[] arrStrings = cmd.split(" ");
        if (arrStrings.length == 0) {
            System.out.println("Неверный формат команды!");
        } else {
            switch (arrStrings[0]) {
                case ("balance"):
                    cmdBalance(arrStrings);
                    break;
                case ("withdraw"):
                    cmdWithdraw(arrStrings);
                    break;
                case ("deposite"):
                    cmdDeposite(arrStrings);
                    break;
                case ("transfer"):
                    cmdTransfer(arrStrings);
                    break;
                default:
                    System.out.println("Неизвествная команда '" + arrStrings[0] + "'");
                    break;
            }
        }
    }

    private void cmdBalance(String[] cmdStrings) throws UnknownAccountException {
        if (cmdStrings.length != 2) {
            System.out.println("Неверный формат команды!");
        } else {
            accountService.balance(Integer.valueOf(cmdStrings[1]));
        }
    }

    private void cmdWithdraw(String[] cmdStrings) throws UnknownAccountException, NotEnoughMoneyException {
        if (cmdStrings.length != 3) {
            System.out.println("Неверный формат команды!");
        } else {
            accountService.withdraw(Integer.valueOf(cmdStrings[1]), Integer.valueOf(cmdStrings[2]));
        }
    }

    private void cmdDeposite(String[] cmdStrings) throws UnknownAccountException, NotEnoughMoneyException {
        if (cmdStrings.length != 3) {
            System.out.println("Неверный формат команды!");
        } else {
            accountService.deposit(Integer.valueOf(cmdStrings[1]), Integer.valueOf(cmdStrings[2]));
        }
    }

    private void cmdTransfer(String[] cmdStrings) throws UnknownAccountException, NotEnoughMoneyException {
        if (cmdStrings.length != 4) {
            System.out.println("Неверный формат команды!");
        } else {
            accountService.transfer(Integer.valueOf(cmdStrings[1]), Integer.valueOf(cmdStrings[2]), Integer.valueOf(cmdStrings[3]));
        }
    }
}

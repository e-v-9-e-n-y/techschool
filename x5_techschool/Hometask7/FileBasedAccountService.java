import java.io.*;

public class FileBasedAccountService extends AccountService {
    private final String folderPath = "c://Dev//JAVA_DEBUG//Task7//";
    private final String fileExtencion = ".acf";

    public String accountToString(Account account) {
        return account.getId() + "|" + account.getHolder() + "|" + account.getAmount() + "|" + account.getDevisor();
    }

    public Account accountFromString(String accString) {
        String[] arr = accString.split("\\|");
        return new Account(Integer.valueOf(arr[0]), arr[1], Integer.valueOf(arr[2]), Integer.valueOf(arr[3]));
    }

    @Override
    public Account getAccount(int accountId) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(folderPath + accountId + fileExtencion))) {
            String str = reader.readLine();
            return accountFromString(str);
        } catch (IOException ex) {
            ex.printStackTrace();
            throw ex;
        }
    }

    @Override
    public void setAccount(Account account) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(folderPath + account.getId() + fileExtencion))) {
            writer.println(accountToString(account));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void init() {
        // определение наличия файлов-счетов
        File folder = new File(folderPath);
        File[] folderEntries = folder.listFiles();
        int cnt = 0;
        for (File entry : folderEntries) {
            if (entry.isDirectory() != true) {
                cnt += 1;
            }
        }

        if (cnt < 10) {
            // генерация счетов
            for (int i = cnt; i <= 10; i++) {
                Account acc = new Account(i, "Holder" + i, i*10, 1);
                setAccount(acc);
            }
        }
    }
}

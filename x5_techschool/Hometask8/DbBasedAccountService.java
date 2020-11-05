import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DbBasedAccountService extends AccountService {
    private Connection connection;
    private int devisor = 1;
    private final String sqlGetAccount = "SELECT * FROM ACCOUNTS WHERE ID=?";
    private final String sqlSetAccount = "UPDATE ACCOUNTS SET AMOUNT = ? WHERE ID = ?";
    private final String sqlCreateAccounts = "CREATE TABLE IF NOT EXISTS ACCOUNTS(ID INT PRIMARY KEY, NAME VARCHAR(255), AMOUNT INT);";
    private final String sqlGetAccountsCount = "SELECT COUNT(*) FROM ACCOUNTS";
    private final String sqlInsertAccount = "INSERT INTO ACCOUNTS VALUES (?, ?, ?);";

    public DbBasedAccountService(Connection connection) {
        this.connection = connection;
    }

    @Override
    public Account getAccount(int accountId) throws IOException, UnknownAccountException {
        try (PreparedStatement statement = connection.prepareStatement(sqlGetAccount);
        ) {
            statement.setInt(1, accountId);
            ResultSet resultSet = statement.executeQuery();
            if (!resultSet.next()) {
                throw new UnknownAccountException("Запрошенный аккаунт не нвйден[accountID = " + accountId + "]");
            } else {
                String holder = resultSet.getString(2);
                int amount = resultSet.getInt(3);
                Account resAccount = new Account(accountId, holder, amount, devisor);
                return resAccount;
            }
        } catch (SQLException | UnknownAccountException e) {
            e.printStackTrace();
            throw new UnknownAccountException("Ошибка получения аккаута[accountID = " + accountId + "]" + e.getMessage());
        }
    }

    @Override
    public void setAccount(Account account) {
        try (PreparedStatement statement = connection.prepareStatement(sqlSetAccount);
        ) {
            statement.setInt(1, account.getAmount());
            statement.setInt(2, account.getId());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void init() {
        try (PreparedStatement statement = connection.prepareStatement(sqlCreateAccounts);
        ) {
            statement.execute();
            try (PreparedStatement statement2 = connection.prepareStatement(sqlGetAccountsCount);
            ) {
                ResultSet resultSet = statement2.executeQuery();
                if (!resultSet.next()) {
                    return;
                } else {
                    int cnt = resultSet.getInt(1);
                    for (int i = cnt; i <= 11; i++) {
                        try (PreparedStatement statement3 = connection.prepareStatement(sqlInsertAccount);
                        ) {
                            statement3.setInt(1, i);
                            statement3.setString(2, "Holder" + i);
                            statement3.setInt(3, 100 + i * 10);
                            statement3.execute();
                        }
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
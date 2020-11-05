import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Task8 {
    public static void main(String[] args) throws SQLException {
        try {
            Class.forName("org.h2.Driver");

            try (
                    Connection connection = DriverManager.getConnection("jdbc:h2:.\\test");
            ) {
                AccountService accountService = new DbBasedAccountService(connection);
                accountService.init(); // проверка наличия счётов и их генерация при необходимости
                UserService userService = new UserService(accountService);
                userService.run();
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

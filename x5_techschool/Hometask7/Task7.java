public class Task7 {
    public static void main(String[] args) {
        AccountService accountService = new FileBasedAccountService();
        accountService.init(); // проверка наличия счётов и их генерация при необходимости
        UserService userService = new UserService(accountService);
        userService.run();
    }
}

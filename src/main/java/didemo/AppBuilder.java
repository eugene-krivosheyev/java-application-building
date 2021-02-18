package didemo;

import didemo.controller.AccountController;
import didemo.domain.Account;

public class AppBuilder {
    public static void main(String[] args) {
        //region Spring Core
//        final AccountController controller = new AccountController(
//                new SimpleAccountService(
//                        new RdbAccountRepository("jdbc:postgres://db")));
        //endregion

        final AccountController controllerFromSpring =
                new ApplicationContext("app-config.xml")
                        .getBean(AccountController.class);

        //region Spring MVC: HTTP
        while (true) {
            int accountRequested = readHttpRequestFromNet();
            Account accountFound = controller.getAccount(accountRequested);
            sendHttpResponseToNet(accountFound);
        }
        //endregion
    }

    private static void sendHttpResponseToNet(Account accountFound) {

    }

    private static int readHttpRequestFromNet() {
        return 0;
    }
}

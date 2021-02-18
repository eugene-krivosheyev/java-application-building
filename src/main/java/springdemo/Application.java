package springdemo;

import springdemo.controller.AccountController;
import springdemo.domain.Account;

public class Application {
    public static void main(String[] args) {
        final AccountController controller =

//                new AccountController(
//                        new FZ152AccountService(
//                                new RdbAccountRepository("jdbc:postres://loclhost/db")
//                        )
//                );

                new ApplicationContext("config.xml")
                        .getBean(AccountController.class);

        Account response = null;
        while (true) {
            String request = getRequestFromNet();

            switch (request) {
                case "find-by-id":
                    response = controller.findById(0);
                    break;
                case "find-all":
                    break;
            }

            sendResponseToNet(response);
        }
    }

    private static void sendResponseToNet(Account response) {

    }

    private static String getRequestFromNet() {
        return null;
    }
}

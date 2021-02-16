package didemo.controller;

import didemo.domain.Account;
import didemo.service.AccountService;

public class AccountController {
    private final AccountService accountService;

    /**
     * DI: constructor dependency injection
     *
     * @param accountService
     */
    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    public Account getAccount(int id) {
        if (id <= 0) throw new IllegalArgumentException("id!!!");

        return accountService.getAccountById(id);
    }
}

package didemo.service;

import didemo.dal.AccountRepository;
import didemo.domain.Account;

public class SimpleAccountService implements AccountService {
    private final AccountRepository accounts;

    public SimpleAccountService(AccountRepository accounts) {
        this.accounts = accounts;
    }

    @Override
    public Account getAccountById(int id) {
        //business logic
        return accounts.getAccountById(id);
        //business logic
    }
}

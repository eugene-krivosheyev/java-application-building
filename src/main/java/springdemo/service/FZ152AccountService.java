package springdemo.service;

import springdemo.dal.AccountRepository;
import springdemo.domain.Account;

@Component
public class FZ152AccountService implements AccountService {
    private final AccountRepository accounts;

    public FZ152AccountService(AccountRepository accounts) {
        this.accounts = accounts;
    }

    @Override
    public Account findById(int id) {
        return accounts.findById(id);
    }
}

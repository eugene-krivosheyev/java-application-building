package springdemo.service;

import springdemo.domain.Account;

public interface AccountService {
    Account findById(int id);
}

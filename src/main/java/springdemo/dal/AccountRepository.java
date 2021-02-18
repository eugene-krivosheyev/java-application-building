package springdemo.dal;

import springdemo.domain.Account;

public interface AccountRepository {
    Account findById(int id);
}

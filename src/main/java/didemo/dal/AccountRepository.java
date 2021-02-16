package didemo.dal;

import didemo.domain.Account;

public interface AccountRepository {
    Account getAccountById(int id);
}

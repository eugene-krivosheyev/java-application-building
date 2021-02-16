package didemo.dal;

import didemo.domain.Account;

public class RdbAccountRepository implements AccountRepository {
    private final String dbUrl;

    public RdbAccountRepository(String dbUrl) {
        this.dbUrl = dbUrl;
    }

    @Override
    public Account getAccountById(int id) {
        return null;
    }
}

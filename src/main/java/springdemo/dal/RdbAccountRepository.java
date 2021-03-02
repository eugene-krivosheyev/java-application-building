package springdemo.dal;

import springdemo.domain.Account;

public class RdbAccountRepository implements AccountRepository {
    private final String dburl;

    public RdbAccountRepository(String dburl) {
        this.dburl = dburl;
    }

    @Override
    public Account findById(int id) {
        return null;
    }
}

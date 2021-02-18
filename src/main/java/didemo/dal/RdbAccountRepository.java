package didemo.dal;

import didemo.domain.Account;
import didemo.service.Component;

@Component
public class RdbAccountRepository implements AccountRepository {
    @Value("db.url")
    private final String dbUrl;

    public RdbAccountRepository(String dbUrl) {
        this.dbUrl = dbUrl;
    }

    @Override
    public Account getAccountById(int id) {
        return null;
    }
}

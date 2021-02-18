package didemo.config;

import didemo.dal.RdbAccountRepository;
import didemo.service.Autowired;

@Configuration
public class Configuration {
    @Autowired
    RdbAccountRepository repo;

    public void setup(...security) {
        security.setProperty(...)
    }

    @Bean
    public RdbAccountRepository setupRepo() {
        repo.setProperty();
        return repo;
    }
}

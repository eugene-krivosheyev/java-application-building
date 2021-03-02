package springdemo.config;

import springdemo.service.AccountService;

@Configuration
public class AppConfig {
    @Autowired
    AccountService service;

    public setupSecurity(context) {
        context.setXXXX();
        context.setXXXX();
        context.setXXXX();
    }

    @Bean
    public AccountService setupService() {
        service.setXXXX();
        return service;
    }
}

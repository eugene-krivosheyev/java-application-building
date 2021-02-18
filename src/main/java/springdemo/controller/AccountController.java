package springdemo.controller;

import springdemo.domain.Account;
import springdemo.service.AccountService;

@Component
@Controller
@Service
@Repository
@RestController
public class AccountController {
    @Autowired
    private final AccountService accountService;

    @MockBean

    /**
     * DI: constructor, setter, field, method
     * @param dependency
     */
    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    public Account findById(int id) {
        if (id <= 0) throw new IllegalArgumentException("id!");

        return accountService.findById(id);
    }
}

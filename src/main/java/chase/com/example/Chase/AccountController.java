package chase.com.example.Chase;

import chase.com.example.Chase.AccountManagement;
import chase.com.example.Chase.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController

public class AccountController {
    @Autowired
    AccountService serviceBank = new AccountService();

    @RequestMapping("chase/account")
    public List<AccountManagement> getAllAccount(){
        return serviceBank.getAllAccount();

    }
    @RequestMapping("/chase/account/{id}")
    public AccountManagement getAmount(@PathVariable String id){
        return serviceBank.getAmount(id);

    }
    /*
    @RequestMapping(method = RequestMethod.POST,value="/chase/account/create")
    public String  createAccount(@RequestBody AccountManagement accountManagement) {
        return serviceBank.createAccount(accountManagement);
    }

    @RequestMapping(method = RequestMethod.PUT,value="/chase/account/update")
    public String addingMoneyAccount(@RequestBody AccountManagement accountManagement) {
        return serviceBank.addAmount(accountManagement);

    }

    @RequestMapping(method = RequestMethod.DELETE,value="/chase/account/delete")
    public String removeAccount(@RequestBody AccountManagement accountManagement) {

        return serviceBank.removeAccount(accountManagement);

    }

*/
}
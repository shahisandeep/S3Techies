package springbootpractice.example.classwork;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController

public class ChaseController {

    @Autowired
    ServiceBank serviceBank = new ServiceBank();


    @RequestMapping(method = RequestMethod.GET,value = "chase/account")
    public List<AccountManagement> getAllAccount(){
        return serviceBank.getAllAccount();

    }
    @RequestMapping(method = RequestMethod.GET,value="chase/account/{id}")
    public AccountManagement getAmount(@PathVariable("id") String id){
       return serviceBank.getAmount(id);

    }
    @RequestMapping(method = RequestMethod.POST,value="/chase/account/create")
    public String createAccount(@RequestBody AccountManagement accountManagement) {
    return serviceBank.createAccount(accountManagement);
    }

    @RequestMapping(method = RequestMethod.PUT,value="/chase/account/update")
    public AccountManagement addingMoneyAccount(@RequestBody AccountManagement accountManagement) {
        return serviceBank.addAmount(accountManagement);

    }

    @RequestMapping(method = RequestMethod.DELETE,value="/chase/account/delete")
    public String removeAccount(@RequestBody AccountManagement accountManagement) {

        return serviceBank.removeAccount(accountManagement);

    }

    @RequestMapping(method = RequestMethod.GET, value = "chase/account/transaction/{id}/{ids}")
    public Double transactionNo(@PathVariable("id") String id,@PathVariable("ids") int ids){
     return  serviceBank.transactionNumber(id,ids);


    }


}

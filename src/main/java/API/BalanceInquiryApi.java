package API;

import Config.CurrentBalanceProvider;
import Service.BalanceInquiryServiceDev;
import Service.BalanceInquiryServiceLocal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/CapitalOne")
public class BalanceInquiryApi {


    @Autowired
    Environment env;

    CurrentBalanceProvider balanceProviderDev  = new BalanceInquiryServiceDev();
    CurrentBalanceProvider balanceProviderLocal  = new BalanceInquiryServiceLocal();

    //get current balance without autowiring using if and else condition
    @GetMapping("/currentBalance")
    public int currentBalanceInterface(){
        if(env.getActiveProfiles().equals("local")){
            return balanceProviderLocal.getCurrentBalance();
        }
        else{
            return balanceProviderDev.getCurrentBalance();
        }
    }

    //get current balance without autowiring using ? statement
    @GetMapping("/currentBalance1")
    public int currentBalanceInterface1(){
        return env.getActiveProfiles().equals("local") ?
                balanceProviderLocal.getCurrentBalance() : balanceProviderDev.getCurrentBalance();
    }

    @Autowired
    CurrentBalanceProvider currentBalanceProvider;

    //get current balance with autowiring using spring
    @GetMapping("/currentBalance2")
    public int getBalanceSpring(){
        return currentBalanceProvider.getCurrentBalance();
    }
}

package s3.january.session.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import s3.january.session.config.BalanceProvider;
import s3.january.session.service.BalanceProviderInquiryServiceDev;
import s3.january.session.service.BalanceProviderInquiryServiceLocal;

@RestController
@RequestMapping("CITI/")
public class BalanceInquiryApi {

    BalanceProvider balanceProviderDev = new BalanceProviderInquiryServiceDev();
    BalanceProvider balanceProviderLocal = new BalanceProviderInquiryServiceLocal();

    @Autowired
    Environment env;

    @Autowired
    BalanceProvider balanceProvider;

    @GetMapping("/currentBalanceWithoutAutoWiringInterface")
    public int currentBalance() {
        return (env.getActiveProfiles().equals("local")) ? balanceProviderDev.getCurrentBalance() : balanceProviderLocal.getCurrentBalance();
    }

    @GetMapping("/currentBalanceWithAutoWiringInterface")
    public int currBalance() {
        if (env.getActiveProfiles().equals("local")) {
            return balanceProviderLocal.getCurrentBalance();
        } else {
            return balanceProviderDev.getCurrentBalance();
        }
    }
    @GetMapping("/currentBalanceWithAutoWiringInterfaceSpringy")
    public int currBalanceSpring() {
        return balanceProvider.getCurrentBalance();
    }
}

package s3.january.session.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import s3.january.session.service.BalanceInquiryService;

@RestController
@RequestMapping("CITI/")
public class BalanceInquiryApi {

    @Autowired
    BalanceInquiryService balanceInquiryService;

    @GetMapping("/currentBalance")
    public int currentBalance() {
        return balanceInquiryService.getCurrentBalance();
    }
}

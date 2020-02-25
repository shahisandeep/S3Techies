package s3.january.session.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import s3.january.session.config.CurrentBalance;

@Profile("local")
@Service
public class BalanceInquiryServiceLocal implements CurrentBalance {

    public int getCurrentBalance() {
        return 500;
    }

}

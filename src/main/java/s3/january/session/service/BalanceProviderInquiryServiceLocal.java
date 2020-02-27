package s3.january.session.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import s3.january.session.config.BalanceProvider;

@Profile("local")
@Service
public class BalanceProviderInquiryServiceLocal implements BalanceProvider {
    @Value("${savings.startingBalance}")
    private int startingBalance;

    public int getCurrentBalance() {
        return startingBalance;
    }
}

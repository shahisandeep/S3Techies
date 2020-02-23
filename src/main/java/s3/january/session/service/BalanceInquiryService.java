package s3.january.session.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class BalanceInquiryService {

    @Value("${savings.startingBalance}")
    private int balance;

    public int getCurrentBalance() {
        return balance;
    }
}

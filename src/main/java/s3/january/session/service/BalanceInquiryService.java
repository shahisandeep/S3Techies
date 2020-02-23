package s3.january.session.service;

import org.springframework.stereotype.Service;

@Service
public class BalanceInquiryService {

    private int currentBalance = 500;

    public int getCurrentBalance() {
        return currentBalance;
    }
}

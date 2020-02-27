package s3.january.session.config;

import org.springframework.stereotype.Component;

@Component
public interface BalanceProvider {
    int getCurrentBalance();
}

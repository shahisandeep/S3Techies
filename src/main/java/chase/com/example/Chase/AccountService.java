package chase.com.example.Chase;


import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class AccountService {


    private AccountRepository accountRepository;

List<AccountManagement> records = new ArrayList<>(Arrays.asList(new AccountManagement("1","Ishwar",500)));


    public List<AccountManagement> getAllAccount() {
        List<AccountManagement> records = new ArrayList<>();
        accountRepository.findAll().forEach(records::add);
        return records;

    }

    public AccountManagement getAmount(String id) {

        return accountRepository.findById(id).get();



    }
/*
    public String createAccount(AccountManagement accountManagement) {
    }

    public String addAmount(AccountManagement accountManagement) {
    }

 */

}




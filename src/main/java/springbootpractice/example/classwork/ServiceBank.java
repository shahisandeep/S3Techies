package springbootpractice.example.classwork;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class ServiceBank {

    String check = "";
    int i = 0;
    int j = 0;
    List<AccountManagement> records = new ArrayList<>();
    HashMap<String, ArrayList<Double>> idRecords = new HashMap<>();
    ArrayList<Double> amountRecords = new ArrayList<Double>();


    public Double transactionNumber(String id, int ids) {
        ArrayList<Double> amountRecords = new ArrayList<Double>();
        amountRecords = idRecords.get(id);
        System.out.println(amountRecords);
        Double amount = amountRecords.get(ids-1);
        return amount;

    }

    public AccountManagement getAmount(String id) {


        for (i = 0; i < records.size(); i++) {
            AccountManagement a = records.get(i);
            if (a.getAccountId().equals(id)) {
                j = i;
            }
        }

        return records.get(j);
    }


    public List<AccountManagement> getAllAccount() {
        return records;
    }

    public String createAccount(AccountManagement accountManagement) {
        ArrayList<Double> amountRecords = new ArrayList<Double>();
        int tracker=0;
        if (records.size()==0) {
            amountRecords.add(accountManagement.getTotalAmount());
            idRecords.put(accountManagement.getAccountId(), amountRecords);
            records.add(accountManagement);
            check = "Successfully Created Account";
        }
        else{{
            for (i = 0; i < records.size(); i++) {
                AccountManagement a = records.get(i);
                if (a.getAccountId().equals(accountManagement.getAccountId())){
                    tracker = 1;
                    System.out.println(tracker);
                    break;
                }
                }}
            if (tracker == 1){
                check = "Unsuccessful Account Id exists";

            }
            else{
                amountRecords.add(accountManagement.getTotalAmount());
                idRecords.put(accountManagement.getAccountId(), amountRecords);
                records.add(accountManagement);
                check = "Successfully Created Account";
            }}


        return check;


    }

    public AccountManagement addAmount(AccountManagement accountManagement) {

        j = 0;
        for (i = 0; i < records.size(); i++) {
            AccountManagement a = records.get(i);
            if (a.getAccountId().equals(accountManagement.getAccountId())) {
                amountRecords = idRecords.get(a.getAccountId());
                if (amountRecords.size() == 3) {
                    amountRecords.clear();
                    amountRecords.add(accountManagement.getTotalAmount());
                    idRecords.replace(accountManagement.getAccountId(), amountRecords);
                } else if (amountRecords.size() < 3) {
                    amountRecords.add(accountManagement.getTotalAmount());
                    idRecords.replace(accountManagement.getAccountId(), amountRecords);
                } else {
                }
                double amount = a.getTotalAmount() + accountManagement.getTotalAmount();
                records.set(i, new AccountManagement(accountManagement.getAccountId(), amount));
                j = i;
            }

        }
        System.out.println(idRecords);
        return records.get(j);
    }

    public String removeAccount(AccountManagement accountManagement) {

        for (i = 0; i < records.size(); i++) {
            AccountManagement a = records.get(i);
            if (a.getAccountId().equals(accountManagement.getAccountId())) {
                idRecords.remove(a.getAccountId());
                records.remove(i);
                check = "Successfully Removed AccountId " + a.getAccountId() + ".";
            } else {
                check = "Invalid Account Id";
            }
        }

        return check;
    }


}



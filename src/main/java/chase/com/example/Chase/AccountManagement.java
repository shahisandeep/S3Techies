package chase.com.example.Chase;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AccountManagement {
    @Id
    private String accountId;
    private String name;
    private double amount;


    public AccountManagement(String accountId, String name, double amount) {
        this.accountId = accountId;
        this.name = name;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}

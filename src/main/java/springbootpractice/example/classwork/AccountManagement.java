package springbootpractice.example.classwork;

public class AccountManagement  {
    private String accountId;
    private double totalAmount;


    public AccountManagement(String accountId, double totalAmount) {
        this.accountId = accountId;
        this.totalAmount = totalAmount;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }
}

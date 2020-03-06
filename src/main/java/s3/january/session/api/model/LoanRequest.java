package s3.january.session.api.model;


import java.util.List;

public class LoanRequest {

    public int getSsn() {
        return ssn;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastNamew() {
        return lastNamew;
    }

    public void setLastNamew(String lastNamew) {
        this.lastNamew = lastNamew;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    private int ssn;
    private String firstName;
    private String lastNamew;
    private int score;
    private double income;
    private String address;

    public List<String> getJob() {
        return job;
    }

    public void setJob(List<String> job) {
        this.job = job;
    }

    List<String> job;
}

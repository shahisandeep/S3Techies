package s3.january.session.api.model;


import lombok.Data;

import java.util.List;

@Data
public class LoanRequest {
    private int ssn;
    private String firstName;
    private String lastName;
    private int score;
    private double income;
    private String address;

}

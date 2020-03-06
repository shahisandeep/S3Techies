package s3.january.session.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import s3.january.session.api.model.LoanRequest;
import s3.january.session.service.BalanceInquiryService;
import java.io.IOException;

@RestController
@RequestMapping("CITI/")
public class BalanceInquiryApi {

    @Autowired
    BalanceInquiryService balanceInquiryService;

    @GetMapping("/currentBalance")
    public int currentBalance() {
        return balanceInquiryService.getCurrentBalance();
    }



    @PostMapping("/fileUpload")
    public ResponseEntity<LoanRequest > fileUpload(@RequestParam("file") MultipartFile file) throws IOException {

        /*
        Things to do:

        Uploaded the file = file
        if you want to read the file, you need some objects to read e.g input stream

        google: how to read multipart file and return it

         */
        String s = "sss";
        //InputStream inputStream = new FileInputStream(file.getInputStream());
        //10,20, 20, 20, 20
        LoanRequest loanRequest = new LoanRequest();

        loanRequest.setFirstName("Bikesh");
        loanRequest.setLastNamew("shrestha");
        loanRequest.setAddress("irving");
        loanRequest.setIncome(2000);
        loanRequest.setScore(750);
        loanRequest.setSsn(12345);

        return new ResponseEntity< LoanRequest >(loanRequest, HttpStatus.OK);

    }
}

package s3.january.session.api;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import s3.january.session.api.model.LoanRequest;
import s3.january.session.service.BalanceInquiryService;

import java.io.IOError;
import java.io.IOException;
import java.io.InputStream;
import java.util.Base64;

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
    public ResponseEntity<byte[]> fileUpload(@RequestParam("file") MultipartFile file) throws IOException {
        InputStream in = file.getInputStream();
        byte[] bytes = (IOUtils.toByteArray(in));
        LoanRequest loanRequest = new LoanRequest();
        loanRequest.setFirstName("Bikesh");
        loanRequest.setAddress("irving");
        loanRequest.setIncome(2000);
        loanRequest.setScore(750);
        loanRequest.setSsn(12345);
        return new ResponseEntity<>(bytes, HttpStatus.OK);
    }

    @Scheduled(cron = "0/3 * * 1/1 * *")
    public void scheduleFixedRateTask() {
        System.out.println(
                "Fixed rate task - " + System.currentTimeMillis() / 1000);
    }


}

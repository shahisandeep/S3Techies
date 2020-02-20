package com.example.banking;


        import org.springframework.web.bind.annotation.*;

        import java.lang.reflect.Method;
        import java.util.ArrayList;

@RestController
@RequestMapping("/chasebank")
public class Checking {
    public int currentAmount = 500;

    @GetMapping("/currentAmount")
    public int checkingAmount() {
        return currentAmount;
    }

    @RequestMapping(method = RequestMethod.POST, value = "/totalAmount")
    public int add(@RequestBody DepositAmounts depositAmounts) {
        int totalAmount = currentAmount + depositAmounts.getFirstDeposit() + depositAmounts.getSecondDeposit() + depositAmounts.getThirdDeposit();
        {
            if (totalAmount <= 2000) {
                return totalAmount;
            } else {
                return currentAmount;
            }
        }
    }
}

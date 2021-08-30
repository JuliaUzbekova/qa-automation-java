package com.tinkoff.edu.test;

import com.tinkoff.edu.app.*;


/**
 * Loan Calc Tests
 */

public class LoanCalcTest {
    public static void main(String... args) {
        LoanRequest request = new LoanRequest(10, 1000);
        LoanCalcController loanCalcController = new LoanCalcController(new SaverLoanCalcService(new StaticVariableLoanCalcRepository()));

        LoanResponse response = loanCalcController.createRequest(request);


        System.out.println(response.getRequestId() + " must be 1");
        System.out.println(response.getRequest());
        System.out.println(response.getDecision());
    }
}

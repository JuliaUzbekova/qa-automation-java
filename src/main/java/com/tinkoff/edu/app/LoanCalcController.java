package com.tinkoff.edu.app;

public class LoanCalcController {
    private LoanCalcService loanCalcService;


    public LoanCalcController(LoanCalcService loanCalcService) {

        this.loanCalcService = loanCalcService;
    }

    /**
     * TODO Validates and logs request
     *
     * @return
     */


    public LoanResponse createRequest(LoanRequest request) {
        return loanCalcService.createRequest(request);
    }
}

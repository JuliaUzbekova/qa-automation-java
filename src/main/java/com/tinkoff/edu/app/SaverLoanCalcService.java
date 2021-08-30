package com.tinkoff.edu.app;

public class SaverLoanCalcService implements LoanCalcService {
    private final LoanCalcRepository repo;

    /**
     * Constructor DI
     * @param repo
     */
    public SaverLoanCalcService(LoanCalcRepository repo) {
        this.repo = repo;
    }

    /**
     * Loan calculation
     *
     * @return
     */

    @Override
    public LoanResponse createRequest(LoanRequest request) {

        int requestId = repo.save(request);

        return new LoanResponse(requestId, request, ResponseType.APPROVE);
    }
}

package com.tinkoff.edu.app;

/**
 * Class,Type -> objects, instances
 */
public class LoanResponse {
    private int requestId;
    private LoanRequest request;
    private final ResponseType decision;


    public LoanResponse(int requestId, LoanRequest request, ResponseType decision) {
        this.requestId = requestId;
        this.request = request;
        this.decision = decision;
    }

    public int getRequestId() {
        return requestId;
    }

    public LoanRequest getRequest() {
        return request;
    }
    public ResponseType getDecision() {
        return decision;
    }
}

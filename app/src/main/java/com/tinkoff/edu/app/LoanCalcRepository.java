package com.tinkoff.edu.app;

public class LoanCalcRepository {
    private static int requestId = 0;

    /**
     * TODO persists request
     * @return Request Id
     */
    public static int save() {
        return ++requestId;
    }
}

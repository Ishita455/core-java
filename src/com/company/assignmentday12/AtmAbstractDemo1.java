package com.company.assignmentday12;

public abstract class AtmAbstractDemo1 {
    int accountNo;
    float bal_Amt = 2345345.45f;
    String name;
    int transferAmt;

    public void balanceInquiry(){
        System.out.println("Account Balance Available: "+(bal_Amt-transferAmt));
    }
    public abstract void fundTransfer();
}

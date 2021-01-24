package com.company.assignmentday12;

import java.util.Scanner;

public class AtmFundTransfer extends AtmAbstractDemo1 {


    @Override
    public void fundTransfer() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Account of the other person: ");
        scanner.nextInt(accountNo);
        System.out.println("Enter Transfer Amount ");
        scanner.nextInt(transferAmt);
    }
}


package com.glearning.service;

public class TransactionService {

    public void checkTransactionTarget(int[] array, int target) {
        /*
         * write a for loop looping through the array
         */
        int totalCount = 0;
        boolean flag = false;
        for (int i = 0; i < array.length; i++) {
            // count the value of transaction using a temp variable
            totalCount = totalCount + array[i];
            // check if the value of totalcount has exceeded the target value
            if (totalCount > target) {
                // has met the target value.
                // the target value is achieved after i+1 value
                System.out
                        .println("Target value achieved after " + (i+1) + " transactions");
                flag = true;
                break;
            }
        }
        if(!flag) {
            System.out.println("Target value not achieved");
        }

    }

    public void checkTransactionTarget2(int[] array, int target) {
        /*
         * write a for loop looping through the array
         */
        long totalCount = 0;
        for (long i = 0; i < array.length; i++) {
            // count the value of transaction using a temp variable
            totalCount = totalCount + array[(int) i];
            // check if the value of totalcount has exceeded the target value
            if (totalCount < target) {
                continue;
            }
            System.out.println("Target value is  achieved after " + (i + 1) + " transactions");

        }
    }

}


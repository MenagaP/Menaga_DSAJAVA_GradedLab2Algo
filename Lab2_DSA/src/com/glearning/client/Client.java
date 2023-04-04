package com.glearning.client;
import com.glearning.service.TransactionService;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) {
        TransactionService obj = new TransactionService();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = sc.nextInt();
        int array[] = new int[size];
        System.out.println("Enter elements of array");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("Enter the total number of targets to be achieved");
        int target = sc.nextInt();
        for (int i = 0; i < target; i++) {
            System.out.println("Enter the value of the target");
            int value = sc.nextInt();
            obj.checkTransactionTarget(array, value);
        }

    }
}


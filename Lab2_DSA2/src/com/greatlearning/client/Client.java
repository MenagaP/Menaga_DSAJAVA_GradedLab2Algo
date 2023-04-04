package com.greatlearning.client;
import com.greatlearning.service.CurrencyService;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        CurrencyService obj = new CurrencyService();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the currency denominations");
        int size = sc.nextInt();
        int array[] = new int[size];
        System.out.println("Enter the currency denominations value");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("Enter the amount you want to pay");
        int amount = sc.nextInt();
        obj.denominatorService(array, amount);
    }
}

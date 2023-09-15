package com.DSA.HashMap;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class ObjectHashMap {
    public static void main(String[] args) {
        // Create a LinkedHashMap with String keys and Payloaddetails values
        LinkedHashMap<String, Payloaddetails> linkHashMap = new LinkedHashMap<>();

        // Create Payloaddetails objects
        Payloaddetails payload1 = new Payloaddetails("001", "Saving", "Amol Appa Harde");
        Payloaddetails payload2 = new Payloaddetails("002", "Saving", "Ruturaj Bharat Gidde");
        Payloaddetails payload3=new Payloaddetails("003", "Current", "Anemoi Software LLP");

        // Add Payloaddetails objects to the LinkedHashMap
        linkHashMap.put("Amol", payload1);
        linkHashMap.put("Ruturaj", payload2);
        linkHashMap.put("Anemoi", payload3);

        Scanner sc = new Scanner(System.in);
        String keyName;

        do {
            System.out.println("Enter a key (or 'exit' to quit):");
            keyName = sc.next();

            if (!keyName.equalsIgnoreCase("exit")) {
                Payloaddetails retrievedPayload = linkHashMap.get(keyName);

                if (retrievedPayload != null) {
                    System.out.println("Account Number: " + retrievedPayload.getAccountNumber());
                    System.out.println("Account Type: " + retrievedPayload.getAccountType());
                    System.out.println("Account Holder: " + retrievedPayload.getAccountHolder());
                } else {
                    System.out.println("Key not found.");
                }
            }
        } while (!keyName.equalsIgnoreCase("exit"));

        // Close the scanner
        sc.close();
    }
}

class Payloaddetails {
    private String accountNumber;
    private String accountType;
    private String accountHolder;

    public Payloaddetails(String accountNumber, String accountType, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.accountHolder = accountHolder;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    public String getAccountHolder() {
        return accountHolder;
    }
}

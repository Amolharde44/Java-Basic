package com.DSA;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regrex {
    public static void main(String[] args) {
        String input = "INR2345.00";
        
        // Define a regex pattern to match numeric values
        Pattern pattern = Pattern.compile("\\d+(?:[,.]\\d+)*");
        
        // Create a Matcher object
        Matcher matcher = pattern.matcher(input);
        
        // Find and print the numeric value(s)
        while (matcher.find()) {
            String numericValue = matcher.group();
            System.out.println("Numeric Value: " + numericValue);
        }
    }
}

/*
 *  UCF COP3330 Fall 2021 Assignment 11 Solution
 *  Copyright Melanie Ehrlich
 */

package org.example;
import java.util.*;

public class App {
    public static void main(String[] args) {
        float amtEuros, conversion;
        double dollars;

        Scanner s = new Scanner(System.in);
        System.out.print("How many euros are you exchanging?");
        amtEuros = s.nextFloat();

        System.out.print("What is the exchange rate?");
        conversion = s.nextFloat();
        dollars = Math.round((amtEuros * conversion) * 100.0) / 100.0;

        System.out.print(amtEuros + " euros at an exchange rate of " + conversion + " is\n" + dollars + " U.S. dollars.");
    }
}
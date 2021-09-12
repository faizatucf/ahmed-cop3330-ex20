/*
 *  UCF COP3330 Fall 2021 Assignment 20 Solution
 *  Copyright 2021 Faiz Ahmed
 */

import java.util.*;
public class multistatetax {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int amount; 
        String county, state, output = "";
        double subtotal, tax=0, total;
        System.out.println("What is the order amount?");
        amount = sc.nextInt();
        sc.nextLine();
        System.out.println("What is the state?");
        state = sc.nextLine();
        System.out.println("What is the county?");
        county = sc.nextLine();
        subtotal = amount;
        if(state.toLowerCase().equals("wisconsin") && county.toLowerCase().equals("eau claire"))
        tax = ((5.0/100.0) * subtotal) + 0.005;
        else if(state.toLowerCase().equals("wisconsin") && county.toLowerCase().equals("dunn"))
        tax = ((5.0/100.0) * subtotal) + 0.004;
        else if(state.toLowerCase().equals("illinois"))
        tax = (8.0/100.0) * subtotal;
        else if(state.equals("wisconsin"))
        tax = (5.0/100.0) * subtotal;
        total = subtotal +(tax);
        if (tax != 0)
        output = String.format("\nThe tax is $%.2f.\nThe total is $%.2f.",tax,total);
        else
        output = String.format("\nThe total is $%.2f.",total);
        System.out.println(output);
    }
}
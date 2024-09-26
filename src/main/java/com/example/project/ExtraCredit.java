package com.example.project;
import java.util.Scanner;
public class ExtraCredit {

    public static String calculateTip(int people, int percent, double cost, String items) {
        StringBuilder result = new StringBuilder();

        double percentageDecimal = ((double)percent / 100); // calculating the decimal value of the percent
        double tip = cost * percentageDecimal; // calculating the tip for the cost
        double costWithTip = cost + tip; // adding the two to get the total cost

        double costPerPerson = cost / people; // calculate the cost per person WITHOUT tip
        double tipPerPerson = tip / people; // calculate the tip per person
        double totalPerPerson = costWithTip / people; // calculate the total with the tip per person

        // i learned how to format the decimal from Tyler Walters
        result.append("-------------------------------\n");
        result.append("Total bill before tip: ").append("$"+String.format("%.2f", cost)).append("\n"); //concatenate to this string. DO NOT ERASE AND REWRITE
        result.append("Total percentage: ").append(percent + "%").append("\n");
        result.append("Total tip: ").append("$" + String.format("%.2f", tip)).append("\n");
        result.append("Total Bill with tip: ").append("$" + String.format("%.2f", costWithTip)).append("\n");
        result.append("Per person cost before tip: ").append("$" + String.format("%.2f", costPerPerson)).append("\n");
        result.append("Tip per person: ").append("$" + String.format("%.2f", tipPerPerson)).append("\n");
        result.append("Total cost per person: ").append("$" + String.format("%.2f", totalPerPerson)).append("\n");
        result.append("-------------------------------\n");

        //the two lines  should go below result.append("-------------------------------\n"); 
        result.append("Items ordered:\n").append(items);
        return result.toString();

        } 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 
        StringBuilder items = new StringBuilder(); // allows for multiple strings to go into one variable
        String input;
        
        while (true) {
            System.out.print("Enter an item name of type -1 to finish: "); // prompts the user
            input = scan.nextLine(); 
            if (input.equals("-1")) { //if the user inputs -1, the loop breaks and the receipt prints
                break;
            } else {
                items.append(input).append("\n"); //appends the items the user inputted to the receipt
            }
            
        //test code
        int people = 6;
        int percent = 25;
        double cost = 52.27;
        System.out.println(calculateTip(people,percent,cost, items.toString()));
        scan.close();
        }
    }
}
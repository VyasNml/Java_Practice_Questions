/*
 * Question - 04
Check Eligibility for Premium Membership

Problem Statement:
A company offers premium membership to customers based on 
the following criteria:

The customer must be at least 18 years old.
Their monthly income should be greater than or equal to ₹30,000.
They should not have any pending dues.
Write a program that uses relational, logical, and ternary 
operators to check if a customer is eligible for premium 
membership. Use appropriate keywords, identifiers, and 
access modifiers for the program.

Requirements:
Take the following inputs from the user:
Age (integer)
Monthly Income (double)
Pending Dues (boolean: true if there are dues, otherwise false)
Use a ternary operator to determine and display the 
 customer's eligibility status.
Ensure proper handling of variable declarations, data types,
 and access modifiers.

Input:
Enter your age: 25
Enter your monthly income: 40000
Do you have pending dues (true/false): false

Output:
You are eligible for premium membership.
 */
import java.util.*;

public class S4_C4_E4_premium_member_check {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int age,income;
        boolean b;

        System.out.println("Enter your age: ");
        age = sc.nextInt();
        System.out.println("Enter your monthly income: ");
        income = sc.nextInt();
        System.out.println("Do you have pending dues(true/false): ");
        b = sc.nextBoolean();
        sc.close();

        if(age>18 && income>=30000 && b==false){
            System.out.println("You are eligible for premium membership.");
        }else{
            System.out.println("You are Not eligible for premium membership.");
        }


    }
}

/*
 * Question - 03
A retail store offers discounts on the total amount of items 
in a shopping cart based on specific conditions. You need 
to write a program that calculates the final amount a 
customer needs to pay after applying a discount. Use 
primitive data types, type conversion, and conditional 
statements to solve the problem.

Conditions:
~If the total cart amount is greater than ₹5000, 
 apply a 20% discount.

~If the total cart amount is between ₹3000 and ₹5000
 (inclusive), apply a 10% discount.

 ~If the total cart amount is less than ₹3000, no discount 
is applied.

The program should:

Accept the total cart amount as input from the user (use 
primitive data types).
Calculate the discount and the final amount to be paid.
Use appropriate operators (e.g., arithmetic, relational, 
and ternary).
Display the discount and final amount in a user-friendly 
format.

Input: Enter the total cart amount: 4500
output:
Discount: ₹450.0
Final Amount: ₹4050.0
 */
import java.util.*;


public class S4_C3_E3_store_discount_calc {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total cart amount: ");
        double dis,t_amt = (double)(sc.nextInt());
        sc.close();

        if(t_amt > 5000){
            t_amt = t_amt*0.8;
            dis = t_amt*0.2;
        }else if(t_amt>3000){
            t_amt = t_amt*0.9;
            dis = t_amt*0.1;
        }else{
            dis = 0;
        }
        System.out.printf("Discount: ₹%.1f\n",dis);
        System.out.printf("Final Amount: ₹%.1f",t_amt);
    }
}

// ###Question - 02###

// Write a Java program to demonstrate the use of primitive 
// data types and type conversion. The program should:

// Declare and initialize variables of different primitive
//  data types (int, double, char, and boolean).
// Perform type conversion by converting an int to a double 
// and a char to an int.
// Print the values of all variables before and after the 
// conversions.


public class S4_C2_E2_basic_type_conversion {
    public static void main(){
        //declaration
        int i;
        double d;
        char c;
        boolean b;

        //int to double
        i = 15;
        System.out.println("Before (int): "+i);
        d = (int) i;
        System.out.println("After (double): "+d);

        //char to int
        c = '4';
        System.out.println("Before (char): "+c);
        i = (int) c;
        System.out.println("After (int): "+i);
        
        

    }
    
};

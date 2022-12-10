//Kareena
//19105112
/*
Question 2 For addition and subtraction, two numbers should be positive. If any
negative number is entered then throw an exception in respective
methods. So design an exception handler (ArithmeticException) in Add ()
and Subtract () methods respectively to check whether any number is
negative or not. */
import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first Integer: ");
        int operand_1 = sc.nextInt();
        System.out.println("Enter second integer: ");
        int operand_2 = sc.nextInt();
        sc.close();
        try{
            int result = addInt(operand_1, operand_2);
            System.out.println("Result: " + result);
        }catch(ArithmeticException e){
            System.out.println(e);
        }
 
        try{
            int result = subtractInt(operand_1, operand_2);
            System.out.println("Result: " + result);
        }catch(ArithmeticException e){
            System.out.println(e);
        }
    }
    public static int addInt(int i, int j){
        if(i<0 || j<0){
            throw new ArithmeticException("Negative Input Entered");
        }
        return i+j;
    }
    public static int subtractInt(int i, int j){
        if(i<0 || j<0){
            throw new ArithmeticException("Negative Input Entered");
        }
        return i-j;
    }
}
        
 
    

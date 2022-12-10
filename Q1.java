//Kareena
//19105112
/*
Question1: For division and multiplication two numbers should not be zero. If zero is
entered for any number then throw an exception in respective methods.
So design an exception handler (ArithmeticException) in multiply () and
Division () methods respectively to check whether any number is zero or
not. */
import java.util.Scanner;
class Q1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        int first_operand = sc.nextInt();
        System.out.println("Enter Second Number: ");
        int second_operand = sc.nextInt();
        sc.close();
        try{
            int result = divideInt(first_operand, second_operand);
            System.out.println("Result : " + result);
        }catch(ArithmeticException e){
            System.out.println(e);
        }

        try{
            int result = multiplyInt(first_operand, second_operand);
            System.out.println("Result: " + result);
        }catch(ArithmeticException e){
            System.out.println(e);
        }

    }
    public static int divideInt(int i, int j){
        if(i==0 || j==0){
            throw new ArithmeticException("Input cannot be zero");
        }
        return i/j;
    }
    public static int multiplyInt(int i, int j){
        if(i==0 || j==0){
            throw new ArithmeticException("Input cannot be zero");
        }
        return i*j;
    }
}
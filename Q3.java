//Kareena
//19105112
/*
 Question 3 Write a main class and declare four objects of Calculator class. Perform
addition (obj1), subtraction (obj2), multiply (obj3) and division (obj4)
operations for these objects. If any non integer values are provided as
input; then you should throw an exception (NumberFormatException)
and display a message that informs the user of the wrong input.
 */

class Calculator{

    private int solution; 
    private static int i; 
    private static int j; 

    public Calculator(int i, int j) 
    { 
        this.i = i;
        this.j = j;
        solution = 0;  
    } 

    public int get_i() {
        return i;
    }

    public int get_j() {
        return j;
    }

    public int add(){
        return get_i() + get_j();
    }

    public int subtract(){
        return get_i() - get_j();
    }

    public int multiply(){
        return get_i() * get_j();
    }

    public int divide(){
        return get_i() / get_j();
    }
}
    


public class Q3 {
    public static void main(String args[]){
        try {
            int first_operand = 5;
            int second_operand = 8;
            Calculator obj1=new Calculator(first_operand, second_operand);
            System.out.println("Addition is :: " + obj1.add());
            Calculator obj2=new Calculator(first_operand, second_operand);
            System.out.println("Subtraction is :: "+obj2.subtract());

            Calculator obj3=new Calculator(first_operand, second_operand);
            System.out.println("Multiplication is :: "+obj3.multiply());
            Calculator obj4=new Calculator(first_operand, second_operand);
            System.out.println("Division is :: "+obj4.divide());


        }
        catch (NumberFormatException ne)
        {
            System.out.println(ne.getMessage());
        }

    }
    
}

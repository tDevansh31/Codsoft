import java.util.Scanner;    //importing scanner class to take input from user
public class Main {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Select the given operators = + , - , / , * ");
         String Operators = sc.next();
        System.out.println("enter your first number");
         int Firstnumber = sc.nextInt();
        System.out.println("enter the second number");
         int Secondnumber = sc.nextInt();

         if (Operators.equals("+") ) {              // using if else for conditions calcutions
             double result = Firstnumber + Secondnumber;
             System.out.println(result);
         }
         else if (Operators.equals("-")){
             double result = Firstnumber-Secondnumber;
                 System.out.println(result);
         }
         else if (Operators.equals("*")){
             double result = Firstnumber*Secondnumber;
             System.out.println(result);
         }
         else if (Operators.equals("/")){
             float result = Firstnumber/Secondnumber;
             System.out.println(result);
         }
         else {
             System.out.println("this is invalid");
         }

    }
}
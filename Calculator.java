import java.util.IllformedLocaleException;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        try{
        
        System.out.println("Enter first number: ");
        double num1 = s.nextDouble();
        System.out.println("Enter second number: ");
        double num2 = s.nextDouble();
        s.nextLine();
        System.out.println("Enter the operation(+,-,*,/): ");
        String c = s.nextLine();

        double result;

        switch (c) { 
            case "+": result = num1 + num2; 
            break;

            case "-": result = num1 - num2; 
            break; 

            case "*": result = num1 * num2; 
            break; 

            case "/": 
            if(num2==0)
                throw new ArithmeticException("Cannot divide by zero");
            result = num1 / num2; 
            break; 

            default:
                throw new IllegalArgumentException("Invalid operator");


            }

            System.out.println("Result: "+result);

        }catch(NumberFormatException e){
            System.out.println("NumberFormatException: "+e);
        }
        
        catch(ArithmeticException e){
            System.out.println(e);
        }

        catch(IllegalArgumentException e){
            System.out.println(e);
        }finally{

        s.close();}



    }    

}    
  

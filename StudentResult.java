import java.nio.InvalidMarkException;
import java.util.Scanner;

class InvalidMarksException extends Exception{

    public InvalidMarksException(String message){
        super(message);
    }
}




public class StudentResult {
    public static void main(String[] args) {

        try{


        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of subjects: ");
        int n = s.nextInt();

        int total = 0;

        for(int i=1; i<=n; i++){

            
            System.out.println("enter marks for subject "+i+": ");
            int marks = s.nextInt();

            if(marks<0 || marks>100){
                throw new InvalidMarksException("Invalid marks! marks must be between 0 and 100");
            }

            total += marks;
        }

        System.out.println("Total: "+total);

        double percentage = ( (double) total/n);
        System.out.println("Percentage: "+percentage);

        

        if (percentage >= 90){
           System.out.println("A");
        }else if(percentage >=80){
            System.out.println("B");
        }else if(percentage >=70){
            System.out.println("C");
        }else if(percentage >=60){
            System.out.println("D");
        }else{
            System.out.println("F");
        }
        
        }catch(InvalidMarkException e){
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println(e);
        }

    }

    
}

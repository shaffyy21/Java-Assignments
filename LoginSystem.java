import java.util.Scanner;

class InvalidUsernameException extends Exception{
    public InvalidUsernameException(String message){
        super(message);
    }
}

class InvalidPasswordException extends Exception{
    public InvalidPasswordException(String message){
        super(message);
    }
}

class AccountLockedException extends Exception{
    public AccountLockedException(String message){
        super(message);
    }
}


public class LoginSystem {
    public static void main(String[] args) throws InvalidUsernameException, InvalidPasswordException {
        Scanner s = new Scanner(System.in);

        int count = 0;
        
        try{

            while(count < 5){
                try{
            System.out.println("Enter your username: ");
            String name = s.nextLine();

            if(name.length() > 20){
                throw new InvalidUsernameException("username is invalid!!");

            }

            System.out.println("Enter password: ");
            String password = s.nextLine();

            if(!password.equals("cslab768")){
                throw new InvalidPasswordException("Invalid passsword!!");
            }
            System.out.println("Login successful!!");
            break;

            
        }catch(InvalidUsernameException e){
            count++;
            System.out.println(e);
            System.out.println("Attempts left: " + (5 - count));
        }
        catch(InvalidPasswordException e){
            count++;
            System.out.println(e);
            System.out.println("Attempts left: " + (5 - count));
        }
        
        if (count==5){
            throw new AccountLockedException("Too many failed attempts!!account is locked");
        }

    }  


    }catch(AccountLockedException e){
         System.out.println(e);
    }
    }
}

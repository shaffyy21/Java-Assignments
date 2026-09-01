import java.util.Scanner;


class AccountNotFoundException extends Exception {
    public AccountNotFoundException(String message) {
        super(message);
    }
}

class InvalidAmountException extends Exception{
    public InvalidAmountException(String message){
        super(message);
    }
}

class InsufficientBalanceException extends Exception{
    public InsufficientBalanceException(String message){
        super(message);
    }
}

public class BankTranscation {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        try {

            System.out.println("Enter valid account number: ");
            int account = s.nextInt();

            if(account <0 || account > 200){
                throw new AccountNotFoundException("Account not found");
            }
            System.out.println("Enter your account Balance: ");
            Double balance = s.nextDouble();
          
            System.out.println("Enter amount to be deposited: ");
            Double deposit = s.nextDouble();

            if(deposit<=0 ){
                throw new InvalidAmountException("Invalid amount!!");
            }

             balance += deposit;


            System.out.println("Enter amount to be withdraw: ");
            Double withdraw = s.nextDouble();

            
            if(withdraw<=0 ){
                throw new InvalidAmountException("Invalid amount!!");
            }

            if(balance < withdraw){
                throw new InsufficientBalanceException("Insufficient Balance");
            }

           balance -= withdraw;

            System.out.println("FINAL BALANCE: "+balance);

        }catch (AccountNotFoundException e) {
            System.out.println(e);
        }
        catch( InvalidAmountException e){
            System.out.println(e);
        }
        catch(InsufficientBalanceException e){
            System.out.println(e);
        }
        
    }
    
}

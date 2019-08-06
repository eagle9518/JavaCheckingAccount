import java.util.Scanner;
public class Bank {
    public static void main(String[] args) {
        Login();
        actionsOFBank();
    }
        private static void Login() {
            String Username;
            String Password;

            Password = "SuperFastFlyingBirdForce";
            Username = "eagleForce";

            Scanner input1 = new Scanner(System.in);
            System.out.println("Enter Username : ");
            String username = input1.next();

            Scanner input2 = new Scanner(System.in);
            System.out.println("Enter Password : ");
            String password = input2.next();

            if (username.equals(Username) && password.equals(Password)) {

                System.out.println("Access Granted! Welcome!");
            } else if (username.equals(Username)) {
                System.out.println("Invalid Password!");
            } else if (password.equals(Password)) {
                System.out.println("Invalid Username!");
            } else {
                System.out.println("Invalid Username & Password!");
            }
        }
        private static void actionsOFBank() {
            System.out.println("Would you like to deposit, withdraw, transfer, or check your balance\nYes or No");
            Scanner scanner = new Scanner(System.in);
            String val = scanner.next();
            if (val.equalsIgnoreCase("y") || val.equalsIgnoreCase("Yes")) {
            } else if (val.equalsIgnoreCase("n") || val.equalsIgnoreCase("No")) {
                System.out.println("Okay, thank you for coming to Logan's Bank");
                System.exit(0);
            } else {
                System.err.println("Invalid Response please try again");
                actionsOFBank();
            }
            System.out.println("What would you like to do");
            scanner = new Scanner(System.in);
            val = scanner.next();
            if (val.equalsIgnoreCase("d") || val.equalsIgnoreCase("Deposit")) {
                System.out.println("How much would you like to deposit");
                double amountDeposited = scanner.nextDouble();
                System.out.println("Amount Deposited $" + amountDeposited);
                System.out.println("Anything else?");
                actionsOFBank();

            } else if (val.equalsIgnoreCase("w") || val.equalsIgnoreCase("Withdraw")) {
                System.out.println("How much would you like to withdraw");
                double amountWithdrawn = scanner.nextDouble();
                System.out.println("Amount Withdrawn $" + amountWithdrawn);
                System.out.println("Anything else?");
                actionsOFBank();

            } else if (val.equalsIgnoreCase("t") || val.equalsIgnoreCase("Transfer")) {
                System.out.println("How much would you like to transfer");
                double amountTransferred = scanner.nextDouble();
                System.out.println("Amount Transferred $" + amountTransferred);
                System.out.println("Anything else?");
                actionsOFBank();
            } else {
                System.err.println("Invalid Response please try again");
                actionsOFBank();
            }
        }
    }





   /*
   import java.io.IOException;
    import java.io.BufferedReader;
    import java.io.InputStreamReader;
    BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
    
     System.out.println("Please login or sign up to to access account\nLogin or Sign Up");
        Scanner scanner = new Scanner(System.in);
        String val = scanner.next();
        if (val.equalsIgnoreCase("l") || val.equalsIgnoreCase("Login")) {
        } else if (val.equalsIgnoreCase("s") || val.equalsIgnoreCase("Sign Up")) {
            System.out.println("O");
        } else {
            System.out.println("Invalid Response please try again");
            main(args);
    */




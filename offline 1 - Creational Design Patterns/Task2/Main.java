import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
try{
        
        System.out.println("Welcome to the Bank. Please select a service:");
        System.out.println("1. Loan");
        System.out.println("2. Savings Account");
        int serviceChoice = scanner.nextInt();

        
        scanner.nextLine();

       
        System.out.println("What is your customer type?");
        System.out.println("1. Regular");
        System.out.println("2. Premium");
        System.out.println("3. VIP");
        int customerTypeChoice = scanner.nextInt();

        
        scanner.nextLine();

        
        System.out.println("Enter the principal amount:");
        double principal = scanner.nextDouble();

        
        System.out.println("Enter the number of years:");
        int years = scanner.nextInt();

        
        BankFactory factory = null;
        switch (customerTypeChoice) {
            case 1:
                factory = new RegularBankFactory();
                break;
            case 2:
                factory = new PremiumBankFactory();
                break;
            case 3:
                factory = new VIPBankFactory();
                break;
            default:
                System.out.println("Invalid customer type selected.");
                return;
        }

        
        switch (serviceChoice) {
            case 1:
                // Loan service
                Loan loan = factory.createLoan();
                double loanInterest = loan.calculateInterestRate(principal, years);
                System.out.printf("Total Loan Interest: $%.2f\n", loanInterest);

                break;
            case 2:
                // Savings account service
                Account savingsAccount = factory.createAccount();
                double savingsInterest = savingsAccount.calculateInterestRate(principal, years);
                System.out.printf("Total Savings Account Interest: $%.2f\n", savingsInterest);

                break;
            default:
                System.out.println("Invalid service selected.");
                break;
        }
    }finally{

        // Close the scanner to avoid resource leaks
        scanner.close();
    }
    }
}

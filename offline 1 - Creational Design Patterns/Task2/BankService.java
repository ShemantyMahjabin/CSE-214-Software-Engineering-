public class BankService {
       private Loan loan;
       private Account account;

       public BankService(BankFactory factory){
         loan = factory.createLoan();
         account = factory.createAccount();
       }
       
       public void totalInterest(double principal,int years){
        double loanInterest=loan.calculateInterestRate(principal, years);
        double accountInterest=account.calculateInterestRate(principal, years);
        System.out.println("Loan Interest: " + loanInterest);
        System.out.println("Savings Account Interest: " + accountInterest);
       }
} 
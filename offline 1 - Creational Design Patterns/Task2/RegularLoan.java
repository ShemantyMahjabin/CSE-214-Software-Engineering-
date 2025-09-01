public class RegularLoan implements Loan {
    private static final double interestRate=14.0/100;

    @Override
    public double calculateInterestRate(double principal,int years){
        return principal * interestRate * years;
    }
    
}

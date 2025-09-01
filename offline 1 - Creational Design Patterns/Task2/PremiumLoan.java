public class PremiumLoan implements Loan {
    private static final double INTEREST_RATE = 12.0 / 100; 

    @Override
    public double calculateInterestRate(double principal, int years) {
        return principal * INTEREST_RATE * years;
    }
    
}

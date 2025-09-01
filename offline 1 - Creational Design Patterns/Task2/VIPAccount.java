public class VIPAccount implements Account{
    private static final double INTEREST_RATE = 5.0 / 100; 

    @Override
    public double calculateInterestRate(double principal, int years) {
        return principal * INTEREST_RATE * years;
    }
    
}

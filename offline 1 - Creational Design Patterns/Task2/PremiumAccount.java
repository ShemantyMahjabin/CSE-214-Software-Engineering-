public class PremiumAccount implements Account {
    private static final double INTEREST_RATE = 3.5 / 100; // 3.5%

    @Override
    public double calculateInterestRate(double principal, int years) {
        return principal * INTEREST_RATE * years;
    }
}

public class RegularAccount implements Account  {
    private static final double interestRate =2.5/100;
    @Override
    public double calculateInterestRate(double principal,int years){
        return principal*interestRate*years;
    }
    
}

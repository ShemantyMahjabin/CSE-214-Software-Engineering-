public class PremiumBankFactory extends BankFactory {
    @Override
    public Loan createLoan() {
        return new PremiumLoan();
    }
    @Override
    public Account createAccount(){
        return new PremiumAccount();
    }
}

public class RegularBankFactory extends BankFactory {
    @Override
    public Loan createLoan(){
        return new RegularLoan();
    }
    @Override
    public Account createAccount(){
        return new RegularAccount();
    }
    
}

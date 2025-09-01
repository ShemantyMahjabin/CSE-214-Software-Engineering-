public class VIPBankFactory extends BankFactory {
    @Override
    public Loan createLoan(){
        return new VIPLoan();
    }
    @Override
    public Account createAccount(){
        return new VIPAccount();
    }
    
}

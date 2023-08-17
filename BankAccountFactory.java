package AbstractFactPattern;

public class BankAccountFactory {
    public BankAccount getInstance(String str){
        if(str == "current"){
            return new CurrentAccount();
        }
        else if (str == "loan") {
            return new LoanAccount();
        }
        else
            return new SavingsAccount();

    }
}

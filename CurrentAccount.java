package AbstractFactPattern;

public class CurrentAccount extends BankAccount
{
    int p;
    int i = 7;
    int t;
    public void createAccount()
    {
        System.out.println("Yor Current account has been created");
    }
    public void interestRate(int p, int t) {
        this.p = p;
        this.t = t;
        double si;
        si = (p * t * i) / 100;
        System.out.println("The interest amount is : " + si);
        System.out.println("The total amount is : " + (p + si));
    }
}

package AbstractFactPattern;

import java.util.Scanner;

public class AccountDesignMain {
    public static void main(String[] args){
        BankAccountFactory bf = new  BankAccountFactory();
        System.out.println("Enter valid number : \n 1. SavingsAccount \n 2. CurrentAccount \n 3. LoanAccount");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String str;
        switch (a){
            case 1 :
                str = "SavingsAccount";
                break;
            case 2 :
                str = "CurrentAccount";
                break;
            case 3 :
                str = "LoanAccount";
                break;
            default:
                str = null;
                System.out.println("please enter a valid account");
        }
        BankAccount ba = bf.getInstance(str);
        ba.createAccount();
        System.out.println("Please enter the amount");
        int p = sc.nextInt();
        System.out.println("Please enter the timeSpan");
        int t = sc.nextInt();
        ba.interestRate(p, t);
    }
}
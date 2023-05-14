package methodHomeWork;

public class CreditCard{
    /*
    Create a class CreditCard and define variable balance and interest. Create an instance method that
    will calculate interest based on the given balance.*/

int balance;
double interest;

 double totalInterest(int balance,double interest){
     this.balance=balance;
     this.interest=interest;
     double interestInDecimal=interest/100;
     double finalAmount=balance*interestInDecimal;
     return finalAmount;
 }

    public static void main(String[] args) {
        CreditCard c1 = new CreditCard();
        double result=c1.totalInterest(1000,10);
        System.out.println(result);

        AX a1 = new AX();
        double AXResult= a1.totalInterest(10000,10);
        System.out.println(AXResult);

        Visa v1 = new Visa();
       double visaResult = v1.totalInterest(12000,10);
        System.out.println(visaResult);


    }
}

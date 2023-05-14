package methodHomeWork;

public class Visa extends CreditCard {
    /*
    Create 2 subclasses: Visa and AX. In AX class override
method calculate interest. Call the method by creating an object
of each of the three classes.*/ }
class AX extends CreditCard{
    int balance;
    double interest;
  double  totalInterest(int balance,double  interest) {
      this.balance=balance;
      this.interest=interest;
       double Ax=balance*interest/100;
      System.out.println("this is interest from AX "+ Ax);
       return Ax; }
}

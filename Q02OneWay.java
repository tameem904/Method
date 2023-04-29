package methodHomeWork;

import java.util.Scanner;

public class Q02OneWay {
    /*
    Create a method createEmail(). Based on values of users firstName, lastName
     and email type, your method should return complete email Address.
     Example:  createEmail(John, Snow, gmail) → johnsnow@gmail.com
     */
    String createEmail(){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter you first name");
        String firstName=scan.next();
        System.out.println("Enter your last name");
        String lastName= scan.next();
        System.out.println("Your gmail type");
        String gmail=scan.next();
        String concat=firstName+lastName+gmail;
                     return concat;  }

    public static void main(String[] args) {
        Q02OneWay obj=new Q02OneWay();
        String result=obj.createEmail();
        System.out.println(result);
    }
}

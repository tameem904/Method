package methodHomeWork;

import java.util.Scanner;

public class Q01 {
    /*Q1:: Create a method that will say Hello in different language
    based on the country that will passed when method is executed.*/
    void  greeting(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your country");
        String country=scan.next();
        if(country.equalsIgnoreCase("USA")|| country.equalsIgnoreCase("Canada")){
            System.out.println("Hello");
        } else if(country.equalsIgnoreCase("China")){
            System.out.println("你好");
        }else if(country.equalsIgnoreCase("French")){
            System.out.println("Bonjour");
        }else if(country.equalsIgnoreCase("spain")){
            System.out.println("Hola");
        } else{
            System.out.println(" We are sorry!! our system can not translate your language");}}

        public static void main(String[] args) {
          Q01 a=new Q01();
          a.greeting();
    }
}

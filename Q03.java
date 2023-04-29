package methodHomeWork;

public class Q03 {
    //Write a method to return whether given number is prime or not?

    boolean isPrime(int num){
        boolean isPrime=true;
        int count=0;

        for(int i=2;i<=num;i++){
            if(num%i==0){
                count++;}

            if(count>1){
                isPrime=false;}}
                 return isPrime; }

       public static void main(String[] args) {
        int num=4;
        Q03 obj=new Q03();
        boolean result= obj.isPrime(num);
        System.out.println(result);
    }






}

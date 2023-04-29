package methodHomeWork;

public class Q02SecondWay {

    String createEmail(String firsName, String lastName, String gmailType){
        String gmail=firsName+lastName+gmailType;
         return gmail;}

       public static void main(String[] args) {
        Q02SecondWay obj=new Q02SecondWay();

        String result= obj.createEmail("Ahmad","Saha","@yahoo.com");
        System.out.println(result);
    }
}

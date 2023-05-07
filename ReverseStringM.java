package methodHomeWork;

public class ReverseStringM {
    /*

Create a method that will accept a String as a parameter and return a new String that consist only of vowels.
Method should be available inside the class only where it was declared and executed by calling it is name */

  private static  String revString(String str){
       String vowel="";
       for(int i=0; i<str.length();i++){
           if(str.charAt(i)=='a' ||str.charAt(i)=='e'|| str.charAt(i)=='o'|| str.charAt(i)=='i'|| str.charAt(i)=='u'){
                vowel=vowel+str.charAt(i);
           }
        }
    return vowel; }

    public static void main(String[] args) {
        String word="hello beautiful";
        String result= ReverseStringM.revString(word);
        System.out.println(result);
    }




}

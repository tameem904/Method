package methodHomeWork;

import javax.sound.midi.Soundbank;

public class StringParameterRev {
    /*
    Create a method that will take a String as a parameter and returns reversed String.
     Method should be available to all classes within your project and accessible by class name.
     */
    static String revStr(String str1){
        StringBuilder str = new StringBuilder(str1);
        str=str.reverse();
        String s=str.toString();
        return s;
    }

    public static void main(String[] args) {

        String str="Hello";
        String result=StringParameterRev.revStr(str);
        System.out.println(result);
    }
}

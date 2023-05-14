package methodHomeWork;

public class Degree {
    /*Create a class 'Degree' having a method 'getPrerequisite' that prints ""To get a degree you need
high school diploma"".Class 'Degree' has 2 subclasses namely 'Bachelors' and Masters’.
In Masters class override method getPrerequisite.Call the method by creating an object of each of the three classes.*/

    void getPrerequisite(){
        System.out.println("To get a degree you need high school diploma");
    }
}
class Bachelors extends Degree{
    void getPrerequisite(){
        System.out.println("To get a bachelors degree you need Associate degree");
    }
}
class Masters extends Degree{
    void getPrerequisite(){
        System.out.println("To get a Masters degree you need bachelors degree");
    }

}
class DegreeTester{
    public static void main(String[] args) {
        Degree d1 = new Degree();
        Bachelors B1 = new Bachelors();
        Masters M1 = new Masters();


        d1.getPrerequisite();
        B1.getPrerequisite();
        M1.getPrerequisite();




    }
}
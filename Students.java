package methodHomeWork;

public class Students {
    /*Create a Class called Students Create three  variables  Name , ID  and  numberOfStudents
Create three objects of the Students Class Set the value for  studentName ,
studentID and increment  the numberOfStudents for each object Print out  total number of students*/

    String name;
    int id;
   static int numberOfStudents;

    void printInfo(){
        System.out.println(name+" "+id);

    }

    public static void main(String[] args) {
        Students st1 = new Students();
        Students st2 = new Students();
        Students st3 = new Students();

        st1.name="Flor";
        st1.id=777222;
        numberOfStudents++;

        st2.name="T";
        st2.id=999666;
        numberOfStudents++;

        st3.name="Sam";
        st3.id=121200;
        numberOfStudents++;

        st1.printInfo();
        st2.printInfo();
        st3.printInfo();
        System.out.println(numberOfStudents);





    }


}
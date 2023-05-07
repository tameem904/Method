package methodHomeWork;

public class SyntaxEmployee {
/*Create a Class called SyntaxEmployee:
Create three  variables  empID , salary and set the CEO to “Sumair”
Create two objects of the class SyntaxEmployee
Set the value of eID, salary for each of the objects
Print out the eID , salary and  CEO for each of the objects*/

    int empID;
    int salary;
    static String CEO = "Sumair";
    void printInfo(){
        System.out.println(empID+" "+salary+" "+CEO);
    }

    public static void main(String[] args) {

        SyntaxEmployee se1 = new SyntaxEmployee();
        SyntaxEmployee se2 = new SyntaxEmployee();

        se1.empID=123456789;
        se1.salary=150000;

        se2.empID=456778899;
        se2.salary=120000;

        se1.printInfo();
        se2.printInfo();
    }
}
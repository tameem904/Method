package methodHomeWork;

/*
Write a java Class Students that have a constructor which takes students name and 3 subject grades.
Inside your class also have a method to Calculate Average Grade.
Test Student class for 5 different students with different marks.
 Your program should print an average mark of each student's name.
 */
public class ConsrtuctorHW {
    String name;
    int historyGrade;
    int mathGrade;
    int languageGrade;

    public ConsrtuctorHW(String name, int historyGrade, int mathGrade, int languageGrade) {
        this.name = name;
        this.historyGrade = historyGrade;
        this.mathGrade = mathGrade;
        this.languageGrade = languageGrade;
    }
    void average(){
         int sum=0;
         sum=historyGrade+mathGrade+languageGrade;
         sum=sum/3;
        System.out.println(name+" "+"having average grade of "+sum);
    }

    public static void main(String[] args) {
        ConsrtuctorHW c1 = new ConsrtuctorHW("Lou",90,105,100);
        ConsrtuctorHW c2 = new ConsrtuctorHW("Alex",34,78,84);
        ConsrtuctorHW c3 = new ConsrtuctorHW("Mike",93,67,54);
        ConsrtuctorHW c4 = new ConsrtuctorHW("Hank",100,105,110);
        ConsrtuctorHW c5 = new ConsrtuctorHW("Walt",86,75,89);

        c1.average();
        c2.average();
        c3.average();
        c4.average();
        c5.average();
    }
}

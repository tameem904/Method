package methodHomeWork;

public class StudentQ04 {
    /*Create  class Student that will have a method getGrade.
    Your method should accept the score of a student and return a grade:
    score > 90 - A , score >80 - B, score >70 - C, score > 50 - D, anything else - F  */

    char getGrade(int score) {
        char grade = 'F';
        if (score > 90) {
            grade = 'A';
        } else if (score > 80) {
            grade = 'B';
        } else if (score > 70) {
            grade = 'C';
        } else if (score > 50) {
            grade = 'D';
        }
        return grade;
    }
    public static void main(String[] args) {
     StudentQ04 obj=new StudentQ04();
     int score=100;
     char result=obj.getGrade(score);
        System.out.println(result);



    }
}
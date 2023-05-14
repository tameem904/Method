package methodHomeWork;

public class ShapeTester {
    public static void main(String[] args) {
        Shapes sh1=new Shapes();
        double result=sh1.calculateAreaRectangle(44,21);
        System.out.println(result);

        Shapes sh2=new Shapes();
        int result2=sh2.calculateAreaSquare(12,6);
        System.out.println(result2);

    }
}

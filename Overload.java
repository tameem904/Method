package methodHomeWork;

public class Overload {
    /*Create 1 class with a static method that has 3 overloaded forms.
 Then call each overloaded method with specific arguments and observe result.*/

    static void car(String color,String Brand,int price){
        System.out.println("The color of the car is "+color+" the brand of the car is "+Brand+" the cost is "+price);
    }
   static void car(int year,int horsePower){
       System.out.println("The year is "+year+" the horsepower ="+horsePower);
    }
    static void car(String transmission,String wheels){
        System.out.println("The transmission is "+transmission+" what kind of wheels are they "+wheels);
    }

    public static void main(String[] args) {
        Overload.car("Blue","Demon",12000);
        Overload.car(1993,450);
        Overload.car("Manual","Aluminum");
    }
}

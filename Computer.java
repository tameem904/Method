package methodHomeWork;

public class Computer {
    /*
    Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell.
Define common behavior within and some fields in parent class and override some of the
methods in child classes Define some methods specific to child classes
Create objects of child classes and store them into array. Loop through each object and execute available methods.
     */

    String name;
    int price;
    String memory;
    boolean keyboard;
    boolean speaker;
    Computer(String name,int price,String memory,boolean keyboard,boolean speaker){
        this.name=name;
        this.price=price;
        this.memory=memory;
        this.keyboard=keyboard;
        this.speaker=speaker;
        System.out.println("name = "+name+" price = "+price+" memory = "+memory+" keyboard = "+keyboard+" speaker = "+speaker);
    }
    void on(){
        System.out.println("Turning onn");
    }
    void off(){
        System.out.println("Turning off");
    }
    void music(){
        System.out.println("Can play sounds");
    }
    void type(){
        System.out.println("You can use keyboard to type");
    }

}
class Apple extends Computer{
    Apple(String name,int price,String memory,boolean keyboard,boolean speaker){
        super(name,price,memory,keyboard,speaker);
    }
    void on(){
        System.out.println("Apple can turn on by fingerprint");
    }
    void off(){
        System.out.println("Apple can turn off by speaking to siri");
    }
    void playGame(){
        System.out.println("You cant play games on Apple");
    }

}
class Lenovo extends Computer{
    Lenovo(String name,int price,String memory,boolean keyboard,boolean speaker){
        super(name,price,memory,keyboard,speaker);
    }
    void on(){
        System.out.println("lenovo can turn on by pressing on button");
    }
    void losingCharge(){
        System.out.println("lenovo loses charge quickly");
    }
    void music(){
        System.out.println("Cant play sounds well");
    }
}
class HP extends Computer{
    HP(String name,int price,String memory,boolean keyboard,boolean speaker){
        super(name,price,memory,keyboard,speaker);
    }
    void type(){
        System.out.println("preferred for gaming ");
    }
    void on(){
        System.out.println("can turn on by opening the laptop");
    }
    void off(){
        System.out.println("have to press power button to turn off");
    }
}
class Dell extends Computer{
    Dell(String name,int price,String memory,boolean keyboard,boolean speaker){
        super(name,price,memory,keyboard,speaker);
    }
    void type(){
        System.out.println("out of date");
    }
    void on(){
        System.out.println("to old to turn on");
    }
    void charging(){
        System.out.println("has to be plugged in to stay onn");
    }
}
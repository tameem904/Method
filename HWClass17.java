package methodHomeWork;

public class HWClass17 {
    /*
    Write a java class that have 4 constructors with 4 different access levels of constructors(
    private,public,default,protected) and create 4 objects of this class:
    1 - inside same class; 2 - from outside the class; 3 - from different class inside different
    package  and observe result.
     */
private HWClass17(){
    System.out.println("Private constructor");
}
public HWClass17(String name) {
    System.out.println("Public constructor");
}
HWClass17(int money){
    System.out.println("default constructor");
}

    public static void main(String[] args) {
        HWClass17 h1 = new HWClass17();
        HWClass17 h2 = new HWClass17("be nice");
        HWClass17 h3 = new HWClass17(99);

    }
}

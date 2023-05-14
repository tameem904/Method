package methodHomeWork;

public class PrivateOverload {
    private static void cat(String name, String breed, String color) {
        System.out.println("Name is " + name + " I am a "+breed+" an im " + color);
    }

    private static void cat(String speak, String eat) {
        System.out.println("I speak " + speak + " I like to eat " + eat);
    }

   private static void cat(String run,String climb,int legs,int eyes) {
        System.out.println("I can run "+run+" I can "+climb+" I have "+legs+" I have "+eyes);
    }

    public static void main(String[] args) {
        PrivateOverload.cat("chinese","Fish");
        PrivateOverload.cat("Bone","sharpe","blue");
        PrivateOverload.cat("Fast","trees",4,2);
    }
}

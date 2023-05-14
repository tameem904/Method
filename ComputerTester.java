package methodHomeWork;

public class ComputerTester {
    public static void main(String[] args) {

        Computer c1 []={new Apple("16Pro",3000,"1TB",true,true),
                new Lenovo("M1",400,"5G",true,true),
        new HP("h1",800,"12G",true,true),
        new Dell("D1",200,"1g",true,false)};

        for(Computer c2:c1){
            c2.on();
            c2.off();
            c2.type();
            c2.music();
        }
    }
}

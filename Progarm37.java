//super keyword
//super keyword is used to call the constructor of base class
class Base {
    Base(int val) {
        System.out.println("You provided " + val);
    }
}

class Derived extends Base {
    Derived() {
        super(10);// this should be the first line of constructor of derived
        System.out.println("Constructor of Derived");
    }
}

public class Progarm37 {
    public static void main(String[] args) {
        new Derived();
    }
}

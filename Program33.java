class Dog {
    // public static void main(String[] args) {
    // what is a class
    // a class is an abstraction datatype
    // a class is an collection /composition of properties &methods

    // what is an object??
    // an objecy=t si an instance of a class
    // an object is required to access/call members i.e properties & methods

    String breed = "Tibetian Mastiff";
    int age = 3;
    boolean isVegetarian = false;

    void bark() {
        System.out.println("Woof Woof!!!");
    }

    boolean fly() {
        return false;
    }

    void eat(String food) {
        System.out.println(" Yum yum " + food + " is delecious ");
    }
}

public class Program33 {
    public static void main(String[] args) {
        // syntax to craete object
        // classnmae objectName=new classnme();
        Dog terry = new Dog();
        System.out.println(" Hi I ma Terry!!My breed is " + terry.breed);
        System.out.println(" I am " + terry.age + " Years OLD.");
        System.out.println("Am I Vegetarian" + (terry.isVegetarian ? "Yes" : " No"));
        terry.bark();
        System.out.println("Can I try fly" + (terry.fly() ? "Yes" : " No "));
        terry.eat("Pedigree");
    }
}

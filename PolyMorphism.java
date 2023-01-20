//Polymorphism

//Polymorphism is an ability of an object to exist in multiple forms
//types of polymorphism.

//1.1 Static Polymorphism:when the fns cell call is at compile time
//to implement static polymorphism we use function overloading.

//2.2 Dynamic Polymorphism:when the fns call is determined at runtime
//to implement runtime polymorphism we use function overriding.

public class PolyMorphism {
    // function Overloading :it is a processs of defining multiple functions with
    // same name but different parameters.
    void add(int n1, int n2) {
        System.out.println(n1 + n2);
    }

    void add(int n1, int n2, int n3) {
        System.out.println(n1 + n2 + n3);
    }

    void add(float f1, float f2) {
        System.out.println(f1 + f2);
    }

    void add(int n1, float f1) {
        System.out.println(n1 + f1);
    }

    void add(float f1, int n1) {
        System.out.println(n1 + f1);
    }

    public static void main(String[] args) {
        PolyMorphism p1 = new PolyMorphism();
        p1.add(10.0f, 12);
    }
}

interface A {
    void meth1();

    void meth2();
}

class myClass implements A {
    @Override
    public void meth1() {
        System.out.println("Hello1");
    }

    @Override
    public void meth2() {
        System.out.println("Hello2");
    }
}

public class Program39 {
    public static void main(String[] args) {
        A obj = new myClass();
        obj.meth1();
        obj.meth2();
    }

}

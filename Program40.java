interface test {
    void square();
}

class arithmetic implements test {
    @Override
    public void square() {
        System.out.println("I am square");
    }
}

class ToTestInt extends arithmetic {
    test A = new arithmetic();

    @Override
    public void square() {
        // TODO Auto-generated method stub
        super.square();
    }
}

public class Program40 {
    public static void main(String[] args) {

        ToTestInt obj = new ToTestInt();
        obj.square();
    }
}

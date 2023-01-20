//Function Overiding:when a function of Base class is Re-Defined in derived class.
abstract class Doctor {
    abstract void treat();
}

class Physician extends Doctor {
    public void treat() {
        System.out.println("I Treat Patients with Medicine");
    }
}

class Surgeon extends Doctor {
    public void treat() {
        System.out.println("I Treat Patients with Surgery");
    }
}

class Dentist extends Doctor {
    public void treat() {
        System.out.println("I Treat Patients Teeth");
    }
}

public class Abstract {
    public static void main(String[] args) {
        Doctor doc = null;
        System.out.println("1.Physician 2.Surgeon 3.Dentist");
        int choice = new java.util.Scanner(System.in).nextInt();
        if (choice == 1)
            doc = new Physician();
        else if (choice == 2)
            doc = new Surgeon();
        else if (choice == 3)
            doc = new Dentist();

        doc.treat();
    }
}

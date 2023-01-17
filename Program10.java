
public class Program10 {
    public static void main(String[] args) {

    }
}

interface Herbivorous {
    void eatPlant();

}

interface Carnivorous {
    void eatMeat();
}

class Cow implements Herbivorous {
    @Override
    public void eatPlant() {

    }
}

class Cat implements Carnivorous {
    @Override
    public void eatMeat() {
    }
}

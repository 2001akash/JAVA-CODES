
//Access Modifiers
//Private:any member defined as private will be accessible in  only declaring classes 
//Protected:any member defined as protected will be accessible in  derived class only
//Public:any member defined as public will be accessible in  All /extrenal classes across packages
//Default:this is the default access (no keyword required)such members are accessible across all classes in the smae package only
//this program explains inheritance
//inheritance allows us to acquire properties & methods of one class into another
//Advantages -Inheritance
//code reusability
//memory optimization
//fast development etc.

//java provides extends keyword to inherit a class
//java doesn't supports multiple inheritance i.einheriting more tahn 1 class isn't suupported

class Father {
    Father() {
        System.out.println("Constructor of Base");
    }

    void foodHabit() {
        System.out.println("I Like Salty");
    }
}

class Son extends Father {
    Son() {
        System.out.println("Constructor of derived");
    }
}

public class Progarm36 {
    public static void main(String[] args) {
        Son peter = new Son();
        peter.foodHabit();
    }
}
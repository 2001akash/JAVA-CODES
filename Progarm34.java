import java.util.stream.Stream;
import java.util.Arrays;

class Employee {
    // A constructor
    // a constructor is a special method taht has same anme as of class
    // a constructor is usused to initialze or alloacy=te memory to object
    // a comstructor cant have return type
    String name;

    Employee(String name) {
        this.name = name;// here this keyword help me acess class variablei.e name
    }
}

public class Progarm34 {
    public static void main(String[] args) {
        Employee e1 = new Employee("Jack");
        Employee e2 = new Employee("Harry");
        Employee e3 = new Employee("Akash");
        Employee[] employees = new Employee[] { e1, e2, e3 };
        Stream<Employee> empStream = Arrays.stream(employees);
        // printing all employees names
        empStream.forEach(e -> System.out.println("Employee Name :" + e.name));
    }
}

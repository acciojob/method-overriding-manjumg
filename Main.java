// Parent class A
class A {

    // Task 1: Method in class A
    public String meth() {
        return "Invoking method from class A";
    }
}

// Child class B extending class A
class B extends A {

    // Task 4: Overriding method in class B
    @Override
    public String meth() {
        return "Method is overridden in Extended class B";
    }
}

// Main class to run the program
public class Main {

    public static void main(String[] args) {

        // Task 3 & Task 5:
        // Creating object of class B
        B obj = new B();

        // Calling method meth()
        System.out.println(obj.meth());
    }
}

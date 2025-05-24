// Task 1: Class A with a method meth
class A {
    String meth() {
        return "Invoking method from class A";
    }
}

// Task 2: Class B extends A
class B extends A {

    // Task 4: Override meth in class B
    @Override
    String meth() {
        return "Method is overridden in Extended class B";
    }
}

public class Main {
    public static void main(String[] args) {
        // Task 3: Create object of B and call method from A
        A obj1 = new B();
        System.out.println(obj1.meth()); // Will call overridden method from B

        // Task 5: Call overridden method from B directly
        B obj2 = new B();
        System.out.println(obj2.meth());
    }
}

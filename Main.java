// Task 5 (Final combined program)
class A {
    String meth() {
        return "Invoking method from class A";
    }
}

class B extends A {
    @Override
    String meth() {
        return "Method is overridden in Extended class B";
    }
}

public class Main {
    public static void main(String[] args) {
        B obj = new B();  // create object of class B
        System.out.println(obj.meth());  // call overridden method
    }
}

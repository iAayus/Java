class AccessModifiersDemo {

    // Public variable
    public int publicVar = 10;

    // Private variable
    private int privateVar = 20;

    // Protected variable
    protected int protectedVar = 30;

    // Default variable
    int defaultVar = 40;

    // Public method
    public void publicMethod() {
        System.out.println("This is a public method.");
    }

    // Private method
    private void privateMethod() {
        System.out.println("This is a private method.");
    }

    // Protected method
    protected void protectedMethod() {
        System.out.println("This is a protected method.");
    }

    // Default method
    void defaultMethod() {
        System.out.println("This is a default method.");
    }
}

public class Access {
    public static void main(String[] args) {
        AccessModifiersDemo obj = new AccessModifiersDemo();

        // Access public variable and method
        System.out.println(obj.publicVar);
        obj.publicMethod();

        // Cannot access private variable and method
        // System.out.println(obj.privateVar);
        // obj.privateMethod();

        // Access protected variable and method
        System.out.println(obj.protectedVar);
        obj.protectedMethod();

        // Access default variable and method
        System.out.println(obj.defaultVar);
        obj.defaultMethod();
    }
}

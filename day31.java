// AccessModifiersExample.java

// Class with default access modifier (package-private)
class DefaultClass {
    void display() {
        System.out.println("Default (package-private) access modifier");
    }
}

// Public class
public class AccessModifiersExample {

    public String publicVariable = "This is a public variable";
    private String privateVariable = "This is a private variable";
    protected String protectedVariable = "This is a protected variable";

    String defaultVariable = "This is a default (package-private) variable";

    public void publicMethod() {
        System.out.println("Public method");
    }

    private void privateMethod() {
        System.out.println("Private method");
    }

    protected void protectedMethod() {
        System.out.println("Protected method");
    }

    void defaultMethod() {
        System.out.println("Default (package-private) method");
    }


    public static void main(String[] args) {
        AccessModifiersExample example = new AccessModifiersExample();

        System.out.println("Public variable: " + example.publicVariable);
        example.publicMethod();

        System.out.println("Private variable: " + example.privateVariable);
        example.privateMethod();

        System.out.println("Protected variable: " + example.protectedVariable);
        example.protectedMethod();

        System.out.println("Default variable: " + example.defaultVariable);
        example.defaultMethod();

        DefaultClass defaultClass = new DefaultClass();
        defaultClass.display();
    }
}
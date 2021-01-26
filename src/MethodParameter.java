public class MethodParameter {
    public static void main(String[] args) {

        sayHello("Rafi", "Nur");
        sayHello("Moch", "Oktafian");

    }

    static void sayHello(String firstName, String lastName) {
        System.out.println("Hello " + firstName + " " + lastName);
    }
}

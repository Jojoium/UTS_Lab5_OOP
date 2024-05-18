//221401035 Lab-5

package Nomor3;

public class TestMain {
    public static void main(String[] args) {
        // Test constructor and toString()
        Account a1 = new Account("A101", "Ligma", 88);
        System.out.println(a1); // toString();

        Account a2 = new Account("A102", "Deezma"); // default balance
        System.out.println(a2);

    }
}

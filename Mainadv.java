public class Mainadv {
    char[] sar = new char[50];

    public Mainadv() {
        // Initialize the char array in the constructor
        sar = "I am 3rd year Student,currently Studing java adv".toCharArray();
    }

    public static void main(String args[]) {
        Mainadv obj1 = new Mainadv();
        System.out.println(obj1.sar);
    }
}

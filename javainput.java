import java.util.Scanner;

public class javainput {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a;
        double b;
        char ch;
        String st;

        System.out.println("Enter values:- ");
        st = input.nextLine();
        a = input.nextInt();
        b = input.nextDouble();
        ch = input.next().charAt(0);

        System.out.println(a + " " + b + " " + ch + " " + st);
    }
}

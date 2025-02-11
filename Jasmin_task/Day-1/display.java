//5. Product of Two Numbers
import java.util.Scanner;

public class display {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        System.out.println("Enter First Number:-");
        int num1 = scan.nextInt();

        System.out.println("Enter Secound Number:-");
        int num2 = scan.nextInt();

        System.out.println(num1 + "x" + num2 + "=" + " " +num1 * num2);

    }
}

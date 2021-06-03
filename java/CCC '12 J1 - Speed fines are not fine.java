import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();

        if (b <= a) {
            System.out.println("Congratulations, you are within the speed limit!");
        } else if (b > a & b <= (a + 20)) {
            System.out.println("You are speeding and your fine is $100");
        } else if (b > (a + 20) & b <= (a + 30)) {
            System.out.println("You are speeding and your fine is $270");
        } else {
            System.out.println("You are speeding and your fine is $500");
        }
    }
}

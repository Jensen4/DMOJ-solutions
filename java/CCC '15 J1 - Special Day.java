import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();

        if (a <= 2 & b < 18 || a < 2) {
            System.out.println("Before");
        } else if (a >= 2 & b > 18 || a > 2) {
            System.out.println("After");
        } else if (a == 2 & b == 18) {
            System.out.println("Special");
        }
    }
}

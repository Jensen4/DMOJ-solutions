import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        String b = in.next();
        int c = 0;

        for (int i = 0; i < a; i++) {
            if (b.charAt(i) == 'A') {
                c++;
            }
        }
        if (c > a - c) {
            System.out.println("A");
        } else if (c == a - c) {
            System.out.println("Tie");
        } else {
            System.out.println("B");
        }
    }
}

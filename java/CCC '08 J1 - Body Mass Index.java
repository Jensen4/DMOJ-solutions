import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = a / (b * b);

        if (c < 18.5) {
            System.out.println("Underweight");
        } else if (c >= 18.5 & c <= 25) {
            System.out.println("Normal Weight");
        } else {
            System.out.println("Overweight");
        }
    }
}

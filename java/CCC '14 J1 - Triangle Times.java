import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a, b, c;

        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();

        if (a + b + c !=180) 
        {
            System.out.println("Error");
        }
        else if (a == 60 & b == 60 & c == 60)
        {
            System.out.println("Equilateral");
        }
        else if (a == b | b == c | a == c)
        {
            System.out.println("Isosceles");
        }
        else if (a != b & b != c)
        {
            System.out.println("Scalene");
        }
    }
}

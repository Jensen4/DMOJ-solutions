import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a,b,c;
        
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        
        if (b > a && a > c || b < a && a < c)
        {
            System.out.println(a);
        }
        else if (a > b && b > c || a < b && b < c)
        {
            System.out.println(b);
        }
        else System.out.println(c);
    }
}

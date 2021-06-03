import java.util.*;
import java.lang.Math;

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a;
        a = in.nextInt();
        a = (int)Math.sqrt(a);
        
        System.out.println("The largest square has side length " + a + ".");
    }
}

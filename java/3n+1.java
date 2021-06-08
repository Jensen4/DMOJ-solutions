import java.util.*;

public class Main
{
  public static void main (String[]args)
  {
    Scanner in = new Scanner (System.in);
    int n;
    int a = 0;
    n = in.nextInt();
    while (n != 1) {
        if (n % 2 == 1) { 
            n = n*3 + 1;
            a++;
        }
        else { 
           n = n/2; 
           a++;
        }
    }
    System.out.println(a);
  }
}

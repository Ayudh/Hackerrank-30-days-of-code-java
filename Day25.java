import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-->0) {
        int n = scanner.nextInt();
        int root = (int)Math.sqrt(n);
            if (n==1) {
            System.out.println("Not prime");
            continue;                
            }
            
        if (n==2) {
          System.out.println("Prime");
continue;            
        }
        boolean isPrime = true;
        for (int i=2;i<=root;i++) {
          if (n % i == 0) {
            isPrime = false;
            break;
          }
        }
        if (isPrime)
          System.out.println("Prime");
        else
          System.out.println("Not prime");
        }
    }
}
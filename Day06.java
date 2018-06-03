import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0) {
            String s = in.next();
            for (int i=0;i<s.length();i=i+2)
                System.out.print(s.charAt(i));
            System.out.print(" ");
            for (int i=1;i<s.length();i=i+2)
                System.out.print(s.charAt(i));
            System.out.println();
        }
    }
}
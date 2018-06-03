import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = Integer.toString(n, 2);
        int ans = 0;
        int temp = 0;
        for (int i=0;i<s.length();i++) {
          if (s.charAt(i)=='1')
            temp++;
          else {
            ans = (ans>temp)? ans:temp;
            temp = 0;
          }
        }
        ans = (ans>temp)? ans:temp;
        System.out.println(ans)
        scanner.close();
    }
}

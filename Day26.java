import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int dateActual = scanner.nextInt();
        int monthActual = scanner.nextInt();
        int yearActual = scanner.nextInt();

        int dateExpected = scanner.nextInt();
        int monthExpected = scanner.nextInt();
        int yearExpected = scanner.nextInt();
        int fine = 0;

        if (yearActual < yearExpected)
          fine = 0;
        else if (yearActual == yearExpected) {
          if (monthActual < monthExpected)
            fine = 0;
          else if (monthActual == monthExpected) {
            if (dateActual <= dateExpected)
              fine = 0;
            else 
              fine = 15 * (dateActual - dateExpected);
          }
          else
            fine = 500 * (monthActual - monthExpected);
        }
        else
          fine = 10000;

        System.out.println(fine);
    }
}
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        ArrayList<String> s = new ArrayList<String>();
        while(t--!=0)
        {
            String firstName=in.next();
            String[] gmail=in.next().split("@");
            if(gmail[1].equals("gmail.com"))
                s.add(firstName);
        }
        Collections.sort(s);
        for(int i=0;i<s.size();i++)
            System.out.println(s.get(i));
                
    }
}
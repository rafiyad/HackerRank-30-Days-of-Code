import java.io.*;
import java.util.*;

public class Solution {
    
    public static void stringEvenOdd (String str) {
        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (i % 2 == 0) {
                System.out.print(ch[i]);
            }
        }
        System.out.print(" ");
        for (int i = 0; i < ch.length; i++) {
            if (i % 2 != 0) {
                System.out.print(ch[i]);
            }
        }
    }
    

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc= new Scanner(System.in);
        int T=sc.nextInt();
    
        sc.nextLine();
        for(int i=1; i<=T;i++){
            String str=sc.nextLine();
            stringEvenOdd(str);
              System.out.println();
        }
        }
}

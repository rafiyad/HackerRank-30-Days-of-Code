import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       int i= 4;
       double d = 4;
       String s = "HackerRank ";
       
       Scanner sc = new Scanner(System.in);
       int iPlus= sc.nextInt();
       double dPlus= sc.nextDouble();
       sc.nextLine();
       String sPlus= sc.nextLine();
       
       System.out.println(i+iPlus);
       System.out.println(d+dPlus);
       System.out.println(s+sPlus);
    }
}

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
   Map<String, Integer> phoneBook = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int T= sc.nextInt();

        for (int i=0; i<T;i++){
            String name = sc.next();
            int number = sc.nextInt();
            phoneBook.put(name, number);
        }
// User input can be unlimited
       while (sc.hasNext()){
           String check=sc.next();
           if (phoneBook.containsKey(check)){
               System.out.println(check+"="+phoneBook.get(check));
           } else {
               System.out.println("Not found");
           }
       }
        
    }
}

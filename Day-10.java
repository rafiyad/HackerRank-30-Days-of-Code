import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());
        // write codes here
        int counter=0;
        int max=0;
        while(n>0){
            int a =n%2;
            if(a==1){
                counter++;
                if(counter>max){
                    max=counter;
                }
            }else{
                counter=0;
            }   
            n=n/2;
        }
        System.out.println(max);
        
        
        bufferedReader.close();
    }
}

//Reserve order
/* int n = 7;
        int counter=0;

        ArrayList<Integer> bn = new ArrayList<>();
        while(n>0){
            int a= n%2;
            bn.add(a);
            n=n/2;
        }

        // System.out.println(bn.size());
        for (int i=bn.size()-1;i>=0;i--){
            //System.out.print(bn.get(i));
            if (bn.get(i)==1){
                counter++;
            }else
                break;
        }
        System.out.println(counter);
*/

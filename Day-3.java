import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

      if ((N>20) && (N%2==0)){
          System.out.println("Not Weird");
      }
      else if ((6<N && N<20) && (N%2==0)) {
          System.out.println("Weird");
      }
      else if ((2<N && N<5) && (N%2==0)) {
          System.out.println("Not Weird");
      }
      else {
          System.out.println("Weird");
      }
        bufferedReader.close();
    }
}

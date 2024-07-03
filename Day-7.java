import java.util.Scanner;



public class Solution {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int [] numArray= new int [n];

        for(int i=0; i<n;i++){
            numArray[i]=sc.nextInt();

        }
        for (int i=numArray.length-1;i>=0;i--){
            System.out.print(numArray[i]+" ");
        }
   
    }
}

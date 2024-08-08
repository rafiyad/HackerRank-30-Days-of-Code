
import java.util.*;



public class Main {

    public static void maxHourGlass(List<List<Integer>> arr){
        int max=-2147483648;
        //int sum=0;
        for (int row=0; row<4; row++){
            for (int col=0; col<4; col++){
                //storing the sum value
               int sum=arr.get(row).get(col)+arr.get(row).get(col+1)+arr.get(row).get(col+2) //first line
                        +arr.get(row+1).get(col+1)    //second line
                +arr.get(row+2).get(col)+arr.get(row+2).get(col+1)+arr.get(row+2).get(col+2);  //Third line

                if(sum>max){ max=sum; }
            }
        }
        System.out.println(max);
    }

    public static void main(String[] args) {
        //Value adding
        List<List<Integer>> arr = new ArrayList<>();
        List<Integer> row1 = List.of(1, 1, 1, 0, 0, 0);
        List<Integer> row2 = List.of(0, 1, 0, 0, 0, 0);
        List<Integer> row3 = List.of(1, 1, 1, 0, 0, 0);
        List<Integer> row4 = List.of(0, 0, 2, 4, 4, 0);
        List<Integer> row5 = List.of(0, 0, 0, 2, 0, 0);
        List<Integer> row6 = List.of(0, 0, 1, 2, 4, 0);

        arr.add(row1);
        arr.add(row2);
        arr.add(row3);
        arr.add(row4);
        arr.add(row5);
        arr.add(row6);
        
        //calling the function
        maxHourGlass(arr);


    }
}



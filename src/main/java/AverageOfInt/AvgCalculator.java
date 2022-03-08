package AverageOfInt;

import java.util.Arrays;

public class AvgCalculator {
    AvgCalculator(){
    }
    public int avgCeil(int value1, int value2){
        double diff_distance;
        if(value2>=value1) {
            diff_distance=(double)(value2-value1)/2;
            if(diff_distance==(value2-value1)/2)
                return value1 + (value2 - value1) / 2;
            else
                return value1 + (value2 - value1) / 2 + 1;
        }
        else {
            diff_distance=(double)(value1-value2)/2;
            if(diff_distance==(value1-value2)/2)
                return value2 + (value1 - value2) / 2;
            else
                return value2 + (value1 - value2) / 2 + 1;
        }
    }
    public int avgFloor(int value1, int value2){
        if(value2>=value1)
            return value1+(value2-value1)/2;
        else
            return value2+(value1-value2)/2;
    }



    public void showArray(int[] myArray){
        if(myArray == null)
            System.out.println("The Array is null!");
        else {
            for (int i : myArray) {
                System.out.print(" " + i);
            }
            System.out.println();
        }
    }
    public void sortArray(int[] myArray){
        if(myArray == null)
            System.out.println("The Array is null!");
        else {
            Arrays.sort(myArray);
        }
    }

    public double mediumValue(int[] myArray){
        if(myArray == null){
            System.out.println("The Array is null!");
            return -1;
        }
        else{
            sortArray(myArray);
            if (myArray.length % 2 == 1){
                return myArray[myArray.length/2];
            }else{
                int mediumIndex = myArray.length/2;
                return (double) (myArray[mediumIndex-1]+myArray[mediumIndex])/2 ;
            }

        }
    }


}

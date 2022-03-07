package AverageOfInt;

import java.util.Arrays;

public class AvgCalculator {

    // TODO: at least to private, other note store result in object it's state will have issue with mult-threading
    public double sumValue;
    public double avgValue;
    
    // TODO: default is public 
    AvgCalculator(){
    }
    
    // TODO: value1 is Int.VALUE_MAX , overflow, underflow 32
    // Ceil division 3/2 = 2, floor 3/2 = 1, java default to floor
    public int avgCeil(int value1, int value2){
        return (int) Math.ceil((value1+value2)/2);
    }
    
    public int avgFloor(int value1, int value2){
        return (int) Math.ceil((value1+value2)/2);
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

    // TODO: what happens if myArray length = 0
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

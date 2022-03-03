package AverageOfInt;

public class AvgOfInt {
    public static void main(String[] Args){
        AvgCalculator myAvgCal = new AvgCalculator();

        System.out.println("The ceil average is: "+myAvgCal.avgCeil(1,14));
        System.out.println("The floor average is: "+myAvgCal.avgFloor(1,14));

        int[] myArray = new int[] {2, 1, 3, 4, 5, 7};
        myAvgCal.showArray(myArray);

        myAvgCal.sortArray(myArray);
        myAvgCal.showArray(myArray);
        System.out.println("The medium value is: "+myAvgCal.mediumValue(myArray));

    }

}

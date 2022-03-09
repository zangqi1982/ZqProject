package AverageOfInt;

public class AvgOfInt {
    public static void main(String[] Args){
        AvgCalculator myAvgCal = new AvgCalculator();

        System.out.println("The ceil average is: "+myAvgCal.avgCeil(Integer.MAX_VALUE,Integer.MAX_VALUE));
        System.out.println("The floor average is: "+myAvgCal.avgFloor(Integer.MAX_VALUE,Integer.MAX_VALUE));
        System.out.println("The ceil average is: "+myAvgCal.avgCeil(Integer.MAX_VALUE,0));
        System.out.println("The floor average is: "+myAvgCal.avgFloor(Integer.MAX_VALUE,0));
        System.out.println("The ceil average is: "+myAvgCal.avgCeil(Integer.MAX_VALUE,1));
        System.out.println("The floor average is: "+myAvgCal.avgFloor(Integer.MAX_VALUE,1));
        System.out.println("The ceil average is: "+myAvgCal.avgCeil(0,Integer.MAX_VALUE));
        System.out.println("The floor average is: "+myAvgCal.avgFloor(0,Integer.MAX_VALUE));
        System.out.println("The ceil average is: "+myAvgCal.avgCeil(1,Integer.MAX_VALUE));
        System.out.println("The floor average is: "+myAvgCal.avgFloor(1,Integer.MAX_VALUE));
        System.out.println("The ceil average is: "+myAvgCal.avgCeil(1,11));
        System.out.println("The floor average is: "+myAvgCal.avgFloor(1,11));
        System.out.println("The ceil average is: "+myAvgCal.avgCeil(11,1));
        System.out.println("The floor average is: "+myAvgCal.avgFloor(11,1));
        System.out.println("The ceil average is: "+myAvgCal.avgCeil(1,12));
        System.out.println("The floor average is: "+myAvgCal.avgFloor(1,12));
        System.out.println("The ceil average is: "+myAvgCal.avgCeil(12,1));
        System.out.println("The floor average is: "+myAvgCal.avgFloor(12,1));
        System.out.println("The ceil average is: "+myAvgCal.avgCeil(0,0));
        System.out.println("The floor average is: "+myAvgCal.avgFloor(0,0));

        int[] myArray = new int[] {2, 1, 3, 4, 5, 7};
        myAvgCal.showArray(myArray);

        myAvgCal.sortArray(myArray);
        myAvgCal.showArray(myArray);
        System.out.println("The medium value is: "+myAvgCal.mediumValue(myArray));

    }

}

package LargestOfArray;

public class LOA {


//    static int[] array = {1, 2, 3, 4, 5, 4, 3, 2, -1};
//    static int[] array1 = { -1};
 //   static int[] array2 = { };

    // input is null
    // input is empty
    // input is ....
    //

    public static void main(String[] Args) {

        
        
        int [] testArray = null;
        int [] testArray2 = new int[0];
        int [] testArray3 = new int[10];
        // premative default 
        for(int arrayItem: testArray3) {
            System.out.println(arrayItem);
        }
        
        LOA loa = new LOA();
        loa.findLargestValue(testArray);
        loa.findLargestValue(testArray2);
        loa.findLargestValue(testArray3);
     }

    /**
     * return largest value or
     * return index of largest value
     * <p>
     * same value return first return last, random return all?
     *
     * empty ??
     */
    public int findLargestValue(int[] array) {
        int largestValue = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (largestValue < array[i]) {
                largestValue = array[i];
            }
        }
        return largestValue;
    }


}


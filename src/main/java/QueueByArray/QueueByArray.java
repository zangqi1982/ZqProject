package QueueByArray;

import java.lang.reflect.MalformedParameterizedTypeException;

public class QueueByArray {
    public static boolean result=false;
    //queue max size
//    public static int size=4;
    //queue top position
//    public static int top=0;
    //queue bottom position: pop first
 //   public static int bottom=0;
    //Stack data content
 //   public static int[] myArray;
    public static void main(String[] Args){
//        myArray=new int[size];
        MyQueue myQueue1=new MyQueue(4);
        result=myQueue1.push(1);
        result=myQueue1.push(2);
//        System.out.println("Queue pop value is: "+myQueue1.pop());
//        System.out.println("Queue pop value is: "+myQueue1.pop());
        result=myQueue1.push(3);
        result=myQueue1.push(4);
        myQueue1.showQueue();
        System.out.println("The Queue count now is: "+myQueue1.count());
        result=myQueue1.push(5);
        System.out.println("The Queue count now is: "+myQueue1.count());
        myQueue1.showQueue();
        myQueue1.delete(3);
        System.out.println("Queue pop value is: "+myQueue1.pop());
        System.out.println("The Queue count now is: "+myQueue1.count());
        System.out.println("Queue pop value is: "+myQueue1.pop());
        System.out.println("Queue pop value is: "+myQueue1.pop());
        System.out.println("Queue pop value is: "+myQueue1.pop());
        System.out.println("Queue pop value is: "+myQueue1.pop());
    }
//    public static boolean push(int[] myArray, int value){
//        if(myArray==null) {
//            System.out.println("Queue is null!");
//            return false;
//        }
//        if(top==size) {
//            System.out.println("Queue is full!");
//            return false;
//        }
//        myArray[top] = value;
//        top=top+1;
//        return true;
//    }
//    public static int pop(int[] myArray){
//        if(top==bottom){
//            System.out.println("The Queue is empty!");
//            return -1;
//        }
//        bottom=bottom+1;
//        return myArray[bottom-1];
//    }
//    public static int count(int[] myArray){
//        if(myArray==null){
//            System.out.println("The Queue is null!");
//            return 0;
//        }
//        return top-bottom;
//    }
}

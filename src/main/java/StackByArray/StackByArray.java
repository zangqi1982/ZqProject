package StackByArray;


import java.util.Stack;

public class StackByArray {
    public static boolean result = false;

    //stack max size
//    public static int size=4;
    //stack top position
//    public static int top=0;
    //Stack data content
//    public static int[] myArray;
    public static void main(String[] Args) {
//        myArray=new int[size];
        MyStack myStack1 = new MyStack(4);
//        myStack myStack1 = new myStack();
        result = myStack1.push(1);
        result = myStack1.push(2);
        result = myStack1.push(3);
        result = myStack1.push(4);
        result = myStack1.push(4);
        System.out.println("The Stack count now is: " + myStack1.count());
        result = myStack1.push(5);
        System.out.println("The Stack count now is: " + myStack1.count());
        myStack1.showStack();
        myStack1.delete(4);
        myStack1.showStack();

        System.out.println("Stack pop value is: " + myStack1.pop());
        System.out.println("Stack pop value is: " + myStack1.pop());
        System.out.println("Stack pop value is: " + myStack1.pop());
        System.out.println("Stack pop value is: " + myStack1.pop());
        System.out.println("Stack pop value is: " + myStack1.pop());
    }
}
//    public static boolean push(int[] myArray, int value){
//        if(myArray==null) {
//            System.out.println("Stack is null!");
//            return false;
//        }
//        if(top==size) {
//            System.out.println("Stack is full!");
//            return false;
//        }
//        myArray[top] = value;
//        top=top+1;
//        return true;
//    }
//    public static int pop(int[] myArray){
//        if(top==0){
//            System.out.println("The Stack is empty!");
//            return -1;
//        }
//        top=top-1;
//        return myArray[top];
//    }
//    public static int count(int[] myArray){
//        if(myArray==null){
//            System.out.println("The Stack is null!");
//            return 0;
//        }
//        return top;
//    }


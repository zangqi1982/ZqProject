package StackByArray;

public class MyStack {
    private int maxSize;
    private int top;
    private int[] myArray;
    public MyStack(int stackSize){
        this.maxSize=stackSize;
        this.top=0;
        this.myArray=new int[maxSize];
    }
    public boolean push(int pushValue){
        if(myArray==null) {
            System.out.println("Stack is null!");
            return false;
        }
        if(top==maxSize) {
            System.out.println("Stack is full! Will resize the stack automatically");
            resizeArray();
            myArray[top] = pushValue;
            top=top+1;
            return true;
        }
        myArray[top] = pushValue;
        top=top+1;
        return true;
    }
    public void resizeArray(){
        maxSize=maxSize*2;
        int[] tempArray=new int[maxSize];
        for(int i=0; i<myArray.length; i++){
            tempArray[i]=myArray[i];
        }
        myArray=tempArray;
    }
    public int pop(){
        if(top==0){
            System.out.println("The Stack is empty!");
            return -1;
        }
        top=top-1;
        int popValue=myArray[top];
        myArray[top]=0;
        return popValue;
    }
    public int count(){
        if(myArray==null){
            System.out.println("The Stack is null!");
            return 0;
        }
        return top;
    }
    public void delete(int deletedValue){
        int[] tempArray = new int[maxSize];
        int index_delay=0;
        int j=0;
        for(int i=0; i<top; i++){
            if(myArray[i]==deletedValue) {
                index_delay=index_delay+1;
            }else{
                tempArray[j]=myArray[j+index_delay];
                j=j+1;
            }
        }
        top=top-index_delay;
        myArray=tempArray;
    }
    public void showStack(){
        for (int i=0;i<top;i++){
            System.out.println(myArray[i]);
        }
    }
}

package QueueByArray;

public class MyQueue {
    private int maxSize;
    private int top;
    private int bottom;
    private int[] myArray;
    public MyQueue(int queueSize){
        this.maxSize=queueSize;
        this.top=0;
        this.bottom=0;
        this.myArray=new int[maxSize];
    }
    public boolean push(int pushValue){
        if(myArray==null) {
            System.out.println("Queue is null!");
            return false;
        }
        if(top-bottom==maxSize) {
            System.out.println("Queue is full! Queue will be resized automatically");
            resizeQueue();
            myArray[top] = pushValue;
            top=top+1;
            return true;
        }
        myArray[top] = pushValue;
        top=top+1;
        return true;
    }
    public int pop(){
        if(top==bottom){
            System.out.println("Queue is empty!");
            return -1;
        }
        bottom=bottom+1;
//        System.out.println("Now bottom is: "+bottom+" Value is: "+myArray[bottom]);
        return myArray[bottom-1];
    }
    public int count(){
        if(myArray==null){
            System.out.println("Queue is null!");
            return 0;
        }
        return top-bottom;
    }
    public void resizeQueue(){
        maxSize=maxSize*2;
        int[] tempArray=new int[maxSize];
        for(int i=0; i<top-bottom;i++){
            tempArray[i]=myArray[i];
        }
        myArray=tempArray;
    }
    public void delete(int deletedValue){
        int[] tempArray = new int[maxSize];
        int index_delay=0;
        int j=0;
        for(int i=bottom; i<top; i++){
            if(myArray[i]==deletedValue) {
                index_delay=index_delay+1;
            }else{
                tempArray[j]=myArray[j+index_delay];
//                System.out.println("Now myArray"+j+index_delay+" is:"+myArray[j+index_delay]);
//                System.out.println("Now tempArray"+j+" is:"+tempArray[j]);
                j=j+1;
            }
        }
        top=top-index_delay;
        myArray=tempArray;
    }
    public void showQueue(){
        for (int i=bottom; i<top; i++){
            System.out.println(myArray[i]);
        }
    }
}

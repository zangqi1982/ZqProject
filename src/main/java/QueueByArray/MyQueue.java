package QueueByArray;

public class MyQueue {
    public int maxSize;
    public int top;
    public int bottom;
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
        if(top==maxSize) {
            resizeQueue();
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
        int popValue=myArray[bottom];
        bottom=bottom+1;
        if(bottom>=maxSize/2){
            shrink();
        }
        System.out.println("Now bottom is: "+bottom+" Value is: "+popValue);
        return popValue;
    }
    public int count(){
        if(myArray==null){
            System.out.println("Queue is null!");
            return 0;
        }
        return top-bottom;
    }
    public void resizeQueue(){
        System.out.println("Queue is full! Queue will be resized automatically");
        maxSize=maxSize*2;
        int[] tempArray=new int[maxSize];
        for(int i=0; i<top;i++){
            tempArray[i]=myArray[i];
        }
        myArray=tempArray;
    }
    // if top value is less than 1/2 maxSize, shrink it.
    public void shrink(){
        System.out.println("Will be shrink to 1/2 size automatically");
        maxSize=maxSize/2;
        int[] tempArray=new int[maxSize];
        for(int i=0; i<maxSize; i++){
            tempArray[i]=myArray[i+bottom];
        }
        myArray=tempArray;
        bottom=bottom-maxSize;
        top=top-maxSize;
    }
    public void delete(int deletedValue){
        int[] tempArray = new int[maxSize];
        int index_delay=0;
        int j=0;
        for(int i=bottom; i<top; i++){
            if(myArray[i]==deletedValue) {
                index_delay=index_delay+1;
            }else{
                tempArray[j+bottom]=myArray[j+bottom+index_delay];
//                System.out.println("Now myArray"+j+index_delay+" is:"+myArray[j+index_delay]);
//                System.out.println("Now tempArray"+j+" is:"+tempArray[j]);
                j=j+1;
            }
        }
        top=top-index_delay;
        for(int i=bottom;i<top;i++){
            if(tempArray[i]==0 && bottom<top){
                bottom++;
            }else{
                break;
            }
        }
        myArray=tempArray;
    }
    public void showQueue(){
        for (int i=bottom; i<top; i++){
            System.out.println(myArray[i]);
        }
    }
}

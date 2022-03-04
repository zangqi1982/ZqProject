package LinkedList;

public class Node {
    
    public int data;
    public Node next;
    

    public Node(int dataValue){
        this.data = dataValue;
        this.next = null;
    }
    
    public int getData() { return data; }
    public Node getNext() { return next; }
    
    public void setData(int dataValue) { this.data = dataValue; }
    public void setNext(Node nextNode) { this.next = nextNode; }



}

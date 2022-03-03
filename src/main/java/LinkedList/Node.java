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

    void appendNode(Node head, Node targetNode){
        Node currNode=head;
        if(head==null){
            head=targetNode;
            showLinedList(head);
        } else{
            while(currNode.next!=null){
                currNode=currNode.next;
            }
            currNode.next=targetNode;
            showLinedList(head);
        }
    }

    boolean insertNode(Node head, Node targetNode, int nodeValue) {
        Node currNode=head;
        while(currNode!=null){
            if(currNode.getData()!=nodeValue){
                currNode=currNode.next;
            }else{
                targetNode.next= currNode.next;
                currNode.next=targetNode;
                showLinedList(head);
                return true;
            }
        }
        System.out.println("Can's find specific value from the Linked List!");
        return false;
    }
    boolean selectNode(Node head, int nodeValue){
        Node currNode=head;
        int i=0;
        while(currNode!=null){
            i++;
            if(currNode.getData()!=nodeValue){
                currNode=currNode.next;
            }else{
                System.out.println("The value node is in position: "+i);
                return true;
            }
        }
        System.out.println("Can's find specific value from the Linked List!");
        return false;
    }
    boolean deleteNode(Node head, int nodeValue){
        Node currNode=head;
        Node prevNode=head;
        while(currNode!=null){
            if(currNode.getData()!=nodeValue){
                prevNode=currNode;
                currNode=currNode.next;
            }else{
                prevNode.next=currNode.next;
                System.out.println("The value node is deleted successfully");
                return true;
            }
        }
        System.out.println("Can's find specific value from the Linked List!");
        return false;
    }
    void reversedLinkedList(Node head){
        Node prevNode=null;
        Node nextNode=null;
        while(head.next!=null){
            nextNode=head.next;
            head.next=prevNode;
            prevNode=head;
            head=nextNode;
        }
        head.next=prevNode;
    }
    void showLinedList(Node headNode){
        while(headNode!=null){
            System.out.println("The LinkedList is: "+headNode.getData()+"->");
            headNode=headNode.next;
        }
    }

}

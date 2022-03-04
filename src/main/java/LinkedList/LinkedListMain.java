package LinkedList;

public class LinkedListMain {
    public static void main(String[] Args){
        boolean result;
        LinkedList myLinkedList = new LinkedList();
        Node head = new Node(0);
        myLinkedList.appendNode(head,new Node(2));
        myLinkedList.appendNode(head,new Node(3));
        myLinkedList.appendNode(head,new Node(4));
        myLinkedList.appendNode(head,new Node(5));
        myLinkedList.showLinedList(head);
        result=myLinkedList.selectNode(head,3);
        result=myLinkedList.selectNode(head,0);
        result=myLinkedList.deleteNode(head,4);
        result=myLinkedList.deleteNode(head,0);
        result=myLinkedList.insertNode(head,new Node(33),3);
        result=myLinkedList.insertNode(head,new Node(44),4);
        myLinkedList.reversedLinkedList(head);
        myLinkedList.showLinedList(head);
    }
}

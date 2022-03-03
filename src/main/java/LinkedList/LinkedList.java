package LinkedList;

public class LinkedList {

    // static means all linked list share this
    private static Node head= new Node(0);
    
    // count for how many linked list created
    public static int count = 0;
    
    // length of the linked list
    private int length = 0;
    
    public static void main(String[] Args){
        boolean result;
        Node head=new Node(0);
        head.appendNode(head,new Node(2));
        head.appendNode(head,new Node(3));
        head.appendNode(head,new Node(4));
        head.appendNode(head,new Node(5));
        head.showLinedList(head);
        result=head.selectNode(head,3);
        result=head.selectNode(head,0);
        result=head.deleteNode(head,4);
        result=head.deleteNode(head,0);
        result=head.insertNode(head,new Node(33),3);
        result=head.insertNode(head,new Node(44),4);
        head.reversedLinkedList(head);
        head.showLinedList(head);
    }
//    public static void appendNode(Node targetNode){
//        Node currNode=head;
//        if(head==null){
//            head=targetNode;
//            showLinedList(head);
//        } else{
//            while(currNode.next!=null){
//                currNode=currNode.next;
//            }
//            currNode.next=targetNode;
//            showLinedList(head);
//        }
//    }
//    public static boolean insertNode(Node targetNode, int nodeValue) {
//        Node currNode=head;
//        while(currNode!=null){
//            if(currNode.getData()!=nodeValue){
//                currNode=currNode.next;
//            }else{
//                targetNode.next= currNode.next;
//                currNode.next=targetNode;
//                showLinedList(head);
//                return true;
//            }
//        }
//        System.out.println("Can's find specific value from the Linked List!");
//        return false;
//    }
//    public static boolean selectNode(int nodeValue){
//        Node currNode=head;
//        int i=0;
//        while(currNode!=null){
//            i++;
//            if(currNode.getData()!=nodeValue){
//                currNode=currNode.next;
//            }else{
//                System.out.println("The value node is in position: "+i);
//                return true;
//            }
//        }
//        System.out.println("Can's find specific value from the Linked List!");
//        return false;
//    }
//    public static boolean deleteNode(int nodeValue){
//        Node currNode=head;
//        Node prevNode=head;
//        while(currNode!=null){
//            if(currNode.getData()!=nodeValue){
//                prevNode=currNode;
//                currNode=currNode.next;
//            }else{
//                prevNode.next=currNode.next;
//                System.out.println("The value node is deleted successfully");
//                return true;
//            }
//        }
//        System.out.println("Can's find specific value from the Linked List!");
//        return false;
//    }
//    public static void reversedLinkedList(){
//        Node prevNode=null;
//        Node nextNode=null;
//        while(head.next!=null){
//            nextNode=head.next;
//            head.next=prevNode;
//            prevNode=head;
//            head=nextNode;
//        }
//        head.next=prevNode;
//    }
//    public static void showLinedList(Node headNode){
//        while(headNode!=null){
//            System.out.println("The LinkedList is: "+headNode.getData()+"->");
//            headNode=headNode.next;
//        }
//    }


}

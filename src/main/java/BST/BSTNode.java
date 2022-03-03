package BST;

public class BSTNode {
    int key;
    BSTNode left;
    BSTNode right;
    public BSTNode(int keyValue) {
        this.key = keyValue;
        left=null;
        right=null;
    }

    BSTNode addNode(BSTNode root, int keyValue){
        if(searchNode(root, keyValue)==null){
            root=new BSTNode(keyValue);
            return root;
        }else{
            System.out.println("The keyValue was already exist!");
            return null;
        }
    }
    BSTNode searchNode(BSTNode root, int keyValue){
        if(root==null || root.key==keyValue){
            return root;
        }
        if(root.key>keyValue)
            return searchNode(root.left, keyValue);
        else
            return searchNode(root.right,keyValue);
    }
}

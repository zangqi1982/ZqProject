package BST;

public class BSTree {

    public static void main(String[] Args){
        Integer[] myArray = {1,2,3,4,5,6,7,8};
        BSTree myBSTree = new BSTree();
        TreeNode root = new TreeNode();
        int n = myArray.length;
        root = myBSTree.createBSTbyArray(myArray,0,n-1);
        System.out.println(root.getValue());
        System.out.println(root.left.getValue()+"       "+root.right.getValue());
        System.out.println(root.left.left.getValue()+"   "+root.left.right.getValue()+"   "+root.right.left.getValue()+"   "+root.right.right.getValue());
        //System.out.println(root.right.right.right.right.getValue());

        //Search value through the tree
        TreeNode foundResult = myBSTree.searchNode(root,7);
        if(foundResult==null)
            System.out.println("Nothing was found!");
        else
            System.out.println("found the "+foundResult.getValue());

    }

    public TreeNode createBSTbyArray(Integer[] myArray, int start, int end){
        if(start>end){
            return null;
        }
        int mid = (start+end)/2;
        TreeNode root = new TreeNode(myArray[mid]);
        root.left = createBSTbyArray(myArray, start, mid-1);
        root.right = createBSTbyArray(myArray,mid+1, end);
        return root;
    }

    public TreeNode searchNode(TreeNode root, int val){
        if(root==null || root.getValue()==val){
            return root;
        }
        if(root.getValue()>val)
            return searchNode(root.left, val);
        else
            return searchNode(root.right,val);
    }

//    public TreeNode addNode(TreeNode root, int val){
//    }


}

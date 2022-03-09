package BST;

public class RegularTree {

    public static void main(String[] Args){
        Integer[] myArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        RegularTree myTree = new RegularTree();
        TreeNode root=myTree.createTreeByArray(myArray,0);
        System.out.println(root.left.left.right.getValue());

    }

    public TreeNode createTreeByArray(Integer[] myArray, int idx){
        if(idx>myArray.length){return null;}
        Integer value=myArray[idx];
        if(value == null){
            return null;
        }
        TreeNode root = new TreeNode(value);
        root.left=createTreeByArray(myArray,idx*2+1);
        root.right=createTreeByArray(myArray,idx*2+2);
        return root;
    }

}

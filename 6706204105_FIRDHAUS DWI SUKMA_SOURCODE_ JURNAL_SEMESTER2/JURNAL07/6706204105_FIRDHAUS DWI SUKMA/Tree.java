package Jurnal07;

public class Tree <E extends Comparable <E>>{
    private  TreeNode<E> root;

    //konstruktor menginisialisasi tree bilangan bulat yang kosong
    public Tree(){
        root = null;
    }

    //masukkan simpul baru di tree pencarian biner
    public void insertNode(E insertValue){
        if (root == null){
            root = new TreeNode<E>(insertValue);// create root node
        }else {
            root.insert(insertValue);/// call the insert method
        }
    }
    // begin preorder traversal
    public void preorderTraversal(){
        preorderHelper(root);
    }
    //metode rekursif untuk melakukan preorder traversal
    public void preorderHelper (TreeNode<E> node){
        if (node == null){
            return;
        }
        System.out.printf("%s ", node.getData());//output node data
        preorderHelper(node.getLeftNode());//traverse left subtree
        preorderHelper(node.getRightNode());//traverse right subtree
    }
    //begin inorder traversal
    public void inorderTraversal(){
        inorderHelper(root);
    }
    //metode rekursif untuk melakukan traversal inorder
    private void inorderHelper(TreeNode<E> node){
        if (node == null){
            return;
        }
        inorderHelper(node.getLeftNode());//traverse left subtree
        System.out.printf("%s ", node.getData());//output node data
        inorderHelper(node.getRightNode());//traverse right subtree
    }
    //begin postorder traversal
    public void postorderTraversal(){
        postorderHelper(root);
    }
    //metode rekursif untuk melakukan traversal postorder
    private void postorderHelper(TreeNode<E> node){
        if (node == null){
            return;
        }
        postorderHelper(node.getLeftNode());//traverse left subtree
        postorderHelper(node.getRightNode());//traverse right subtree
        System.out.printf("%s ", node.getData());//output node data
    }
    public void searchBST(E key){
        boolean hasil = searchBSTHelper(root, key);
        if (hasil)
            System.out.println("Data ditemukan");
        else
            System.out.println("Data tidak ditemukan");
    }
    //Carrano
    public boolean searchBSTHelper (TreeNode<E> node, E key){
        boolean result = false;

        if (node != null){
            if (key.equals(node.getData()))
                result = true;
            else if(key.compareTo(node.getData()) < 0)
                result = searchBSTHelper(node.getLeftNode(), key);
            else
                result = searchBSTHelper(node.getRightNode(), key);
        }
        return result;
    }
}

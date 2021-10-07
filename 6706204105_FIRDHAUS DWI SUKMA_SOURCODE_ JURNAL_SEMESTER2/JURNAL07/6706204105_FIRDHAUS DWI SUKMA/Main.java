package Jurnal07;

public class Main {
    public static void main(String[] args) {
        Tree<Character> tree = new Tree<>();

        tree.insertNode('F');
        tree.insertNode('E');
        tree.insertNode('H');
        tree.insertNode('D');
        tree.insertNode('G');
        tree.insertNode('C');
        tree.insertNode('B');
        tree.insertNode('H');
        tree.insertNode('K');
        tree.insertNode('J');

/*        System.out.printf("%nPreorder traversal%n");
        tree.preorderTraversal();
        System.out.printf("%n%nInorder traversal%n");
        tree.inorderTraversal();
        System.out.printf("%n%nPostorder traversal%n");
        tree.postorderTraversal();
        System.out.println("\n");*/

        tree.searchBST('K');
        tree.searchBST('A');
/*
        System.out.printf("%n%nPreorder tranversal%n");
        tree.preorderTraversal();

        System.out.println("%n%nInorder tranversal%n");
        tree.inorderTraversal();

        System.out.println("%n%nPostorder tranversal%n");
        tree.postorderTraversal();

        System.out.println();

        tree.searchBST();*/
    }
}

package Jurnal06;

import java.util.ArrayList;
import java.util.Stack;

public class DFS_ADJACENT {
    static ArrayList<NodeAdjacent> nodes = new ArrayList<>();

    public ArrayList<NodeAdjacent> kunjungiTetangga (int matriks[][], NodeAdjacent x) {
        int idx = -1;
        ArrayList<NodeAdjacent> tetangga = new ArrayList<>();
        for (int i = 0; i < nodes.size(); i++) {
            if (nodes.get(i).equals(x)) {
                idx = i;
                break;
            }
        }

        if (idx != -1) {
            for (int j = 0; j < matriks[idx].length; j++) {
                if (matriks[idx][j] == 1) {
                    tetangga.add(nodes.get(j));
                }
            }
        }
        return tetangga;
    }
    public void dfsStack(int matriks[][], NodeAdjacent node) {
        Stack<NodeAdjacent> stack = new Stack<>();
        stack.add(node);
        while (!stack.isEmpty()) {//stack tidak kosong akan di lakukan perulangan
            NodeAdjacent element = stack.pop();//stack tidak kosong akan di lakukan perulangan
            if (!element.isVisited()) {//apakah node topVertex sudah dikunjungin atau belum
                System.out.print(element.getData() + " ");
                element.setVisited(true);
            }

            ArrayList<NodeAdjacent> tetangga = kunjungiTetangga(matriks, element);
            for (int i = 0; i < tetangga.size(); i++) {
                NodeAdjacent n = tetangga.get(i);
                if (n != null && !n.isVisited()) {
                    stack.add(n);
                }
            }
        }
    }

    public static void main(String[] args) {
        NodeAdjacent node1 = new NodeAdjacent("A");
        NodeAdjacent node2 = new NodeAdjacent("B");
        NodeAdjacent node3 = new NodeAdjacent("C");
        NodeAdjacent node4 = new NodeAdjacent("D");
        NodeAdjacent node5 = new NodeAdjacent("E");
        NodeAdjacent node6 = new NodeAdjacent("F");
        NodeAdjacent node7 = new NodeAdjacent("G");
        NodeAdjacent node8 = new NodeAdjacent("H");
        NodeAdjacent node9 = new NodeAdjacent("I");

        nodes.add(node1);
        nodes.add(node2);
        nodes.add(node3);
        nodes.add(node4);
        nodes.add(node5);
        nodes.add(node6);
        nodes.add(node7);
        nodes.add(node8);
        nodes.add(node9);

        int matriks[][] = {
                // Simpul A  B  C  D  E  F  G  H  I
                {0, 1, 0, 1, 1, 0, 0, 0, 0}, // A
                {0, 0, 0, 0, 1, 0, 0, 0, 0}, // B
                {0, 1, 0, 0, 0, 0, 0, 0, 0}, // C
                {0, 0, 0, 0, 0, 0, 1, 0, 0}, // D
                {0, 0, 0, 0, 0, 1, 0, 1, 0}, // E
                {0, 0, 1, 0, 0, 0, 0, 1, 0}, // F
                {0, 0, 0, 0, 0, 0, 0, 1, 0}, // G
                {0, 0, 0, 0, 0, 0, 0, 0, 1}, // H
                {0, 0, 0, 0, 0, 1, 0, 0, 0}, // I
        };

        System.out.print("Traversal Graph : ");
        DFS_ADJACENT dfs = new DFS_ADJACENT();
        dfs.dfsStack(matriks, node1);
        System.out.println();
    }
}



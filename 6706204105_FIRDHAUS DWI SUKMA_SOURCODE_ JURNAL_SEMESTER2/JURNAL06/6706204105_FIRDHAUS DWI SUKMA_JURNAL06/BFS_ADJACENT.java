package Jurnal06;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS_ADJACENT {

    private Queue<NodeAdjacent> queue = new LinkedList<>();
    static ArrayList<NodeAdjacent> nodes = new ArrayList<NodeAdjacent>();


    public ArrayList<NodeAdjacent> listTetangga(int matriks[][], NodeAdjacent x) {
        int idx = -1;
        ArrayList<NodeAdjacent> tetangga = new ArrayList<>();
        for (int i = 0; i < nodes.size(); i++) {
            if (nodes.get(i).getData() == x.getData()) {
                idx = i;
                break;
            }
        }

        if (idx != -1) {
            for (int j = 0; j < matriks[idx].length; j++) {
                if (matriks[idx] [j] == 1) {
                    tetangga.add(nodes.get(j));
                }
            }
        }
        return tetangga;
    }

    public void bfs(int matriks[][], NodeAdjacent node) {
        queue.add(node);
        node.setVisited(true);
        while (!queue.isEmpty()) {//untuk mengulangi selama antrian itu tidak kosong
            NodeAdjacent element = queue.remove();//untuk menghapus antrian dan node akan masuk ke variabel
            System.out.print(element.getData() +" ");
            ArrayList<NodeAdjacent> tetangga = listTetangga(matriks, element);
            for (int i = 0; i < tetangga.size(); i++) {
                NodeAdjacent n = tetangga.get(i);
                if (n != null && !n.isVisited()) {//untuk mengecek apakah node tersebut sudah dikunjungin atau belum
                    queue.add(n);
                    n.setVisited(true);
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
        BFS_ADJACENT bfs_adjacent = new BFS_ADJACENT();
        bfs_adjacent.bfs(matriks, node1);
        System.out.println("");

    }
}



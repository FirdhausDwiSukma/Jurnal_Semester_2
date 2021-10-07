package Jurnal06;
public class NodeAdjacent {
    private String data;
    private boolean visited=false;

    NodeAdjacent(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }
}

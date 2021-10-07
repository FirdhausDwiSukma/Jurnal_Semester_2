package Jurnal02;

public class Player implements Comparable<Player> {
    String idPlayer;
    String name;
    String job;

    public Player(String idPlayer, String name, String job) {
        this.idPlayer = idPlayer;
        this.name = name;
        this.job = job;
    }
    public String getIdPlayer(){

        return idPlayer;
    }
    public String getName(){

        return name;
    }

    @Override
    public String toString(){

        return idPlayer + " " + name + " " + job;
    }

    @Override
    public int compareTo(Player o) {
        return 0;
    }
}

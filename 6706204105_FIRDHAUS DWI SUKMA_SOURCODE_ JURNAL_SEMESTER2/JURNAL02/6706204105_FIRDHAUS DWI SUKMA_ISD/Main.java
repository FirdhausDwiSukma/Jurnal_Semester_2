package Jurnal02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        GenArrayList<Player> playerList = new GenArrayList<>(3);
        GenArrayList<Items> itemList = new GenArrayList<>(3);

        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan ID Item,Name Item, Location");
            String idItems = userInput.next();
            String nameItems = userInput.next();
            String location = userInput.next();

            itemList.addData(new Items(idItems,nameItems,location));
        }

            itemList.displaySort();

        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan ID Name,Name,Job");
            String idPlayer = userInput.next();
            String name = userInput.next();
            String job = userInput.next();
            Player pyr = new Player(idPlayer,name,job);

            playerList.addData(pyr);
        }

        playerList.addData(new Player("0","Suxy","Shaman"));
        Player pyDelete = (new Player("0","Suxy","Shaman"));

        playerList.displaySort();

        playerList.removeData(pyDelete);
        playerList.display();
    }
}

package Jurnal04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        ArrayList<ItemList> listItem = new ArrayList<>();
        listItem.add(new ItemList("A010", "Good Day Mocchachino", "kopi", "10"));
        listItem.add(new ItemList("B020", "Teh Sariwangi", "teh", "5"));
        listItem.add(new ItemList("C015", "Dettol", "sabun", "10"));

        System.out.println("Masukkan Kode Barang:");
        String keyItem = userInput.nextLine();

        ItemList itemResult = searchItem(listItem, keyItem);
        System.out.println(itemResult);
    }
    private static ItemList searchItem(ArrayList<ItemList> list, String codeItem){
        ItemList result;
        Collections.sort(list);
        int index = Collections.binarySearch(list, new ItemList(codeItem, null, null, null));
        result = list.get(index);
        return result;
    }
}

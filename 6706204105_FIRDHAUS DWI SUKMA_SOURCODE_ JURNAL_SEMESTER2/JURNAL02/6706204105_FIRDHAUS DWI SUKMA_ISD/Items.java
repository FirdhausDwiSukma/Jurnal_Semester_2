package Jurnal02;

public class Items implements Comparable<Items> {
    private String idItems;
    private String nameItems;
    private String location;

    public Items(String idItems, String nameItems, String location) {
        this.idItems = idItems;
        this.nameItems = nameItems;
        this.location = location;
    }

    public String getNameItems(){
        return nameItems;
    }

@Override
    public String toString(){
        return "Items{" +
                "Id Items'" + idItems + '\'' +
                ", name ='" + nameItems + '\'' +
                ", location = '" + location + '\'' +
                '}';
    }

    @Override
    public int compareTo(Items o) {
        return 0;
    }
}

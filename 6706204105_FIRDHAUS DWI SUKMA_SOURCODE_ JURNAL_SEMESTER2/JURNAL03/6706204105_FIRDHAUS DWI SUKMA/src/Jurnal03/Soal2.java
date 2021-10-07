package Jurnal03;

public class Soal2 {
    public static void main(String[] args) {
        Queue bread = new Queue();
        bread.takeNomer(new Bread(1, "Roti Upin", "roti manis", 10));
        bread.takeNomer(new Bread(2, "Roti Ipin", "roti manis", 5));
        bread.takeNomer(new Bread(3, "Roti Icih", "roti manis", 4));
        bread.summonBread();
        bread.takeNomer(new Bread(4, "Roti Ini", "roti manis", 2));

    }
}

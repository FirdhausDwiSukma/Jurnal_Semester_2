package Jurnal09;

import java.util.HashMap;
import java.util.Map;

public class main {
    public static void main(String[] args) {
        HashMap<dataMahasiswa, Integer> mapDataMhs = new HashMap<>();
        nilai print = new nilai();

        dataMahasiswa mahasiswa1 = new dataMahasiswa("6706204105", "04", "Firdhaus");
        dataMahasiswa mahasiswa2 = new dataMahasiswa("6706204110", "04", "GLoxy");
        dataMahasiswa mahasiswa3 = new dataMahasiswa("6706203115", "03", "Huxy");
        dataMahasiswa mahasiswa4 = new dataMahasiswa("6706203120", "03", "Suxy");
        dataMahasiswa mahasiswa5 = new dataMahasiswa("6706202125", "02", "usdhaus");

        mapDataMhs.put(mahasiswa1, 90);
        mapDataMhs.put(mahasiswa2, 100);
        mapDataMhs.put(mahasiswa3, 85);
        mapDataMhs.put(mahasiswa4, 100);
        mapDataMhs.put(mahasiswa5, 75);

        double[] array = {
                mapDataMhs.get(mahasiswa1),
                mapDataMhs.get(mahasiswa2),
                mapDataMhs.get(mahasiswa3),
                mapDataMhs.get(mahasiswa4),
                mapDataMhs.get(mahasiswa5)
        };
        System.out.println("List nilai seluruh mahasiswa: ");
        for (Map.Entry<dataMahasiswa, Integer> entry : mapDataMhs.entrySet()){
            System.out.println(entry.getKey() + "Nilai = " + entry.getValue());
        }

        print.nilai(array);

        System.out.println();
        System.out.println("salah satu mahasiswa yang di hapus dari daftar: " + mahasiswa5.getNama());
        mapDataMhs.remove(mahasiswa5);

        for (Map.Entry<dataMahasiswa, Integer> entry : mapDataMhs.entrySet()){
            System.out.println(entry.getKey() + "Nilai = " + entry.getValue());
        }

    }
}

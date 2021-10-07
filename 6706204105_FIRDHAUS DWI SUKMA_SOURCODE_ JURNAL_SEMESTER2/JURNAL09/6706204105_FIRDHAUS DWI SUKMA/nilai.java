package Jurnal09;

public class nilai {

    public void nilai(double[] data) {
        double result = 0;
        for (int i = 0; i < data.length; i++)
            result += data[i];
        double mean = result/data.length;
        System.out.format("Nilai rata-rata dari nilai keseluruhan mahasiswa: %.2f \n", mean);
    }
}

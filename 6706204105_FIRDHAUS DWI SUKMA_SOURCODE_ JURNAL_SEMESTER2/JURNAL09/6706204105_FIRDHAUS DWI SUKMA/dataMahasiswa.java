package Jurnal09;

public class dataMahasiswa {
    private String NIM;
    private String kelas;
    private String nama;

    public dataMahasiswa(String NIM, String kelas, String nama) {
        this.NIM = NIM;
        this.kelas = kelas;
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    @Override
    public int hashCode() {
        //konstata ini digunakan dalam perhitungan total hash
        //gunakan bilangan primer sebagai penggali
        final int HASH_MULTIPLIER = 29;
        int idx1 = NIM.hashCode();
        int idx2 = kelas.hashCode();
        int idx3 = nama.hashCode();
        int idx = HASH_MULTIPLIER * idx1 + idx2 + idx3;//key ini adalah gabungan nim ,kelas,nama, dan nilai yg ingin dikembalikan
        return idx;
    }

    @Override
    //Memeriksa variabel pada objek
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        dataMahasiswa other = (dataMahasiswa) obj;
        return NIM.equals(other.NIM) && kelas.equals(other.kelas) && nama.equals((other.nama));
    }

    @Override
    public String toString() {
        return "(NIM = " + NIM +
                ", kelas = " + kelas +
                ", nama = " + nama +
                ')';
    }
}

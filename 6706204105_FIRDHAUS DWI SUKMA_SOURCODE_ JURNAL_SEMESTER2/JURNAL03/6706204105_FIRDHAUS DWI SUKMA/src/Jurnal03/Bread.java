package Jurnal03;

public class Bread {
    private int antrian;
    private String bread;
    private String flavor;
    private int amount;

    public Bread(int antrian, String bread, String flavor, int amount){
        this.antrian = antrian;
        this.bread = bread;
        this.flavor = flavor;
        this.amount = amount;
    }
    public int getAntrian(){
        return antrian;
    }
    public String getBread(){
        return bread;
    }

}

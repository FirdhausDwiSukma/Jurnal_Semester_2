package Jurnal04;

public class ItemList implements Comparable<ItemList>{
    private String codeItem;
    private String nameItem;
    private String jenisItem;
    private String stockItem;

    public ItemList(String codeItem, String nameItem, String jenisItem, String stockItem) {
        this.codeItem = codeItem;
        this.nameItem = nameItem;
        this.jenisItem = jenisItem;
        this.stockItem = stockItem;
    }
    public String getCodeItem() {
        return codeItem;
    }
    @Override
    public int compareTo(ItemList o){
        return this.getCodeItem().compareTo(o.getCodeItem());
    }
    @Override
    public String toString(){
        return nameItem + ", jenis barang " + jenisItem;
    }
}

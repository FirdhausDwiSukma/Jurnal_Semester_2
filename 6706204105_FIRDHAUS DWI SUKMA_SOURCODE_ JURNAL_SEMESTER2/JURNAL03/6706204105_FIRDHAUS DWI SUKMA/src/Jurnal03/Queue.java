package Jurnal03;

public class Queue {
    private SinglyLinkedList<Bread> queueList;
    private boolean wait = true;
    private int temp = 0;
    private int orders = -1;

    public Queue(){
        queueList = new SinglyLinkedList<Bread>();
    }
    public void takeNomer(Bread items){
        queueList.insertAtBack(items);
        orders++;
        if (orders == 2){
            wait = false;
        }
        if (queueList.getSize() != 1){
            System.out.println("Anda menunggu " + (queueList.getSize() - 1) + " orang lagi");
            if (wait && temp !=0){
                System.out.println("#Nomor " + items.getAntrian() + " menunggu "
                        + (queueList.getSize() - 1)
                        + " orang karena pembelian nomor "
                        + temp + " sudah selesai");
                temp = 0;
            } else if (!wait){
                System.out.println("#Pengambilan nomor yang pertama tidak perlu menunggu");
            }
        }
    }

    public void summonBread(){
        if (!wait){
            Bread items1 = queueList.removeFromFront();
            System.out.println("nomor " + items1.getAntrian() + " : pembelian " + items1.getBread() + " siap");
            temp = items1.getAntrian();
            wait = true;
            orders = 0;
        } else {
            System.out.println("Pesanan pertama belum siap");
        }
    }
}

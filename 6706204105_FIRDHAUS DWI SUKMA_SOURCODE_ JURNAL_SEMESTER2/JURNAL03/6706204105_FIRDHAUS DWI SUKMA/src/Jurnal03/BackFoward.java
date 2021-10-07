package Jurnal03;

import java.util.Stack;

public class BackFoward <E> { // type data E agar bisa gunakan type data generic apa saja
    private Stack backStack;
    private Stack wardStack;

    public BackFoward(){
        this.backStack = new Stack();
        this.wardStack = new Stack();
    }
    public void addData(E value){ // Membuat dari fungsi void untuk membentuk data yang akan dibuat
        backStack.push(value);
        wardStack.clear();
        System.out.println("Website " + value + " dibuka");
    }
    public boolean canBack(){
        return !backStack.isEmpty();
    }
    public void back(){
        if (!this.canBack()){ //Pengecekan apakah bisa di back atau tidak
            System.out.println("List Backwad kosong");
        } else {
            E value = (E) backStack.pop();
            wardStack.push(value);
            System.out.println("Mundur ke alamat " + backStack.peek());
        }
    }
    public boolean canWard (){
        return !wardStack.isEmpty();
    }
    public void forward(){
        if (!canWard()){
            System.out.println("List Forward kosong");
        } else {
            E value = (E) wardStack.pop();
            backStack.push(value);
            System.out.println("Kembali lagi ke alamat " + value);
        }
    }
}

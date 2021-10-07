package Jurnal03;

public class ListNode<E> {
    E data;
    ListNode<E> next;

    public ListNode(E value) {

        this(value, null);
    }

    public ListNode(E value, ListNode<E> node){
        data = value;
        this.next= node;
    }

    public E getData(){

        return data;
    }

    public ListNode<E> getNext(){

        return next;
    }
}

package Jurnal03;

import java.util.NoSuchElementException;

public class SinglyLinkedList <E> {
    private ListNode<E> firstNode;
    private ListNode<E> lastNode;
    private int size = 0;

    public SinglyLinkedList() {
        this.firstNode = lastNode = null;
    }

    public int getSize() {
        return size;
    }

    public void insertAtBack(E items) {
        if (isEmpty()) {
            firstNode = lastNode = new ListNode<E>(items);
        } else {
            ListNode<E> newNode = new ListNode<E>(items);
            lastNode.next = newNode;
            lastNode = newNode;
        }
        size++;
    }

    public E removeFromFront() throws NoSuchElementException {
        if (isEmpty()) {
            throw new NoSuchElementException("list is empty");
        }
        E removedItem = firstNode.getData();
        if (firstNode == lastNode) {
            firstNode = lastNode = null;
        } else {
            firstNode = firstNode.getNext();
        }
        size--;
        return removedItem;
    }

    public boolean isEmpty() {
        return firstNode == null;
    }
}
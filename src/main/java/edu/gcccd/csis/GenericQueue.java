package edu.gcccd.csis;


public class GenericQueue<E> {
    private Node<E> head;

    public E dequeue() {
        if (head == null) {
            return null;
        } else {
            E temp = head.getContent();
            head = head.getNext();
            return temp;
        }
    }

    public void enqueue(E toAdd) {
        Node<E> nextNode = new Node<>(toAdd);
        if (head == null){
            head = nextNode;
        } else {
            Node temp = head;
            while (temp.hasNext()) {
                temp = temp.getNext();
            }
            temp.setNext(nextNode);
        }
    }

    // current length of the queue
    public int length() {
        if (head == null)
            return 0;
        else {
            int length = 1;
            Node temp = head;
            while (temp.hasNext()) {
                temp = temp.getNext();
                length++;
            }
            return length;
        }
    }
}
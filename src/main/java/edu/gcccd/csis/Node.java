package edu.gcccd.csis;

public class Node<E> {
    private Node next;
    private E content;

    Node(final E content) {
        if (content == null) {throw new IllegalArgumentException();}
        this.content = content;
    }

    public E getContent() {
        return content;
    }

    public boolean hasNext() {
        return (next != null);
    }

    public Node<E> getNext() {
        return next;
    }

    void setNext(final Node<E> pointed) {
        //Throw exception if the nodes hold different types of data
        if (!pointed.getContent().getClass().equals(content.getClass())) {
            throw new IllegalArgumentException();
        }
        this.next = pointed;
    }
}

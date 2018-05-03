package edu.gcccd.csis;

class Node<E> {
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
        this.next = pointed;
    }
}

package edu.gcccd.csis;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class testGenericQueue {
    @Test
    public void testNode() {
        try {
            Node<String> tryNull = new Node<>(null);
            assertTrue( "Allows null content", false);
        } catch (IllegalArgumentException e) {
            assertTrue(true);
        }
        Node<String> a = new Node<>("string");
        assertEquals("string", a.getContent());
        assertEquals(false, a.hasNext());
        assertEquals(null, a.getNext());

        //Now add a next node to a
        Node<String>  b = new Node<>("different");
        a.setNext(b);
        assertEquals(true, a.hasNext());
        assertEquals(b, a.getNext());

        //What about unspecified type nodes?
        try {
            Node str = new Node((Integer) 8);
            b.setNext(str);
            assertTrue("Allows next node of different type", false);
        } catch (IllegalArgumentException e) {
            assertTrue(true);
        }
    }

    @Test
    public void testGenericQueue() {
        GenericQueue<String> str = new GenericQueue<>();
        assertEquals(0, str.length());
        try {
            str.enqueue(null);
            assertTrue("allows adding null", false);
        } catch (IllegalArgumentException e) {
            assertTrue(true);
        }
        str.enqueue("zero");
        str.enqueue("one");
        assertEquals("zero", str.dequeue());
        str.enqueue("two");
        assertEquals("one", str.dequeue());

        GenericQueue<Integer> num = new GenericQueue<>();
        num.enqueue(0);
        num.enqueue(1);
        assertEquals(2, num.length());
        assertEquals((Integer) 0, num.dequeue());
        assertEquals(1, num.length());
    }
}

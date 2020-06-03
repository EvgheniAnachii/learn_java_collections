import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyLinkedList<E> implements List<E> {
    private class Node {
        Node next;
        E data;
    }

    private Node head = new Node();

    @Override
    public void add(int index, E element) {
        Node newNode = new Node();
        newNode.data = element;
        Node before = head;
        int i = index - 1;
        while (i-- >= 0){
            before = before.next;
        }
        Node after = before.next;
        before.next = newNode;
        newNode.next = after;
    }

    @Override
    public boolean add(E e) {
        Node newNode = new Node();
        newNode.data = e;
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = newNode;
        return true;
    }

    @Override
    public E set(int index, E element) {
        Node n = head;
        int i = index;
        while (i-- >= 0){
            n = n.next;
        }
        E old = n.data;
        n.data = element;
        return old;
    }

    @Override
    public E remove(int index) {
        Node before = head;
        int i = index - 1;
        while (i-- >= 0) {
            before = before.next;
        }
        Node thisOne = before.next;
        Node after = thisOne.next;
        before.next = after;

        return thisOne.data;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("MyLinkedList [");
        Node n = head;
        while (n.next != null) {
            n = n.next;
            sb.append(n.data);
            if(n.next != null) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean remove(Object o) {
       return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<E> listIterator() {
        return null;
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        return null;
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        return null;
    }
}

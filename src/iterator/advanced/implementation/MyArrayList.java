package iterator.advanced.implementation;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyArrayList<E> implements List<E> {
  private class MyArrayListIterator implements Iterator<E> {
    private int progress = 0;

    @Override
    public boolean hasNext() {
      return progress < count;
    }

    @Override
    public E next() {
      return data[progress++];
    }
  }

  @SuppressWarnings("unchecked")
  private  E[] data = (E[])(new Object[10]);
  private int count = 0;

  @Override
  public boolean add(E e) {
    data[count++] = e;
    return true;
  }

  @Override
  public Iterator<E> iterator() {
    return new MyArrayListIterator();
  }

  @Override
  public String toString() {
    StringBuilder out = new StringBuilder();
    out.append("MyArrayList[");
    for (int i = 0; i < count; i++) {
      out.append(data[i]).append((", "));
    }

    if (count > 0) {
      out.setLength(out.length() - 2);
    }

    out.append("]");
    return out.toString();
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
  public Object[] toArray() {
    return new Object[0];
  }

  @Override
  public <T> T[] toArray(T[] a) {
    return null;
  }

  @Override
  public boolean remove(Object o) {
    return false;
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
  public E set(int index, E element) {
    return null;
  }

  @Override
  public void add(int index, E element) {

  }

  @Override
  public E remove(int index) {
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

package iterator.advanced.implementation;

import java.util.Iterator;
import java.util.List;

public class TryMyList {
  public static void main(String [] args) {
    List<String> ls = new MyArrayList<>();
    ls.add("One");
    ls.add("Two");
    ls.add("Three");

    System.out.println(ls);
    Iterator<String> iter = ls.iterator();
    while (iter.hasNext()) {
      System.out.println("> " + iter.next());
    }

  }
}

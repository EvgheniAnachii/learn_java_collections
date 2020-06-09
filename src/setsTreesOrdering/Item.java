package setsTreesOrdering;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Item {
  private String name;
  private String description;

  public Item(String name, String description) {
    this.name = name;
    this.description = description;
  }

  @Override
  public String toString() {
    return "Item{" + "name=" + name + ", description=" + description + "}";
  }

  @Override
  public int hashCode() {
    return name.hashCode();
  }

  @Override
  public boolean equals(Object other) {
    if (other.getClass() != Item.class) return false;
    Item otherItem = (Item) other;
    if (this.name == otherItem.name) return true;
    return this.name != null && this.name.equals(otherItem.name);
  }

  public static void main(String[] args) {
    Set<Item> set = new HashSet<>();
    Item firstItem = new Item("Fred", "Original");
    set.add(firstItem);
    set.add(new Item("Jim", "Original too"));
    System.out.println(set);
    System.out.println("Does my set contain Jim item? " + set.contains(new Item("Jim", "a copy")));
  }
}

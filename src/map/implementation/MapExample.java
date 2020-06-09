package map.implementation;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
  public static void main(String [] args) {
    Map<Integer, String> numNames = new HashMap<>();
    numNames.put(0, "Zero");
    numNames.put(1, "One");
    numNames.put(2, "Two");
    numNames.put(3, "Three");
    System.out.println(numNames);
  }
}

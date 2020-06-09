package map.implementation;

import java.util.*;

public class MapExample2 {
  public static void main(String [] args) {
    Map<String, String> translate = new TreeMap<>();
    translate.put("One", "Un");
    translate.put("Two", "Deux");
    translate.put("Three", "Trois");
    Set<String> keys = translate.keySet();
    String english = "One";
    String french = translate.get(english);
    System.out.println(english + " : " + french);
    System.out.println("-------------------------");

    Set<Map.Entry<String, String>> entries = translate.entrySet();
    for (Map.Entry<String, String> entry : entries) {
      System.out.println("Key is: " + entry.getKey());
      if (entry.getKey().equals("One")) {
        entry.setValue("0");
      }
    }
    System.out.println("Map is: " + entries);
    translate = Collections.unmodifiableMap(translate);
    translate.put(english, "try to change");
  }
}

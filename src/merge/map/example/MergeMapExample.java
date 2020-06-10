package merge.map.example;

import java.util.*;

public class MergeMapExample {
  public static void main(String[] args) {
    Map<String, Integer> shop1 = new HashMap<>();
    shop1.put("Fred", 3);
    shop1.put("Jim", 2);
    shop1.put("Alice", 3);

    Map<String, Integer> shop2 = new HashMap<>();
    shop2.put("Alice", 2);
    shop2.put("Jim", 4);
    shop2.put("Sheila", 6);

    Map<String, Integer> shop3 = new HashMap<>();
    shop3.put("William", 4);
    shop3.put("Fred", 4);
    shop3.put("Jim", 1);
    shop3.put("Alice", 100);

    Map<String, Integer> totals = new HashMap<>();

    List<Map<String, Integer>> stores = new ArrayList<>(Arrays.asList(shop1, shop2, shop3));
    System.out.println("------------>");
    System.out.println(stores);
    System.out.println("<------------");

    for (Map<String, Integer> m : stores) {
      m.forEach((k, v) -> System.out.printf("%s - %d\n", k,v));
    }

    for (Map<String, Integer> m : stores) {
      m.forEach((k, v) -> totals.merge(k, v, (v1, v2) -> v1 + v2));
    }

    System.out.println("^^^^^^^^^^^^^^^^^^^");
    totals.forEach((k, v) -> System.out.printf("%s spent %d\n", k, v));
  }
}

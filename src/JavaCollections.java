import java.time.LocalDateTime;
import java.util.*;

public class JavaCollections {
    public static void showListContents(List l) {
        for (Object obj : l) {
            System.out.println("> " + obj);
        }
    }

    public static void createAndDisplayList() {
        List<String> list = new ArrayList<>();
        list.add("Fred");
        //list.add(LocalDateTime.now());
        System.out.println(list.get(1));
        System.out.printf("Jim is%s present\n", (list.contains("Jim") ? "" : " not"));
        System.out.printf("Bill is%s present\n", (list.contains("Bill") ? "" : " not"));
    }

    public static void addDate(List l) {
        l.add(LocalDateTime.now());
    }

    public static void displayNotGeneric() {
        List<String> list = new ArrayList();
        list.add("Fred");
        addDate(list);
        for (int idx = 0; idx < list.size(); idx++) {
            String st = list.get(idx);
        }
    }

    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        LinkedList ll = new LinkedList();
        ll.add("My linked 1");
        ll.add("My linked 1");
        ll.add("My linked 2");
        al.add("One");
        al.add("Two");
        al.add("Three");
        /*System.out.println("My array: " + al);
        Set<String> ss = new HashSet<>(ll);
        showListContents(al);
        System.out.println("Show LL:");
        showListContents(ll);
        System.out.println("Show LL but from Set: "+ ss);
        LinkedList listFromSet = new LinkedList(ss);
        showListContents(listFromSet);

        Iterator<String> is = al.iterator();
        while (is.hasNext()) {
            System.out.println("> caling next: " + is.next());
        }*/
        tryMyLinkedList();
    }

    public static void operateWithList() {
        List<String> myList = new ArrayList<>();
        myList.add("Jim");
        myList.add("Doe");
        System.out.println(myList);
        myList.add(1, "Sheila");
        System.out.println(myList);
        myList.set(1, "Heily");
        System.out.println(myList);
        myList.remove(1);
        System.out.println(myList);
        myList.add(1, "Heily");
        myList.add(3, "Heily");
        System.out.println(myList);
        myList.remove("Heily");
        System.out.println(myList);
    }

    public static void tryMyArrayList() {
        List<String> myList = new MyArrayList<>();
        myList.add("Hi");
        System.out.println(myList.toString());
    }

    public static void tryMyLinkedList() {
        List<String> myList = new MyLinkedList<>();
        myList.add("hi there");
        myList.add(1, "by now");
        myList.add(2,"welcome again");
        System.out.println(myList.toString());
        myList.remove(1);
        System.out.println(myList.toString());
    }
}

package hashStorage;

public class FakeHashStore {
  private static final int STORE_SIZE = 10;
  private Object[][] store = new Object[STORE_SIZE][4];

  public void insert(Object o) {
    Object[] target = store[storeLocation(o)];
    int idx = 0;
    while (target[idx] != null) {
      idx++;
    }
    target[idx] = o;
  }

  public boolean contains(Object o) {
    Object [] target = store[storeLocation(o)];
    int idx = 0;
    while (target[idx] != null) {
      if (o.equals(target[idx])) return true;
      idx++;
    }
    return false;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    /*for(Object o : store) {
      if(o != null) {
        sb.append(o).append(", ");
      }
    }*/
    for (Object [] row : store) {
      int idx = 0;
      while (row[idx] != null) {
        sb.append(row[idx]).append(", ");
        idx++;
      }
    }
    if(sb.length() >= 2) {
      sb.setLength(sb.length() - 2);
    }
    return sb.toString();
  }

  public int storeLocation(Object o) {
    return Math.abs(o.hashCode()) % STORE_SIZE;
  }

  public static void main(String[] args) {
    FakeHashStore fhs = new FakeHashStore();
    fhs.insert(new Student("Sheila"));
    fhs.insert(new Student("Harima nasuhai"));
    fhs.insert(new Student("Yi"));
    fhs.insert(new Student("Alain"));
    fhs.insert(new Student("Fred"));

    System.out.println("In store are: " + fhs);

    System.out.println("Is contained? " + fhs.contains(new Student("Yi")));

    fhs.insert(new Fruit(Fruit.Color.BLUE));
    fhs.insert(new Fruit(Fruit.Color.GREEN));
    System.out.println("In store are: " + fhs);
  }
}

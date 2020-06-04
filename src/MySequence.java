import java.util.Iterator;

public class MySequence implements Iterable<Integer> {
  final int start, increment, limit;

  public MySequence(int start, int increment, int limit) {
    this.start = start;
    this.increment = increment;
    this.limit = limit;
  }

  @Override
  public Iterator<Integer> iterator() {
    return new SequenceIterator(this);
  }
}



class SequenceIterator implements Iterator<Integer> {
  private MySequence sequence;
  private int nextValue;

  public SequenceIterator(MySequence sequence) {
    this.sequence = sequence;
    this.nextValue = sequence.start;
  }

  @Override
  public boolean hasNext() {
    return this.nextValue <= this.sequence.limit;
  }

  @Override
  public Integer next() {
    if (this.sequence.limit < this.nextValue) {
      try {
        throw new NoSuchFieldException("No such element");
      } catch (NoSuchFieldException e) {
        e.printStackTrace();
      }
      return this.sequence.limit;
    } else {
        int rv = this.nextValue;
        this.nextValue += this.sequence.increment;
        return rv;
    }
  }

  public static void main(String[] args) {
    /*for (Integer i : new MySequence(1, 1, 4)) {
      System.out.println(i);
    }*/

    MySequence myseq = new MySequence(1, 1, 4);
    Iterator iter = myseq.iterator();
    System.out.println("next: " + iter.next());
    System.out.println("next: " + iter.next());
    System.out.println("next: " + iter.next());
    System.out.println("next: " + iter.next());
    System.out.println("next: " + iter.next());
  }
}

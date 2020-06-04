package ordering;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StudentGradeComparator implements Comparator<Student> {

  @Override
  public int compare(Student o1, Student o2) {
    return Float.compare(o1.getGpa(), o2.getGpa());
  }
}

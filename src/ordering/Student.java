package ordering;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Student implements Comparable<Student> {
  private String name;
  private float gpa;

  public int getHeight() {
    return height;
  }

  private int height;
  private int debt;

  public String getName() {
    return this.name;
  }

  public float getGpa() {
    return this.gpa;
  }

  public Student(String name, float gpa, int height, int debt) {
    this.name = name;
    this.gpa = gpa;
    this.height = height;
    this.debt = debt;
  }

  @Override
  public String toString() {
    return "Student{" + "name=" + name + ", gpa=" + gpa + ", height: " + height + "}";
  }

  @Override
  public int compareTo(Student o) {
    return Float.compare(this.gpa, o.gpa);
  }

  public static void main(String[] args){
    Student st1 = new Student("Fred", 2.6F, 72, 12_000);
    Student st2 = new Student("Alise", 1.4F, 73, 4_000);
    Student st3 = new Student("Paul", 8.6F, 73, 4_000);
    List<Student> ls = new ArrayList<>(Arrays.asList(st1, st2, st3));
    System.out.println("before: ");
    for (Student s: ls) {
      System.out.println("> " + s);
    }
    ls.sort(null);
    System.out.println("after: ");
    for (Student s: ls) {
      System.out.println("> " + s);
    }

    ls.sort(new StudentGradeComparator());
    System.out.println("GradeComparator");
    for (Student s : ls) {
      System.out.println(s);
    }

    ls.sort(new StudentHeightComparator());
    System.out.println("HeightComparator");
    for (Student s : ls) {
      System.out.println(s);
    }
  }
}

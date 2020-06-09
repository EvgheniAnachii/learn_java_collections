package setsTreesOrdering.treeImplementation;

import java.util.Set;
import java.util.TreeSet;

public class Student implements Comparable<Student> {
  private String name;
  private String address;
  private float gpa;

  public Student(String name, String address, Float gpa) {
    this.name = name;
    this.address = address;
    this.gpa = gpa;
  }

  @Override
  public boolean equals(Object other) {
    if (other.getClass() != Student.class) return false;
    Student otherStudent = (Student)other;
    return name.equals(otherStudent.name) && address.equals(otherStudent.address);
  }


  @Override
  public int hashCode() {
    return name.hashCode() + address.hashCode();
  }

  @Override
  public String toString() {
    return "Student{" + "name= " + name + ", address=" + address + ", gpa=" + gpa + "}";
  }

  public String getName() {
    return name;
  }

  public String getAddress() {
    return address;
  }

  public float getGpa() {
    return gpa;
  }

  @Override
  public int compareTo(Student o) {
    return name.compareTo(o.name);
  }

  public static void main(String[] args) {
    Set<Student> school = new TreeSet<>();
    Student studentJim = new Student("Jim", "Far Away", 3.6F);
    school.add(new Student("Fred", "here", 2.9F));
    school.add(studentJim);
    school.add(new Student("Sheila", "There", 3.2F));

    for (Student st: school) {
      System.out.println(st);
    }

    Student anotherJim = new Student("Jim", "Other location", 3.4F);
    school.add(anotherJim);
    System.out.println("---------------------------------");
    for (Student st: school) {
      System.out.println(st);
    }
    System.out.println("---------------------------------");
    System.out.println("Is another Jim is the same one? " + studentJim.equals(anotherJim));
  }
}

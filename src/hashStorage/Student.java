package hashStorage;

public class Student {
  private String firstName;

  public Student(String firstName) {
    this.firstName = firstName;
  }

  @Override
  public int hashCode() {
    return firstName.length();
  }

  @Override
  public boolean equals(Object other) {
    if(other.getClass() != Student.class) return false;
    Student otherStudent = (Student)other;
    return otherStudent.firstName.equals(firstName);
  }

  @Override
  public String toString() {
    return "Student{ firstName: " + firstName + "}";
  }
}

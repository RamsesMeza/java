public class Classroom {

  private String studentName;
  private static String schoolName = "UPA";

  public Classroom(String studentName) {
    this.studentName = studentName;

  }

  public void printInfo() {
    System.out.println(String.format("name: %s, schoolName: %s", this.studentName, Classroom.schoolName));
  }

  public static String getSchoolName() {
    return schoolName;
  }

  public static void setSchoolName(String schoolName) {
    Classroom.schoolName = schoolName;
  }

  public String getStudentName() {
    return studentName;
  }

  public void setStudentName(String studentName) {
    this.studentName = studentName;
  }

}

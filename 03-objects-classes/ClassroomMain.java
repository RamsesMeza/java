public class ClassroomMain {
  public static void main(String[] args) {
    Classroom studentOne = new Classroom("Ramses");
    Classroom studentTwo = new Classroom("Derek");

    studentOne.printInfo();
    studentTwo.printInfo();

    System.out.println(Classroom.getSchoolName());
    Classroom.setSchoolName("UAA");

    studentOne.setSchoolName("UTA");

    studentOne.printInfo();
    studentTwo.printInfo();
  }

}

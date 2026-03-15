public class Main {
  public static void main(String[] args) {
    byte variableByte = 1;
    short variableShort = 1234;
    int variableInt = 10;
    long variableLong = 12341234;
    // Its necessary to specify with an F at the end of the value to manage as a
    // float type
    float variableFloat = 123.9F;
    double variableDouble = 123.9;
    // Very interesting that for char type needs to use simple quote
    char individualCharacter = 'a';
    String simpleText = "Hola";
    boolean isActive = true;

    System.out.println(variableByte);
    System.out.println(variableShort);
    System.out.println(variableInt);
    System.out.println(variableLong);
    System.out.println(variableFloat);
    System.out.println(variableDouble);
    System.out.println(simpleText);
    System.out.println(individualCharacter);
    System.out.println(isActive);
  }
}

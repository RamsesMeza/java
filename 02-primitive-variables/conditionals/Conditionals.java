package conditionals;

public class Conditionals {
  public static void main(String[] args) {
    int age = -10;

    final int LEGAL_AGE = 18;
    boolean haveEnoughAge = age > LEGAL_AGE;

    if (age <= 0) {
      System.out.println("You age can't be less or equals to cero");
    } else if (haveEnoughAge) {
      System.out.println("You have age to continue");
    } else {
      System.out.println("You don't have the enough age to continue");
    }

    int day = 0;

    switch (day) {
      case 1:
        System.out.println("It's Monday");
        break;
      case 2:
        System.out.println("It's Tuesday");
        break;
      case 3:
        System.out.println("It's Wednesday");
        break;
      case 4:
        System.out.println("It's Thursday");
        break;
      case 5:
        System.out.println("It's Friday");
        break;
      case 6:
        System.out.println("It's Saturday");
        break;
      case 7:
        System.out.println("It's Sunday");
        break;
      default:
        System.out.println("The day number is not valid");
    }

  }
}

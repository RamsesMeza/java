package trycatch.withresources;

public class AutoCloseableExample {
  public static void main(String[] args) {

    try (FakeDataBaseConnection db = new FakeDataBaseConnection()) {

      db.fetchData();

    } catch (Exception e) {
      System.out.println("An error happen");
      e.printStackTrace();
    }
  }
}

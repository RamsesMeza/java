package trycatch.withresources;

public class FakeDataBaseConnection implements AutoCloseable {

  public FakeDataBaseConnection() {
  }

  public void fetchData() {
    System.out.println("Information");
  }

  @Override
  public void close() throws Exception {
    System.out.println("Connection has closed");
  }
}
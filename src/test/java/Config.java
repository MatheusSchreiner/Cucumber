import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Config {

  @Before("@token")
  public void token() {
  }

  @After("@deleteUser")
  public void deleteUser() {
  }

}

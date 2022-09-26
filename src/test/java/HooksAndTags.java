import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Então;

public class HooksAndTags {

  @Before
  public void Before() {
    System.out.println("Primeiro Hook Before");
  }

  @Before("@tag")
  public void Before2() {
    System.out.println("Segundo Hook Before");
  }

  @After
  public void After() {
    System.out.println("Primeiro Hook After");
  }

  @Então("roda")
  public void roda() {
  }

  @Dado("que estou utilizando a tag wip")
  public void queEstouUtilizandoATagWip() {
    System.out.println("Não irá aparecer");
  }

  @Dado("que estou utilizando a tag tag")
  public void queEstouUtilizandoATagTag() {
  }

  @Entao("Apenas este cenario ira rodar o segundo Before")
  public void apenasEsteCenarioIraRodarOSegundoBefore() {
  }
}

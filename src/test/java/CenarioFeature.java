import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class CenarioFeature {
  private static int soma;

  @Quando("Joao soma dois numeros")
  public void joaoSomaDoisNumeros() {
    soma = 2 + 2;
  }

  @Então("o resultado sera quatro")
  public void oResultadoSeraQuatro() {
    if (soma == 4) {
      System.out.println("OK");
    }
  }
}

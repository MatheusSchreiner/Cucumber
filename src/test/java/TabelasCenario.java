import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class TabelasCenario {

  static int soma;

  @Quando("joazinho soma {int} e {int}")
  public void joazinhoSomaPrimeironumeroESegundonumero(int a, int b) {
    soma = a + b;
  }

  @Então("o resultado da soma sera {int}")
  public void oResultadoDaSomaSeraResultado(int c) {
    if (soma == c) {
      System.out.println("OK");
    } else {
      System.out.println("Deu Ruim!");
    }
  }
}

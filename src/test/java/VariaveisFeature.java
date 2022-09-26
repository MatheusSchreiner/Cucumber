import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

import java.util.Map;

public class VariaveisFeature {

  private static int soma;

  @Quando("joazinho soma {int} + {int}")
  public void joazinhoSoma(int arg0, int arg1) {
    soma = arg0 + arg1;
  }

  @Então("o resultado sera {int}")
  public void oResultadoSera(int arg0) {
    if (soma == arg0) {
      System.out.println(arg0 + " = " + soma);
    }
  }

  @E("deu tudo {word}")
  public void deuTudoOk(String arg) {
    if (arg.equals("OK")) {
      System.out.println(arg);
    }
  }

  @Quando("eu passo varios dados")
  public void euPassoVariosDados(Map<String, String> user) {
    user.values().forEach(System.out::println);
  }
}

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Então;

public class ContextoFeature {

  static int idade = 30;

  @Dado("que o usuario tem")
  public void queOUsuarioTemIdade() {
    System.out.println("Ola!!!");
    idade+= 10;
  }

  @Entao("usuario tem {int} anos")
  public void usuarioTemAnos(int arg0) {
    System.out.println(idade + "  " + arg0);
  }

  @Então("agora ele tem {int} anos")
  public void agoraEleTemAnos(int arg0) {
    System.out.println(idade + "  " + arg0);
  }
}

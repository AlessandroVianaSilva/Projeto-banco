
import java.util.List;

public class Notificacao {

  public void enviaEmail(String operacao, double valor) {
    System.out.println("##### Enviando email #####");
    System.out.println("Operação realizada: " + operacao);
    System.out.println("Valor: " + valor);
    System.out.println("##### Email enviado #####");
  }
}
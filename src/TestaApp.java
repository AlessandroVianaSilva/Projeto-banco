import java.time.LocalDate;

public class TestaApp {

  public static void main(String[] args) {
      Cliente cliente1 = new Cliente("Alessandro", "324343242", 
      new Endereco("lagradouro", 1, "bairro", "cidade", "uf"), LocalDate.of(2000, 01, 14));
      Conta cc = new contaCorrente(1, 2, cliente1);
      Conta cp = new contaPoupanca(1, 4, cliente1);

      cc.deposita(100);
      cp.deposita(100);

      cc.saca(50);
      cp.saca(50);

      System.out.println("saldo atual da conta cc: " + cc.getSaldo());
      System.out.println("saldo atual da conta cp: " + cp.getSaldo());

      cc.saca(150);
      cp.saca(150);

      System.out.println("saldo atual da conta cc: " + cc.getSaldo());
      System.out.println("saldo atual da conta cp: " + cp.getSaldo());
}
}
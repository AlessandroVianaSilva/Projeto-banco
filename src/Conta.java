public class Conta {
  private int agencia;
  private int numero;
  private double saldo;
  private Cliente cliente;
  private static int contas = 0;
  private static Notificacao notifica = new Notificacao();

  public Conta(int agencia, int numero, Cliente cliente) {
      this.agencia = agencia;
      this.numero = numero;
      this.saldo = 0.0;
      this.cliente = cliente;
      contas++;
  }

  public static int getContas() {
      return contas;
  }

  public int getAgencia() {
      return agencia;
  }

  public int getNumero() {
      return numero;
  }

  public String getNome() {
      return cliente.getNome();
  }

  public double consultaSaldo() {
      return this.saldo;
  }

  public boolean deposita(double valor) {
      if (valor > 0.0) {
          this.saldo += valor;
          System.out.println("Deposito de R$ " + valor + " realizado com sucesso!");
          return true;
      } else {
          System.out.println("Valor para deposito não pode ser menor que 0!");
          return false;
      }
  }

  public double sacar(double valor) {
      if (valor > this.saldo) {
          System.out.println("Saldo insuficiente!");
          return 0.0;
      } else {
          this.saldo -= valor;
          System.out.println("Saque de R$ " + valor + " realizado com sucesso!");
          return valor;
      }
  }

  public void transfere(Conta contaDestino, double valor) {
      if (this.sacar(valor) > 0.0) {
          contaDestino.deposita(valor);
          System.out.println("Transferência de R$ " + valor + " realizada com sucesso para "
                  + contaDestino.getNome());
      }
  }

  public void enviaNotificacao(String operacao, double valor) {
      notifica.enviaEmail(cliente.getEmail(), operacao, valor);
  }
}
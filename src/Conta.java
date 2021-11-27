public class Conta {
    private int agencia;
    private int numero;
    private Cliente cliente;
    private double saldo;
  
    private static int quantidadeDeContas;
  
    public Conta(int agencia, int numero, Cliente cliente) {
      System.out.println("Construindo objeto da classe conta");
      quantidadeDeContas++;
      this.agencia = agencia;
      this.numero = numero;
      this.cliente = cliente;
    }
  
    public void deposita(double valor) {
      this.saldo = this.saldo + valor;
      System.out.println("Valor depositado, agora sua conta tem: " + saldo);
    }
  
    public void saca(double valor) {
      if (valor <= this.saldo) {
        this.saldo = this.saldo - valor;
        System.out.println("Valor sacado: " + valor);
      } else {
        System.out.println("Saque não realizado, valor acima do saldo atual!");
      }
    }
  
    public double getSaldo() {
      return saldo;
    }
  
    public int getAgencia() {
      return this.agencia;
    }
  
    public int getNumero() {
      return numero;
    }
  
    public Cliente getCliente() {
      return cliente;
    }
  
    public static int getQuantidadeDeContas() {
      return quantidadeDeContas;
    }
  
  }
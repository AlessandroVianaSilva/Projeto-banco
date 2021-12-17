abstract public class Conta {
    private int agencia;
    private int numero;
    private Cliente cliente;
    protected double saldo;
    private static int quantidadeDeContas;
  
    public Conta(int agencia, int numero, Cliente cliente) {
      System.out.println("Construindo objeto da classe conta");
      quantidadeDeContas++;
      this.agencia = agencia;
      this.numero = numero;
      this.cliente = cliente;
    }

    public void deposita(double valor) {
      if (valor > 0) {
        this.saldo = this.saldo + valor;
        this.enviaNotificacao("Depósito", valor);
        System.out.println("Valor depositado na conta " + this.numero);
      }
    }
  
    abstract public boolean saca(double valor);
  
   abstract public void transfere(double valor, Conta contaDestino);
  
    protected void enviaNotificacao(String operacao, double valor) {
      new Notificacao().enviaEmail(operacao, valor);
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
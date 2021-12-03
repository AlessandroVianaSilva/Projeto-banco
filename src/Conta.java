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
      if (valor>0){
        this.saldo = this.saldo + valor;
      System.out.println("Valor depositado, agora sua conta tem: " + saldo);
      } else{
        System.out.println("Para fazer deposito, é necessário que o valor seja a cima de R$0");
      }
      
    }
  
    public boolean saca(double valor) {
      if (valor > 0 && valor <= this.saldo) {
        this.saldo = this.saldo - valor;
        System.out.println("Valor sacado: " + valor);
        return true;
      } else {
        System.out.println("Saque não realizado, valor acima do saldo atual!");
        return false;
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
    public void transfere(double valor, Conta contaDestino){
      boolean saqueComSucesso = this.saca(valor);
      if (saqueComSucesso){
        contaDestino.deposita(valor);
      }
      } 

    public double transfere(double valor){
      if (valor<=this.saldo){
       this.saldo-=valor;
       System.out.println("Transferência realizada!");
       return valor;
     }else{
       System.out.println("Seu saldo é insuficiente para completar a transferencia");
        return 0.0;
     }
    }
  }

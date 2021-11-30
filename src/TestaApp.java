public class TestaApp {

    public static void main(String[] args) {
  
      System.out.println("Abrindo o banco Maut, contas existentes: " + Conta.getQuantidadeDeContas());
  
      Cliente cliente1 = new Cliente("Alessandro Viana", "Santa Quiteria","84738473847");
      System.out.println("Cliente1 "+cliente1.getendereco());
      cliente1.setendereco("Santa Quiteria");
      System.out.println("\n");
  
      Conta conta1 = new Conta(123, 45, cliente1);
       System.out.println(conta1.getAgencia() + " - " + conta1.getNumero() + " - " +
       conta1.getCliente().nome);
  
      System.out.println("Quantidade de contas no Banco Maut: " + Conta.getQuantidadeDeContas());
  
       conta1.deposita(100);
       System.out.println("Saldo atual da conta1: " + conta1.getSaldo());
  
       conta1.saca(50);
       System.out.println("Saldo atual da conta1: " + conta1.getSaldo());
  
       conta1.deposita(500);
       System.out.println("Saldo atual da conta1: " + conta1.getSaldo());
  
       System.out.println("Saldo atual da conta1: " + conta1.getSaldo());
  
       System.out.println(conta1.getAgencia());
  
      Cliente cliente2 = new Cliente("Antonio Joao", "Parnaiba", "0123333555");
      
  
      Conta conta2 = new Conta(1, 81, cliente2);
      System.out.println("Quantidade de contas no Banco Maut: " + Conta.getQuantidadeDeContas());
       System.out.println(conta2.getSaldo());
       conta2.deposita(10000);
       System.out.println(conta2.getSaldo());
    }
  }
public class contaCorrente extends Conta {
    private double chequeEspecial;
    
    public contaCorrente(int agencia, int numero, Cliente cliente){
        super (agencia, numero, cliente);
        this.chequeEspecial = 100;
    }

    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }

    public double getChequeEspecial() {
        return chequeEspecial;
    }

    @Override
    public boolean saca(double valor) {
        if (valor > 0 && valor <= super.saldo + this.chequeEspecial) {
          super.saldo = super.saldo - valor;
          System.out.println("Valor sacado da conta " + super.getNumero());
          this.enviaNotificacao("Saque", valor);
          return true;
        } else {
          System.out.println("Saque não realizado, valor acima do saldo atual!");
          return false;
        }
      }
      @Override
      public void transfere(double valor, Conta contaDestino) {
        System.out.println("Iniciando transferência entre contas!");
        boolean saqueComSucesso = this.saca(valor);
        if (saqueComSucesso) {
          contaDestino.deposita(valor);
          super.enviaNotificacao("Transferência", valor);
        }
      }
}

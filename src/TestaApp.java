import java.util.Date;

public class TestaApp {
    public static void main(String[] args) throws Exception {
        // Metodo abrir separado da classe Conta
        abraConta abraConta = new abraConta();

        // Criando duas contas para realizar os testes
        Conta conta1 = abraConta.abrir("Alessandro", "84733847383", new Date(), "alessandro@gmail.com", new Endereco("Rua", 1, "Bairro", "Parnaiba", "PI"));
        Conta conta2 = abraConta.abrir("João", "09983742", new Date(), "joao@gmail.com", new Endereco("Rua", 2, "Bairro", "Picos", "PI"));

        // Verificando a quantidade de contas criadas pela classe Conta
        System.out.println("Contas criadas: " + Conta.getContas() + "\n");

        // Adicioando dinheiro na conta 1 e testando metodo depositar
        conta1.deposita(50.0);

        // Verificando saldo inicial das contas
        System.out.println("Saldo conta 1: " + conta1.consultaSaldo());
        System.out.println("Saldo conta 2: " + conta2.consultaSaldo() + "\n");

        // Testando metodo transferir
        conta1.transfere(conta2, 50.0);

        // Verificando saldo após transferência
        System.out.println("Saldo conta 1 após transfência: " + conta1.consultaSaldo());
        System.out.println("Saldo conta 2 após transfência: " + conta2.consultaSaldo() + "\n");

        // Testando metodo sacar
        conta1.sacar(50.0);
        System.out.println("Saldo conta 1 após saque: " + conta1.consultaSaldo() + "\n");

        // Testando metodo sacar com saldo insuficiente
        conta1.sacar(100.0);
        System.out.println("Saldo conta 1 após saque: " + conta1.consultaSaldo());

        // Testando envio de email
        conta1.enviaNotificacao("Teste email", 200.0);
    }
}
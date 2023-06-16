import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();
        cliente1.nome = "Pedro";
        cliente1.dataNascimento = LocalDate.parse("1995-02-14");

        Cliente cliente2 = new Cliente();
        cliente2.nome = "Fernanda";
        cliente2.dataNascimento = LocalDate.parse("1996-10-30");

        ContaCorrente conta1 = new ContaCorrente();
        conta1.cliente = cliente1;

        ContaCorrente conta2 = new ContaCorrente();
        conta2.cliente = cliente2;

        conta1.depositar(150.00);
        conta1.transferir(100.00, conta2);

        conta1.incluiTransacao(50.00);
        conta1.incluiTransacao(100.00);

        LocalDate dataI = LocalDate.parse("2023-06-14");
        LocalDate dataF = LocalDate.parse("2023-06-28");

        conta1.consultaExtrato(dataI, dataF);
    }
}
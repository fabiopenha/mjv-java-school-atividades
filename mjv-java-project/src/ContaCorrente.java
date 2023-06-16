import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ContaCorrente {
    Cliente cliente;
    String numeroConta;
    String numeroAgencia;
    Double saldoConta = 0.0;

    List<Transacao>transaçoes = new ArrayList();

    public void sacar(Double valor) {
        saldoConta -= valor;
    }

    public void depositar(Double valor) {
        saldoConta += valor;
    }

    public void transferir(Double valor, ContaCorrente outraConta) {
        if(saldoConta < valor) {
            System.out.println("Saldo insuficiente");
            return;
        }
        saldoConta-= valor;
        outraConta.saldoConta = valor;
    }

    public Double consultaSaldo(){
        return saldoConta;
    }

    public void incluiTransacao(Double valor){
        Transacao t = new Transacao();
        t.data = LocalDate.now();
        t.descricao = "Transferência de pagamento";
        t.valor = valor;
        t.tipo = "Transferência";

        transaçoes.add(t);
    }

    public void consultaExtrato(LocalDate dataInicio, LocalDate dataFim){
        transaçoes.forEach(transacao -> {
            if (
                transacao.data.isAfter(dataInicio) &&
                transacao.data.isBefore(dataFim)
            ){
                System.out.println(transacao);
                return;
            }

            System.out.println("Sem transações  durante este período");
        });
    }

    public void cancelarConta(){

    }
}

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {
         Set<Cadastro> cadastros = new LinkedHashSet();

         Cadastro cadastro1 = new Cadastro();
         cadastro1.setNome("Pedro");
         cadastro1.setCpf("999.999.999-99");
         cadastro1.setDataNascimento(LocalDate.parse("1995-02-14"));
         cadastro1.setSexo(Sexo.valueOf("M"));
         cadastro1.setLogradouro("Rua dos Alfeneiros");
         cadastro1.setLogradouro("Rua dos Alfeneiros");
         cadastro1.setNumero("nº 4");
         cadastro1.setBairro("Little Whinging");
         cadastro1.setComplemento("casa do Harry");
         cadastro1.setCidade("Rio de Janeiro");
         cadastro1.setEstado("RJ");
         cadastro1.setEmail("fabio@email.com");
         cadastro1.setTelefone(999999999L);
         cadastro1.setCelular(999999999L);
         cadastro1.setCelularWhats(true);
         cadastro1.setProfissao("Desenvolvedor");
         cadastro1.setEmpresa("Nome da Empresa");
         cadastro1.setSalario(2.500);
         cadastro1.setEmpregoAtual(true);
         cadastro1.setPretencaoMinima(2.500);
         cadastro1.setPretencaoMaxima(2.400);
         cadastro1.setHabilidades("Java");

         Cadastro cadastro2 = new Cadastro();
         cadastro2.setNome("Fernanda");
         cadastro2.setCpf("999.999.999-99");
         cadastro2.setDataNascimento(LocalDate.parse("1995-02-14"));
         cadastro2.setSexo(Sexo.valueOf("M"));
         cadastro2.setLogradouro("Rua dos Alfeneiros");
         cadastro2.setLogradouro("Rua dos Alfeneiros");
         cadastro2.setNumero("nº 4");
         cadastro2.setBairro("Little Whinging");
         cadastro2.setComplemento("casa do Harry");
         cadastro2.setCidade("Rio de Janeiro");
         cadastro2.setEstado("RJ");
         cadastro2.setEmail("fabio@email.com");
         cadastro2.setTelefone(999999999L);
         cadastro2.setCelular(999999999L);
         cadastro2.setCelularWhats(true);
         cadastro2.setProfissao("Desenvolvedor");
         cadastro2.setEmpresa("Nome da Empresa");
         cadastro2.setSalario(2.500);
         cadastro2.setEmpregoAtual(true);
         cadastro2.setPretencaoMinima(2.500);
         cadastro2.setPretencaoMaxima(2.400);
         cadastro2.setHabilidades("Java");

         cadastros.add(cadastro1);
         cadastros.add(cadastro2);

         SalvarDados salvarCSV = new SalvarDados();
         salvarCSV.escreverNoAruivoCSV(cadastros);

    }
}
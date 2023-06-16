import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.text.DecimalFormat;
import java.util.Set;

public class SalvarDados {
    DecimalFormat df = new DecimalFormat("0.000");
    public void escreverNoAruivoCSV(Set<Cadastro> cadastros){
        try{
            StringBuilder builder = new StringBuilder();

            for (Cadastro cadastro : cadastros){
                builder.append(cadastro.getNome() + ";");
                builder.append(cadastro.getCpf() + ";");
                builder.append(cadastro.getDataNascimento() + ";");
                builder.append(cadastro.getSexo() + ";");
                builder.append(cadastro.getLogradouro() + ";");
                builder.append(cadastro.getNumero() + ";");
                builder.append(cadastro.getBairro() + ";");
                builder.append(cadastro.getComplemento() + ";");
                builder.append(cadastro.getCidade() + ";");
                builder.append(cadastro.getEstado() + ";");
                builder.append(cadastro.getEmail() + ";");
                builder.append(cadastro.getTelefone() + ";");
                builder.append(cadastro.getCelular() + ";");
                builder.append(cadastro.getCelularWhats() + ";");
                builder.append(cadastro.getProfissao() + ";");
                builder.append(cadastro.getEmpresa() + ";");
                builder.append(df.format(cadastro.getSalario()) + ";");
                builder.append(cadastro.getEmpregoAtual() + ";");
                builder.append(df.format(cadastro.getPretencaoMinima()) + ";");
                builder.append(df.format(cadastro.getPretencaoMaxima()) + ";");
                builder.append(cadastro.getHabilidades() + ";");
                builder.append("\n");
            }

            String path = "C:\\workspace-eclipse\\mjv-java-school-atividades\\cadastro-csv-mjv-project";
            Path caminhoArquivo = Paths.get(path + "\\cadastro.csv");

            Files.write(
                    caminhoArquivo,
                    builder.toString().getBytes(StandardCharsets.UTF_8),
                    StandardOpenOption.CREATE,
                    StandardOpenOption.APPEND
            );

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}

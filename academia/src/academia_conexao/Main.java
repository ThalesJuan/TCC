
package academia_conexao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.Month;
import java.util.List;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) throws SQLException{
        
        //Connection con = conexao.abrirConexao();
        
        frmAcademia tela = new frmAcademia();
        tela.setVisible(true);
        
        
        // Tabela alunos
        /*
        academiaBean ab = new academiaBean();
        academiaDAO ad = new academiaDAO(con);
        
        /*
        ab.setCpf("123");
        ab.setNome("Novo");
        ab.setEndereco("Rua 2");
        ab.setCidade("Cidade nova");
        ab.setCep("186");
        ab.setUf("SP");
        ab.setIdade(21);
        ab.setPeso(50.1);
        ab.setAltura(1.55);
        ab.setTel_res("3800");
        ab.setTel_cel("0000");
        ab.setEmail("Email novo");
        ab.setSexo("f");
        ab.setEndereco("Rua 2");
        ab.setCidade("Cidade nova");
        ab.setCep("186");
        ab.setUf("SP");
        ab.setIdade(21);
        ab.setPeso(50.1);
        ab.setAltura(1.55);
        ab.setTel_res("3800");
        ab.setTel_cel("0000");
        ab.setEmail("Email novo");
        
        System.out.println(ad.alterar(ab));
        
        
        // Tabela professores
        
        profBean pb = new profBean();
        profDAO pd = new profDAO(con);
        
        // Tabela exercicios
        
        
        exercBean eb = new exercBean();
        exercDAO ed = new exercDAO(con);
        
        // Tabela mensalidade
        
        
        mensBean mb = new mensBean();
        mensDAO md = new mensDAO(con);
        
        /*
        mb.setId_mens(1);
        mb.setCpf("123");
        mb.setPeriodo(Date.valueOf(LocalDate.now()));
        mb.setValor_mens(10);
        mb.setPagamento(true);
        
        
        mb.setPeriodo(Date.valueOf("2020-10-21"));
        mb.setCpf("123");
        mb.setValor_mens(120);
        mb.setPagamento(true);
        mb.setId_mens(121);
        
        System.out.println(md.alterar(mb));
        
        /*
        // O listar e o excluir estão funcionando
        
        List<mensBean> lista = md.ListarTodos();
        if (lista != null){
            for (mensBean ml: lista){
                System.out.println("Id mensalidade: " + ml.getId_mens());
                System.out.println("Período: " + ml.getPeriodo());
                System.out.println("CPF: " + ml.getCpf());
                System.out.println("Valor mensalidade: " + ml.getValor_mens());
                System.out.println("Pagamento: "+ ml.isPagamento());
            }
        }
        
        mb.setId_mens(1);
        
        System.out.println(md.excluir(mb));
        
        
        // Tabela treinos
        
        treinosBean tb = new treinosBean();
        treinoDAO td = new treinoDAO(con);
        
        
        tb.setId_treino(1);
        tb.setCod_treino(2);
        tb.setCpf("123");
        tb.setId_exerc(100);
        tb.setNum_serie(10);
        tb.setNum_rep(15);
        tb.setDia_semana("Sexta");
        
        List<treinosBean> lista = td.ListarTodos();
        if (lista != null){
            for (treinosBean tl: lista){
                System.out.println("Id treino: " + tl.getId_treino());
                System.out.println("Cód exerc: " + tl.getCod_treino());
                System.out.println("Cpf: " + tl.getCpf());
                System.out.println("Id exerc: " + tl.getId_exerc());
                System.out.println("Num série: "+ tl.getNum_serie());
                System.out.println("Num rep: " + tl.getNum_rep());
                System.out.println("Dia da semana: " + tl.getDia_semana());
            }
        }
        */
    }
}

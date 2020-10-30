
package academia_conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class academiaDAO {
    private Connection con;

    public academiaDAO(Connection con) {
        this.con = con;
    }
    
    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }
    
    public String inserir(academiaBean aluno) throws SQLException {
        String sql = "insert into alunos(cpf,nome,sexo,endereco,cidade,"
                + "cep,uf,idade,peso,altura,tel_res,tel_cel,email)"
                + "values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, aluno.getCpf());
            ps.setString(2, aluno.getNome());
            ps.setString(3, aluno.getSexo());
            ps.setString(4, aluno.getEndereco());
            ps.setString(5, aluno.getCidade());
            ps.setString(6, aluno.getCep());
            ps.setString(7, aluno.getUf());
            ps.setInt(8, aluno.getIdade());
            ps.setDouble(9, aluno.getPeso());
            ps.setDouble(10, aluno.getAltura());
            ps.setString(11, aluno.getTel_res());
            ps.setString(12, aluno.getTel_cel());
            ps.setString(13, aluno.getEmail());
            
            if (ps.executeUpdate() > 0){
                return "Inserido co sucesso !";
            } else {
                return "Erro ao inserir";
            }
        } catch (SQLException e){
            return e.getMessage();
        }
    }
    
    public String alterar(academiaBean aluno) throws SQLException {
        String sql = "update alunos set nome = ?, sexo = ?, endereco = ?,"
                + "cidade = ?, cep = ?, uf = ?, idade = ?, peso = ?, altura = ?,"
                + "tel_res = ?, tel_cel = ?, email = ?";
        sql += "where cpf = ?";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, aluno.getNome());
            ps.setString(2, aluno.getSexo());
            ps.setString(3, aluno.getEndereco());
            ps.setString(4, aluno.getCidade());
            ps.setString(5, aluno.getCep());
            ps.setString(6, aluno.getUf());
            ps.setInt(7, aluno.getIdade());
            ps.setDouble(8, aluno.getPeso());
            ps.setDouble(9, aluno.getAltura());
            ps.setString(10, aluno.getTel_res());
            ps.setString(11, aluno.getTel_cel());
            ps.setString(12, aluno.getEmail());
            ps.setString(13, aluno.getCpf());
            
            if (ps.executeUpdate() > 0){
                return "Alterado com sucesso";
            } else {
                return "Erro ao alterar";
            }
        } catch (SQLException e){
            return e.getMessage();
        }
    }
    
    public String excluir(academiaBean aluno) throws SQLException {
        String sql = "delete from alunos where cpf = ?";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, aluno.getCpf());
            
            if (ps.executeUpdate() > 0){
                return "Excluído com sucesso";
            } else {
                return "Erro ao excluir";
            }
        } catch (SQLException e){
            return e.getMessage();
        }
    }
    
    public List<academiaBean>ListarTodos() throws SQLException {
        String sql = "select * from alunos";
        List<academiaBean> listaAluno = new ArrayList<academiaBean>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs != null){
                while (rs.next()){
                    academiaBean ab = new academiaBean();
                    ab.setCpf(rs.getString(1));
                    ab.setNome(rs.getString(2));
                    ab.setSexo(rs.getString(3));
                    ab.setEndereco(rs.getString(4));
                    ab.setCidade(rs.getString(5));
                    ab.setCep(rs.getString(6));
                    ab.setUf(rs.getString(7));
                    ab.setIdade(rs.getInt(8));
                    ab.setPeso(rs.getDouble(9));
                    ab.setAltura(rs.getDouble(10));
                    ab.setTel_res(rs.getString(11));
                    ab.setTel_cel(rs.getString(12));
                    ab.setEmail(rs.getString(13));
                    listaAluno.add(ab);
                }
                return listaAluno;
            } else {
                return null;
            }
        } catch (SQLException e){
            return null;
        }
    }
}

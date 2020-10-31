
package academia_conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class profDAO {
    private Connection con;

    public profDAO(Connection con) {
        this.con = con;
    }
    
    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }
    
    public String inserir(profBean prof) throws SQLException {
        String sql = "insert into professores(cpf,nome,idade,funcao,email)"
                + "values(?,?,?,?,?)";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, prof.getCpf());
            ps.setString(2, prof.getNome());
            ps.setInt(3, prof.getIdade());
            ps.setString(4, prof.getFuncao());
            ps.setString(5, prof.getEmail());
            
            
            if (ps.executeUpdate() > 0){
                return "Adicionado com sucesso !";
            } else {
                return "Erro ao adicionar";
            }
        } catch (SQLException e){
            return e.getMessage();
        }
    }
    
    public String alterar(profBean prof) throws SQLException {
        String sql = "update professores set nome = ?, idade = ?,"
                + "funcao = ?, email = ?";
        sql += "where cpf = ?";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, prof.getNome());
            ps.setInt(2, prof.getIdade());
            ps.setString(3, prof.getFuncao());
            ps.setString(4, prof.getEmail());
            ps.setString(5, prof.getCpf());
            
            if (ps.executeUpdate() > 0){
                return "Alterado com sucesso";
            } else {
                return "Erro ao alterar";
            }
        } catch (SQLException e){
            return e.getMessage();
        }
    }
    
    public String excluir(profBean prof) throws SQLException {
        String sql = "delete from professores where cpf = ?";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, prof.getCpf());
            
            if (ps.executeUpdate() > 0){
                return "Excluído com sucesso";
            } else {
                return "Erro ao excluir";
            }
        } catch (SQLException e){
            return e.getMessage();
        }
    }
    
    public List<profBean>ListarTodos() throws SQLException {
        String sql = "select * from professores";
        List<profBean> listaProf = new ArrayList<profBean>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs != null){
                while (rs.next()){
                    profBean pb = new profBean();
                    pb.setCpf(rs.getString(1));
                    pb.setNome(rs.getString(2));
                    pb.setIdade(rs.getInt(3));
                    pb.setFuncao(rs.getString(4));
                    pb.setEmail(rs.getString(5));
                    
                    listaProf.add(pb);
                }
                return listaProf;
            } else {
                return null;
            }
        } catch (SQLException e){
            return null;
        }
    }
}

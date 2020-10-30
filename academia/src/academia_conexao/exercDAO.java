
package academia_conexao;

import academia_conexao.exercBean;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class exercDAO {
    private Connection con;

    public exercDAO(Connection con) {
        this.con = con;
    }
    
    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }
    
    public String inserir(exercBean exerc) throws SQLException {
        String sql = "insert into exercicios(id_exerc,nome_exerc)"
                + "values(?,?)";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setInt(1, exerc.getId_exerc());
            ps.setString(2, exerc.getNome_exerc());
            
            if (ps.executeUpdate() > 0){
                return "Inserido co sucesso !";
            } else {
                return "Erro ao inserir";
            }
        } catch (SQLException e){
            return e.getMessage();
        }
    }
    
    public String alterar(exercBean exerc) throws SQLException {
        String sql = "update exercicios set nome_exerc = ?";
        sql += "where id_exerc = ?";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, exerc.getNome_exerc());
            ps.setInt(2, exerc.getId_exerc());
            
            if (ps.executeUpdate() > 0){
                return "Alterado com sucesso";
            } else {
                return "Erro ao alterar";
            }
        } catch (SQLException e){
            return e.getMessage();
        }
    }
    
    public String excluir(exercBean exerc) throws SQLException {
        String sql = "delete from exercicios where id_exerc = ?";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setInt(1, exerc.getId_exerc());
            
            if (ps.executeUpdate() > 0){
                return "Excluído com sucesso";
            } else {
                return "Erro ao excluir";
            }
        } catch (SQLException e){
            return e.getMessage();
        }
    }
    
    public List<exercBean>ListarTodos() throws SQLException {
        String sql = "select * from exercicios";
        List<exercBean> listaExerc = new ArrayList<exercBean>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs != null){
                while (rs.next()){
                    exercBean pb = new exercBean();
                    pb.setId_exerc(rs.getInt(1));
                    pb.setNome_exerc(rs.getString(2));
                    
                    listaExerc.add(pb);
                }
                return listaExerc;
            } else {
                return null;
            }
        } catch (SQLException e){
            return null;
        }
    }
}


package academia_conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class treinoDAO {
    private Connection con;

    public treinoDAO(Connection con) {
        this.con = con;
    }
    
    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }
    
    public String inserir(treinosBean treinos) throws SQLException {
        String sql = "insert into treinos(id_treino,cod_treino,cpf,"
                + "id_exerc,num_serie,num_rep,dia_semana)"
                + "values(?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setInt(1, treinos.getId_treino());
            ps.setInt(2, treinos.getCod_treino());
            ps.setString(3, treinos.getCpf());
            ps.setInt(4, treinos.getId_exerc());
            ps.setInt(5, treinos.getNum_serie());
            ps.setInt(6, treinos.getNum_rep());
            ps.setString(7, treinos.getDia_semana());
            
            
            if (ps.executeUpdate() > 0){
                return "Adicionado co sucesso !";
            } else {
                return "Erro ao adicionar";
            }
        } catch (SQLException e){
            return e.getMessage();
        }
    }
    
    public String alterar(treinosBean treinos) throws SQLException {
        String sql = "update treinos set cod_treino = ?, cpf = ?,"
                + "id_exerc = ?, num_serie = ?, num_rep = ?, dia_semana = ?";
        sql += "where id_treino = ?";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setInt(1, treinos.getCod_treino());
            ps.setString(2, treinos.getCpf());
            ps.setInt(3, treinos.getId_exerc());
            ps.setInt(4, treinos.getNum_serie());
            ps.setInt(5, treinos.getNum_rep());
            ps.setString(6, treinos.getDia_semana());
            ps.setInt(7, treinos.getId_treino());
            
            if (ps.executeUpdate() > 0){
                return "Alterado com sucesso";
            } else {
                return "Erro ao alterar";
            }
        } catch (SQLException e){
            return e.getMessage();
        }
    }
    
    public String excluir(treinosBean treinos) throws SQLException {
        String sql = "delete from treinos where id_treino = ?";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setInt(1, treinos.getId_treino());
            
            if (ps.executeUpdate() > 0){
                return "Excluído com sucesso";
            } else {
                return "Erro ao excluir";
            }
        } catch (SQLException e){
            return e.getMessage();
        }
    }
    
    public List<treinosBean>ListarTodos() throws SQLException {
        String sql = "select * from treinos";
        List<treinosBean> listaTreinos = new ArrayList<treinosBean>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs != null){
                while (rs.next()){
                    treinosBean tb = new treinosBean();
                    tb.setId_treino(rs.getInt(1));
                    tb.setCod_treino(rs.getInt(2));
                    tb.setCpf(rs.getString(3));
                    tb.setId_exerc(rs.getInt(4));
                    tb.setNum_serie(rs.getInt(5));
                    tb.setNum_rep(rs.getInt(6));
                    tb.setDia_semana(rs.getString(7));
                    
                    listaTreinos.add(tb);
                }
                return listaTreinos;
            } else {
                return null;
            }
        } catch (SQLException e){
            return null;
        }
    }
}

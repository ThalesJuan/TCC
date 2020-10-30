
package academia_conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class mensDAO {
    private Connection con;

    public mensDAO(Connection con) {
        this.con = con;
    }
    
    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }
    
    public String inserir(mensBean mens) throws SQLException {
        String sql = "insert into mensalidade(id_mens,periodo,cpf,"
                + "valor_mens, pagamento)values(?,?,?,?,?)";
        try {
            
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setInt(1, mens.getId_mens());
            ps.setDate(2, mens.getPeriodo());
            ps.setString(3, mens.getCpf());
            ps.setFloat(4, mens.getValor_mens());
            ps.setBoolean(5, false);
            
            if (ps.executeUpdate() > 0){
                return "Inserido co sucesso !";
            } else {
                return "Erro ao inserir";
            }
        } catch (SQLException e){
            return e.getMessage();
        }
    }
    
    public String alterar(mensBean mens) throws SQLException {
        String sql = "update mensalidade set periodo = ?, cpf = ?,"
                + "valor_mens = ?, pagamento = ?";
        sql += "where id_mens = ?";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            
            ps.setDate(1, mens.getPeriodo());
            ps.setString(2, mens.getCpf());
            ps.setFloat(3, mens.getValor_mens());
            ps.setBoolean(4, false);
            ps.setInt(5, mens.getId_mens());
            
            if (ps.executeUpdate() > 0){
                return "Alterado com sucesso";
            } else {
                return "Erro ao alterar";
            }
        } catch (SQLException e){
            return e.getMessage();
        }
    }
    
    public String excluir(mensBean mens) throws SQLException {
        String sql = "delete from mensalidade where id_mens = ?";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setInt(1, mens.getId_mens());
            
            if (ps.executeUpdate() > 0){
                return "Excluído com sucesso";
            } else {
                return "Erro ao excluir";
            }
        } catch (SQLException e){
            return e.getMessage();
        }
    }
    
    public List<mensBean>ListarTodos() throws SQLException {
        String sql = "select * from mensalidade";
        List<mensBean> listaMens = new ArrayList<mensBean>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs != null){
                while (rs.next()){
                    mensBean mb = new mensBean();
                    mb.setId_mens(rs.getInt(1));
                    mb.setPeriodo(rs.getDate(2));
                    mb.setCpf(rs.getString(3));
                    mb.setValor_mens(rs.getFloat(4));
                    mb.setPagamento(rs.getBoolean(5));
                    
                    listaMens.add(mb);
                }
                return listaMens;
            } else {
                return null;
            }
        } catch (SQLException e){
            return null;
        }
    }
}


package academia_conexao;

import java.sql.Date;
import java.util.Calendar;

public class mensBean {
    private int id_mens;
    private Date periodo;
    private String cpf;
    private float valor_mens;
    private boolean pagamento;

    public int getId_mens() {
        return id_mens;
    }

    public void setId_mens(int id_mens) {
        this.id_mens = id_mens;
    }

    public Date getPeriodo() {
        return periodo;
    }

    public void setPeriodo(Date periodo) {
        this.periodo = periodo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public float getValor_mens() {
        return valor_mens;
    }

    public void setValor_mens(float valor_mens) {
        this.valor_mens = valor_mens;
    }

    public boolean isPagamento() {
        return pagamento;
    }

    public void setPagamento(boolean pagamento) {
        this.pagamento = pagamento;
    }

}

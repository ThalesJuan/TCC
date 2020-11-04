/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package academia_conexao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author thales
 */
public class frmTreino extends javax.swing.JFrame {

    /**
     * Creates new form frmNovoTreino
     */
    public frmTreino() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtIdTreino = new javax.swing.JTextField();
        txtCod = new javax.swing.JTextField();
        txtIdExerc = new javax.swing.JTextField();
        txtCPF = new javax.swing.JTextField();
        txtNumSerie = new javax.swing.JTextField();
        txtNumRep = new javax.swing.JTextField();
        chkSegunda = new javax.swing.JCheckBox();
        chkTerca = new javax.swing.JCheckBox();
        chkQuarta = new javax.swing.JCheckBox();
        chkQuinta = new javax.swing.JCheckBox();
        chkSexta = new javax.swing.JCheckBox();
        chkSabado = new javax.swing.JCheckBox();
        btnAdicionar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        btnCalcel = new javax.swing.JButton();
        lblResult = new javax.swing.JLabel();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnTodos = new javax.swing.JButton();
        lblResult2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblConsulta = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Treinos:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Id do treino:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Código do treino:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("CPF:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Id do exercício:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Número de séries:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Número de repetições:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Dias da semana:");

        txtIdTreino.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtCod.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtIdExerc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtCPF.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtNumSerie.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtNumRep.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        chkSegunda.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chkSegunda.setText("Segunda-feira");

        chkTerca.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chkTerca.setText("Terça-feira");

        chkQuarta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chkQuarta.setText("Quarta-feira");

        chkQuinta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chkQuinta.setText("Quinta-feira");

        chkSexta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chkSexta.setText("Sexta-feira");

        chkSabado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chkSabado.setText("Sábado");

        btnAdicionar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAdicionar.setText("Adicionar");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        btnLimpar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        btnCalcel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCalcel.setText("Cancelar");
        btnCalcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcelActionPerformed(evt);
            }
        });

        lblResult.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblResult.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        btnAlterar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAlterar.setText("Aterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnExcluir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnTodos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnTodos.setText("Mostrar treinos");
        btnTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTodosActionPerformed(evt);
            }
        });

        lblResult2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblResult2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        tblConsulta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id treino", "Cod. treino", "CPF", "Id exercício", "Num. séries", "Num. repetições", "Dias semana"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblConsulta);
        if (tblConsulta.getColumnModel().getColumnCount() > 0) {
            tblConsulta.getColumnModel().getColumn(0).setResizable(false);
            tblConsulta.getColumnModel().getColumn(1).setResizable(false);
            tblConsulta.getColumnModel().getColumn(2).setResizable(false);
            tblConsulta.getColumnModel().getColumn(3).setResizable(false);
            tblConsulta.getColumnModel().getColumn(4).setResizable(false);
            tblConsulta.getColumnModel().getColumn(5).setResizable(false);
            tblConsulta.getColumnModel().getColumn(6).setResizable(false);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(lblResult, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(233, 233, 233)
                        .addComponent(jLabel1)))
                .addContainerGap(167, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 37, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(275, 275, 275)
                                        .addComponent(jLabel8))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtNumRep, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(163, 163, 163)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chkSegunda)
                                    .addComponent(chkQuarta)
                                    .addComponent(chkTerca)
                                    .addComponent(chkQuinta)
                                    .addComponent(chkSexta)
                                    .addComponent(chkSabado)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtNumSerie))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtCod))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtIdTreino, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtIdExerc, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(63, 63, 63)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblResult2, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(89, 89, 89))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAdicionar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnTodos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnLimpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCalcel)))
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtIdTreino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtIdExerc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtNumSerie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtNumRep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(chkSegunda)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(chkTerca)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(chkQuarta)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(chkQuinta)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(chkSexta)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(chkSabado)))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdicionar)
                    .addComponent(btnLimpar)
                    .addComponent(btnCalcel)
                    .addComponent(btnAlterar)
                    .addComponent(btnExcluir)
                    .addComponent(btnTodos))
                .addGap(26, 26, 26)
                .addComponent(lblResult2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblResult)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        try {
            Connection con = conexao.abrirConexao();
            
            treinosBean tb = new treinosBean();
            treinoDAO td = new treinoDAO(con);
            
            tb.setId_treino(Integer.parseInt(txtIdTreino.getText()));
            tb.setCod_treino(Integer.parseInt(txtCod.getText()));
            tb.setCpf(txtCPF.getText());
            tb.setId_exerc(Integer.parseInt(txtIdExerc.getText()));
            tb.setNum_serie(Integer.parseInt(txtNumSerie.getText()));
            tb.setNum_rep(Integer.parseInt(txtNumRep.getText()));
            
            String dia = "";
            if (chkSegunda.isSelected() == true){
                dia += "Segunda-feira ";
            } 
            if (chkTerca.isSelected() == true){
                dia += "Terça-feira ";
            } 
            if (chkQuarta.isSelected() == true){
                dia += "Quarta-feira ";
            }
            if (chkQuinta.isSelected() == true){
                dia += "Quinta-feira ";
            }
            if (chkSexta.isSelected() == true){
                dia += "Sexta-feira ";
            }
            if (chkSabado.isSelected() == true){
                dia += "Sábado ";
            }
            tb.setDia_semana(dia);
            
            lblResult2.setText(td.inserir(tb));
            
            conexao.fecharConexao(con);
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Dados incorretos " + e.getMessage());
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Erro... " + e.getMessage());
        }
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        txtIdTreino.setText("");
        txtCod.setText("");
        txtIdExerc.setText("");
        txtNumSerie.setText("");
        txtNumRep.setText("");
        txtCPF.setText("");
        chkSegunda.setSelected(false);
        chkTerca.setSelected(false);
        chkQuarta.setSelected(false);
        chkQuinta.setSelected(false);
        chkSexta.setSelected(false);
        chkSabado.setSelected(false);
        lblResult2.setText("");
        DefaultTableModel tbm = (DefaultTableModel)tblConsulta.getModel();
        for (int i = tbm.getRowCount()-1; i >= 0; i--){
            tbm.removeRow(i);
        }
        
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnCalcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcelActionPerformed
        setVisible(false);
    }//GEN-LAST:event_btnCalcelActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        try {
            Connection con = conexao.abrirConexao();
            treinosBean tb = new treinosBean();
            treinoDAO ed = new treinoDAO(con);
            tb.setId_treino(Integer.parseInt(txtIdTreino.getText()));
            Object[] opcoes = { "Sim", "Não"};
            int i = JOptionPane.showOptionDialog(null, "Desela excluir esse treino ?" +
                    "" + txtIdExerc.getText() + " ? ", " Exclusão",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null,
                    opcoes, opcoes[0]);
            if (i == JOptionPane.YES_OPTION){
                lblResult2.setText(ed.excluir(tb));
            }
            conexao.fecharConexao(con);
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Erro... " + e.getMessage());
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Erro... " + e.getMessage());
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        try {
            Connection con = conexao.abrirConexao();
            
            treinosBean tb = new treinosBean();
            treinoDAO td = new treinoDAO(con);
            
            tb.setId_treino(Integer.parseInt(txtIdTreino.getText()));
            tb.setCod_treino(Integer.parseInt(txtCod.getText()));
            tb.setCpf(txtCPF.getText());
            tb.setId_exerc(Integer.parseInt(txtIdExerc.getText()));
            tb.setNum_serie(Integer.parseInt(txtNumSerie.getText()));
            tb.setNum_rep(Integer.parseInt(txtNumRep.getText()));
            
            String dia = "";
            if (chkSegunda.isSelected() == true){
                dia += "Segunda-feira ";
            } 
            if (chkTerca.isSelected() == true){
                dia += "Terça-feira ";
            } 
            if (chkQuarta.isSelected() == true){
                dia += "Quarta-feira ";
            }
            if (chkQuinta.isSelected() == true){
                dia += "Quinta-feira ";
            }
            if (chkSexta.isSelected() == true){
                dia += "Sexta-feira ";
            }
            if (chkSabado.isSelected() == true){
                dia += "Sábado ";
            }
            tb.setDia_semana(dia);
            
            lblResult2.setText(td.alterar(tb));
            
            conexao.fecharConexao(con);
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Erro..." + e.getMessage());
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Erro... " + e.getMessage());
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTodosActionPerformed
        try {
            Connection con = conexao.abrirConexao();
            treinoDAO td = new treinoDAO(con);
            List<treinosBean> listaTreino = new ArrayList<treinosBean>();
            listaTreino = td.ListarTodos();
            DefaultTableModel tbm = (DefaultTableModel) tblConsulta.getModel();
            for (int i = tbm.getRowCount() - 1; i >= 0; i--) {
                tbm.removeRow(i);
            }
            int i = 0;
            for (treinosBean tb : listaTreino) {
                tbm.addRow(new String[1]);
                tblConsulta.setValueAt(tb.getId_treino(), i, 0);
                tblConsulta.setValueAt(tb.getCod_treino(), i, 1);
                tblConsulta.setValueAt(tb.getCpf(), i, 2);
                tblConsulta.setValueAt(tb.getId_exerc(), i, 3);
                tblConsulta.setValueAt(tb.getNum_serie(), i, 4);
                tblConsulta.setValueAt(tb.getNum_rep(), i, 5);
                tblConsulta.setValueAt(tb.getDia_semana(), i, 6);
                i++;
            }
            conexao.fecharConexao(con);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro..." + e.getMessage());
        }
    }//GEN-LAST:event_btnTodosActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmTreino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmTreino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmTreino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmTreino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmTreino().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCalcel;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnTodos;
    private javax.swing.JCheckBox chkQuarta;
    private javax.swing.JCheckBox chkQuinta;
    private javax.swing.JCheckBox chkSabado;
    private javax.swing.JCheckBox chkSegunda;
    private javax.swing.JCheckBox chkSexta;
    private javax.swing.JCheckBox chkTerca;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblResult;
    private javax.swing.JLabel lblResult2;
    private javax.swing.JTable tblConsulta;
    private javax.swing.JTextField txtCPF;
    private javax.swing.JTextField txtCod;
    private javax.swing.JTextField txtIdExerc;
    private javax.swing.JTextField txtIdTreino;
    private javax.swing.JTextField txtNumRep;
    private javax.swing.JTextField txtNumSerie;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_cud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author pmedeiros
 */
public class cudJava extends javax.swing.JFrame {

    /**
     * Creates new form cudJava
     */
    public cudJava() {
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

        Pnl_create = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        Tfd_nome = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Tfd_CPF = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Tfd_nascimento = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Tfd_telefone = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Tfd_rua = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        Tfd_turma = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        Tfd_nomeMae = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        Tfd_email = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        Tfd_sexo = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        Tfd_PCD = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        Tfd_nacionalidade = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        Tfd_raca = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        Tfd_naturalidade = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        Btn_novo = new javax.swing.JButton();
        Btn_alterar = new javax.swing.JButton();
        Btn_excluir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tae_observacao = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Pnl_create.setBackground(new java.awt.Color(255, 255, 255));
        Pnl_create.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel4.setText("Nome :");

        jLabel5.setText("CPF :");

        jLabel6.setText("Nascimento :");

        jLabel7.setText("Telefone :");

        jLabel8.setText("Rua :");

        jLabel9.setText("Turma :");

        jLabel10.setText("Nome da Mãe :");

        jLabel11.setText("E-Mail :");

        jLabel12.setText("Sexo :");

        jLabel13.setText("PCD :");

        jLabel14.setText("Nacionalidade :");

        jLabel15.setText("Raça :");

        jLabel16.setText("Naturalidade :");

        jLabel17.setText("Observação :");

        Btn_novo.setText("Novo");
        Btn_novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_novoActionPerformed(evt);
            }
        });

        Btn_alterar.setText("Alterar");
        Btn_alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_alterarActionPerformed(evt);
            }
        });

        Btn_excluir.setText("Excluir");

        Tae_observacao.setColumns(20);
        Tae_observacao.setRows(5);
        jScrollPane1.setViewportView(Tae_observacao);

        javax.swing.GroupLayout Pnl_createLayout = new javax.swing.GroupLayout(Pnl_create);
        Pnl_create.setLayout(Pnl_createLayout);
        Pnl_createLayout.setHorizontalGroup(
            Pnl_createLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pnl_createLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Pnl_createLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Pnl_createLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Pnl_createLayout.createSequentialGroup()
                            .addGroup(Pnl_createLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel10)
                                .addComponent(jLabel9)
                                .addComponent(jLabel8)
                                .addComponent(jLabel7)
                                .addComponent(jLabel6)
                                .addComponent(jLabel5)
                                .addComponent(jLabel4))
                            .addGap(18, 18, 18)
                            .addGroup(Pnl_createLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Tfd_CPF, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                                .addComponent(Tfd_nascimento)
                                .addComponent(Tfd_telefone)
                                .addComponent(Tfd_rua)
                                .addComponent(Tfd_turma)
                                .addComponent(Tfd_nome)
                                .addComponent(Tfd_nomeMae, javax.swing.GroupLayout.Alignment.TRAILING)))
                        .addGroup(Pnl_createLayout.createSequentialGroup()
                            .addGroup(Pnl_createLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Pnl_createLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Pnl_createLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Pnl_createLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Pnl_createLayout.createSequentialGroup()
                                                .addComponent(jLabel13)
                                                .addGap(63, 63, 63))
                                            .addGroup(Pnl_createLayout.createSequentialGroup()
                                                .addComponent(jLabel14)
                                                .addGap(12, 12, 12)))
                                        .addGroup(Pnl_createLayout.createSequentialGroup()
                                            .addComponent(jLabel15)
                                            .addGap(59, 59, 59)))
                                    .addGroup(Pnl_createLayout.createSequentialGroup()
                                        .addComponent(jLabel16)
                                        .addGap(22, 22, 22)))
                                .addGroup(Pnl_createLayout.createSequentialGroup()
                                    .addGroup(Pnl_createLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel11)
                                        .addComponent(jLabel12))
                                    .addGap(55, 55, 55)))
                            .addGroup(Pnl_createLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Tfd_email, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                                .addComponent(Tfd_raca)
                                .addComponent(Tfd_nacionalidade)
                                .addComponent(Tfd_PCD)
                                .addComponent(Tfd_naturalidade)
                                .addComponent(Tfd_sexo))))
                    .addGroup(Pnl_createLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(Btn_novo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Btn_alterar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(Btn_excluir)
                    .addGroup(Pnl_createLayout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        Pnl_createLayout.setVerticalGroup(
            Pnl_createLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pnl_createLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Pnl_createLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Tfd_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Pnl_createLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Tfd_CPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Pnl_createLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(Tfd_nascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Pnl_createLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(Tfd_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Pnl_createLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(Tfd_rua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Pnl_createLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(Tfd_turma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Pnl_createLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(Tfd_nomeMae, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Pnl_createLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(Tfd_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(Pnl_createLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(Tfd_sexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Pnl_createLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(Tfd_PCD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Pnl_createLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(Tfd_nacionalidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Pnl_createLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(Tfd_raca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Pnl_createLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(Tfd_naturalidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Pnl_createLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(Btn_novo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Btn_alterar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Btn_excluir)
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(376, 376, 376)
                .addComponent(Pnl_create, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(759, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(Pnl_create, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_novoActionPerformed

        try {
            Class.forName("com.mysql.cj.jdbc.Drive");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_escola","root","");
            java.sql.Statement st = conn.createStatement();
            
            st.executeUpdate("INSERT INTO aluno (nome,CPF,nascimento,telefone,rua,turma,nome_da_mae,email,sexo,PCD,nacionalidade,raca,naturalidade,observacao) VALUE ("
            +this.Tfd_nome.getText()+","
            +this.Tfd_CPF.getText()+","
            +this.Tfd_nascimento.getText()+","       
            +this.Tfd_telefone.getText()+","
            +this.Tfd_rua.getText()+","
            +this.Tfd_turma.getText()+","
            +this.Tfd_nomeMae.getText()+","       
            +this.Tfd_email.getText()+","
            +this.Tfd_sexo.getText()+","
            +this.Tfd_PCD.getText()+","
            +this.Tfd_nacionalidade.getText()+","  
            +this.Tfd_raca.getText()+","
            +this.Tfd_naturalidade.getText()+","
            +this.Tae_observacao.getText()+")"
                    
            );
            
            JOptionPane.showMessageDialog(Pnl_create,"Aluno Criado");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(cudJava.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(cudJava.class.getName()).log(Level.SEVERE, null, ex);
        }
        


        
    }//GEN-LAST:event_Btn_novoActionPerformed

    private void Btn_alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_alterarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_alterarActionPerformed

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
            java.util.logging.Logger.getLogger(cudJava.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cudJava.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cudJava.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cudJava.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cudJava().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_alterar;
    private javax.swing.JButton Btn_excluir;
    private javax.swing.JButton Btn_novo;
    private javax.swing.JPanel Pnl_create;
    private javax.swing.JTextArea Tae_observacao;
    private javax.swing.JTextField Tfd_CPF;
    private javax.swing.JTextField Tfd_PCD;
    private javax.swing.JTextField Tfd_email;
    private javax.swing.JTextField Tfd_nacionalidade;
    private javax.swing.JTextField Tfd_nascimento;
    private javax.swing.JTextField Tfd_naturalidade;
    private javax.swing.JTextField Tfd_nome;
    private javax.swing.JTextField Tfd_nomeMae;
    private javax.swing.JTextField Tfd_raca;
    private javax.swing.JTextField Tfd_rua;
    private javax.swing.JTextField Tfd_sexo;
    private javax.swing.JTextField Tfd_telefone;
    private javax.swing.JTextField Tfd_turma;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}

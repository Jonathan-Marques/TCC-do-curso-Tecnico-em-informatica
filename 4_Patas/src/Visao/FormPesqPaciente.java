/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao;

/**
 *
 * @author tecnico.quantor
 */
public class FormPesqPaciente extends javax.swing.JFrame {

    /**
     * Creates new form FormPesqPaciente
     */
    public FormPesqPaciente() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabelNome = new javax.swing.JLabel();
        jTextFieldPesq = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButtonBuscar = new javax.swing.JButton();
        jButtonCadPacienteNovo = new javax.swing.JButton();
        jButtonjButtonCadPacienteAltera = new javax.swing.JButton();
        jButtonCadPacienteExcluir = new javax.swing.JButton();
        jButtonCadPacienteCancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelNome.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabelNome.setText("Nome:");

        jTable1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButtonBuscar.setText("Buscar");

        jButtonCadPacienteNovo.setText("Novo");
        jButtonCadPacienteNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadPacienteNovoActionPerformed(evt);
            }
        });

        jButtonjButtonCadPacienteAltera.setText("Altera");
        jButtonjButtonCadPacienteAltera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonjButtonCadPacienteAlteraActionPerformed(evt);
            }
        });

        jButtonCadPacienteExcluir.setText("Excluir");
        jButtonCadPacienteExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadPacienteExcluirActionPerformed(evt);
            }
        });

        jButtonCadPacienteCancelar.setText("Cancelar");
        jButtonCadPacienteCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadPacienteCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldPesq, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(218, 218, 218)
                .addComponent(jButtonCadPacienteNovo)
                .addGap(31, 31, 31)
                .addComponent(jButtonjButtonCadPacienteAltera)
                .addGap(31, 31, 31)
                .addComponent(jButtonCadPacienteExcluir)
                .addGap(34, 34, 34)
                .addComponent(jButtonCadPacienteCancelar)
                .addContainerGap(222, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNome)
                    .addComponent(jTextFieldPesq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBuscar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCadPacienteNovo)
                    .addComponent(jButtonjButtonCadPacienteAltera)
                    .addComponent(jButtonCadPacienteExcluir)
                    .addComponent(jButtonCadPacienteCancelar))
                .addGap(12, 12, 12))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 39, 796, 510);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel1.setText("Cadastros de Pacientes");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(340, 10, 150, 17);

        setSize(new java.awt.Dimension(830, 599));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCadPacienteNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadPacienteNovoActionPerformed
        // TODO add your handling code here:
        form.flag = 1;
        form.setVisible(true);
        form.getjTextFieldCod().setText("");
        form.getjTextFieldCRM().setText("");
        form.getjTextFieldNome().setText("");
        dispose();

    }//GEN-LAST:event_jButtonCadPacienteNovoActionPerformed

    private void jButtonjButtonCadPacienteAlteraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonjButtonCadPacienteAlteraActionPerformed
        // TODO add your handling code here:
        Connection.conexao();
        form.flag = 2;
        form.setVisible(true);
        mod.setPesquisa(getjTextFieldNomePsq().getText());
        ModMedico model = control.buscaMedico(mod);
        form.getjTextFieldNome().setText(model.getNome());
        form.getjTextFieldCRM().setText(String.valueOf(model.getCrm()));
        form.getjTextFieldCod().setText(String.valueOf(model.getCodigo()));
        form.getjComboBox1().setSelectedItem(model.getEspecialidade());
        dispose();

    }//GEN-LAST:event_jButtonjButtonCadPacienteAlteraActionPerformed

    private void jButtonCadPacienteExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadPacienteExcluirActionPerformed
        // TODO add your handling code here:

        int resposta = 0;
        resposta = JOptionPane.showConfirmDialog(rootPane, "Deseja realmente excluir!");
        if(resposta == JOptionPane.YES_OPTION){
            mod.setCodigo(Integer.parseInt(form.getjTextFieldCod().getText()));
            control.Excluir(mod);
        }
        getjTextFieldNomePsq().setText("");

        jButtonCadPacienteExcluir.setEnabled(false);
        jButtonjButtonCadPacienteAltera.setEnabled(false);
        jButtonCadPacienteCancelar.setEnabled(false);
        Connection.conexao();
        preecherTabela("select * from medicos order by nome");
    }//GEN-LAST:event_jButtonCadPacienteExcluirActionPerformed

    private void jButtonCadPacienteCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadPacienteCancelarActionPerformed
        // TODO add your handling code here:
        getjTextFieldNomePsq().setText("");
        jButtonCadPacienteExcluir.setEnabled(false);
        jButtonjButtonCadPacienteAltera.setEnabled(false);
        jButtonCadPacienteCancelar.setEnabled(false);
    }//GEN-LAST:event_jButtonCadPacienteCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(FormPesqPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPesqPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPesqPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPesqPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPesqPaciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonCadPacienteCancelar;
    private javax.swing.JButton jButtonCadPacienteExcluir;
    private javax.swing.JButton jButtonCadPacienteNovo;
    private javax.swing.JButton jButtonjButtonCadPacienteAltera;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldPesq;
    // End of variables declaration//GEN-END:variables
}

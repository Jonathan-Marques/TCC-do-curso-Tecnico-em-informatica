/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao;

import Conexao.ConexaoBD;
import Dao.DaoProprietario;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import modelo.ModProprietario;
import modelo.ModeloTabela;

/**
 *
 * @author tecnico.quantor
 */
public class FormPesqAnimal extends javax.swing.JFrame {

    int flag = 0;
    ModProprietario mod = new ModProprietario();
    Dao.DaoProprietario dao = new DaoProprietario();
    FormProprietario form = new FormProprietario();
    FormAnimal animalForm = new FormAnimal();
    ConexaoBD con = new ConexaoBD();
    /**
     * Creates new form FormPesqPaciente
     */
    public FormPesqAnimal() {
        initComponents();
        jButtonjButtonCadPacienteAltera.setEnabled(false);
        jButtonCadPacienteExcluir.setEnabled(false);
        jButtonCadPacienteCancelar.setEnabled(false);
        con.conexao();
        preecherTabela("SELECT A.nome_animal, B.nome_proprietario, B.cpf, B.telefone\n" +
"FROM cliente B\n" +
"INNER JOIN animal A\n" +
"ON (A.cod_proprietario = B.cod_proprietario);");
        con.desconecta();
        
        
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
        jButtonNovoPacientes = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButtonBuscar.setText("Buscar");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        jButtonCadPacienteNovo.setText("Novo Dono");
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

        jButtonNovoPacientes.setText("Novo Paciente");
        jButtonNovoPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoPacientesActionPerformed(evt);
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
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 772, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(jButtonCadPacienteNovo)
                .addGap(18, 18, 18)
                .addComponent(jButtonNovoPacientes)
                .addGap(18, 18, 18)
                .addComponent(jButtonjButtonCadPacienteAltera)
                .addGap(18, 18, 18)
                .addComponent(jButtonCadPacienteExcluir)
                .addGap(18, 18, 18)
                .addComponent(jButtonCadPacienteCancelar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNome)
                    .addComponent(jTextFieldPesq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBuscar))
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonjButtonCadPacienteAltera)
                    .addComponent(jButtonCadPacienteExcluir)
                    .addComponent(jButtonCadPacienteCancelar)
                    .addComponent(jButtonNovoPacientes)
                    .addComponent(jButtonCadPacienteNovo))
                .addGap(23, 23, 23))
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
        
       if(form==null){
                    form = new FormProprietario();
                    form.setVisible(true);
                    form.setResizable(false);
                 }else{
                    form.setVisible(true);
                    form.setResizable(false); 
       }
       
    }//GEN-LAST:event_jButtonCadPacienteNovoActionPerformed

    private void jButtonjButtonCadPacienteAlteraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonjButtonCadPacienteAlteraActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButtonjButtonCadPacienteAlteraActionPerformed

    private void jButtonCadPacienteExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadPacienteExcluirActionPerformed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_jButtonCadPacienteExcluirActionPerformed

    private void jButtonCadPacienteCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadPacienteCancelarActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButtonCadPacienteCancelarActionPerformed

    private void jButtonNovoPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoPacientesActionPerformed
        // TODO add your handling code here:
        
        
        animalForm.flag = 1;
        
       if(animalForm==null){
                    animalForm = new FormAnimal();
                    animalForm.setVisible(true);
                    animalForm.setResizable(false);
                 }else{
                    animalForm.setVisible(true);
                    animalForm.setResizable(false);      
        
       }
        
         
    }//GEN-LAST:event_jButtonNovoPacientesActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        
        
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void preecherTabela(String SQL){
    ArrayList dados = new ArrayList();
    String [] Colunas = new String[]{"Nome","Telefone","CPF","Nome do Animal",};
    con.executaSQL(SQL);
         try {
             con.rs.first();
             do{
                 dados.add(new Object[]{con.rs.getString("nome_proprietario"),con.rs.getString("telefone"),con.rs.getString("cpf"),con.rs.getString("nome_animal") });
                }while(con.rs.next());
         } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, " Erro ao Preencher a Tabela! " + ex);
         }
         
   ModeloTabela modelo = new ModeloTabela(dados, Colunas);
   jTable1.setModel (modelo);
   jTable1.getColumnModel().getColumn(0).setPreferredWidth(150);
   jTable1.getColumnModel().getColumn(0).setResizable(false);
   jTable1.getColumnModel().getColumn(1).setPreferredWidth(80);
   jTable1.getColumnModel().getColumn(1).setResizable(false);
   jTable1.getColumnModel().getColumn(2).setPreferredWidth(100);
   jTable1.getColumnModel().getColumn(2).setResizable(false);
   jTable1.getColumnModel().getColumn(3).setPreferredWidth(150);
   jTable1.getColumnModel().getColumn(3).setResizable(false);
   jTable1.getTableHeader().setReorderingAllowed(false);
   jTable1.setAutoResizeMode(jTable1.AUTO_RESIZE_OFF);
   jTable1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }
    
    
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
            java.util.logging.Logger.getLogger(FormPesqAnimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPesqAnimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPesqAnimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPesqAnimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPesqAnimal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonCadPacienteCancelar;
    private javax.swing.JButton jButtonCadPacienteExcluir;
    private javax.swing.JButton jButtonCadPacienteNovo;
    private javax.swing.JButton jButtonNovoPacientes;
    private javax.swing.JButton jButtonjButtonCadPacienteAltera;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldPesq;
    // End of variables declaration//GEN-END:variables
}

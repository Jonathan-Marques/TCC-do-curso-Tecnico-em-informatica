/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao;

import Conexao.ConexaoBD;
import Dao.DaoAgenda;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import modelo.ModAgenda;
import modelo.ModeloTabela;

/**
 *
 * @author dota-
 */
public class FormAgenda extends javax.swing.JFrame {
    ConexaoBD con = new ConexaoBD();
    ModAgenda agenda = new ModAgenda();
    ModAgenda agen = new ModAgenda();
    DaoAgenda dao = new DaoAgenda();
    String dtHoje;
    String status;
    

    /**
     * Creates new form FormAgenda
     */
    public FormAgenda() {
        initComponents();
        Calendar data = Calendar.getInstance();
        Date d = data.getTime();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        
       
        dtHoje = dateFormat.format(d);
        status = "aberto";
        con.conexao();
        preecherTabela("select * from agenda inner join animal on agenda.agenda_codpaciente = animal.cod_animal inner join medicos on agenda.agenda_codmedico = medicos.id_medico inner join cliente on cliente.cod_proprietario = animal.cod_proprietario where agenda_data='"+dtHoje+"' and agenda_status = '"+status+"' order by agenda_turno");
        con.desconecta();
    }
    
    private void preecherTabela(String SQL){
    ArrayList dados = new ArrayList();
    String [] Colunas = new String[]{"ID","Nome","Turno","Data","Status","Veterinario","Nome do Dono","Telefone",};
    con.executaSQL(SQL);
         try {
             con.rs.first();
             do{
                 dados.add(new Object[]{con.rs.getInt("id_agenda"),con.rs.getString("nome_animal"),con.rs.getString("agenda_turno"),con.rs.getString("agenda_data"),con.rs.getString("agenda_status"),con.rs.getString("nome"),con.rs.getString("nome_proprietario"),con.rs.getString("telefone") });
                }while(con.rs.next());
         } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, " Não tem nenhum atendimento agendado para hoje! ");
         }
         
   ModeloTabela modelo = new ModeloTabela(dados, Colunas);
   jTable1.setModel (modelo);
   jTable1.getColumnModel().getColumn(0).setPreferredWidth(30);
   jTable1.getColumnModel().getColumn(0).setResizable(false);
   jTable1.getColumnModel().getColumn(1).setPreferredWidth(220);
   jTable1.getColumnModel().getColumn(1).setResizable(false);
   jTable1.getColumnModel().getColumn(2).setPreferredWidth(80);
   jTable1.getColumnModel().getColumn(2).setResizable(false);
   jTable1.getColumnModel().getColumn(3).setPreferredWidth(80);
   jTable1.getColumnModel().getColumn(3).setResizable(false);
   jTable1.getColumnModel().getColumn(4).setPreferredWidth(120);
   jTable1.getColumnModel().getColumn(4).setResizable(false);
   jTable1.getColumnModel().getColumn(5).setPreferredWidth(150);
   jTable1.getColumnModel().getColumn(5).setResizable(false);
   jTable1.getColumnModel().getColumn(6).setPreferredWidth(220);
   jTable1.getColumnModel().getColumn(6).setResizable(false);
   jTable1.getColumnModel().getColumn(7).setPreferredWidth(80);
   jTable1.getColumnModel().getColumn(7).setResizable(false);
   jTable1.getTableHeader().setReorderingAllowed(false);
   jTable1.setAutoResizeMode(jTable1.AUTO_RESIZE_OFF);
   jTable1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabelAgendamento = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabelAgenda = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

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

        jLabelAgendamento.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabelAgendamento.setText("Agendamento de hoje");

        jButton1.setText("Atender Agendamento");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 807, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelAgendamento, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelAgendamento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(90, Short.MAX_VALUE))
        );

        jLabelAgenda.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabelAgenda.setText("Agenda");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(390, 390, 390)
                .addComponent(jLabelAgenda, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabelAgenda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(867, 539));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        String agenda_cod = "" + jTable1.getValueAt(jTable1.getSelectedRow(), 0);
        con.conexao();
        
        con.executaSQL("select * from agenda where id_agenda='"+agenda_cod+"'");
        try {
            con.rs.first();
            agen.setStatus("Atendimento");
            agen.setId_agenda(con.rs.getInt("id_agenda"));
            
            } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao selecionar dados");
                       
        }
        
        con.desconecta();
        
        
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dao.Altera(agen);
        con.conexao();
        preecherTabela("select * from agenda inner join animal on agenda.agenda_codpaciente = animal.cod_animal inner join medicos on agenda.agenda_codmedico = medicos.id_medico inner join cliente on cliente.cod_proprietario = animal.cod_proprietario where agenda_data='"+dtHoje+"' and agenda_status = '"+status+"' order by agenda_turno");
        con.desconecta();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(FormAgenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormAgenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormAgenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormAgenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormAgenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabelAgenda;
    private javax.swing.JLabel jLabelAgendamento;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
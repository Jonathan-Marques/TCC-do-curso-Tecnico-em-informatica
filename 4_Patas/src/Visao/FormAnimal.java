/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao;

import Conexao.ConexaoBD;
import Dao.DaoPaciente;
import Dao.DaoProprietario;
import modelo.ModPaciente;
import modelo.ModProprietario;

/**
 *
 * @author tecnico.quantor
 */
public class FormAnimal extends javax.swing.JFrame {
     int flag = 0;
ConexaoBD con = new ConexaoBD();
ModPaciente mod = new ModPaciente();
DaoPaciente dao = new DaoPaciente();
DaoProprietario control = new DaoProprietario();
ModProprietario modPac = new ModProprietario();



    /**
     * Creates new form FormPaciente
     */
    public FormAnimal() {
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
        jButtonSalvar = new javax.swing.JButton();
        jButtonLimpar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabelNomeAnimal = new javax.swing.JLabel();
        jTextFieldNomeAnimal = new javax.swing.JTextField();
        jLabelEspecie = new javax.swing.JLabel();
        jTextFieldEspecieAnimal = new javax.swing.JTextField();
        jLabelPelagem = new javax.swing.JLabel();
        jTextFieldPelagemAnimal = new javax.swing.JTextField();
        jLabelSexoAnimal = new javax.swing.JLabel();
        jComboBoxSexoAnimal = new javax.swing.JComboBox();
        jLabelRaça = new javax.swing.JLabel();
        jTextFieldRaçaAnimal = new javax.swing.JTextField();
        jLabelPeso = new javax.swing.JLabel();
        jTextFieldPesoAnimal = new javax.swing.JTextField();
        jLabelDataNascimento = new javax.swing.JLabel();
        jLabelPorte = new javax.swing.JLabel();
        jTextFieldPorteAnimal = new javax.swing.JTextField();
        jLabelIdade = new javax.swing.JLabel();
        jTextFieldIdadeAnimal = new javax.swing.JTextField();
        jLabelcod = new javax.swing.JLabel();
        jTextFieldCod = new javax.swing.JTextField();
        jLabelcodDono = new javax.swing.JLabel();
        jTextFieldCodDono = new javax.swing.JTextField();
        jLabelcodDono1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabelcodDonoCPF = new javax.swing.JLabel();
        jTextFieldCPF = new javax.swing.JTextField();
        jTextFieldDataNascimentoAnimal = new javax.swing.JTextField();
        jLabelNome10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButtonSalvar.setText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jButtonLimpar.setText("Limpar");
        jButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparActionPerformed(evt);
            }
        });

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelNomeAnimal.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabelNomeAnimal.setText("Nome:");

        jTextFieldNomeAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeAnimalActionPerformed(evt);
            }
        });

        jLabelEspecie.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabelEspecie.setText("Especie:");

        jLabelPelagem.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabelPelagem.setText("Pelagem:");

        jLabelSexoAnimal.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabelSexoAnimal.setText("Sexo:");

        jComboBoxSexoAnimal.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "masculino", "feminino" }));

        jLabelRaça.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabelRaça.setText("Raça:");

        jLabelPeso.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabelPeso.setText("Peso:");

        jLabelDataNascimento.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabelDataNascimento.setText("Data de Nascimento:");

        jLabelPorte.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabelPorte.setText("Porte:");

        jLabelIdade.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabelIdade.setText("Idade:");

        jLabelcod.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabelcod.setText("Cod:");

        jTextFieldCod.setEnabled(false);
        jTextFieldCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCodActionPerformed(evt);
            }
        });

        jLabelcodDono.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabelcodDono.setText("Codigo do dono:");

        jTextFieldCodDono.setEnabled(false);

        jLabelcodDono1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabelcodDono1.setText("Nome do dono:");

        jTextField1.setDropMode(javax.swing.DropMode.INSERT);
        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField1FocusLost(evt);
            }
        });
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabelcodDonoCPF.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabelcodDonoCPF.setText("CPF Dono:");

        jTextFieldCPF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldCPFFocusLost(evt);
            }
        });
        jTextFieldCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCPFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabelNomeAnimal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldNomeAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabelRaça)
                                .addGap(9, 9, 9)
                                .addComponent(jTextFieldRaçaAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelPeso)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldPesoAnimal)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabelEspecie)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldEspecieAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelPelagem)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldPelagemAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelSexoAnimal))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabelDataNascimento)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldDataNascimentoAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelPorte)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldPorteAnimal)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBoxSexoAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabelIdade)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldIdadeAnimal)))
                        .addContainerGap(22, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabelcod)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldCod, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelcodDonoCPF)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldCPF)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelcodDono1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelcodDono)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldCodDono, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelcod)
                    .addComponent(jLabelcodDono)
                    .addComponent(jTextFieldCodDono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelcodDono1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelcodDonoCPF)
                    .addComponent(jTextFieldCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNomeAnimal)
                    .addComponent(jTextFieldNomeAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelEspecie)
                    .addComponent(jTextFieldEspecieAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPelagem)
                    .addComponent(jTextFieldPelagemAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelSexoAnimal)
                    .addComponent(jComboBoxSexoAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelRaça)
                    .addComponent(jTextFieldRaçaAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPeso)
                    .addComponent(jTextFieldPesoAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDataNascimento)
                    .addComponent(jLabelPorte)
                    .addComponent(jTextFieldPorteAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelIdade)
                    .addComponent(jTextFieldIdadeAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldDataNascimentoAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(217, 217, 217)
                        .addComponent(jButtonSalvar)
                        .addGap(47, 47, 47)
                        .addComponent(jButtonLimpar)
                        .addGap(47, 47, 47)
                        .addComponent(jButtonCancelar)))
                .addGap(8, 8, 8))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonSalvar)
                    .addComponent(jButtonLimpar)
                    .addComponent(jButtonCancelar))
                .addContainerGap())
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 30, 790, 190);

        jLabelNome10.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabelNome10.setText("Dados do Animal");
        getContentPane().add(jLabelNome10);
        jLabelNome10.setBounds(20, 10, 100, 14);

        setSize(new java.awt.Dimension(825, 269));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        // TODO add your handling code here:
        
        con.conexao();
                    
                if (flag==1){
            
                mod.setNomeAnimal(jTextFieldNomeAnimal.getText());
                mod.setEspecie(jTextFieldEspecieAnimal.getText());
                mod.setPelagem(jTextFieldPelagemAnimal.getText());
                mod.setSexo((String) jComboBoxSexoAnimal.getSelectedItem());
                mod.setRaça(jTextFieldRaçaAnimal.getText());
                mod.setPeso(jTextFieldPesoAnimal.getText());
                mod.setDatanascimento(jTextFieldDataNascimentoAnimal.getText());
                mod.setPorte(jTextFieldPorteAnimal.getText());
                mod.setIdade(Integer.parseInt(jTextFieldIdadeAnimal.getText()));
                mod.setCodProprietario(Integer.parseInt(jTextFieldCodDono.getText()));
                
                               
                dao.Salvar(mod);
                                               
                jTextFieldNomeAnimal.setText("");
                jTextFieldEspecieAnimal.setText("");
                jTextFieldPelagemAnimal.setText("");
                jTextFieldRaçaAnimal.setText("");
                jTextFieldPesoAnimal.setText("");
                jTextFieldDataNascimentoAnimal.setText("");
                jTextFieldPorteAnimal.setText("");
                jTextFieldIdadeAnimal.setText("");
                jTextFieldCPF.setText("");
                jTextFieldCodDono.setText("");
                jTextField1.setText("");
               
                               
        }else{  
               con.conexao();
                mod.setNomeAnimal(jTextFieldNomeAnimal.getText());
                mod.setEspecie(jTextFieldEspecieAnimal.getText());
                mod.setPelagem(jTextFieldPelagemAnimal.getText());
                mod.setSexo((String) jComboBoxSexoAnimal.getSelectedItem());
                mod.setRaça(jTextFieldRaçaAnimal.getText());
                mod.setPeso(jTextFieldPesoAnimal.getText());
                mod.setDatanascimento(jTextFieldDataNascimentoAnimal.getText());
                mod.setPorte(jTextFieldPorteAnimal.getText());
                mod.setIdade(Integer.parseInt(jTextFieldIdadeAnimal.getText()));
                mod.setCodProprietario(Integer.parseInt(jTextFieldCodDono.getText()));
                                
                
                dao.Editar(mod);
                               
                jTextFieldNomeAnimal.setText("");
                jTextFieldEspecieAnimal.setText("");
                jTextFieldPelagemAnimal.setText("");
                jTextFieldRaçaAnimal.setText("");
                jTextFieldPesoAnimal.setText("");
                jTextFieldDataNascimentoAnimal.setText("");
                jTextFieldPorteAnimal.setText("");
                jTextFieldIdadeAnimal.setText("");
                jTextFieldCPF.setText("");
                jTextFieldCodDono.setText("");
                jTextField1.setText("");
                                                
                con.conexao();
                
        
        
        
                }    
        
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparActionPerformed
        // TODO add your handling code here:
        
                jTextFieldNomeAnimal.setText("");
                jTextFieldEspecieAnimal.setText("");
                jTextFieldPelagemAnimal.setText("");
                jTextFieldRaçaAnimal.setText("");
                jTextFieldPesoAnimal.setText("");
                jTextFieldDataNascimentoAnimal.setText("");
                jTextFieldPorteAnimal.setText("");
                jTextFieldIdadeAnimal.setText("");
    }//GEN-LAST:event_jButtonLimparActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        // TODO add your handling code here:
                jTextFieldNomeAnimal.setText("");
                jTextFieldEspecieAnimal.setText("");
                jTextFieldPelagemAnimal.setText("");
                jTextFieldRaçaAnimal.setText("");
                jTextFieldPesoAnimal.setText("");
                jTextFieldDataNascimentoAnimal.setText("");
                jTextFieldPorteAnimal.setText("");
                jTextFieldIdadeAnimal.setText("");
                
                dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jTextFieldNomeAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeAnimalActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_jTextFieldNomeAnimalActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
                
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextFieldCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCPFActionPerformed
        // TODO add your handling code here:
        
        
        
        
       
    }//GEN-LAST:event_jTextFieldCPFActionPerformed

    private void jTextFieldCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCodActionPerformed

    private void jTextFieldCPFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldCPFFocusLost
        // TODO add your handling code here:
        
        con.conexao();    
        modPac.setPesquisa(jTextFieldCPF.getText());
        ModProprietario model = control.buscaProprietarioCPF(modPac);
        jTextFieldCPF.setText(model.getCpf());
        jTextFieldCodDono.setText(String.valueOf(model.getId()));
        jTextField1.setText(model.getNomeProprietario());
        con.desconecta();
    }//GEN-LAST:event_jTextFieldCPFFocusLost

    private void jTextField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1FocusLost

    
    
    
    
    
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
            java.util.logging.Logger.getLogger(FormAnimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormAnimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormAnimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormAnimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormAnimal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JComboBox jComboBoxSexoAnimal;
    private javax.swing.JLabel jLabelDataNascimento;
    private javax.swing.JLabel jLabelEspecie;
    private javax.swing.JLabel jLabelIdade;
    private javax.swing.JLabel jLabelNome10;
    private javax.swing.JLabel jLabelNomeAnimal;
    private javax.swing.JLabel jLabelPelagem;
    private javax.swing.JLabel jLabelPeso;
    private javax.swing.JLabel jLabelPorte;
    private javax.swing.JLabel jLabelRaça;
    private javax.swing.JLabel jLabelSexoAnimal;
    private javax.swing.JLabel jLabelcod;
    private javax.swing.JLabel jLabelcodDono;
    private javax.swing.JLabel jLabelcodDono1;
    private javax.swing.JLabel jLabelcodDonoCPF;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextFieldCPF;
    private javax.swing.JTextField jTextFieldCod;
    private javax.swing.JTextField jTextFieldCodDono;
    private javax.swing.JTextField jTextFieldDataNascimentoAnimal;
    private javax.swing.JTextField jTextFieldEspecieAnimal;
    private javax.swing.JTextField jTextFieldIdadeAnimal;
    private javax.swing.JTextField jTextFieldNomeAnimal;
    private javax.swing.JTextField jTextFieldPelagemAnimal;
    private javax.swing.JTextField jTextFieldPesoAnimal;
    private javax.swing.JTextField jTextFieldPorteAnimal;
    private javax.swing.JTextField jTextFieldRaçaAnimal;
    // End of variables declaration//GEN-END:variables
}

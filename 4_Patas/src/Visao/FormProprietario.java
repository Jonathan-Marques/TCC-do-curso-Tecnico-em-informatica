/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao;

import Conexao.ConexaoBD;
import Dao.DaoProprietario;
import javax.swing.JOptionPane;
import modelo.ModProprietario;


/**
 *
 * @author Jonathan
 */
public class FormProprietario extends javax.swing.JFrame {
    int flag = 0;
    ModProprietario mod = new ModProprietario();
    DaoProprietario dao = new DaoProprietario();
    ConexaoBD con = new ConexaoBD();
    /**
     * Creates new form FormProprietario
     */
    public FormProprietario() {
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

        jLabelNome9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabelNomedaRua = new javax.swing.JLabel();
        jTextFieldNomedaRua = new javax.swing.JTextField();
        jLabelNumero = new javax.swing.JLabel();
        jTextFieldNumero = new javax.swing.JTextField();
        jLabelBarrio = new javax.swing.JLabel();
        jLabelCep = new javax.swing.JLabel();
        jTextFieldBarrio = new javax.swing.JTextField();
        jTextFieldCep = new javax.swing.JTextField();
        jLabelEstado = new javax.swing.JLabel();
        jTextFieldCidade = new javax.swing.JTextField();
        jLabelCidade = new javax.swing.JLabel();
        jComboBoxEstado = new javax.swing.JComboBox();
        jLabelNome21 = new javax.swing.JLabel();
        jPanelProprietario = new javax.swing.JPanel();
        jLabelEmail = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jLabelDataNascimento = new javax.swing.JLabel();
        jLabelNomeProprietario = new javax.swing.JLabel();
        jLabelCod = new javax.swing.JLabel();
        jTextFieldCod = new javax.swing.JTextField();
        jTextFieldNomeProprietario = new javax.swing.JTextField();
        jLabelTelefone = new javax.swing.JLabel();
        jTextFieldRG = new javax.swing.JTextField();
        jLabelNomeRg = new javax.swing.JLabel();
        jTextFieldCpf = new javax.swing.JTextField();
        jLabelCpf = new javax.swing.JLabel();
        jLabelCel = new javax.swing.JLabel();
        jComboBoxSexo = new javax.swing.JComboBox();
        jLabelSexo = new javax.swing.JLabel();
        jTextFieldData = new javax.swing.JTextField();
        jTextFieldTel = new javax.swing.JTextField();
        jTextFieldCel = new javax.swing.JTextField();
        jButtonLimpar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelNome9.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabelNome9.setText("Dados do Proprietario");
        getContentPane().add(jLabelNome9, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 11, 120, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelNomedaRua.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabelNomedaRua.setText("Nome:");

        jLabelNumero.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabelNumero.setText("Numero:");

        jLabelBarrio.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabelBarrio.setText("Bairro:");

        jLabelCep.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabelCep.setText("CEP:");

        jLabelEstado.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabelEstado.setText("Estado:");

        jLabelCidade.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabelCidade.setText("Cidade:");

        jComboBoxEstado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AC", "AL", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR\t ", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabelNomedaRua)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldNomedaRua, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelNumero)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelCep)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldCep, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabelBarrio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldBarrio, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelEstado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelCidade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(148, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jTextFieldCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNumero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelNomedaRua)
                        .addComponent(jTextFieldNomedaRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabelCep, javax.swing.GroupLayout.Alignment.LEADING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelBarrio)
                        .addComponent(jTextFieldBarrio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelCidade)
                        .addComponent(jComboBoxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelEstado)))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jLabelNome21.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabelNome21.setText("Endereço");

        jPanelProprietario.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelEmail.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabelEmail.setText("E-mail:");

        jLabelDataNascimento.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabelDataNascimento.setText("Data de Nascimento:");

        jLabelNomeProprietario.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabelNomeProprietario.setText("Nome:");

        jLabelCod.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabelCod.setText("Codigo:");

        jTextFieldCod.setEditable(false);
        jTextFieldCod.setEnabled(false);
        jTextFieldCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCodActionPerformed(evt);
            }
        });

        jLabelTelefone.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabelTelefone.setText("Telefone:");

        jLabelNomeRg.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabelNomeRg.setText("RG:");

        jLabelCpf.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabelCpf.setText("CPF:");

        jLabelCel.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabelCel.setText("Celular:");

        jComboBoxSexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "masculino", "feminino" }));

        jLabelSexo.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabelSexo.setText("Sexo:");

        javax.swing.GroupLayout jPanelProprietarioLayout = new javax.swing.GroupLayout(jPanelProprietario);
        jPanelProprietario.setLayout(jPanelProprietarioLayout);
        jPanelProprietarioLayout.setHorizontalGroup(
            jPanelProprietarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProprietarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelProprietarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelProprietarioLayout.createSequentialGroup()
                        .addComponent(jLabelCod)
                        .addGap(9, 9, 9)
                        .addComponent(jTextFieldCod, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelProprietarioLayout.createSequentialGroup()
                        .addComponent(jLabelEmail)
                        .addGap(11, 11, 11)
                        .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelProprietarioLayout.createSequentialGroup()
                        .addComponent(jLabelNomeProprietario)
                        .addGap(5, 5, 5)
                        .addComponent(jTextFieldNomeProprietario, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelNomeRg)
                        .addGap(9, 9, 9)
                        .addComponent(jTextFieldRG, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jLabelCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jTextFieldCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(jLabelSexo)
                        .addGap(10, 10, 10)
                        .addComponent(jComboBoxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelProprietarioLayout.createSequentialGroup()
                        .addComponent(jLabelDataNascimento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldData, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelTelefone)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldTel, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelCel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldCel, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanelProprietarioLayout.setVerticalGroup(
            jPanelProprietarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProprietarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelProprietarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelCod)
                    .addComponent(jTextFieldCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanelProprietarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelNomeProprietario)
                    .addComponent(jTextFieldNomeProprietario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNomeRg)
                    .addComponent(jTextFieldRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCpf)
                    .addComponent(jTextFieldCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelSexo)
                    .addComponent(jComboBoxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelProprietarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelProprietarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelDataNascimento)
                        .addComponent(jTextFieldData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelProprietarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelTelefone)
                        .addComponent(jTextFieldTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelProprietarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelCel)
                        .addComponent(jTextFieldCel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(jPanelProprietarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelEmail)
                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

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

        jButtonSalvar.setText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jPanelProprietario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addComponent(jButtonSalvar)
                        .addGap(57, 57, 57)
                        .addComponent(jButtonLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(jButtonCancelar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelNome21, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jPanelProprietario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabelNome21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonSalvar)
                    .addComponent(jButtonLimpar)
                    .addComponent(jButtonCancelar))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 31, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        // TODO add your handling code here:
        
                 con.conexao();
                    
                if (flag==1){
            
                mod.setNomeProprietario(jTextFieldNomeProprietario.getText());
                mod.setRg(jTextFieldRG.getText());
                mod.setCpf(jTextFieldCpf.getText());
                mod.setSexoPro((String) jComboBoxSexo.getSelectedItem());
                mod.setDatanascimentoProietario(jTextFieldData.getText());
                mod.setTelefone(jTextFieldTel.getText());
                mod.setCelular(jTextFieldCel.getText());
                mod.setEmail(jTextFieldEmail.getText());
                
                mod.setRua(jTextFieldNomedaRua.getText());
                mod.setNumero(jTextFieldNumero.getText());
                mod.setCep(jTextFieldCep.getText());
                mod.setBairro(jTextFieldBarrio.getText());
                mod.setEstado((String) jComboBoxEstado.getSelectedItem());
                mod.setCidade(jTextFieldCidade.getText());
                               
                dao.Salvar(mod);
                 
                 int resposta = 0;
                resposta = JOptionPane.showConfirmDialog(rootPane, "Deseja Cadastra o Paciente!");
                if(resposta == JOptionPane.YES_OPTION){
                FormAnimal form = new FormAnimal();
                form.setVisible(true);
                
        }
                jTextFieldNomeProprietario.setText("");
                jTextFieldRG.setText("");
                jTextFieldCpf.setText("");
                jTextFieldData.setText("");
                jTextFieldTel.setText("");
                jTextFieldCel.setText("");
                jTextFieldEmail.setText("");
                jTextFieldNomedaRua.setText("");
                jTextFieldNumero.setText("");
                jTextFieldCep.setText("");
                jTextFieldBarrio.setText("");
                jTextFieldCidade.setText("");
               
                
                con.conexao();
                
        }else{  con.conexao();
                 mod.setNomeProprietario(jTextFieldNomeProprietario.getText());
                mod.setRg(jTextFieldRG.getText());
                mod.setCpf(jTextFieldCpf.getText());
                mod.setSexoPro((String) jComboBoxSexo.getSelectedItem());
                mod.setDatanascimentoProietario(jTextFieldData.getText());
                mod.setTelefone(jTextFieldTel.getText());
                mod.setCelular(jTextFieldCel.getText());
                mod.setEmail(jTextFieldEmail.getText());
                
                mod.setRua(jTextFieldNomedaRua.getText());
                mod.setNumero(jTextFieldNumero.getText());
                mod.setCep(jTextFieldCep.getText());
                mod.setBairro(jTextFieldBarrio.getText());
                mod.setEstado((String) jComboBoxEstado.getSelectedItem());
                mod.setCidade(jTextFieldCidade.getText());
                                
                
                dao.Editar(mod);
                               
                jTextFieldNomeProprietario.setText("");
                jTextFieldRG.setText("");
                jTextFieldCpf.setText("");
                jTextFieldData.setText("");
                jTextFieldTel.setText("");
                jTextFieldCel.setText("");
                jTextFieldEmail.setText("");
                jTextFieldNomedaRua.setText("");
                jTextFieldNumero.setText("");
                jTextFieldCep.setText("");
                jTextFieldBarrio.setText("");
                jTextFieldCidade.setText("");
                                                
                con.conexao();
                
        
        
        
                }    
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparActionPerformed
        // TODO add your handling code here:
                jTextFieldNomeProprietario.setText("");
                jTextFieldRG.setText("");
                jTextFieldCpf.setText("");
                jTextFieldData.setText("");
                jTextFieldTel.setText("");
                jTextFieldCel.setText("");
                jTextFieldEmail.setText("");
                jTextFieldNomedaRua.setText("");
                jTextFieldNumero.setText("");
                jTextFieldCep.setText("");
                jTextFieldBarrio.setText("");
                jTextFieldCidade.setText("");
        
        
    }//GEN-LAST:event_jButtonLimparActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        // TODO add your handling code here:
                 jTextFieldNomeProprietario.setText("");
                jTextFieldRG.setText("");
                jTextFieldCpf.setText("");
                jTextFieldData.setText("");
                jTextFieldTel.setText("");
                jTextFieldCel.setText("");
                jTextFieldEmail.setText("");
                jTextFieldNomedaRua.setText("");
                jTextFieldNumero.setText("");
                jTextFieldCep.setText("");
                jTextFieldBarrio.setText("");
                jTextFieldCidade.setText("");
                
                dispose();
        
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jTextFieldCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCodActionPerformed

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
            java.util.logging.Logger.getLogger(FormProprietario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormProprietario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormProprietario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormProprietario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormProprietario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JComboBox jComboBoxEstado;
    private javax.swing.JComboBox jComboBoxSexo;
    private javax.swing.JLabel jLabelBarrio;
    private javax.swing.JLabel jLabelCel;
    private javax.swing.JLabel jLabelCep;
    private javax.swing.JLabel jLabelCidade;
    private javax.swing.JLabel jLabelCod;
    private javax.swing.JLabel jLabelCpf;
    private javax.swing.JLabel jLabelDataNascimento;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelEstado;
    private javax.swing.JLabel jLabelNome21;
    private javax.swing.JLabel jLabelNome9;
    private javax.swing.JLabel jLabelNomeProprietario;
    private javax.swing.JLabel jLabelNomeRg;
    private javax.swing.JLabel jLabelNomedaRua;
    private javax.swing.JLabel jLabelNumero;
    private javax.swing.JLabel jLabelSexo;
    private javax.swing.JLabel jLabelTelefone;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelProprietario;
    private javax.swing.JTextField jTextFieldBarrio;
    private javax.swing.JTextField jTextFieldCel;
    private javax.swing.JTextField jTextFieldCep;
    private javax.swing.JTextField jTextFieldCidade;
    private javax.swing.JTextField jTextFieldCod;
    private javax.swing.JTextField jTextFieldCpf;
    private javax.swing.JTextField jTextFieldData;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldNomeProprietario;
    private javax.swing.JTextField jTextFieldNomedaRua;
    private javax.swing.JTextField jTextFieldNumero;
    private javax.swing.JTextField jTextFieldRG;
    private javax.swing.JTextField jTextFieldTel;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the jTextFieldCod
     */
    public javax.swing.JTextField getjTextFieldCod() {
        return jTextFieldCod;
    }

    /**
     * @param jTextFieldCod the jTextFieldCod to set
     */
    public void setjTextFieldCod(javax.swing.JTextField jTextFieldCod) {
        this.jTextFieldCod = jTextFieldCod;
    }
}

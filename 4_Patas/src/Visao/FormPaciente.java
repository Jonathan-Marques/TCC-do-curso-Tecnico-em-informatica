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
public class FormPaciente extends javax.swing.JFrame {

    /**
     * Creates new form FormPaciente
     */
    public FormPaciente() {
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
        jFormattedTextFieldDataNascimentoAnimal = new javax.swing.JFormattedTextField();
        jLabelPorte = new javax.swing.JLabel();
        jTextFieldPorteAnimal = new javax.swing.JTextField();
        jLabelIdade = new javax.swing.JLabel();
        jTextFieldIdadeAnimal = new javax.swing.JTextField();
        jLabelNome10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(null);

        jButtonSalvar.setText("Salvar");
        jPanel1.add(jButtonSalvar);
        jButtonSalvar.setBounds(220, 140, 63, 23);

        jButtonLimpar.setText("Limpar");
        jPanel1.add(jButtonLimpar);
        jButtonLimpar.setBounds(330, 140, 63, 23);

        jButtonCancelar.setText("Cancelar");
        jPanel1.add(jButtonCancelar);
        jButtonCancelar.setBounds(440, 140, 75, 23);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelNomeAnimal.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabelNomeAnimal.setText("Nome:");

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

        jFormattedTextFieldDataNascimentoAnimal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));

        jLabelPorte.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabelPorte.setText("Porte:");

        jLabelIdade.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabelIdade.setText("Idade:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
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
                        .addComponent(jFormattedTextFieldDataNascimentoAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
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
                    .addComponent(jFormattedTextFieldDataNascimentoAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPorte)
                    .addComponent(jTextFieldPorteAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelIdade)
                    .addComponent(jTextFieldIdadeAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(10, 10, 770, 80);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 30, 790, 170);

        jLabelNome10.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabelNome10.setText("Dados do Animal");
        getContentPane().add(jLabelNome10);
        jLabelNome10.setBounds(20, 10, 100, 14);

        setSize(new java.awt.Dimension(825, 251));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(FormPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPaciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JComboBox jComboBoxSexoAnimal;
    private javax.swing.JFormattedTextField jFormattedTextFieldDataNascimentoAnimal;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextFieldEspecieAnimal;
    private javax.swing.JTextField jTextFieldIdadeAnimal;
    private javax.swing.JTextField jTextFieldNomeAnimal;
    private javax.swing.JTextField jTextFieldPelagemAnimal;
    private javax.swing.JTextField jTextFieldPesoAnimal;
    private javax.swing.JTextField jTextFieldPorteAnimal;
    private javax.swing.JTextField jTextFieldRaçaAnimal;
    // End of variables declaration//GEN-END:variables
}

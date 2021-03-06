/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Controladores.ControladorProdutos;
import classes.Produto;
import classes.ProdutoImportado;
import classes.ProdutoNacional;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Eymar Lima
 */
public class CadastroDeProdutos extends javax.swing.JDialog {

    /**
     * Creates new form CadastroDeProdutos
     */
    public CadastroDeProdutos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        jButton2 = new javax.swing.JButton();
        labelTipo = new javax.swing.JLabel();
        labelIcone = new javax.swing.JLabel();
        textFieldCodigo = new javax.swing.JTextField();
        labelCodigo = new javax.swing.JLabel();
        labelDescricao = new javax.swing.JLabel();
        textFieldDescricao = new javax.swing.JTextField();
        labelValor = new javax.swing.JLabel();
        textFieldValor = new javax.swing.JTextField();
        labelTaxaImposto = new javax.swing.JLabel();
        labelTaxaImportacao = new javax.swing.JLabel();
        textFieldImposto = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        comboBoxTipos = new javax.swing.JComboBox();
        textFieldImportacao = new javax.swing.JTextField();

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/1436243313_arrow-back.png"))); // NOI18N
        jButton2.setText("Voltar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        labelTipo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelTipo.setText("Tipo:");

        labelIcone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/1436244933_deliverables.png"))); // NOI18N

        labelCodigo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelCodigo.setText("Código:");

        labelDescricao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelDescricao.setText("Descrição:");

        labelValor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelValor.setText("Valor:");

        textFieldValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldValorActionPerformed(evt);
            }
        });

        labelTaxaImposto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelTaxaImposto.setText("Taxa de Imposto:");

        labelTaxaImportacao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelTaxaImportacao.setText("Taxa de Importação:");

        btnSalvar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/1436243324_save.png"))); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnVoltar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/1436243313_arrow-back.png"))); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        comboBoxTipos.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Produto Importado", "Produto Nacional" }));
        comboBoxTipos.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                comboBoxTiposFocusLost(evt);
            }
        });
        comboBoxTipos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxTiposActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelIcone, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                            .addComponent(labelTipo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(textFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(labelValor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                                .addComponent(textFieldValor, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(comboBoxTipos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelDescricao)
                        .addGap(18, 18, 18)
                        .addComponent(textFieldDescricao))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(labelTaxaImposto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textFieldImposto, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(63, 63, 63)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelTaxaImportacao)
                            .addComponent(btnVoltar))
                        .addGap(18, 18, 18)
                        .addComponent(textFieldImportacao, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {labelCodigo, labelDescricao, labelTipo, labelValor});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {labelTaxaImportacao, labelTaxaImposto});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {comboBoxTipos, textFieldCodigo, textFieldValor});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnSalvar, btnVoltar});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(comboBoxTipos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(labelIcone))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelValor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelDescricao))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(labelTaxaImposto)
                                .addComponent(textFieldImposto, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(labelTaxaImportacao, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(textFieldImportacao, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 73, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnVoltar)
                            .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(24, 24, 24))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {comboBoxTipos, textFieldCodigo, textFieldDescricao, textFieldImposto, textFieldValor});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {labelCodigo, labelDescricao, labelTipo, labelValor});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {labelTaxaImportacao, labelTaxaImposto});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnSalvar, btnVoltar});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textFieldValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldValorActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void comboBoxTiposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxTiposActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxTiposActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        //Salvar o produto cadastrado
        
        String codigo,descricao,verif1, verif2;
        float valor,taxaImposto,taxaImportacao;
        Produto prdt;
        ControladorProdutos control = new ControladorProdutos();
        
        codigo = textFieldCodigo.getText();
        descricao = textFieldDescricao.getText();
        
        try {
            if(control.produtoJaCadastrado(codigo) == true){
                JOptionPane.showMessageDialog(null, "Já Possui um Item Cadastrado Com Esse Código!!");
                return;
            }
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(CadastroDeProdutos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if(codigo.isEmpty() || descricao.isEmpty()){
            JOptionPane.showMessageDialog(null, "Algum dos Campos Está Vazio !!");
            return;
        }
        
        verif1 = textFieldValor.getText();
        verif2 = textFieldImposto.getText();
        
        if(verif1.isEmpty() || verif2.isEmpty()){
            JOptionPane.showMessageDialog(null, "Algum dos Campos Está Vazio !!");
            return;
        }
        valor = Float.parseFloat(verif1);
        taxaImposto = Float.parseFloat(verif2);
        
        if(comboBoxTipos.getSelectedIndex() == 1){
            prdt = new ProdutoNacional(codigo,descricao,valor,taxaImposto);
        }else{
            String verif = textFieldImportacao.getText();
            
            if(verif.isEmpty()){
                JOptionPane.showMessageDialog(null, "Algum dos Campos Está Vazio !!");
                return;
            }
            taxaImportacao = Float.parseFloat(verif);
            prdt = new ProdutoImportado(codigo,descricao,valor,taxaImposto,taxaImportacao);
        }
        
        try {
            control.cadastrarProduto(prdt);
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(CadastroDeProdutos.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void comboBoxTiposFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_comboBoxTiposFocusLost
        
        if(comboBoxTipos.getSelectedIndex() == 1)textFieldImportacao.setEnabled(false);
        else textFieldImportacao.setEnabled(true);
        textFieldImportacao.setEditable(true);
    }//GEN-LAST:event_comboBoxTiposFocusLost

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
            java.util.logging.Logger.getLogger(CadastroDeProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroDeProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroDeProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroDeProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CadastroDeProdutos dialog = new CadastroDeProdutos(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JComboBox comboBoxTipos;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel labelCodigo;
    private javax.swing.JLabel labelDescricao;
    private javax.swing.JLabel labelIcone;
    private javax.swing.JLabel labelTaxaImportacao;
    private javax.swing.JLabel labelTaxaImposto;
    private javax.swing.JLabel labelTipo;
    private javax.swing.JLabel labelValor;
    private javax.swing.JTextField textFieldCodigo;
    private javax.swing.JTextField textFieldDescricao;
    private javax.swing.JTextField textFieldImportacao;
    private javax.swing.JTextField textFieldImposto;
    private javax.swing.JTextField textFieldValor;
    // End of variables declaration//GEN-END:variables
}

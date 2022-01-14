/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.CaixaController;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Alan
 */
public class TelaCaixa extends javax.swing.JFrame {

   String padrao = "###,###.##";
    DecimalFormat df = new DecimalFormat(padrao);
    double caixa;
    double saldoAtualizado;
    
    public TelaCaixa() {
        initComponents();
        this.setLocationRelativeTo(null);
        
       atualizaSaldo();
        
    }
    
    public void atualizaSaldo(){
        CaixaController caixaController = new CaixaController();
        CampoSaldo.setText(String.valueOf(caixaController.buscaId()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        CampoSaldo = new javax.swing.JLabel();
        BotaoValor = new javax.swing.JButton();
        CampoValor = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Debitar = new javax.swing.JCheckBox();
        Creditar = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\Allan\\OneDrive\\Documentos\\NetBeansProjects\\Oficina\\Sistema-Oficina\\src\\main\\java\\view\\icons\\Money_27019_1.png")); // NOI18N
        jLabel10.setText("CAIXA DA EMPRESA");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("VOLTAR");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        CampoSaldo.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        CampoSaldo.setForeground(new java.awt.Color(0, 153, 0));

        BotaoValor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BotaoValor.setText("Confirmar");
        BotaoValor.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BotaoValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoValorActionPerformed(evt);
            }
        });

        CampoValor.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, null, 1.0d));

        jLabel1.setText("R$");

        jLabel3.setBackground(new java.awt.Color(51, 153, 0));
        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 0));
        jLabel3.setText("R$");

        Debitar.setText("Debitar");
        Debitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DebitarActionPerformed(evt);
            }
        });

        Creditar.setText("Creditar");
        Creditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(167, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CampoSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
            .addGroup(layout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(CampoValor, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(Creditar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(Debitar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BotaoValor, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(203, 203, 203))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CampoSaldo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CampoValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(BotaoValor, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Creditar)
                    .addComponent(Debitar))
                .addGap(30, 30, 30)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void BotaoValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoValorActionPerformed
     
       CaixaController caixaController = new CaixaController();
        
      if(Creditar.isSelected()){
     
      caixaController.atualizaCaixaPositivo(Float.parseFloat(CampoValor.getValue().toString()));
      JOptionPane.showMessageDialog(null, "Valor de R$"+CampoValor.getValue()+" adiconado com sucesso.");
      atualizaSaldo();
      }else if(Debitar.isSelected()){
        caixaController.atualizaCaixaNegativo(Float.parseFloat(CampoValor.getValue().toString()));
        JOptionPane.showMessageDialog(null, "Valor de R$"+CampoValor.getValue()+" retirado com sucesso.");
        atualizaSaldo();
      }else{
          JOptionPane.showMessageDialog(null, "Selecione o tipo da operação para continuar.");
      }
        
      
    }//GEN-LAST:event_BotaoValorActionPerformed

    private void DebitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DebitarActionPerformed
      
        if(Debitar.isSelected() == true){
        Creditar.setEnabled(false);    
        }else{
        Creditar.setEnabled(true);
        }
        
    }//GEN-LAST:event_DebitarActionPerformed

    private void CreditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreditarActionPerformed
       if(Creditar.isSelected() == true){
        Debitar.setEnabled(false);    
        }else{
        Debitar.setEnabled(true);
        }
    }//GEN-LAST:event_CreditarActionPerformed


    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCaixa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoValor;
    private javax.swing.JLabel CampoSaldo;
    private javax.swing.JSpinner CampoValor;
    private javax.swing.JCheckBox Creditar;
    private javax.swing.JCheckBox Debitar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}

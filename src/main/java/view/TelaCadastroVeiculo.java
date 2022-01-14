/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ClienteController;
import controller.VeiculoController;
import javax.swing.JOptionPane;
import model.Veiculo;

public class TelaCadastroVeiculo extends javax.swing.JFrame {

    public TelaCadastroVeiculo() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        ClienteController cc = new ClienteController();
        
        for (int i = 0; i<cc.mostrarTodos().size(); i++) {
            CampoProprietario.addItem(cc.mostrarTodos().get(i).getNome());
        }
        
    }
 
    @SuppressWarnings("unchecked") 
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        CampoNomeCarro = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        CampoTipo = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        CampoCor = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        CampoAno = new javax.swing.JComboBox<>();
        CampoMarca = new javax.swing.JComboBox<>();
        CampoProprietario = new javax.swing.JComboBox<>();
        CampoPlaca = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        CampoObservacoes = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(0, 204, 204));
        setPreferredSize(new java.awt.Dimension(720, 650));
        setResizable(false);

        jLabel6.setText("NOME :");

        CampoNomeCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoNomeCarroActionPerformed(evt);
            }
        });

        jLabel7.setText("ANO :");

        jLabel8.setText("PLACA :");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\Allan\\OneDrive\\Documentos\\NetBeansProjects\\Oficina\\Sistema-Oficina\\src\\main\\java\\view\\icons\\cargreenicon_98531 (1).png")); // NOI18N
        jLabel9.setText("DADOS DO CARRO");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("VOLTAR");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("CADASTRAR");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel17.setText("TIPO :");

        CampoTipo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        CampoTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aventureiro compacto", "Hatch subcompacto", "Hatch compacto", "Hatch médio", "Sedã compacto", "Sedã médio", "Sedã grande", "Familiar compacto", "Familiar médio", "Familiar grande", "Picape compacta", "Picape média", "Picape grande", "SUV compacto", "SUV médio", "SUV grande", "Esportivo compacto", "Esportivo médio", "Esportivo grande", "Conversível compacto", "Conversível médio", "Conversível grande", "Van média", "Van grande", "Jipe", "Furgão compacto", "Furgão médio", "Caminhão urbano" }));
        CampoTipo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12), new java.awt.Color(0, 153, 153))); // NOI18N

        jLabel18.setText("COR :");

        CampoCor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoCorActionPerformed(evt);
            }
        });

        jLabel19.setText("MARCA :");

        CampoAno.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        CampoAno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040" }));
        CampoAno.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12), new java.awt.Color(0, 153, 153))); // NOI18N

        CampoMarca.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        CampoMarca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Toyota", "BMW", "Volkswagen", "Mercedes-Benz", "Honda", "Nissan", "Ford", "Porsche", "Hyundai", "Renault", "Peugeot", "Audi", "Chevrolet", "Kia", "Suzuki", "Fiat", "Daimler", "General Motors", "Mazda", "Land Rover", "GMC", "Citroën", "Subaru", "Lexus", "Ferrari", "Harley-Davidson", "Mitsubishi", "Dongfeng Motors", "Volvo", "Isuzu", "Hino", "Daihatsu", "SAIC Motor", "Opel", "Kenworth", "Jeep", "Scania", "Lincoln", "Great Wall Motors", "Dodge", "Tata Motors", "Acura", "Bentley", "Skoda", "Chrysler" }));
        CampoMarca.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12), new java.awt.Color(0, 153, 153))); // NOI18N
        CampoMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoMarcaActionPerformed(evt);
            }
        });

        CampoProprietario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        CampoProprietario.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12), new java.awt.Color(0, 153, 153))); // NOI18N
        CampoProprietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoProprietarioActionPerformed(evt);
            }
        });

        jLabel1.setText("PROPRIETÁRIO :");

        jLabel2.setText("OBSERVAÇÕES :");

        CampoObservacoes.setColumns(20);
        CampoObservacoes.setRows(5);
        jScrollPane1.setViewportView(CampoObservacoes);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CampoNomeCarro, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CampoCor, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CampoPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel17)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 588, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel2)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(CampoTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(32, 32, 32)
                                                .addComponent(jLabel7)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(CampoAno, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(23, 23, 23)
                                                .addComponent(jLabel19)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(CampoMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(CampoProprietario, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(168, 168, 168))))
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(61, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(30, 30, 30))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(219, 219, 219))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel9)
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CampoNomeCarro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel18)
                    .addComponent(CampoCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(CampoPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(CampoAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(CampoTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(CampoMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(CampoProprietario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
        VeiculoController vc = new VeiculoController();
        Veiculo veiculo = new Veiculo();
       
        if(CampoNomeCarro.getText().equals("") || CampoCor.getText().equals("") ||
                CampoPlaca.getText().equals("")){
            
            JOptionPane.showMessageDialog(null, "Preencha todos os campos para pode prosseguir.");
            
        }else{
        
        veiculo.setNome(CampoNomeCarro.getText());
        veiculo.setTipo((String) CampoTipo.getSelectedItem());
        veiculo.setAno(Integer.parseInt(CampoAno.getSelectedItem().toString()));
        veiculo.setCor(CampoCor.getText());
        veiculo.setMarca((String) CampoMarca.getSelectedItem());
        veiculo.setPlaca(CampoPlaca.getText());
        veiculo.setProprietario( CampoProprietario.getSelectedItem().toString());
        veiculo.setObservacoes(CampoObservacoes.getText());
        vc.adiciona(veiculo);
        
        CampoNomeCarro.setText("");
        CampoPlaca.setText("");
        CampoCor.setText("");
        CampoObservacoes.setText("");
        
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void CampoNomeCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoNomeCarroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoNomeCarroActionPerformed

    private void CampoCorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoCorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoCorActionPerformed

    private void CampoProprietarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoProprietarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoProprietarioActionPerformed

    private void CampoMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoMarcaActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastroVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroVeiculo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CampoAno;
    private javax.swing.JTextField CampoCor;
    private javax.swing.JComboBox<String> CampoMarca;
    private javax.swing.JTextField CampoNomeCarro;
    private javax.swing.JTextArea CampoObservacoes;
    private javax.swing.JTextField CampoPlaca;
    private javax.swing.JComboBox<String> CampoProprietario;
    private javax.swing.JComboBox<String> CampoTipo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}

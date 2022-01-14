
package view;

import controller.AdministradorController;
import controller.AtendenteController;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author Allan
 */
public class TelaLogin extends javax.swing.JFrame {

    public TelaLogin() {
        initComponents();
        LoadingLabel.setVisible(false);
        LabelPorcentagem.setVisible(false);
        BarProgresso.setVisible(false);
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        CampoLogin = new javax.swing.JTextField();
        CampoSenha = new javax.swing.JPasswordField();
        ButaoEntrar = new javax.swing.JButton();
        BarProgresso = new javax.swing.JProgressBar();
        LoadingLabel = new javax.swing.JLabel();
        LabelPorcentagem = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Cooper Black", 1, 24)); // NOI18N
        jLabel1.setText("Bem vindo");

        jLabel2.setFont(new java.awt.Font("Cooper Black", 1, 24)); // NOI18N
        jLabel2.setText("Login:");

        jLabel3.setFont(new java.awt.Font("Cooper Black", 1, 24)); // NOI18N
        jLabel3.setText("Senha:");

        CampoLogin.setFont(new java.awt.Font("Cooper Black", 1, 16)); // NOI18N

        CampoSenha.setFont(new java.awt.Font("Cooper Black", 1, 24)); // NOI18N

        ButaoEntrar.setText("Entrar");
        ButaoEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButaoEntrarActionPerformed(evt);
            }
        });

        BarProgresso.setForeground(new java.awt.Color(0, 204, 51));

        LoadingLabel.setFont(new java.awt.Font("Cooper Black", 1, 14)); // NOI18N
        LoadingLabel.setText("Carregando...");

        LabelPorcentagem.setFont(new java.awt.Font("Cooper Black", 1, 14)); // NOI18N
        LabelPorcentagem.setText("0%");

        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.LINE_AXIS));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Allan\\OneDrive\\Documentos\\NetBeansProjects\\Oficina\\Sistema-Oficina\\src\\main\\java\\view\\imagens\\jaguar-e-type-1961-732x488.jpeg")); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BarProgresso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LoadingLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LabelPorcentagem, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(139, 139, 139)
                                .addComponent(ButaoEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CampoLogin)
                                    .addComponent(CampoSenha)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(33, 33, 33))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 119, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(117, 117, 117)))
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel1)
                        .addGap(88, 88, 88)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CampoLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CampoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(ButaoEntrar))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LoadingLabel)
                    .addComponent(LabelPorcentagem))
                .addGap(7, 7, 7)
                .addComponent(BarProgresso, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ButaoEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButaoEntrarActionPerformed
       
        AtendenteController atendenteController = new AtendenteController();
        AdministradorController administradorController = new AdministradorController();
        int count = 0;
        
        for(int i = 0; i<atendenteController.mostrarTodos().size(); i++){
            if(atendenteController.mostrarTodos().get(i).getLogin().equals(CampoLogin.getText())
                    && atendenteController.mostrarTodos().get(i).getSenha().equals(CampoSenha.getText())){
                
                LoadingLabel.setVisible(true);
                LabelPorcentagem.setVisible(true);
                BarProgresso.setVisible(true);
        
                TelaPrincipalAtendente telaPrincipalAtendente = new TelaPrincipalAtendente();
        
                for(int j = 0; j<=100; j++){
                LabelPorcentagem.setText(String.valueOf(j)+"%");
                BarProgresso.setValue(100);
                try {            
                    Thread.sleep(70);
                } catch (Exception e) {
                    System.out.println(e);
        } 
    }
        JOptionPane.showInternalMessageDialog(null, atendenteController.mostrarTodos().get(i).getNome()+" bem vindo(a).");
        telaPrincipalAtendente.show();
        this.dispose();
        }else{
                count++;
            }
        }
        
        for(int i = 0; i<administradorController.mostrarTodos().size(); i++){
            if(administradorController.mostrarTodos().get(i).getLogin().equals(CampoLogin.getText())
                    && administradorController.mostrarTodos().get(i).getSenha().equals(CampoSenha.getText())){
                
                LoadingLabel.setVisible(true);
                LabelPorcentagem.setVisible(true);
                BarProgresso.setVisible(true);
        
                TelaPrincipal telaPrincipal = new TelaPrincipal();
        
                for(int j = 0; j<=100; j++){
                LabelPorcentagem.setText(String.valueOf(j)+"%");
                BarProgresso.setValue(100);
                try {            
                    Thread.sleep(70);
                } catch (Exception e) {
                    System.out.println(e);
        } 
    }
        JOptionPane.showInternalMessageDialog(null, administradorController.mostrarTodos().get(i).getNome()+" bem vindo(a).");
        telaPrincipal.show();
        this.dispose();
        }else{
                count++;
            }
        }
        
        
        if(count == (atendenteController.mostrarTodos().size() + administradorController.mostrarTodos().size())){
            JOptionPane.showInternalMessageDialog(null, "Senha ou login incorretos. Tente novamente.");
            LoadingLabel.setVisible(false);
            LabelPorcentagem.setVisible(false);
            BarProgresso.setVisible(false);
        }
    }//GEN-LAST:event_ButaoEntrarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);   
            }
       });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar BarProgresso;
    private javax.swing.JButton ButaoEntrar;
    private javax.swing.JTextField CampoLogin;
    private javax.swing.JPasswordField CampoSenha;
    private javax.swing.JLabel LabelPorcentagem;
    private javax.swing.JLabel LoadingLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

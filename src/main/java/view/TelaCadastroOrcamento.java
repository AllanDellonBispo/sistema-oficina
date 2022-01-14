
package view;

import controller.AtendenteController;
import controller.CaixaController;
import controller.ClienteController;
import controller.InsumoController;
import controller.ServicoController;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.Insumo;
import model.Servico;

/**
 *
 * @author Alan
 */
public class TelaCadastroOrcamento extends javax.swing.JFrame {

    public TelaCadastroOrcamento() {

        //Inica co centro da tela.
        initComponents();
        this.setLocationRelativeTo(null);
        CampoResultado.setEditable(false);
        CampoResultado.setText("0");
        CampoResultadoMO.setEditable(false);
        CampoResultadoMO.setText("0");
        CampoResultadoPR.setEditable(false);
        CampoResultadoPR.setText("0");
        //this.setExtendedState(MAXIMIZED_BOTH);
        
        
        DefaultTableModel modelo = (DefaultTableModel)TabelaInsumo.getModel();
        TabelaInsumo.setRowSorter(new TableRowSorter(modelo));
        
        ClienteController clienteController = new ClienteController();
        AtendenteController atendenteController = new AtendenteController();
        ServicoController servicoController = new ServicoController();
        InsumoController insumoController = new InsumoController();
      
        for (int i = 0; i < clienteController.mostrarTodos().size(); i++) {
            CampoProprietario.addItem(clienteController.mostrarTodos().get(i).getNome());
        }
        
        for (int i = 0; i < atendenteController.mostrarTodos().size(); i++) {
            CampoAtendente.addItem(atendenteController.mostrarTodos().get(i).getNome());
        }
        for (int i = 0; i < servicoController.mostrarTodos().size(); i++) {
             CampoServico.addItem(servicoController.mostrarTodos().get(i).getNome());
        }
        
        for (int i = 0; i < insumoController.mostrarTodos().size(); i++) {
            CampoInsumo.addItem(insumoController.mostrarTodos().get(i).getNome());
        }
        

    }
    
    ArrayList<Servico> servicos = new ArrayList<>();
    ArrayList<Insumo> insumos = new ArrayList<>();
    
     public void lerTabela(){
        
        try {
            
        
          ServicoController servicoController = new ServicoController();
            
            DefaultTableModel modelo = (DefaultTableModel)TabelaInsumo.getModel();
            modelo.setNumRows(0);
            
                for(int i = 0; i< servicoController.mostrarTodos().size(); i++){
                    modelo.addRow(new Object[]{
                    
                       servicoController.mostrarTodos().get(i).getId(),
                       servicoController.mostrarTodos().get(i).getNome(),
                       servicoController.mostrarTodos().get(i).getDescricao(),
                       "R$"+servicoController.mostrarTodos().get(i).getPreco()
                        
                    });
                }
               
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    
    }

    @SuppressWarnings("unchecked")


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        CampoAtendente = new javax.swing.JComboBox<>();
        CampoProprietario = new javax.swing.JComboBox<>();
        CampoServico = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        ButtonZerar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        CampoPlaca = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        CampoTempo = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        CampoQuantidadeInsumo = new javax.swing.JSpinner();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        CampoResultadoMO = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        CampoResultadoPR = new javax.swing.JTextField();
        ButtonZerar1 = new javax.swing.JButton();
        CampoResultado = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TabelaInsumo = new javax.swing.JTable();
        CampoInsumo = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        TabelaServico = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setBackground(new java.awt.Color(0, 204, 204));
        setPreferredSize(new java.awt.Dimension(800, 420));
        setResizable(false);

        jLabel1.setText("CLIENTE :");

        jLabel4.setText("SERVIÇO :");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\Allan\\OneDrive\\Documentos\\NetBeansProjects\\Oficina\\Sistema-Oficina\\src\\main\\java\\view\\icons\\shoppaymentorderbuy-04_icon-icons.com_73886.png")); // NOI18N
        jLabel10.setText("Ordem de Serviço");
        jLabel10.setMaximumSize(new java.awt.Dimension(32, 32));
        jLabel10.setMinimumSize(new java.awt.Dimension(32, 32));
        jLabel10.setPreferredSize(new java.awt.Dimension(32, 32));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("VOLTAR");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("Finalizar");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel16.setText("ATENDENTE :");

        CampoAtendente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        CampoAtendente.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12), new java.awt.Color(0, 153, 153))); // NOI18N
        CampoAtendente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoAtendenteActionPerformed(evt);
            }
        });

        CampoProprietario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        CampoProprietario.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12), new java.awt.Color(0, 153, 153))); // NOI18N
        CampoProprietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoProprietarioActionPerformed(evt);
            }
        });

        CampoServico.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        CampoServico.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12), new java.awt.Color(0, 153, 153))); // NOI18N
        CampoServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoServicoActionPerformed(evt);
            }
        });

        jLabel2.setText("TEMPO/H :");

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Allan\\OneDrive\\Documentos\\NetBeansProjects\\Oficina\\Sistema-Oficina\\src\\main\\java\\view\\icons\\1486485557-add-create-new-more-plus_81188.png")); // NOI18N
        jButton4.setText("ADICIONAR");
        jButton4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        ButtonZerar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ButtonZerar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Allan\\OneDrive\\Documentos\\NetBeansProjects\\Oficina\\Sistema-Oficina\\src\\main\\java\\view\\icons\\icontexto-webdev-cancel-032x032.png")); // NOI18N
        ButtonZerar.setText("ZERAR");
        ButtonZerar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ButtonZerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonZerarActionPerformed(evt);
            }
        });

        jLabel5.setText("PLACA :");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("TOTAL R$");

        CampoTempo.setForeground(new java.awt.Color(0, 153, 204));

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Allan\\OneDrive\\Documentos\\NetBeansProjects\\Oficina\\Sistema-Oficina\\src\\main\\java\\view\\icons\\1486485557-add-create-new-more-plus_81188.png")); // NOI18N
        jButton5.setText("ADICIONAR");
        jButton5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jSeparator2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel6.setText("NOME :");

        jLabel7.setText("QUANTIDADE :");

        CampoQuantidadeInsumo.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setText("Insumos");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setText("R$");

        CampoResultadoMO.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        CampoResultadoMO.setForeground(new java.awt.Color(0, 204, 0));
        CampoResultadoMO.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel14.setText("R$");

        CampoResultadoPR.setForeground(new java.awt.Color(0, 204, 0));

        ButtonZerar1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ButtonZerar1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Allan\\OneDrive\\Documentos\\NetBeansProjects\\Oficina\\Sistema-Oficina\\src\\main\\java\\view\\icons\\icontexto-webdev-cancel-032x032.png")); // NOI18N
        ButtonZerar1.setText("ZERAR");
        ButtonZerar1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ButtonZerar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonZerar1ActionPerformed(evt);
            }
        });

        CampoResultado.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        CampoResultado.setForeground(new java.awt.Color(0, 204, 0));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel15.setText("MÃO DE OBRA");

        TabelaInsumo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "NOME", "DESCRIÇÃO", "PREÇO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(TabelaInsumo);

        CampoInsumo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        CampoInsumo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12), new java.awt.Color(0, 153, 153))); // NOI18N
        CampoInsumo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoInsumoActionPerformed(evt);
            }
        });

        TabelaServico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "NOME", "DESCRIÇÃO", "PREÇO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(TabelaServico);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2)
            .addGroup(layout.createSequentialGroup()
                .addGap(195, 195, 195)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(225, 225, 225))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(4, 4, 4)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jButton4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(ButtonZerar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(CampoServico, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(92, 92, 92)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CampoTempo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(ButtonZerar1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(CampoInsumo, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(88, 88, 88)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CampoQuantidadeInsumo, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(109, 109, 109))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CampoResultadoMO, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CampoResultadoPR, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(202, 202, 202)))
                .addGap(23, 23, 23))
            .addGroup(layout.createSequentialGroup()
                .addGap(424, 424, 424)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CampoResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CampoProprietario, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CampoAtendente, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CampoPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(157, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(578, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CampoProprietario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel16)
                    .addComponent(CampoAtendente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(CampoPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(jLabel11))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(CampoTempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(CampoServico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton4)
                            .addComponent(ButtonZerar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(CampoQuantidadeInsumo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CampoInsumo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ButtonZerar1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5))))
                .addGap(39, 39, 39)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(CampoResultadoPR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(CampoResultadoMO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(CampoResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(354, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(197, 197, 197)))
        );

        setBounds(0, 0, 1098, 679);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        this.dispose();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        CaixaController caixaController = new CaixaController();
        caixaController.atualizaCaixaPositivo(Float.parseFloat(CampoResultado.getText().toString()));
        JOptionPane.showMessageDialog(null, "Ordem de serviço cadastrada com sucesso.");

    }//GEN-LAST:event_jButton2ActionPerformed

    private void CampoAtendenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoAtendenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoAtendenteActionPerformed

    private void CampoProprietarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoProprietarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoProprietarioActionPerformed

    private void CampoServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoServicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoServicoActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
        ServicoController servicoController = new ServicoController();
        float precoServico = 0;
        String descricao = "";
        
        for(int i = 0; i< servicoController.mostrarTodos().size(); i++){
            if(servicoController.mostrarTodos().get(i).getNome().equals(CampoServico.getSelectedItem())){
                precoServico = servicoController.mostrarTodos().get(i).getPreco();
                descricao = servicoController.mostrarTodos().get(i).getDescricao();
                
            }
        }
        
        Servico servico = new Servico();
        servico.setNome((String) CampoServico.getSelectedItem());
        servico.setDescricao(descricao);
        servico.setPreco(Float.parseFloat(CampoTempo.getText()) * precoServico);
        servicos.add(servico);
        
         DefaultTableModel modelo = (DefaultTableModel)TabelaServico.getModel();
            modelo.setNumRows(0);
            
                for(int i = 0; i< servicos.size(); i++){
                    modelo.addRow(new Object[]{
                    
                       servicos.get(i).getNome(),
                       servicos.get(i).getDescricao(),
                       "R$"+servicos.get(i).getPreco(),
                        
                    });
                }
        
            CampoResultadoMO.setText(String.valueOf(Float.parseFloat(CampoResultadoMO.getText()) + servico.getPreco()));
            CampoResultado.setText(String.valueOf(Float.parseFloat(CampoResultadoMO.getText()) + Float.parseFloat(CampoResultadoPR.getText())));

    }//GEN-LAST:event_jButton4ActionPerformed

    private void ButtonZerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonZerarActionPerformed
       

    }//GEN-LAST:event_ButtonZerarActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        
        InsumoController insumoController = new InsumoController();
        float precoInsumo = 0;
        String descricao = "";
        
        for(int i = 0; i< insumoController.mostrarTodos().size(); i++){
            if(insumoController.mostrarTodos().get(i).getNome().equals(CampoInsumo.getSelectedItem())){
                precoInsumo = (float) insumoController.mostrarTodos().get(i).getPreco();
                descricao = insumoController.mostrarTodos().get(i).getDescricao();
            }
        }
        
        Insumo insumo = new Insumo();
        insumo.setNome((String) CampoInsumo.getSelectedItem());
        insumo.setDescricao(descricao);
        insumo.setPreco(precoInsumo * Float.parseFloat(CampoQuantidadeInsumo.getValue().toString()));
        insumos.add(insumo);
        
         DefaultTableModel modelo = (DefaultTableModel)TabelaInsumo.getModel();
            modelo.setNumRows(0);
            
                for(int i = 0; i< insumos.size(); i++){
                    modelo.addRow(new Object[]{
                    
                       insumos.get(i).getNome(),
                       insumos.get(i).getDescricao(),
                       "R$"+insumos.get(i).getPreco(),
                        
                    });
                }
        
            CampoResultadoPR.setText(String.valueOf(Float.parseFloat(CampoResultadoPR.getText()) + insumo.getPreco()));
            CampoResultado.setText(String.valueOf(Float.parseFloat(CampoResultadoPR.getText()) + Float.parseFloat(CampoResultadoMO.getText())));

    }//GEN-LAST:event_jButton5ActionPerformed

    private void ButtonZerar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonZerar1ActionPerformed

    }//GEN-LAST:event_ButtonZerar1ActionPerformed

    private void CampoInsumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoInsumoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoInsumoActionPerformed

    public static void main(String args[]) {
  
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroOrcamento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonZerar;
    private javax.swing.JButton ButtonZerar1;
    private javax.swing.JComboBox<String> CampoAtendente;
    private javax.swing.JComboBox<String> CampoInsumo;
    private javax.swing.JTextField CampoPlaca;
    private javax.swing.JComboBox<String> CampoProprietario;
    private javax.swing.JSpinner CampoQuantidadeInsumo;
    private javax.swing.JTextField CampoResultado;
    private javax.swing.JTextField CampoResultadoMO;
    private javax.swing.JTextField CampoResultadoPR;
    private javax.swing.JComboBox<String> CampoServico;
    private javax.swing.JTextField CampoTempo;
    private javax.swing.JTable TabelaInsumo;
    private javax.swing.JTable TabelaServico;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}

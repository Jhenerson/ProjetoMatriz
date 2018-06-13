
package tela;

import classe.Matrizes;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jhenenerson
 */

public class TelaMatriz extends javax.swing.JFrame {
    
    

    public TelaMatriz() {
        initComponents();
        txtMatA.setEditable(false);
        txtMatB.setEditable(false);
        txtResultado.setEditable(false);
    }
    Matrizes matrizA = null;
    Matrizes matrizB = null;
    
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtLinhaA = new javax.swing.JTextField();
        txtColunaA = new javax.swing.JTextField();
        btnCriarMatA = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtMatA = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btnCriarMatB = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtLinhaB = new javax.swing.JTextField();
        txtColunaB = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtMatB = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableResultados = new javax.swing.JTable();
        btnPotenciaA = new javax.swing.JButton();
        btnPotenciaB = new javax.swing.JButton();
        btnMultKA = new javax.swing.JButton();
        btnMultKB = new javax.swing.JButton();
        txtPotencia = new javax.swing.JTextField();
        txtConstK = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnTransporB = new javax.swing.JButton();
        btnAdicionar = new javax.swing.JButton();
        btnTransporA = new javax.swing.JButton();
        btnMultiplicar = new javax.swing.JButton();
        btnSubtrair = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtResultado = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        btnLimpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CALCULADORA DE MATRIZ");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Matriz A");

        jLabel5.setText("Linha");

        jLabel6.setText("Coluna");

        txtLinhaA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLinhaAActionPerformed(evt);
            }
        });
        txtLinhaA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtLinhaAKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtLinhaAKeyTyped(evt);
            }
        });

        txtColunaA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtColunaAKeyTyped(evt);
            }
        });

        btnCriarMatA.setText("Criar");
        btnCriarMatA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCriarMatAActionPerformed(evt);
            }
        });

        txtMatA.setColumns(20);
        txtMatA.setRows(5);
        jScrollPane3.setViewportView(txtMatA);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(btnCriarMatA)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addGap(49, 49, 49)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtLinhaA)
                            .addComponent(txtColunaA, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(21, 21, 21))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtLinhaA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtColunaA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCriarMatA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setPreferredSize(new java.awt.Dimension(192, 208));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Matriz B");

        btnCriarMatB.setText("Criar");
        btnCriarMatB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCriarMatBActionPerformed(evt);
            }
        });

        jLabel7.setText("Coluna");

        jLabel8.setText("Linha");

        txtLinhaB.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtLinhaBKeyTyped(evt);
            }
        });

        txtColunaB.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtColunaBKeyTyped(evt);
            }
        });

        txtMatB.setColumns(20);
        txtMatB.setRows(5);
        jScrollPane4.setViewportView(txtMatB);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(btnCriarMatB)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))
                                .addGap(49, 49, 49)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtLinhaB)
                                    .addComponent(txtColunaB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtLinhaB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtColunaB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCriarMatB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tableResultados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item", "Matriz A", "Matriz B"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableResultados);
        if (tableResultados.getColumnModel().getColumnCount() > 0) {
            tableResultados.getColumnModel().getColumn(0).setResizable(false);
            tableResultados.getColumnModel().getColumn(1).setResizable(false);
            tableResultados.getColumnModel().getColumn(2).setResizable(false);
        }

        btnPotenciaA.setText("Potenciar A");
        btnPotenciaA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPotenciaAActionPerformed(evt);
            }
        });

        btnPotenciaB.setText("Potenciar B");
        btnPotenciaB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPotenciaBActionPerformed(evt);
            }
        });

        btnMultKA.setText("Multiplicar A");
        btnMultKA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultKAActionPerformed(evt);
            }
        });

        btnMultKB.setText("Multiplicar B");
        btnMultKB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultKBActionPerformed(evt);
            }
        });

        txtPotencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPotenciaActionPerformed(evt);
            }
        });
        txtPotencia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPotenciaKeyTyped(evt);
            }
        });

        txtConstK.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtConstKKeyTyped(evt);
            }
        });

        jLabel1.setText("Exopente");

        jLabel2.setText("Constante K");

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setPreferredSize(new java.awt.Dimension(400, 122));

        btnTransporB.setText("Transpor B");
        btnTransporB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransporBActionPerformed(evt);
            }
        });

        btnAdicionar.setText("Adicionar");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        btnTransporA.setText("Transpor A");
        btnTransporA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransporAActionPerformed(evt);
            }
        });

        btnMultiplicar.setText("Multiplicar");
        btnMultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplicarActionPerformed(evt);
            }
        });

        btnSubtrair.setText("Subtrair");
        btnSubtrair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubtrairActionPerformed(evt);
            }
        });

        txtResultado.setColumns(20);
        txtResultado.setRows(5);
        jScrollPane2.setViewportView(txtResultado);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAdicionar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnTransporA))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnMultiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSubtrair, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnTransporB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAdicionar)
                            .addComponent(btnSubtrair))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnMultiplicar)
                            .addComponent(btnTransporA))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTransporB)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("CALCULADORA DE MATRIZ");

        btnLimpar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(288, 288, 288))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                                .addComponent(txtConstK, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtPotencia, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnMultKA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnPotenciaA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnMultKB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnPotenciaB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(btnLimpar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(29, 29, 29))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnPotenciaA)
                                .addComponent(txtPotencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnPotenciaB))
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnMultKA)
                            .addComponent(btnMultKB)
                            .addComponent(txtConstK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLimpar))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCriarMatAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCriarMatAActionPerformed
        // TODO add your handling code here:
        try {
            DefaultTableModel resultTable = (DefaultTableModel)tableResultados.getModel();
            resultTable.setNumRows(0);
            txtMatA.setText("");
            if(txtLinhaA.getText().isEmpty() || txtColunaA.getText().isEmpty()){throw new Exception("Favor preencher campos em branco");}
            int linhas = Integer.parseInt(txtLinhaA.getText());
            int colunas = Integer.parseInt(txtColunaA.getText());
            matrizA = new Matrizes(linhas,colunas);
            
            for (int i = 0; i < linhas; i++) {
                for (int j = 0; j < colunas; j++) {
                    int elemento = Integer.parseInt(JOptionPane.showInputDialog("["+(i+1)+"]" + "["+(j+1)+"]"));
                    matrizA.setElemento(i, j, elemento);
                }
                
            }
            resultTable = (DefaultTableModel)tableResultados.getModel();
            String[] linha = new String[]{"Triangular Superior",(matrizA.eTriSup())?"sim":"não","-"};
        resultTable.addRow(linha);
        linha = new String[]{"Triangular Inferior",(matrizA.eTriInf())?"sim":"não","-"};
        resultTable.addRow(linha);
        linha = new String[]{"Simetria",(matrizA.eSimetrica())?"sim":"não","-"};
        resultTable.addRow(linha);
        linha = new String[]{"Identidade",(matrizA.eIdentidade())?"sim":"não","-"};
        resultTable.addRow(linha);
        linha = new String[]{"Igual","-","-"};
        resultTable.addRow(linha);
        linha = new String[]{"Diferente","-","-"};
        resultTable.addRow(linha);
        linha = new String[]{"Ortogonal",(matrizA.eOrtogonal())?"sim":"não","-"};
        resultTable.addRow(linha);
        linha = new String[]{"Permutação",(matrizA.ePermutacao())?"sim":"não","-"};
        resultTable.addRow(linha);
        
            
            txtMatA.setText(matrizA.getMatriz());            
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(rootPane, erro.getMessage());
        }
    }//GEN-LAST:event_btnCriarMatAActionPerformed

    private void btnCriarMatBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCriarMatBActionPerformed
        // TODO add your handling code here:
        try {
            DefaultTableModel resultTable = (DefaultTableModel)tableResultados.getModel();
            resultTable.setNumRows(0);
            txtMatB.setText("");
            if(txtLinhaB.getText().isEmpty() || txtColunaB.getText().isEmpty()){throw new Exception("Favor preencher campos em branco");}
            int linhas = Integer.parseInt(txtLinhaB.getText());
            int colunas = Integer.parseInt(txtColunaB.getText());
            matrizB = new Matrizes(linhas,colunas);
            
            
            for (int i = 0; i < linhas; i++) {
                for (int j = 0; j < colunas; j++) {
                    int elemento = Integer.parseInt(JOptionPane.showInputDialog("["+(i+1)+"]" + "["+(j+1)+"]"));
                    matrizB.setElemento(i, j, elemento);
                }
                
            }
            resultTable = (DefaultTableModel)tableResultados.getModel();
            String[] linha = new String[]{"Triangular Superior",(matrizA.eTriSup())?"sim":"não",(matrizB.eTriSup())?"sim":"não"};
        resultTable.addRow(linha);
        linha = new String[]{"Triangular Inferior",(matrizA.eTriInf())?"sim":"não",(matrizB.eTriInf())?"sim":"não"};
        resultTable.addRow(linha);
        linha = new String[]{"Simetria",(matrizA.eSimetrica())?"sim":"não",(matrizB.eSimetrica())?"sim":"não"};
        resultTable.addRow(linha);
        linha = new String[]{"Identidade",(matrizA.eIdentidade())?"sim":"não",(matrizB.eIdentidade())?"sim":"não"};
        resultTable.addRow(linha);
        linha = new String[]{"Igual",(matrizA.eIgual(matrizB))?"sim":"não",(matrizB.eIgual(matrizA))?"sim":"não"};
        resultTable.addRow(linha);
        linha = new String[]{"Diferente",(matrizA.eDiferente(matrizB))?"sim":"não",(matrizB.eDiferente(matrizA))?"sim":"não"};
        resultTable.addRow(linha);
        linha = new String[]{"Ortogonal",(matrizA.eOrtogonal())?"sim":"não",(matrizB.eOrtogonal())?"sim":"não"};
        resultTable.addRow(linha);
        linha = new String[]{"Permutação",(matrizA.ePermutacao())?"sim":"não",(matrizB.ePermutacao())?"sim":"não"};
        resultTable.addRow(linha);
            txtMatB.setText(matrizB.getMatriz());            
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(rootPane, erro.getMessage());
        }
    }//GEN-LAST:event_btnCriarMatBActionPerformed

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        // TODO add your handling code here:
        try {
            if(txtMatA.getText().isEmpty() || txtMatB.getText().isEmpty()){throw new Exception("Favor criar as duas matrizes.");}
            Matrizes resultado = matrizA.adicionar(matrizB);
            txtResultado.setText(resultado.getMatriz());
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(rootPane, erro.getMessage());
        }
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void btnSubtrairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubtrairActionPerformed
        // TODO add your handling code here:
        try {
            if(txtMatA.getText().isEmpty() || txtMatB.getText().isEmpty()){throw new Exception("Favor criar as duas matrizes.");}
            Matrizes resultado = matrizA.subtrair(matrizB);
            txtResultado.setText(resultado.getMatriz());
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(rootPane, erro.getMessage());
        }
    }//GEN-LAST:event_btnSubtrairActionPerformed

    private void btnTransporAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransporAActionPerformed
        // TODO add your handling code here:
        try {
            if(txtMatA.getText().isEmpty()){throw new Exception("Favor criar a matriz A.");}
            Matrizes resultado = matrizA.transpor();
            txtResultado.setText(resultado.getMatriz());
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(rootPane, erro.getMessage());
        }
    }//GEN-LAST:event_btnTransporAActionPerformed

    private void btnTransporBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransporBActionPerformed
        // TODO add your handling code here:
        try {
            if(txtMatB.getText().isEmpty()){throw new Exception("Favor criar a matriz B.");}
            Matrizes resultado = matrizB.transpor();
            txtResultado.setText(resultado.getMatriz());
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(rootPane, erro.getMessage());
        }
    }//GEN-LAST:event_btnTransporBActionPerformed

    private void btnMultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplicarActionPerformed
        // TODO add your handling code here:
        try {
            if(txtMatA.getText().isEmpty() || txtMatB.getText().isEmpty()){throw new Exception("Favor criar as duas matrizes.");}
            Matrizes resultado = matrizA.multiplicar(matrizB);
            txtResultado.setText(resultado.getMatriz());
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(rootPane, erro.getMessage());
        }
    }//GEN-LAST:event_btnMultiplicarActionPerformed

    private void btnPotenciaAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPotenciaAActionPerformed
        // TODO add your handling code here:
        try {
            if(txtPotencia.getText().isEmpty()){throw new Exception("Informar expoente");}
            if(txtMatA.getText().isEmpty()){throw new Exception("Favor criar a matriz A.");}
            Matrizes resultado = matrizA.calcularPotencia(Integer.parseInt(txtPotencia.getText()));
            txtResultado.setText(resultado.getMatriz());
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(rootPane, erro.getMessage());
        }
    }//GEN-LAST:event_btnPotenciaAActionPerformed

    private void btnPotenciaBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPotenciaBActionPerformed
        // TODO add your handling code here
        try {
            if(txtPotencia.getText().isEmpty()){throw new Exception("Informar expoente");}
            if(txtMatB.getText().isEmpty()){throw new Exception("Favor criar a matriz B.");}
            Matrizes resultado = matrizB.calcularPotencia(Integer.parseInt(txtPotencia.getText()));
            txtResultado.setText(resultado.getMatriz());
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(rootPane, erro.getMessage());
        }
    }//GEN-LAST:event_btnPotenciaBActionPerformed

    private void btnMultKAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultKAActionPerformed
        // TODO add your handling code here:
        try {
            if(txtConstK.getText().isEmpty()){throw new Exception("Informar valor de K");}
            if(txtMatA.getText().isEmpty()){throw new Exception("Favor criar a matriz A.");}
            Matrizes resultado = matrizA.multiplicarK(Integer.parseInt(txtConstK.getText()));
            txtResultado.setText(resultado.getMatriz());
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(rootPane, erro.getMessage());
        }
    }//GEN-LAST:event_btnMultKAActionPerformed

    private void btnMultKBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultKBActionPerformed
        // TODO add your handling code here:
        try {
            if(txtConstK.getText().isEmpty()){throw new Exception("Informar valor de K");}
            if(txtMatB.getText().isEmpty()){throw new Exception("Favor criar a matriz B.");}
            Matrizes resultado = matrizB.multiplicarK(Integer.parseInt(txtConstK.getText()));
            txtResultado.setText(resultado.getMatriz());
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(rootPane, erro.getMessage());
        }
    }//GEN-LAST:event_btnMultKBActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        // TODO add your handling code here:
        DefaultTableModel resultTable = (DefaultTableModel)tableResultados.getModel();
        resultTable.setNumRows(0);
        txtColunaA.setText("");
        txtColunaB.setText("");
        txtLinhaA.setText("");
        txtLinhaB.setText("");
        txtConstK.setText("");
        txtMatA.setText("");
        txtMatB.setText("");
        txtPotencia.setText("");
        txtResultado.setText("");
    }//GEN-LAST:event_btnLimparActionPerformed

    private void txtLinhaAKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLinhaAKeyPressed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_txtLinhaAKeyPressed

    private void txtLinhaAKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLinhaAKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(Character.isLetter(c) && !evt.isAltDown()){
            evt.consume();            
        }
    }//GEN-LAST:event_txtLinhaAKeyTyped

    private void txtPotenciaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPotenciaKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(Character.isLetter(c) && !evt.isAltDown()){
            evt.consume();
        }
    }//GEN-LAST:event_txtPotenciaKeyTyped

    private void txtColunaAKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtColunaAKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(Character.isLetter(c) && !evt.isAltDown()){
            evt.consume();
        }
    }//GEN-LAST:event_txtColunaAKeyTyped

    private void txtLinhaBKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLinhaBKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(Character.isLetter(c) && !evt.isAltDown()){
            evt.consume();
        }
    }//GEN-LAST:event_txtLinhaBKeyTyped

    private void txtColunaBKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtColunaBKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(Character.isLetter(c) && !evt.isAltDown()){
            evt.consume();
        }
    }//GEN-LAST:event_txtColunaBKeyTyped

    private void txtConstKKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConstKKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(Character.isLetter(c) && !evt.isAltDown()){
            evt.consume();
        }
    }//GEN-LAST:event_txtConstKKeyTyped

    private void txtLinhaAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLinhaAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLinhaAActionPerformed

    private void txtPotenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPotenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPotenciaActionPerformed

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
            java.util.logging.Logger.getLogger(TelaMatriz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaMatriz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaMatriz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaMatriz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaMatriz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnCriarMatA;
    private javax.swing.JButton btnCriarMatB;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnMultKA;
    private javax.swing.JButton btnMultKB;
    private javax.swing.JButton btnMultiplicar;
    private javax.swing.JButton btnPotenciaA;
    private javax.swing.JButton btnPotenciaB;
    private javax.swing.JButton btnSubtrair;
    private javax.swing.JButton btnTransporA;
    private javax.swing.JButton btnTransporB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable tableResultados;
    private javax.swing.JTextField txtColunaA;
    private javax.swing.JTextField txtColunaB;
    private javax.swing.JTextField txtConstK;
    private javax.swing.JTextField txtLinhaA;
    private javax.swing.JTextField txtLinhaB;
    private javax.swing.JTextArea txtMatA;
    private javax.swing.JTextArea txtMatB;
    private javax.swing.JTextField txtPotencia;
    private javax.swing.JTextArea txtResultado;
    // End of variables declaration//GEN-END:variables
}

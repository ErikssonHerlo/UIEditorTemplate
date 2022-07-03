package com.mycompany.helloworld.GUI;


import java.io.File;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JList;
import javax.swing.JOptionPane;

/**
 *
 * @author erikssonherlo
 */
public class MainViewV2 extends javax.swing.JFrame {

   // private MainControl control;
    //private FileControl file;
    private LineNumber line;
    private String path;

    public MainViewV2() {
        //this.control = control;
        initComponents();

        line = new LineNumber(editorInput);
        scroll.setRowHeaderView(line);
        //file = control.getFile();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tabbed = new javax.swing.JTabbedPane();
        editorPanel = new javax.swing.JPanel();
        scroll = new javax.swing.JScrollPane();
        editorInput = new javax.swing.JTextArea();
        label_caret = new javax.swing.JLabel();
        compileButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        consoleOutput = new javax.swing.JTextArea();
        traductorButton = new javax.swing.JButton();
        scroll1 = new javax.swing.JScrollPane();
        output3D = new javax.swing.JTextArea();
        logPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        erroresButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        symbolTableButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        ASTButton = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        CSTButton = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        new_Item = new javax.swing.JMenuItem();
        open_item = new javax.swing.JMenuItem();
        save_Item = new javax.swing.JMenuItem();
        saveAs_Item = new javax.swing.JMenuItem();
        exit_Item = new javax.swing.JMenuItem();
        ip_item = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(150, 850));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(24, 26, 31));
        jPanel1.setPreferredSize(new java.awt.Dimension(1200, 850));

        tabbed.setBackground(new java.awt.Color(24, 26, 31));
        tabbed.setForeground(new java.awt.Color(255, 255, 255));
        tabbed.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        tabbed.setPreferredSize(new java.awt.Dimension(1500, 850));
        tabbed.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                tabbedStateChanged(evt);
            }
        });

        editorPanel.setBackground(new java.awt.Color(24, 26, 31));
        editorPanel.setPreferredSize(new java.awt.Dimension(1500, 850));

        editorInput.setBackground(new java.awt.Color(40, 44, 53));
        editorInput.setColumns(20);
        editorInput.setFont(new java.awt.Font("FuraCode Nerd Font", 0, 20)); // NOI18N
        editorInput.setForeground(new java.awt.Color(255, 255, 255));
        editorInput.setRows(5);
        editorInput.setTabSize(4);
        editorInput.setCaretColor(new java.awt.Color(9, 177, 80));
        editorInput.setMargin(new java.awt.Insets(10, 10, 10, 10));
        editorInput.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                editorInputCaretUpdate(evt);
            }
        });
        scroll.setViewportView(editorInput);

        label_caret.setBackground(new java.awt.Color(24, 26, 31));
        label_caret.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        label_caret.setForeground(new java.awt.Color(255, 255, 255));
        label_caret.setText("Linea: 1 Columna: 0");

        compileButton.setBackground(new java.awt.Color(40, 180, 99));
        compileButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        compileButton.setForeground(new java.awt.Color(24, 26, 31));
        compileButton.setText("Compilar");
        compileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compileButtonActionPerformed(evt);
            }
        });

        consoleOutput.setEditable(false);
        consoleOutput.setBackground(new java.awt.Color(40, 44, 53));
        consoleOutput.setColumns(20);
        consoleOutput.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        consoleOutput.setForeground(new java.awt.Color(40, 180, 99));
        consoleOutput.setRows(5);
        consoleOutput.setTabSize(4);
        consoleOutput.setMargin(new java.awt.Insets(10, 10, 10, 10));
        jScrollPane1.setViewportView(consoleOutput);

        traductorButton.setBackground(new java.awt.Color(40, 180, 99));
        traductorButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        traductorButton.setForeground(new java.awt.Color(24, 26, 31));
        traductorButton.setText("Traducir 3D");
        traductorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                traductorButtonActionPerformed(evt);
            }
        });

        output3D.setBackground(new java.awt.Color(40, 44, 53));
        output3D.setColumns(20);
        output3D.setFont(new java.awt.Font("FuraCode Nerd Font", 0, 20)); // NOI18N
        output3D.setForeground(new java.awt.Color(255, 255, 255));
        output3D.setRows(5);
        output3D.setTabSize(4);
        output3D.setCaretColor(new java.awt.Color(9, 177, 80));
        output3D.setMargin(new java.awt.Insets(10, 10, 10, 10));
        output3D.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                output3DCaretUpdate(evt);
            }
        });
        scroll1.setViewportView(output3D);

        javax.swing.GroupLayout editorPanelLayout = new javax.swing.GroupLayout(editorPanel);
        editorPanel.setLayout(editorPanelLayout);
        editorPanelLayout.setHorizontalGroup(
            editorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editorPanelLayout.createSequentialGroup()
                .addGap(0, 47, Short.MAX_VALUE)
                .addGroup(editorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(editorPanelLayout.createSequentialGroup()
                        .addComponent(label_caret, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(compileButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(traductorButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(editorPanelLayout.createSequentialGroup()
                        .addComponent(scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 723, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(scroll1, javax.swing.GroupLayout.PREFERRED_SIZE, 739, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addGap(17, 17, 17))
        );
        editorPanelLayout.setVerticalGroup(
            editorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editorPanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(editorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(scroll, javax.swing.GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE)
                    .addComponent(scroll1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(editorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_caret, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(compileButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(traductorButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        tabbed.addTab("Editor", editorPanel);

        logPanel.setBackground(new java.awt.Color(24, 26, 31));

        jLabel1.setBackground(new java.awt.Color(24, 26, 31));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Reportes");

        jLabel5.setBackground(new java.awt.Color(24, 26, 31));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Errores");
        jLabel5.setToolTipText("");

        erroresButton.setBackground(new java.awt.Color(40, 180, 99));
        erroresButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        erroresButton.setForeground(new java.awt.Color(24, 26, 31));
        erroresButton.setText("Visualizar");
        erroresButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                erroresButtonActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(24, 26, 31));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Tabla de Simbolos");
        jLabel6.setToolTipText("");

        symbolTableButton.setBackground(new java.awt.Color(40, 180, 99));
        symbolTableButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        symbolTableButton.setForeground(new java.awt.Color(24, 26, 31));
        symbolTableButton.setText("Visualizar");
        symbolTableButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                symbolTableButtonActionPerformed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(24, 26, 31));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("AST (Abstract Syntax Tree)");
        jLabel7.setToolTipText("");

        ASTButton.setBackground(new java.awt.Color(40, 180, 99));
        ASTButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ASTButton.setForeground(new java.awt.Color(24, 26, 31));
        ASTButton.setText("Visualizar");
        ASTButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ASTButtonActionPerformed(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(24, 26, 31));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("CST (Concret Syntax Tree)");
        jLabel8.setToolTipText("");

        CSTButton.setBackground(new java.awt.Color(40, 180, 99));
        CSTButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        CSTButton.setForeground(new java.awt.Color(24, 26, 31));
        CSTButton.setText("Visualizar");
        CSTButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CSTButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout logPanelLayout = new javax.swing.GroupLayout(logPanel);
        logPanel.setLayout(logPanelLayout);
        logPanelLayout.setHorizontalGroup(
            logPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logPanelLayout.createSequentialGroup()
                .addGap(685, 685, 685)
                .addComponent(jLabel1)
                .addContainerGap(729, Short.MAX_VALUE))
            .addGroup(logPanelLayout.createSequentialGroup()
                .addGap(175, 175, 175)
                .addGroup(logPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(logPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CSTButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ASTButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(erroresButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(symbolTableButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(264, 264, 264))
        );
        logPanelLayout.setVerticalGroup(
            logPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logPanelLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel1)
                .addGap(120, 120, 120)
                .addGroup(logPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                    .addComponent(erroresButton, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(logPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(symbolTableButton, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(logPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ASTButton, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(logPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CSTButton, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(194, 194, 194))
        );

        tabbed.addTab("Reportes", logPanel);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabbed, javax.swing.GroupLayout.DEFAULT_SIZE, 1576, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(tabbed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jMenuBar1.setBackground(new java.awt.Color(24, 26, 31));
        jMenuBar1.setForeground(new java.awt.Color(0, 0, 255));
        jMenuBar1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jMenu1.setBackground(new java.awt.Color(24, 26, 31));
        jMenu1.setForeground(new java.awt.Color(255, 255, 255));
        jMenu1.setText("File");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        new_Item.setBackground(new java.awt.Color(24, 26, 31));
        new_Item.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        new_Item.setForeground(new java.awt.Color(255, 255, 255));
        new_Item.setText("Nuevo...");
        new_Item.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                new_ItemActionPerformed(evt);
            }
        });
        jMenu1.add(new_Item);

        open_item.setBackground(new java.awt.Color(24, 26, 31));
        open_item.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        open_item.setForeground(new java.awt.Color(255, 255, 255));
        open_item.setText("Open...");
        open_item.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                open_itemActionPerformed(evt);
            }
        });
        jMenu1.add(open_item);

        save_Item.setBackground(new java.awt.Color(24, 26, 31));
        save_Item.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        save_Item.setForeground(new java.awt.Color(255, 255, 255));
        save_Item.setText("Guardar...");
        save_Item.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_ItemActionPerformed(evt);
            }
        });
        jMenu1.add(save_Item);

        saveAs_Item.setBackground(new java.awt.Color(24, 26, 31));
        saveAs_Item.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        saveAs_Item.setForeground(new java.awt.Color(255, 255, 255));
        saveAs_Item.setText("Guardar como...");
        saveAs_Item.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveAs_ItemActionPerformed(evt);
            }
        });
        jMenu1.add(saveAs_Item);

        exit_Item.setBackground(new java.awt.Color(24, 26, 31));
        exit_Item.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        exit_Item.setForeground(new java.awt.Color(255, 255, 255));
        exit_Item.setText("Salir");
        exit_Item.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit_ItemActionPerformed(evt);
            }
        });
        jMenu1.add(exit_Item);

        ip_item.setBackground(new java.awt.Color(24, 26, 31));
        ip_item.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ip_item.setForeground(new java.awt.Color(255, 255, 255));
        ip_item.setText("IP Cliente");
        ip_item.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ip_itemActionPerformed(evt);
            }
        });
        jMenu1.add(ip_item);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1588, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void setTableErrors(List<String> errors) {
       
    }

    private void setSizeTable() {
        
    }

    // Para actualizar listas de reproduccion    
    private void ip_itemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ip_itemActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_ip_itemActionPerformed

    private void exit_ItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit_ItemActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_exit_ItemActionPerformed

    private void saveAs_ItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveAs_ItemActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_saveAs_ItemActionPerformed

    private void save_ItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_ItemActionPerformed

    }//GEN-LAST:event_save_ItemActionPerformed

    private void open_itemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_open_itemActionPerformed

    }//GEN-LAST:event_open_itemActionPerformed

    private void new_ItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_new_ItemActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_new_ItemActionPerformed

    private void tabbedStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_tabbedStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_tabbedStateChanged

    private void CSTButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CSTButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CSTButtonActionPerformed

    private void ASTButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ASTButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ASTButtonActionPerformed

    private void symbolTableButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_symbolTableButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_symbolTableButtonActionPerformed

    private void erroresButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_erroresButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_erroresButtonActionPerformed

    private void traductorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_traductorButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_traductorButtonActionPerformed

    private void compileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compileButtonActionPerformed
        // TODO add your handling code here:
        String text = editorInput.getText();
        consoleOutput.setText(text);
        
    }//GEN-LAST:event_compileButtonActionPerformed

    private void editorInputCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_editorInputCaretUpdate
        // TODO add your handling code here:
    }//GEN-LAST:event_editorInputCaretUpdate

    private void output3DCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_output3DCaretUpdate
        // TODO add your handling code here:
    }//GEN-LAST:event_output3DCaretUpdate

    /**
     * Guardar como
     */
    private void saveFile() {
/**
 *         JFileChooser fileChooser = new JFileChooser();
        int selection = fileChooser.showSaveDialog(this);

        if (selection == JFileChooser.APPROVE_OPTION) {
            File archivo = fileChooser.getSelectedFile();

            this.path = archivo.getAbsolutePath();
            String txt = editor.getText();

            this.file.writeFile(archivo, txt);
        }

 */
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ASTButton;
    private javax.swing.JButton CSTButton;
    private javax.swing.JButton compileButton;
    public javax.swing.JTextArea consoleOutput;
    private javax.swing.JTextArea editorInput;
    private javax.swing.JPanel editorPanel;
    private javax.swing.JButton erroresButton;
    private javax.swing.JMenuItem exit_Item;
    private javax.swing.JMenuItem ip_item;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label_caret;
    private javax.swing.JPanel logPanel;
    private javax.swing.JMenuItem new_Item;
    private javax.swing.JMenuItem open_item;
    private javax.swing.JTextArea output3D;
    private javax.swing.JMenuItem saveAs_Item;
    private javax.swing.JMenuItem save_Item;
    private javax.swing.JScrollPane scroll;
    private javax.swing.JScrollPane scroll1;
    private javax.swing.JButton symbolTableButton;
    public javax.swing.JTabbedPane tabbed;
    private javax.swing.JButton traductorButton;
    // End of variables declaration//GEN-END:variables
}

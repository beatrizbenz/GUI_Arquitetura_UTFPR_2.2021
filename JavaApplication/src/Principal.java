/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Beatriz
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        t_potassio = new javax.swing.JLabel();
        c_qtdPotassio = new javax.swing.JTextField();
        op_sistemadecultivo_plantiodireto = new javax.swing.JRadioButton();
        t_calcio = new javax.swing.JLabel();
        t_sistema_cultivo = new javax.swing.JLabel();
        c_qtdCalcio = new javax.swing.JTextField();
        op_sistemadecultivo_plantioconvencional = new javax.swing.JRadioButton();
        t_magnesio = new javax.swing.JLabel();
        c_qtdmagnesio = new javax.swing.JTextField();
        op_texturadosolo_argiloso = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        c_qtdFosforo = new javax.swing.JTextField();
        t_fosforo = new javax.swing.JLabel();
        t_solo = new javax.swing.JLabel();
        t_enxofre = new javax.swing.JLabel();
        c_qtdEnxofre = new javax.swing.JTextField();
        t_aluminio = new javax.swing.JLabel();
        op_texturadosolo_media = new javax.swing.JRadioButton();
        c_qtdAluminio = new javax.swing.JTextField();
        t_textura_solo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        t_correcao_recuperacaodefosforo = new javax.swing.JLabel();
        t_fontesdefosforo = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabela_fontesdefosforo = new javax.swing.JTable();
        t_teordefosforo_atingir = new javax.swing.JLabel();
        c_teorfosforo_atingir = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        c_qtdfosforo_utilizar = new javax.swing.JTextField();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        t_potassio.setText("Pot??ssio");

        c_qtdPotassio.setText("Cmol");

        buttonGroup2.add(op_sistemadecultivo_plantiodireto);
        op_sistemadecultivo_plantiodireto.setText("Plantio Direto");

        t_calcio.setText("C??lcio");

        t_sistema_cultivo.setText("Sistema de Cultivo");

        c_qtdCalcio.setText("Cmol");
        c_qtdCalcio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_qtdCalcioActionPerformed(evt);
            }
        });

        buttonGroup2.add(op_sistemadecultivo_plantioconvencional);
        op_sistemadecultivo_plantioconvencional.setText("Plantio Convencional");

        t_magnesio.setText("Magn??sio");

        c_qtdmagnesio.setText("Cmol");
        c_qtdmagnesio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_qtdmagnesioActionPerformed(evt);
            }
        });

        buttonGroup1.add(op_texturadosolo_argiloso);
        op_texturadosolo_argiloso.setText("Argiloso");
        op_texturadosolo_argiloso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op_texturadosolo_argilosoActionPerformed(evt);
            }
        });

        jLabel1.setText("Teores no Solo");

        c_qtdFosforo.setText("mg.dm??");
        c_qtdFosforo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_qtdFosforoActionPerformed(evt);
            }
        });

        t_fosforo.setText("F??sforo");

        t_solo.setText("Solo");

        t_enxofre.setText("Enxofre");

        c_qtdEnxofre.setText("mg.dm??");
        c_qtdEnxofre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_qtdEnxofreActionPerformed(evt);
            }
        });

        t_aluminio.setText("Aluminio");

        buttonGroup1.add(op_texturadosolo_media);
        op_texturadosolo_media.setText("M??dia");

        t_textura_solo.setText("Textura do Solo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(192, 192, 192)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addComponent(t_sistema_cultivo))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(op_sistemadecultivo_plantiodireto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(op_sistemadecultivo_plantioconvencional)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(16, 16, 16)
                                    .addComponent(op_texturadosolo_media)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(op_texturadosolo_argiloso))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(t_solo)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(t_aluminio)
                                                .addComponent(c_qtdAluminio, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(18, 18, 18)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(c_qtdCalcio, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(t_calcio)))
                                        .addComponent(t_textura_solo))))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(c_qtdEnxofre, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(t_enxofre))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(t_fosforo)
                                .addComponent(c_qtdFosforo, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(t_magnesio)
                                .addComponent(c_qtdmagnesio, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(c_qtdPotassio, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(t_potassio)))))
                .addContainerGap(251, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(t_potassio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(c_qtdPotassio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(t_aluminio)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(t_calcio)
                                    .addComponent(t_enxofre))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(c_qtdCalcio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(c_qtdEnxofre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(c_qtdAluminio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(t_solo))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(t_fosforo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(c_qtdFosforo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(t_magnesio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(c_qtdmagnesio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(t_sistema_cultivo)
                            .addComponent(t_textura_solo, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(op_sistemadecultivo_plantiodireto)
                            .addComponent(op_sistemadecultivo_plantioconvencional)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(op_texturadosolo_argiloso)
                        .addComponent(op_texturadosolo_media)))
                .addContainerGap(211, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Solo - Dados Gerais", jPanel1);

        t_correcao_recuperacaodefosforo.setText("Corre????o/Recupera????o de F??sforo");

        t_fontesdefosforo.setText("Fontes de F??sforo");

        tabela_fontesdefosforo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                { new Integer(1), "Superfosfato Simples", null},
                { new Integer(2), "Superfosfato Triplo", null},
                { new Integer(3), "MAP", null},
                { new Integer(4), "DAP", null},
                { new Integer(5), "Yoorin", null},
                { new Integer(6), "Fosfato  Arad", null},
                { new Integer(7), "Fosfato  Gafsa", null},
                { new Integer(8), " Fosfato  Daoui", null},
                { new Integer(9), "Fosf.  Patos Minas", null},
                { new Integer(10), "Esc??ria de Thomas", null},
                { new Integer(11), "??cido Fosf??rico ", null},
                { new Integer(12), "Multif.Magnesiano", null}
            },
            new String [] {
                "C??digo", "Fonte", "Valor/Ton. (R$)"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabela_fontesdefosforo.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tabela_fontesdefosforo);
        if (tabela_fontesdefosforo.getColumnModel().getColumnCount() > 0) {
            tabela_fontesdefosforo.getColumnModel().getColumn(0).setResizable(false);
            tabela_fontesdefosforo.getColumnModel().getColumn(1).setResizable(false);
        }

        t_teordefosforo_atingir.setText("Teor de F??sforo a atingir:");

        c_teorfosforo_atingir.setText("mg.dm3");
        c_teorfosforo_atingir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_teorfosforo_atingirActionPerformed(evt);
            }
        });

        jLabel3.setText("Fonte de F??sforo a utilizar:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(t_teordefosforo_atingir)
                        .addGap(18, 18, 18)
                        .addComponent(c_teorfosforo_atingir, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(c_qtdfosforo_utilizar)))
                .addContainerGap(86, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(t_fontesdefosforo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(t_correcao_recuperacaodefosforo)
                .addGap(74, 74, 74))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t_fontesdefosforo)
                    .addComponent(t_correcao_recuperacaodefosforo, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(t_teordefosforo_atingir)
                            .addComponent(c_teorfosforo_atingir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(c_qtdfosforo_utilizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(151, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("F??sforo ", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(530, 530, 530)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(196, 196, 196))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void c_qtdFosforoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_qtdFosforoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_qtdFosforoActionPerformed

    private void c_qtdEnxofreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_qtdEnxofreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_qtdEnxofreActionPerformed

    private void c_qtdmagnesioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_qtdmagnesioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_qtdmagnesioActionPerformed

    private void c_qtdCalcioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_qtdCalcioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_qtdCalcioActionPerformed

    private void op_texturadosolo_argilosoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op_texturadosolo_argilosoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_op_texturadosolo_argilosoActionPerformed

    private void c_teorfosforo_atingirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_teorfosforo_atingirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_teorfosforo_atingirActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JTextField c_qtdAluminio;
    private javax.swing.JTextField c_qtdCalcio;
    private javax.swing.JTextField c_qtdEnxofre;
    private javax.swing.JTextField c_qtdFosforo;
    private javax.swing.JTextField c_qtdPotassio;
    private javax.swing.JTextField c_qtdfosforo_utilizar;
    private javax.swing.JTextField c_qtdmagnesio;
    private javax.swing.JTextField c_teorfosforo_atingir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JRadioButton op_sistemadecultivo_plantioconvencional;
    private javax.swing.JRadioButton op_sistemadecultivo_plantiodireto;
    private javax.swing.JRadioButton op_texturadosolo_argiloso;
    private javax.swing.JRadioButton op_texturadosolo_media;
    private javax.swing.JLabel t_aluminio;
    private javax.swing.JLabel t_calcio;
    private javax.swing.JLabel t_correcao_recuperacaodefosforo;
    private javax.swing.JLabel t_enxofre;
    private javax.swing.JLabel t_fontesdefosforo;
    private javax.swing.JLabel t_fosforo;
    private javax.swing.JLabel t_magnesio;
    private javax.swing.JLabel t_potassio;
    private javax.swing.JLabel t_sistema_cultivo;
    private javax.swing.JLabel t_solo;
    private javax.swing.JLabel t_teordefosforo_atingir;
    private javax.swing.JLabel t_textura_solo;
    private javax.swing.JTable tabela_fontesdefosforo;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figura;

/**
 *
 * @author sergio
 */
public class Ventana extends javax.swing.JFrame {

    /**
     * Creates new form Ventana
     */
    public Ventana() {
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

        jPanelventana = new javax.swing.JPanel();
        btndibujar = new java.awt.Button();
        FIGURA = new javax.swing.JLabel();
        cbxfigura = new javax.swing.JComboBox();
        jLabex1 = new javax.swing.JLabel();
        jLabely1 = new javax.swing.JLabel();
        jLabelx2 = new javax.swing.JLabel();
        jLabely2 = new javax.swing.JLabel();
        jLabelx3 = new javax.swing.JLabel();
        jLabely3 = new javax.swing.JLabel();
        jrfx1 = new javax.swing.JTextField();
        jrfy1 = new javax.swing.JTextField();
        jrfx2 = new javax.swing.JTextField();
        jrfy2 = new javax.swing.JTextField();
        jrfy3 = new javax.swing.JTextField();
        jrfx3 = new javax.swing.JTextField();
        jLabelx4 = new javax.swing.JLabel();
        jLabely4 = new javax.swing.JLabel();
        jrfx4 = new javax.swing.JTextField();
        jrfy4 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jlperimetro = new javax.swing.JLabel();
        jLabelarea = new javax.swing.JLabel();
        jlarea = new javax.swing.JLabel();
        jLabeTipo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanelventanaLayout = new javax.swing.GroupLayout(jPanelventana);
        jPanelventana.setLayout(jPanelventanaLayout);
        jPanelventanaLayout.setHorizontalGroup(
            jPanelventanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 559, Short.MAX_VALUE)
        );
        jPanelventanaLayout.setVerticalGroup(
            jPanelventanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 369, Short.MAX_VALUE)
        );

        btndibujar.setLabel("Dibujar");
        btndibujar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndibujarActionPerformed(evt);
            }
        });

        FIGURA.setText("FIGURA");

        cbxfigura.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cuadrado", "Triangulo", "Rectangulo", "" }));
        cbxfigura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxfiguraActionPerformed(evt);
            }
        });

        jLabex1.setText("x1");

        jLabely1.setText("y1");

        jLabelx2.setText("x2");

        jLabely2.setText("y2");

        jLabelx3.setText("x3");

        jLabely3.setText("y3");

        jLabelx4.setText("x4");

        jLabely4.setText("y4");

        jLabel1.setText("Perimetro =");

        jlperimetro.setText(".");

        jLabelarea.setText("Area=");

        jlarea.setText(".");

        jLabeTipo.setText("jLabel2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelventana, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FIGURA)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelx2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jrfx2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelx3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jrfx3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabex1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jrfx1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbxfigura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabely2)
                                    .addComponent(jLabely1)
                                    .addComponent(jLabely3)
                                    .addComponent(jLabely4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jrfy2, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                                        .addComponent(jrfy3, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                                        .addComponent(jrfy1))
                                    .addComponent(jrfy4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 13, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabelx4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jrfx4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabelarea)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jlarea, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jLabel1)
                                            .addGap(18, 18, 18)
                                            .addComponent(jlperimetro, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 45, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jLabeTipo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btndibujar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelventana, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(FIGURA)
                            .addComponent(cbxfigura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabex1)
                            .addComponent(jLabely1)
                            .addComponent(jrfx1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jrfy1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelx2)
                            .addComponent(jLabely2)
                            .addComponent(jrfx2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jrfy2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelx3)
                            .addComponent(jLabely3)
                            .addComponent(jrfy3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jrfx3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelx4)
                            .addComponent(jLabely4)
                            .addComponent(jrfx4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jrfy4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jlperimetro))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelarea)
                            .addComponent(jlarea))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabeTipo)))
                .addGap(26, 26, 26)
                .addComponent(btndibujar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btndibujarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndibujarActionPerformed

         jPanelventana.paintImmediately(00,00,jPanelventana.getWidth(),jPanelventana.getHeight());

        //define la figura que se  dibujara
        if (cbxfigura.getSelectedIndex() == 1) {
            
            try {
                Coordenada coordenadas[] = new Coordenada[3];
                coordenadas[0] = new Coordenada(Integer.parseInt(jrfx1.getText()), Integer.parseInt(jrfy1.getText()));
                coordenadas[1] = new Coordenada(Integer.parseInt(jrfx2.getText()), Integer.parseInt(jrfy2.getText()));
                coordenadas[2] = new Coordenada(Integer.parseInt(jrfx3.getText()), Integer.parseInt(jrfy3.getText()));
                Triangulo triangulo = new Triangulo(coordenadas);
                 triangulo.Dibujar(jPanelventana.getGraphics());
               
               
                jlperimetro.setText(Float.toString(triangulo.calcularPerimetro()));
                jlarea.setText(Float.toString(triangulo.calcularArea()));
                jLabeTipo.setText(triangulo.definirTriangulo());
                
            } catch (Exception e) {
                System.out.println(e);
            }

        }

    }//GEN-LAST:event_btndibujarActionPerformed

    private void cbxfiguraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxfiguraActionPerformed

        if (cbxfigura.getSelectedIndex() == 1) {
            jrfx4.setVisible(false);
            jrfy4.setVisible(false);
            jLabelx4.setVisible(false);
            jLabely4.setVisible(false);
        } else {
            jrfx4.setVisible(true);
            jrfy4.setVisible(true);
            jLabelx4.setVisible(true);
            jLabely4.setVisible(true);
        }
    }//GEN-LAST:event_cbxfiguraActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FIGURA;
    private java.awt.Button btndibujar;
    private javax.swing.JComboBox cbxfigura;
    private javax.swing.JLabel jLabeTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelarea;
    private javax.swing.JLabel jLabelx2;
    private javax.swing.JLabel jLabelx3;
    private javax.swing.JLabel jLabelx4;
    private javax.swing.JLabel jLabely1;
    private javax.swing.JLabel jLabely2;
    private javax.swing.JLabel jLabely3;
    private javax.swing.JLabel jLabely4;
    private javax.swing.JLabel jLabex1;
    private javax.swing.JPanel jPanelventana;
    private javax.swing.JLabel jlarea;
    private javax.swing.JLabel jlperimetro;
    private javax.swing.JTextField jrfx1;
    private javax.swing.JTextField jrfx2;
    private javax.swing.JTextField jrfx3;
    private javax.swing.JTextField jrfx4;
    private javax.swing.JTextField jrfy1;
    private javax.swing.JTextField jrfy2;
    private javax.swing.JTextField jrfy3;
    private javax.swing.JTextField jrfy4;
    // End of variables declaration//GEN-END:variables
}

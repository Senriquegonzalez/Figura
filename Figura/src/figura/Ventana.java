/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figura;

/**
 *
 * @author sergio
 *
 */
public class Ventana extends javax.swing.JFrame {

    /**
     * Creates new form Ventana
     */
    /**
     * Instanciamos el objeto llamado graficar a la clase Grafica
     */
    Grafica graficar = new Grafica();
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
        jLabel2 = new javax.swing.JLabel();
        JTFg = new javax.swing.JTextField();
        JTFb = new javax.swing.JTextField();
        JTFr = new javax.swing.JTextField();
        BTN_Guardar = new javax.swing.JButton();
        JTF_Figura = new javax.swing.JTextField();
        LBL_Contador = new javax.swing.JLabel();

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

        jLabeTipo.setText(".");

        jLabel2.setText("Color RGB");

        JTFr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFrActionPerformed(evt);
            }
        });

        BTN_Guardar.setText("Guardar");
        BTN_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_GuardarActionPerformed(evt);
            }
        });

        JTF_Figura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTF_FiguraActionPerformed(evt);
            }
        });

        LBL_Contador.setText(".");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelventana, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabelx4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jrfx4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(69, 69, 69))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabelarea)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jlarea, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(18, 18, 18)
                                        .addComponent(jlperimetro, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 45, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jLabeTipo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
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
                                            .addComponent(jrfy4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(JTFr, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(JTFg, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(36, 36, 36)
                                        .addComponent(JTFb, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(19, 19, 19))
                                    .addComponent(jLabel2))))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btndibujar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(JTF_Figura, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(BTN_Guardar)
                .addGap(26, 26, 26)
                .addComponent(LBL_Contador, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jrfx4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jrfy4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabely4)
                            .addComponent(jLabelx4))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jlperimetro))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelarea)
                            .addComponent(jlarea))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabeTipo)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JTFg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTFr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTFb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btndibujar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BTN_Guardar)
                        .addComponent(JTF_Figura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(LBL_Contador)))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btndibujarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndibujarActionPerformed

        //Se utiliza para pintar nuevamente jpanel
        jPanelventana.paintImmediately(00, 00, jPanelventana.getWidth(), jPanelventana.getHeight());

                
                graficar.obtenerColor(Integer.parseInt(JTFr.getText()), Integer.parseInt(JTFg.getText()), Integer.parseInt(JTFb.getText()));
                
                graficar.Dibujar(jPanelventana.getGraphics(), jPanelventana,Integer.parseInt(JTF_Figura.getText()));
                jlperimetro.setText(Float.toString(graficar.getPerimetro()));
                jlarea.setText(Float.toString(graficar.getArea()));
                jLabeTipo.setText(graficar.getTipoTriangulo());

                //Se llaman los metodos dentro del setText y se muestran los valores calculados.
                

           

        
        
    }//GEN-LAST:event_btndibujarActionPerformed

    private void cbxfiguraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxfiguraActionPerformed

        if (cbxfigura.getSelectedIndex() == 1) {
            //Se ocultan los JLabel que no se utilizaran en el triangulo
            jrfx4.setVisible(false);
            jrfy4.setVisible(false);
            jLabelx4.setVisible(false);
            jLabely4.setVisible(false);
            jLabeTipo.setVisible(true);
        } else {
            //Se ocultan los JLabel que no se utilizaran en Cuadrado y Rectangulo
            jrfx4.setVisible(true);
            jrfy4.setVisible(true);
            jLabelx4.setVisible(true);
            jLabely4.setVisible(true);
            jLabeTipo.setVisible(false);
        }
    }//GEN-LAST:event_cbxfiguraActionPerformed

    private void JTFrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFrActionPerformed

    private void JTF_FiguraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTF_FiguraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTF_FiguraActionPerformed

    private void BTN_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_GuardarActionPerformed
        // TODO add your handling code here:
        if (cbxfigura.getSelectedIndex() == 0) {
            /**
             * Se crea un arreglo de 4 posiciones que almacena las coordenas del eje x.
             */
            int coordenadasx[] = new int[4];
            /**
             * Se crea un arreglo de 4 posiciones que almacena las coordenas del eje y.
            */ 
                int coordenadasy[] = new int[4];
                 /**
                  * Se asigna a cada posicion del arreglo un dato capturado desde las cajas de texto respectivamente a cada eje.
                 */ 
                coordenadasx[0] = new Integer(jrfx1.getText());
                coordenadasx[1] = new Integer(jrfx2.getText());
                coordenadasx[2] = new Integer(jrfx3.getText());
                coordenadasx[3] = new Integer(jrfx4.getText());
                coordenadasy[0] = new Integer(jrfy1.getText());
                coordenadasy[1] = new Integer(jrfy2.getText());
                coordenadasy[2] = new Integer(jrfy3.getText());
                coordenadasy[3] = new Integer(jrfy4.getText());

                /**
                 * Se declara y se instancia un objeto de la clase Cuadrado.
                */ 
                Cuadrado cuadrado = new Cuadrado(coordenadasx, coordenadasy, 4);
                /**
                 * Se llama al método calcularArea() y calcularPerimetro desde el objeto cuadrado. 
                */ 
                cuadrado.calcularArea();
                cuadrado.calcularPerimetro();
                /**
                 * Se llama al método llenarArray() el cual recibe un cuadrado.
                 */ 
                graficar.llenarArray(cuadrado);
                LBL_Contador.setText(String.valueOf(graficar.lista.size()));
        }
        else if(cbxfigura.getSelectedIndex() == 1){
            int coordenadasx[] = new int[3];
            int coordenadasy[] = new int[3];
            /**
             * Se asigna a cada posicion del arreglo un dato capturado desde las cajas de texto respectivamente a cada eje.
             */
            coordenadasx[0] = new Integer(jrfx1.getText());
            coordenadasx[1] = new Integer(jrfx2.getText());
            coordenadasx[2] = new Integer(jrfx3.getText());
            coordenadasy[0] = new Integer(jrfy1.getText());
            coordenadasy[1] = new Integer(jrfy2.getText());
            coordenadasy[2] = new Integer(jrfy3.getText());
            //Se crea el try catch por si ingresa un null o un caracter especial
          
                /**
                 * Se declara y se instancia un objeto de la clase Triangulo.
                */
                Triangulo triangulo = new Triangulo(coordenadasx, coordenadasy, 3);
                triangulo.calcularArea();
                triangulo.calcularPerimetro();
                triangulo.definirTriangulo();
                        
                /**
                 * Se llama al metodo dibujar donde se envia el Jpanel
                */ 
                graficar.llenarArray(triangulo);
                LBL_Contador.setText(String.valueOf(graficar.lista.size()));
        }
        else if(cbxfigura.getSelectedIndex() == 2){
            int coordenadasx[] = new int[4];
                int coordenadasy[] = new int[4];
                   /**
                    * Se asigna a cada posicion del arreglo un dato capturado desde las cajas de texto respectivamente a cada eje.
                    */
                coordenadasx[0] = new Integer(jrfx1.getText());
                coordenadasx[1] = new Integer(jrfx2.getText());
                coordenadasx[2] = new Integer(jrfx3.getText());
                coordenadasx[3] = new Integer(jrfx4.getText());
                coordenadasy[0] = new Integer(jrfy1.getText());
                coordenadasy[1] = new Integer(jrfy2.getText());
                coordenadasy[2] = new Integer(jrfy3.getText());
                coordenadasy[3] = new Integer(jrfy4.getText());

                /**
                 * Se declara y se instancia un objeto de la clase Rectangulo.
                */
                Rectangulo rectangulo = new Rectangulo(coordenadasx, coordenadasy, 4);
                rectangulo.calcularArea();
                rectangulo.calcularPerimetro();
                graficar.llenarArray(rectangulo);
                LBL_Contador.setText(String.valueOf(graficar.lista.size()));
        }
    }//GEN-LAST:event_BTN_GuardarActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_Guardar;
    private javax.swing.JLabel FIGURA;
    private javax.swing.JTextField JTF_Figura;
    private javax.swing.JTextField JTFb;
    private javax.swing.JTextField JTFg;
    private javax.swing.JTextField JTFr;
    private javax.swing.JLabel LBL_Contador;
    private java.awt.Button btndibujar;
    private javax.swing.JComboBox cbxfigura;
    private javax.swing.JLabel jLabeTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
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

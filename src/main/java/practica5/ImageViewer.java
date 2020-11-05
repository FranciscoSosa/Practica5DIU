package practica5;


public class ImageViewer extends javax.swing.JFrame {


    public ImageViewer() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rgbGroup = new javax.swing.ButtonGroup();
        logoGroup = new javax.swing.ButtonGroup();
        configPanel = new javax.swing.JPanel();
        colorLabel = new javax.swing.JLabel();
        logoLabel = new javax.swing.JLabel();
        topLeftRButton = new javax.swing.JRadioButton();
        bottomLeftRButton = new javax.swing.JRadioButton();
        topRightRButton = new javax.swing.JRadioButton();
        bottomRightRButton = new javax.swing.JRadioButton();
        redCheckBox = new javax.swing.JCheckBox();
        greenCheckBox = new javax.swing.JCheckBox();
        blueCheckBox = new javax.swing.JCheckBox();
        rgbCheckBox = new javax.swing.JCheckBox();
        imagePanel = new practica5.ImagePanel();
        nameLabel1 = new javax.swing.JLabel();
        nameLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Visualización de imagen");
        setResizable(false);

        configPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Configuración"));

        colorLabel.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        colorLabel.setText("Selección color");

        logoLabel.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        logoLabel.setText("Ubicación logo");

        logoGroup.add(topLeftRButton);
        topLeftRButton.setText("arriba-izquierda");
        topLeftRButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                topLeftRButtonActionPerformed(evt);
            }
        });

        logoGroup.add(bottomLeftRButton);
        bottomLeftRButton.setText("abajo-izquierda ");
        bottomLeftRButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bottomLeftRButtonActionPerformed(evt);
            }
        });

        logoGroup.add(topRightRButton);
        topRightRButton.setSelected(true);
        topRightRButton.setText("arriba-derecha");
        topRightRButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                topRightRButtonActionPerformed(evt);
            }
        });

        logoGroup.add(bottomRightRButton);
        bottomRightRButton.setText("abajo-derecha");
        bottomRightRButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bottomRightRButtonActionPerformed(evt);
            }
        });

        redCheckBox.setSelected(true);
        redCheckBox.setText("Rojo");
        redCheckBox.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                redCheckBoxStateChanged(evt);
            }
        });

        greenCheckBox.setSelected(true);
        greenCheckBox.setText("Verde");
        greenCheckBox.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                greenCheckBoxStateChanged(evt);
            }
        });

        blueCheckBox.setSelected(true);
        blueCheckBox.setText("Azul");
        blueCheckBox.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                blueCheckBoxStateChanged(evt);
            }
        });

        rgbCheckBox.setSelected(true);
        rgbCheckBox.setText("Todos");
        rgbCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rgbCheckBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout configPanelLayout = new javax.swing.GroupLayout(configPanel);
        configPanel.setLayout(configPanelLayout);
        configPanelLayout.setHorizontalGroup(
            configPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(configPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(configPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(configPanelLayout.createSequentialGroup()
                        .addComponent(topLeftRButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(topRightRButton))
                    .addGroup(configPanelLayout.createSequentialGroup()
                        .addGroup(configPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(colorLabel)
                            .addComponent(logoLabel)
                            .addGroup(configPanelLayout.createSequentialGroup()
                                .addComponent(bottomLeftRButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bottomRightRButton)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(configPanelLayout.createSequentialGroup()
                        .addComponent(redCheckBox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(greenCheckBox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(blueCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rgbCheckBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        configPanelLayout.setVerticalGroup(
            configPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(configPanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(colorLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(configPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(redCheckBox)
                    .addComponent(greenCheckBox)
                    .addComponent(blueCheckBox)
                    .addComponent(rgbCheckBox))
                .addGap(20, 20, 20)
                .addComponent(logoLabel)
                .addGap(18, 18, 18)
                .addGroup(configPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(topLeftRButton)
                    .addComponent(topRightRButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(configPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bottomLeftRButton)
                    .addComponent(bottomRightRButton))
                .addContainerGap())
        );

        javax.swing.GroupLayout imagePanelLayout = new javax.swing.GroupLayout(imagePanel);
        imagePanel.setLayout(imagePanelLayout);
        imagePanelLayout.setHorizontalGroup(
            imagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 295, Short.MAX_VALUE)
        );
        imagePanelLayout.setVerticalGroup(
            imagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 239, Short.MAX_VALUE)
        );

        nameLabel1.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        nameLabel1.setText("Francisco Jose Santana Sosa");

        nameLabel2.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        nameLabel2.setText("Felipe Santana Hernández");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(configPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameLabel1))
                        .addGap(18, 18, 18)
                        .addComponent(imagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(configPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nameLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nameLabel2)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void redCheckBoxStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_redCheckBoxStateChanged
        if((!greenCheckBox.isSelected() && !blueCheckBox.isSelected())){
            redCheckBox.setSelected(true);
        }else{
            checkBoxEvent();
        }
        
    }//GEN-LAST:event_redCheckBoxStateChanged

    private void greenCheckBoxStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_greenCheckBoxStateChanged
        if((!redCheckBox.isSelected() && !blueCheckBox.isSelected())){
            greenCheckBox.setSelected(true);
        }else{
            checkBoxEvent();
        }
    }//GEN-LAST:event_greenCheckBoxStateChanged

    private void blueCheckBoxStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_blueCheckBoxStateChanged
        if((!redCheckBox.isSelected() && !greenCheckBox.isSelected())){
            blueCheckBox.setSelected(true);
        }else{
            checkBoxEvent();
        }
    }//GEN-LAST:event_blueCheckBoxStateChanged

    private void rgbCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rgbCheckBoxActionPerformed
        if(rgbCheckBox.isSelected()){
            redCheckBox.setSelected(true);
            greenCheckBox.setSelected(true);
            blueCheckBox.setSelected(true);
        }else{
            if (redCheckBox.isSelected() && greenCheckBox.isSelected() && blueCheckBox.isSelected()){
                rgbCheckBox.setSelected(true);
            }
        }
    }//GEN-LAST:event_rgbCheckBoxActionPerformed

    private void topLeftRButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_topLeftRButtonActionPerformed
        imagePanel.setLogoCoordinates(0, 0);
    }//GEN-LAST:event_topLeftRButtonActionPerformed

    private void bottomLeftRButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bottomLeftRButtonActionPerformed
        imagePanel.setLogoCoordinates(0, 199);
    }//GEN-LAST:event_bottomLeftRButtonActionPerformed

    private void topRightRButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_topRightRButtonActionPerformed
        imagePanel.setLogoCoordinates(265, 0);
    }//GEN-LAST:event_topRightRButtonActionPerformed

    private void bottomRightRButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bottomRightRButtonActionPerformed
        imagePanel.setLogoCoordinates(265, 199);
    }//GEN-LAST:event_bottomRightRButtonActionPerformed

    private void checkBoxEvent(){
        if (redCheckBox.isSelected() && greenCheckBox.isSelected() && blueCheckBox.isSelected()){
            rgbCheckBox.setSelected(true);
        }else{
            rgbCheckBox.setSelected(false);
        }
        imagePanel.updateImageColor(redCheckBox.isSelected(), greenCheckBox.isSelected(), blueCheckBox.isSelected());
    }
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
            java.util.logging.Logger.getLogger(ImageViewer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ImageViewer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ImageViewer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ImageViewer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ImageViewer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox blueCheckBox;
    private javax.swing.JRadioButton bottomLeftRButton;
    private javax.swing.JRadioButton bottomRightRButton;
    private javax.swing.JLabel colorLabel;
    private javax.swing.JPanel configPanel;
    private javax.swing.JCheckBox greenCheckBox;
    private practica5.ImagePanel imagePanel;
    private javax.swing.ButtonGroup logoGroup;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JLabel nameLabel1;
    private javax.swing.JLabel nameLabel2;
    private javax.swing.JCheckBox redCheckBox;
    private javax.swing.JCheckBox rgbCheckBox;
    private javax.swing.ButtonGroup rgbGroup;
    private javax.swing.JRadioButton topLeftRButton;
    private javax.swing.JRadioButton topRightRButton;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicals.RainbowTable;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 *
 * @author Ben-PC
 */
public class BuildTable extends javax.swing.JFrame {

    /**
     * Creates new form Interface
     */

    public BuildTable() {
        initComponents();
        int min = sldMin.getValue();
        lblPlaintextMinLen.setText("Minimum Length: " + min);
        
        int max = sldMax.getValue();
        lblPlaintextMaxLen.setText("Maximum Length: " + max);
        
        String cc = txtChainCount.getText();
        long bc = 16 * Integer.parseInt(cc);
        
        String diskSpace = humanReadableByteCount(bc, false);
        
        lblDiskSpace.setText(diskSpace);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrPane = new javax.swing.JScrollPane();
        txtaCharSet = new javax.swing.JTextArea();
        lblCurrentCharSet = new javax.swing.JLabel();
        btnaz = new javax.swing.JButton();
        btnAZ = new javax.swing.JButton();
        btn09 = new javax.swing.JButton();
        lblPlaintextMinLen = new javax.swing.JLabel();
        sldMin = new javax.swing.JSlider();
        lblPlaintextMaxLen = new javax.swing.JLabel();
        sldMax = new javax.swing.JSlider();
        btnRemoveAllChars = new javax.swing.JButton();
        lblNumPos = new javax.swing.JLabel();
        lblHashType = new javax.swing.JLabel();
        cmbHashType = new javax.swing.JComboBox<>();
        lblChainLength = new javax.swing.JLabel();
        lblChainCount = new javax.swing.JLabel();
        txtChainLength = new javax.swing.JTextField();
        txtChainCount = new javax.swing.JTextField();
        lblCombinationsT = new javax.swing.JLabel();
        sep1 = new javax.swing.JSeparator();
        lblDiskSpaceT = new javax.swing.JLabel();
        lblDiskSpace = new javax.swing.JLabel();
        btnGo = new javax.swing.JButton();
        sep2 = new javax.swing.JSeparator();
        lblRainbowProperties = new javax.swing.JLabel();
        lblTableProperties = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Rainbow Table Generator");

        txtaCharSet.setColumns(20);
        txtaCharSet.setLineWrap(true);
        txtaCharSet.setRows(5);
        txtaCharSet.setWrapStyleWord(true);
        txtaCharSet.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtaCharSetKeyReleased(evt);
            }
        });
        scrPane.setViewportView(txtaCharSet);

        lblCurrentCharSet.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblCurrentCharSet.setText("Character Set");

        btnaz.setText("Add (a-z)");
        btnaz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnazActionPerformed(evt);
            }
        });

        btnAZ.setText("Add (A-Z)");
        btnAZ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAZActionPerformed(evt);
            }
        });

        btn09.setText("Add (0-9)");
        btn09.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn09ActionPerformed(evt);
            }
        });

        lblPlaintextMinLen.setText("Minimum Length: ");

        sldMin.setMaximum(10);
        sldMin.setMinimum(1);
        sldMin.setToolTipText("");
        sldMin.setValue(5);
        sldMin.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sldMinStateChanged(evt);
            }
        });

        lblPlaintextMaxLen.setText("Maximum Length: ");

        sldMax.setMaximum(10);
        sldMax.setMinimum(1);
        sldMax.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sldMaxStateChanged(evt);
            }
        });

        btnRemoveAllChars.setText("Remove All Characters");
        btnRemoveAllChars.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveAllCharsActionPerformed(evt);
            }
        });

        lblNumPos.setText("0");

        lblHashType.setText("Hash Type");

        cmbHashType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SHA1", "TBC", " " }));

        lblChainLength.setText("Chain Length");

        lblChainCount.setText("Chain Count");

        txtChainLength.setText("100000");

        txtChainCount.setText("4000000");
        txtChainCount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtChainCountActionPerformed(evt);
            }
        });
        txtChainCount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtChainCountKeyReleased(evt);
            }
        });

        lblCombinationsT.setText("Combinations: ");

        lblDiskSpaceT.setText("Disk Space:");

        lblDiskSpace.setText("0");

        btnGo.setText("GO!");

        lblRainbowProperties.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblRainbowProperties.setText("Rainbow Table Properties");

        lblTableProperties.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblTableProperties.setText("Table Properties");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sep1)
            .addComponent(sep2)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCurrentCharSet)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnaz)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnAZ)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn09))
                                    .addComponent(scrPane, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblPlaintextMinLen)
                                    .addComponent(lblPlaintextMaxLen)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(btnRemoveAllChars, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(sldMax, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                        .addComponent(sldMin, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblRainbowProperties)
                            .addComponent(lblTableProperties)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cmbHashType, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtChainLength, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblChainLength)))
                                    .addComponent(lblHashType))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtChainCount, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblChainCount)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCombinationsT)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblNumPos))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblDiskSpaceT)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblDiskSpace)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btnGo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(lblRainbowProperties)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHashType)
                    .addComponent(lblChainLength)
                    .addComponent(lblChainCount))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbHashType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtChainLength, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtChainCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(sep2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCurrentCharSet)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblPlaintextMinLen)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sldMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPlaintextMaxLen)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sldMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(scrPane, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn09)
                    .addComponent(btnAZ)
                    .addComponent(btnaz)
                    .addComponent(btnRemoveAllChars))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sep1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTableProperties)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNumPos)
                    .addComponent(lblCombinationsT))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDiskSpaceT)
                    .addComponent(lblDiskSpace))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnazActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnazActionPerformed
        txtaCharSet.append("abcdefghijklmnopqrstuvwxyz");
        txtaCharSet.setText(removeDuplicates(txtaCharSet.getText()));
        lblNumPos.setText(String.valueOf(numPosibilities(txtaCharSet.getText(), sldMin.getValue(), sldMax.getValue())));
    }//GEN-LAST:event_btnazActionPerformed

    private void btnAZActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAZActionPerformed
        txtaCharSet.append("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
        txtaCharSet.setText(removeDuplicates(txtaCharSet.getText()));
        lblNumPos.setText(String.valueOf(numPosibilities(txtaCharSet.getText(), sldMin.getValue(), sldMax.getValue())));
    }//GEN-LAST:event_btnAZActionPerformed

    private void btn09ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn09ActionPerformed
        txtaCharSet.append("1234567890");
        txtaCharSet.setText(removeDuplicates(txtaCharSet.getText()));
        lblNumPos.setText(String.valueOf(numPosibilities(txtaCharSet.getText(), sldMin.getValue(), sldMax.getValue())));
    }//GEN-LAST:event_btn09ActionPerformed

    private void btnRemoveAllCharsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveAllCharsActionPerformed
        txtaCharSet.setText("");
        lblNumPos.setText(String.valueOf(numPosibilities(txtaCharSet.getText(), sldMin.getValue(), sldMax.getValue())));
    }//GEN-LAST:event_btnRemoveAllCharsActionPerformed

    private void sldMaxStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sldMaxStateChanged
        int value = sldMax.getValue();
        lblPlaintextMaxLen.setText("Maximum Length: " + value);
        lblNumPos.setText(String.valueOf(numPosibilities(txtaCharSet.getText(), sldMin.getValue(), value)));
    }//GEN-LAST:event_sldMaxStateChanged

    private void sldMinStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sldMinStateChanged
        int value = sldMin.getValue();
        lblPlaintextMinLen.setText("Minimum Length: " + value);
        lblNumPos.setText(String.valueOf(numPosibilities(txtaCharSet.getText(), value, sldMax.getValue())));   
    }//GEN-LAST:event_sldMinStateChanged

    private void txtaCharSetKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtaCharSetKeyReleased
        txtaCharSet.setText(removeDuplicates(txtaCharSet.getText()));
        lblNumPos.setText(String.valueOf(numPosibilities(txtaCharSet.getText(), sldMin.getValue(), sldMax.getValue())));
    }//GEN-LAST:event_txtaCharSetKeyReleased

    private void txtChainCountKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtChainCountKeyReleased
        
        String chainCount = txtChainCount.getText();
        long byteCount = 16 * Integer.parseInt(chainCount);
        
        String diskSpace = humanReadableByteCount(byteCount, false);
        
        lblDiskSpace.setText(diskSpace);
        
        
    }//GEN-LAST:event_txtChainCountKeyReleased

    private void txtChainCountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtChainCountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtChainCountActionPerformed

    public static String humanReadableByteCount(long bytes, boolean si) {
        int unit = si ? 1000 : 1024;
        
        if (bytes < unit) {
            return bytes + " B";
        }
        
        int exp = (int) (Math.log(bytes) / Math.log(unit));
        
        String pre = (si ? "kMGTPE" : "KMGTPE").charAt(exp - 1) + (si ? "" : "i");
        return String.format("%.1f %sB", bytes / Math.pow(unit, exp), pre);
    }
    
    public static String removeDuplicates(String input){
        char[] chars = input.toCharArray();
        Set<Character> charSet = new LinkedHashSet<>();
        for (char c : chars) {
            charSet.add(c);
        }

        StringBuilder sb = new StringBuilder();
        for (Character character : charSet) {
            sb.append(character);
        }
        return sb.toString();
    }
    
    public static long numPosibilities(String input, int minLen, int maxLen){
    
        long numChars = input.length();
        long count = 0;
        
        for (int i = minLen; i <= maxLen; i++) {
            count += Math.pow(numChars, i);
        }

        if (count > Long.MAX_VALUE) {
            return -1;
        }
        
        return count;
    
    }
    
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BuildTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuildTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuildTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuildTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuildTable().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn09;
    private javax.swing.JButton btnAZ;
    private javax.swing.JButton btnGo;
    private javax.swing.JButton btnRemoveAllChars;
    private javax.swing.JButton btnaz;
    private javax.swing.JComboBox<String> cmbHashType;
    private javax.swing.JLabel lblChainCount;
    private javax.swing.JLabel lblChainLength;
    private javax.swing.JLabel lblCombinationsT;
    private javax.swing.JLabel lblCurrentCharSet;
    private javax.swing.JLabel lblDiskSpace;
    private javax.swing.JLabel lblDiskSpaceT;
    private javax.swing.JLabel lblHashType;
    private javax.swing.JLabel lblNumPos;
    private javax.swing.JLabel lblPlaintextMaxLen;
    private javax.swing.JLabel lblPlaintextMinLen;
    private javax.swing.JLabel lblRainbowProperties;
    private javax.swing.JLabel lblTableProperties;
    private javax.swing.JScrollPane scrPane;
    private javax.swing.JSeparator sep1;
    private javax.swing.JSeparator sep2;
    private javax.swing.JSlider sldMax;
    private javax.swing.JSlider sldMin;
    private javax.swing.JTextField txtChainCount;
    private javax.swing.JTextField txtChainLength;
    private javax.swing.JTextArea txtaCharSet;
    // End of variables declaration//GEN-END:variables
}

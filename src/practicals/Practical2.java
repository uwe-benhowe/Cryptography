package practicals;

public class Practical2 extends javax.swing.JFrame {

    public Practical2() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        txtInput = new javax.swing.JTextField();
        lblResults = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaResults = new javax.swing.JTextArea();
        btnClear = new javax.swing.JButton();
        btnVerify = new javax.swing.JButton();
        btnVerify1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitle.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTitle.setText("Enter Six Digits");

        lblResults.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblResults.setText("Results");

        txtaResults.setColumns(20);
        txtaResults.setRows(5);
        jScrollPane1.setViewportView(txtaResults);

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnVerify.setText("Verify6");
        btnVerify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerifyActionPerformed(evt);
            }
        });

        btnVerify1.setText("Verify10");
        btnVerify1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerify1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblResults, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTitle)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtInput, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnVerify)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnVerify1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVerify)
                    .addComponent(btnVerify1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblResults)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClear)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        txtaResults.setText(null);
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnVerifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerifyActionPerformed
        String input = txtInput.getText();
        int[] digits = new int[6];

        if (input.length() == 6) {
            if (input.matches("[0-9]+")) {
                for (int i = 0; i < digits.length; i++) {
                    digits[i] = Character.getNumericValue(input.charAt(i));
                }
                if (generate6(digits) != null) {
                    txtaResults.append(input + generate6(digits) + "\n");
                    return;
                }
            }
        }
        txtaResults.append("unusable number\n");
    }//GEN-LAST:event_btnVerifyActionPerformed

    private void btnVerify1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerify1ActionPerformed
        String input = txtInput.getText();
        int[] digits = new int[10];

        if (input.length() == 10) {
            if (input.matches("[0-9]+")) {
                for (int i = 0; i < digits.length; i++) {
                    digits[i] = Character.getNumericValue(input.charAt(i));
                }
                if (generate10(digits) != null) {
                    txtaResults.append(generate10(digits) + "\n");
                    return;
                }
            }
        }
        txtaResults.append("unusable number\n");    }//GEN-LAST:event_btnVerify1ActionPerformed

    public static String generate6(int[] d) {

        int d7 = (4 * d[0] + 10 * d[1] + 9 * d[2] + 2 * d[3] + d[4] + 7 * d[5]) % 11;
        int d8 = (7 * d[0] + 8 * d[1] + 7 * d[2] + d[3] + 9 * d[4] + 6 * d[5]) % 11;
        int d9 = (9 * d[0] + d[1] + 7 * d[2] + 8 * d[3] + 7 * d[4] + 7 * d[5]) % 11;
        int d10 = (d[0] + 2 * d[1] + 9 * d[2] + 10 * d[3] + 4 * d[4] + d[5]) % 11;

        if (d7 == 10 || d8 == 10 || d9 == 10 || d10 == 10) {
            return null;
        } else {
            return Integer.toString(d7) + Integer.toString(d8) + Integer.toString(d9) + Integer.toString(d10);
        }
    }

    public static String generate10(int[] d) {

        int s1 = (d[0] + d[1] + d[2] + d[3] + d[4] + d[5] + d[6] + d[7] + d[8] + d[9]) % 11;
        int s2 = (d[0] + 2 * d[1] + 3 * d[2] + 4 * d[3] + 5 * d[4] + 6 * d[5] + 7 * d[6] + 8 * d[7] + 9 * d[8] + 10 * d[9]) % 11;
        int s3 = (d[0] + 4 * d[1] + 9 * d[2] + 5 * d[3] + 3 * d[4] + 3 * d[5] + 5 * d[6] + 9 * d[7] + 4 * d[8] + d[9]) % 11;
        int s4 = (d[0] + 8 * d[1] + 5 * d[2] + 9 * d[3] + 4 * d[4] + 7 * d[5] + 2 * d[6] + 6 * d[7] + 3 * d[8] + 10 * d[9]) % 11;

        return Integer.toString(s1) + Integer.toString(s2) + Integer.toString(s3) + Integer.toString(s4);

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Practical2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Practical2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Practical2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Practical2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Practical2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnVerify;
    private javax.swing.JButton btnVerify1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblResults;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtInput;
    private javax.swing.JTextArea txtaResults;
    // End of variables declaration//GEN-END:variables
}

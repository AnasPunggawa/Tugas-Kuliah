/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package crud;

import javax.swing.JOptionPane;

/**
 *
 * @author MSI GF63
 */
public class BentukForm extends javax.swing.JFrame {
    private String Hasil;

    /** Creates new form BentukForm */
    public BentukForm() {
        if (Session.getStatusLogin() == "AKTIF") {
            initComponents();
            txtarea_hasil.disable();
        } else {
            dispose();
            LoginForm form = new LoginForm();
            form.setVisible(true);
        }
    }

    public void reset_text() {
        txt_angka1.setText("");
        txt_angka2.setText("");
    }

    private void polimorfisme(Bentuk[] B, double a, double b) {
        Hasil="";
        for (int i = 0; i < B.length; i++) {
            B[i].set_A(a);
            B[i].set_B(b);
            B[i].set_C();
            Hasil += B[i].cetak() + "\n";
        }
    }

    public void cetakHasil(String Hasil) {
        txtarea_hasil.setText(Hasil);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_angka1 = new javax.swing.JTextField();
        txt_angka2 = new javax.swing.JTextField();
        btn_hitung = new javax.swing.JButton();
        btn_reset = new javax.swing.JButton();
        btn_tutup = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtarea_hasil = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Operasi Luas Bentuk");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Luas Bentuk");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Panjang/Alas/Diagonal 1");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Lebar/Tinggi/Diagonal 2");

        txt_angka1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        txt_angka2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        btn_hitung.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_hitung.setText("Hitung Luas");
        btn_hitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hitungActionPerformed(evt);
            }
        });

        btn_reset.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_reset.setText("Reset");
        btn_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetActionPerformed(evt);
            }
        });

        btn_tutup.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_tutup.setText("Tutup");
        btn_tutup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tutupActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Hasil Luas Bentuk");

        txtarea_hasil.setColumns(20);
        txtarea_hasil.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtarea_hasil.setRows(5);
        jScrollPane1.setViewportView(txtarea_hasil);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel2)
                            .add(jLabel3))
                        .add(29, 29, 29)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(txt_angka1)
                            .add(txt_angka2)
                            .add(layout.createSequentialGroup()
                                .add(jLabel1)
                                .add(0, 0, Short.MAX_VALUE))
                            .add(layout.createSequentialGroup()
                                .add(btn_hitung)
                                .add(18, 18, 18)
                                .add(btn_reset, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 73, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 20, Short.MAX_VALUE)
                                .add(btn_tutup, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 73, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                    .add(layout.createSequentialGroup()
                        .add(jLabel4)
                        .add(0, 0, Short.MAX_VALUE))
                    .add(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel1)
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel2)
                    .add(txt_angka1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel3)
                    .add(txt_angka2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(btn_hitung)
                    .add(btn_reset)
                    .add(btn_tutup))
                .add(18, 18, 18)
                .add(jLabel4)
                .add(18, 18, 18)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_tutupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tutupActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btn_tutupActionPerformed

    private void btn_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resetActionPerformed
        // TODO add your handling code here:
        reset_text();
    }//GEN-LAST:event_btn_resetActionPerformed

    private void btn_hitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hitungActionPerformed
        // TODO add your handling code here:
        if (txt_angka1.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Maaf, Panjang/Tinggi belum diisi!");
            txt_angka1.requestFocus();
        } else if (txt_angka2.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Maaf, Lebar belum diisi!");
            txt_angka2.requestFocus();
        } else {
            String angka1 = txt_angka1.getText();
            Double angka_1 = Double.parseDouble(angka1);
            
            String angka2 = txt_angka2.getText();
            Double angka_2 = Double.parseDouble(angka2);

            Bentuk[] B = {
                new BentukPersegiPanjang(),
                new BentukJajarGenjang(),
                new BentukSegitiga(),
                new BentukLayangLayang(),
                new BentukBelahKetupat()
            };

            polimorfisme(B, angka_1, angka_2);
            cetakHasil(Hasil);
        }
    }//GEN-LAST:event_btn_hitungActionPerformed

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
            java.util.logging.Logger.getLogger(BentukForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BentukForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BentukForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BentukForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BentukForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_hitung;
    private javax.swing.JButton btn_reset;
    private javax.swing.JButton btn_tutup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txt_angka1;
    private javax.swing.JTextField txt_angka2;
    private javax.swing.JTextArea txtarea_hasil;
    // End of variables declaration//GEN-END:variables

}
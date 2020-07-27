/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

/**
 *
 * @author Rahmad Al Habib Khasari <rahmadalhabib89@gmail.com>
 */
public class home extends javax.swing.JFrame {

    public String roleUser = "";
    public String userName = "";

    /**
     * Creates new form home
     */
    public home() {
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

        kGradientPanel1 = new keeptoo.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        label2 = new javax.swing.JLabel();
        roleLabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnTransaksi = new javax.swing.JMenu();
        mnKendaraan = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        mnMerek = new javax.swing.JMenuItem();
        mnTipe = new javax.swing.JMenuItem();
        mnSopir = new javax.swing.JMenu();
        mnPelanggan = new javax.swing.JMenu();
        mnPemilik = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        jMenu9 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(750, 700));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        kGradientPanel1.setkEndColor(new java.awt.Color(34, 167, 240));
        kGradientPanel1.setkStartColor(new java.awt.Color(83, 51, 237));

        jLabel1.setFont(new java.awt.Font("Ubuntu", 0, 48)); // NOI18N
        jLabel1.setText("Aplikasi Rental Mobil");

        label2.setText("Anda Login Sebagai");
        label2.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                label2ComponentAdded(evt);
            }
        });
        label2.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                label2ComponentShown(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/banner_rahmad.jpg"))); // NOI18N

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap(159, Short.MAX_VALUE)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(138, 138, 138))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(label2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(roleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(166, 166, 166))))
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel5)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addGap(116, 116, 116)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label2)
                    .addComponent(roleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 203, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(28, 28, 28))
        );

        jMenuBar1.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                jMenuBar1ComponentAdded(evt);
            }
        });
        jMenuBar1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jMenuBar1ComponentShown(evt);
            }
        });

        mnTransaksi.setText("Transaksi");
        mnTransaksi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mnTransaksiMousePressed(evt);
            }
        });
        mnTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnTransaksiActionPerformed(evt);
            }
        });
        jMenuBar1.add(mnTransaksi);

        mnKendaraan.setText("Kendaraan");

        jMenuItem1.setText("Kendaraan");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        mnKendaraan.add(jMenuItem1);

        mnMerek.setText("Merk");
        mnMerek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnMerekActionPerformed(evt);
            }
        });
        mnKendaraan.add(mnMerek);

        mnTipe.setText("Tipe");
        mnTipe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnTipeActionPerformed(evt);
            }
        });
        mnKendaraan.add(mnTipe);

        jMenuBar1.add(mnKendaraan);

        mnSopir.setText("Sopir");
        mnSopir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mnSopirMousePressed(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnSopirMouseClicked(evt);
            }
        });
        mnSopir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnSopirActionPerformed(evt);
            }
        });
        jMenuBar1.add(mnSopir);

        mnPelanggan.setText("Pelanggan");
        mnPelanggan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mnPelangganMousePressed(evt);
            }
        });
        mnPelanggan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnPelangganActionPerformed(evt);
            }
        });
        jMenuBar1.add(mnPelanggan);

        mnPemilik.setText("Pemilik");
        mnPemilik.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mnPemilikMousePressed(evt);
            }
        });
        mnPemilik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnPemilikActionPerformed(evt);
            }
        });
        jMenuBar1.add(mnPemilik);

        jMenu7.setText("Karyawan");
        jMenu7.addMenuKeyListener(new javax.swing.event.MenuKeyListener() {
            public void menuKeyPressed(javax.swing.event.MenuKeyEvent evt) {
                jMenu7MenuKeyPressed(evt);
            }
            public void menuKeyReleased(javax.swing.event.MenuKeyEvent evt) {
            }
            public void menuKeyTyped(javax.swing.event.MenuKeyEvent evt) {
            }
        });
        jMenu7.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                jMenu7MenuSelected(evt);
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
        });
        jMenu7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenu7MousePressed(evt);
            }
        });
        jMenu7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu7ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu7);

        jMenu8.setText("Users");
        jMenu8.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                jMenu8MenuSelected(evt);
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
        });
        jMenu8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenu8MousePressed(evt);
            }
        });
        jMenu8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu8ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu8);

        jMenu9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenu9MousePressed(evt);
            }
        });
        jMenu9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu9ActionPerformed(evt);
            }
        });

        jMenuItem4.setText("Logout");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem4);

        jMenuBar1.add(jMenu9);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mnTransaksiMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnTransaksiMousePressed
        dispose();
        transaksi transak = new transaksi();
        transak.componentDidUpdate(roleUser, userName);
        transak.setVisible(true);
    }//GEN-LAST:event_mnTransaksiMousePressed

    private void mnTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnTransaksiActionPerformed

    }//GEN-LAST:event_mnTransaksiActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        dispose();
        kendaraan kendar = new kendaraan();
        kendar.componentDidUpdate(roleUser, userName);
        kendar.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void mnMerekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnMerekActionPerformed
        dispose();
        merekKendaraan merekKendar = new merekKendaraan();
        merekKendar.componentDidUpdate(roleUser, userName);
        merekKendar.setVisible(true);
    }//GEN-LAST:event_mnMerekActionPerformed

    private void mnTipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnTipeActionPerformed
        dispose();
        tipeKendaraan tipeKendar = new tipeKendaraan();
        tipeKendar.componentDidUpdate(roleUser, userName);
        tipeKendar.setVisible(true);
    }//GEN-LAST:event_mnTipeActionPerformed

    private void mnSopirMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnSopirMousePressed
        dispose();
        sopir sop = new sopir();
        sop.componentDidUpdate(roleUser, userName);
        sop.setVisible(true);
    }//GEN-LAST:event_mnSopirMousePressed

    private void mnSopirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnSopirMouseClicked

    }//GEN-LAST:event_mnSopirMouseClicked

    private void mnSopirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnSopirActionPerformed

    }//GEN-LAST:event_mnSopirActionPerformed

    private void mnPelangganMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnPelangganMousePressed
        dispose();
        pelanggan pelangg = new pelanggan();
        pelangg.componentDidUpdate(roleUser, userName);
        pelangg.setVisible(true);
    }//GEN-LAST:event_mnPelangganMousePressed

    private void mnPelangganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnPelangganActionPerformed

    }//GEN-LAST:event_mnPelangganActionPerformed

    private void mnPemilikMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnPemilikMousePressed
        dispose();
        pemilik milik = new pemilik();
        milik.componentDidUpdate(roleUser, userName);
        milik.setVisible(true);
    }//GEN-LAST:event_mnPemilikMousePressed

    private void mnPemilikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnPemilikActionPerformed

    }//GEN-LAST:event_mnPemilikActionPerformed

    private void jMenu7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu7MousePressed

    }//GEN-LAST:event_jMenu7MousePressed

    private void jMenu7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu7ActionPerformed

    }//GEN-LAST:event_jMenu7ActionPerformed

    private void jMenu8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu8MousePressed

    }//GEN-LAST:event_jMenu8MousePressed

    private void jMenu8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu8ActionPerformed

    }//GEN-LAST:event_jMenu8ActionPerformed

    private void jMenu9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu9MousePressed
//        dispose();
//        new fLogin().setVisible(true);
    }//GEN-LAST:event_jMenu9MousePressed

    private void jMenu9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu9ActionPerformed

    }//GEN-LAST:event_jMenu9ActionPerformed

    private void label2ComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_label2ComponentAdded

    }//GEN-LAST:event_label2ComponentAdded

    private void label2ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_label2ComponentShown

    }//GEN-LAST:event_label2ComponentShown

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        if (this.roleUser.equals("Karyawan")) {
            jMenu7.setEnabled(false);
            jMenu8.setEnabled(false);
        }
    }//GEN-LAST:event_formWindowOpened

    private void jMenuBar1ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jMenuBar1ComponentShown

    }//GEN-LAST:event_jMenuBar1ComponentShown

    private void jMenuBar1ComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jMenuBar1ComponentAdded

    }//GEN-LAST:event_jMenuBar1ComponentAdded

    private void jMenu7MenuKeyPressed(javax.swing.event.MenuKeyEvent evt) {//GEN-FIRST:event_jMenu7MenuKeyPressed

    }//GEN-LAST:event_jMenu7MenuKeyPressed

    private void jMenu7MenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jMenu7MenuSelected
        dispose();
        karyawan karyaw = new karyawan();
        karyaw.componentDidUpdate(roleUser, userName);
        karyaw.setVisible(true);
    }//GEN-LAST:event_jMenu7MenuSelected

    private void jMenu8MenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jMenu8MenuSelected
        dispose();
        users use = new users();
        use.componentDidUpdate(roleUser, userName);
        use.setVisible(true);
    }//GEN-LAST:event_jMenu8MenuSelected

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        dispose();
        new fLogin().setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

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
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem4;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JLabel label2;
    private javax.swing.JMenu mnKendaraan;
    private javax.swing.JMenuItem mnMerek;
    private javax.swing.JMenu mnPelanggan;
    private javax.swing.JMenu mnPemilik;
    private javax.swing.JMenu mnSopir;
    private javax.swing.JMenuItem mnTipe;
    private javax.swing.JMenu mnTransaksi;
    private javax.swing.JLabel roleLabel;
    // End of variables declaration//GEN-END:variables

    public void componentDidUpdate(String role, String usern) {
        roleLabel.setText(role);
        jMenu9.setText("Selamat datang  " + usern);
        changeString(role, usern);
    }

    private String changeString(String s, String u) {
        this.userName = u;
        return this.roleUser = s;
    }

}

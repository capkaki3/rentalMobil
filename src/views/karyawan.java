/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.awt.event.KeyEvent;
import koneksi.koneksi;

/**
 *
 * @author Rahmad Al Habib Khasari <rahmadalhabib89@gmail.com>
 */
public class karyawan extends javax.swing.JFrame {
    public String roleUser = "";
    public String userName = "";
    private Connection conn = new koneksi().connect();
    private DefaultTableModel tabmode;

    /**
     * Creates new form karyawan
     */
    public karyawan() {
        initComponents();
        kosong();
        aktif();
        datatable();
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
        jLabel2 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtnm = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtalamat = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        txttelp = new javax.swing.JTextField();
        kButton1 = new keeptoo.KButton();
        kButton2 = new keeptoo.KButton();
        kButton3 = new keeptoo.KButton();
        kButton4 = new keeptoo.KButton();
        kButton6 = new keeptoo.KButton();
        txtcari = new javax.swing.JTextField();
        kButton5 = new keeptoo.KButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblplgn = new javax.swing.JTable();
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
        setTitle("Karyawan");
        setPreferredSize(new java.awt.Dimension(750, 700));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        kGradientPanel1.setkEndColor(new java.awt.Color(34, 167, 240));
        kGradientPanel1.setkStartColor(new java.awt.Color(83, 51, 237));
        kGradientPanel1.setPreferredSize(new java.awt.Dimension(750, 704));

        jLabel1.setFont(new java.awt.Font("Ubuntu", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(233, 226, 226));
        jLabel1.setText("Data Karyawan");

        jLabel2.setForeground(new java.awt.Color(41, 26, 26));
        jLabel2.setText("NIK");

        txtid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidActionPerformed(evt);
            }
        });

        jLabel3.setText("Nama");

        txtnm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnmActionPerformed(evt);
            }
        });

        jLabel6.setText("Alamat");

        txtalamat.setColumns(20);
        txtalamat.setRows(5);
        jScrollPane1.setViewportView(txtalamat);

        jLabel5.setText("No Telepon");

        kButton1.setText("Simpan");
        kButton1.setkEndColor(new java.awt.Color(46, 204, 113));
        kButton1.setkForeGround(new java.awt.Color(0, 0, 0));
        kButton1.setkHoverColor(new java.awt.Color(0, 0, 0));
        kButton1.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton1.setkHoverStartColor(new java.awt.Color(30, 130, 76));
        kButton1.setkIndicatorColor(new java.awt.Color(0, 0, 0));
        kButton1.setkSelectedColor(new java.awt.Color(46, 204, 113));
        kButton1.setkStartColor(new java.awt.Color(0, 230, 64));
        kButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton1ActionPerformed(evt);
            }
        });

        kButton2.setText("Ubah");
        kButton2.setkEndColor(new java.awt.Color(46, 204, 113));
        kButton2.setkForeGround(new java.awt.Color(0, 0, 0));

        kButton2.setkHoverColor(new java.awt.Color(0, 0, 0));

        kButton2.setkHoverForeGround(new java.awt.Color(255, 255, 255));

        kButton2.setkHoverStartColor(new java.awt.Color(30, 130, 76));

        kButton2.setkIndicatorColor(new java.awt.Color(0, 0, 0));

        kButton2.setkSelectedColor(new java.awt.Color(46, 204, 113));

        kButton2.setkStartColor(new java.awt.Color(0, 230, 64));
        kButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton2ActionPerformed(evt);
            }
        });

        kButton3.setText("Hapus");
        kButton3.setkEndColor(new java.awt.Color(46, 204, 113));

        kButton3.setkForeGround(new java.awt.Color(0, 0, 0));

        kButton3.setkHoverColor(new java.awt.Color(0, 0, 0));

        kButton3.setkHoverForeGround(new java.awt.Color(255, 255, 255));

        kButton3.setkHoverStartColor(new java.awt.Color(30, 130, 76));

        kButton3.setkIndicatorColor(new java.awt.Color(0, 0, 0));

        kButton3.setkSelectedColor(new java.awt.Color(46, 204, 113));

        kButton3.setkStartColor(new java.awt.Color(0, 230, 64));
        kButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton3ActionPerformed(evt);
            }
        });

        kButton4.setText("Batal");
        kButton4.setkEndColor(new java.awt.Color(46, 204, 113));

        kButton4.setkForeGround(new java.awt.Color(0, 0, 0));

        kButton4.setkHoverColor(new java.awt.Color(0, 0, 0));

        kButton4.setkHoverForeGround(new java.awt.Color(255, 255, 255));

        kButton4.setkHoverStartColor(new java.awt.Color(30, 130, 76));

        kButton4.setkIndicatorColor(new java.awt.Color(0, 0, 0));

        kButton4.setkSelectedColor(new java.awt.Color(46, 204, 113));

        kButton4.setkStartColor(new java.awt.Color(0, 230, 64));
        kButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton4ActionPerformed(evt);
            }
        });

        kButton6.setText("Keluar");
        kButton6.setkEndColor(new java.awt.Color(46, 204, 113));

        kButton6.setkForeGround(new java.awt.Color(0, 0, 0));

        kButton6.setkHoverColor(new java.awt.Color(0, 0, 0));

        kButton6.setkHoverForeGround(new java.awt.Color(255, 255, 255));

        kButton6.setkHoverStartColor(new java.awt.Color(30, 130, 76));

        kButton6.setkIndicatorColor(new java.awt.Color(0, 0, 0));

        kButton6.setkSelectedColor(new java.awt.Color(46, 204, 113));

        kButton6.setkStartColor(new java.awt.Color(0, 230, 64));
        kButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton6ActionPerformed(evt);
            }
        });

        txtcari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcariKeyPressed(evt);
            }
        });

        kButton5.setText("Cari");
        kButton5.setkEndColor(new java.awt.Color(46, 204, 113));

        kButton5.setkForeGround(new java.awt.Color(0, 0, 0));

        kButton5.setkHoverColor(new java.awt.Color(0, 0, 0));

        kButton5.setkHoverForeGround(new java.awt.Color(255, 255, 255));

        kButton5.setkHoverStartColor(new java.awt.Color(30, 130, 76));

        kButton5.setkIndicatorColor(new java.awt.Color(0, 0, 0));

        kButton5.setkSelectedColor(new java.awt.Color(46, 204, 113));

        kButton5.setkStartColor(new java.awt.Color(0, 230, 64));
        kButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton5ActionPerformed(evt);
            }
        });

        tblplgn.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblplgn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblplgnMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblplgn);

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6))
                        .addGap(33, 33, 33)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE)
                            .addComponent(txtnm)
                            .addComponent(txtid)))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addComponent(txtcari, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(kButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txttelp))
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(kButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(kButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(kButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(kButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(kButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(93, 93, 93))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 614, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(242, 242, 242))))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txttelp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
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
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 696, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidActionPerformed

    private void txtnmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnmActionPerformed

    private void kButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton1ActionPerformed
        String sql = "insert into karyawan values (?,?,?,?)";
        try {
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, txtid.getText());
            stat.setString(2, txtnm.getText());
            stat.setString(3, txtalamat.getText());
            stat.setString(4, txttelp.getText());
            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "data berhasil disimpan");
            kosong();
            txtid.requestFocus();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "data gagal disimpan" + e);
        }
        datatable();
    }//GEN-LAST:event_kButton1ActionPerformed

    private void kButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton2ActionPerformed
        txtid.setEditable(true);
        try {
            String sql = "update karyawan set nama=?,alamat=?,noTelp=? where nik ='" + txtid.getText() + "'  ";

            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, txtnm.getText());
            stat.setString(2, txtalamat.getText());
            stat.setString(3, txttelp.getText());
            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "data berhasil diubah");
            kosong();
            txtid.requestFocus();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "data gagal diubah" + e);
        }
        datatable();
    }//GEN-LAST:event_kButton2ActionPerformed

    private void kButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton3ActionPerformed
        int ok = JOptionPane.showConfirmDialog(null, "hapus", "konfirmasi dialog ", JOptionPane.YES_NO_OPTION);
        if (ok == 0) {
            String sql = "delete from karyawan where nik ='" + txtid.getText() + "'";
            try {
                PreparedStatement stat = conn.prepareStatement(sql);
                stat.executeUpdate();
                JOptionPane.showMessageDialog(null, "data berhasil dihapus");
                kosong();
                txtid.requestFocus();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "data gagal dihapus" + e);
            }
            datatable();
        }
    }//GEN-LAST:event_kButton3ActionPerformed

    private void kButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton4ActionPerformed
        kosong();
        datatable();
    }//GEN-LAST:event_kButton4ActionPerformed

    private void kButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton6ActionPerformed
        dispose();
    }//GEN-LAST:event_kButton6ActionPerformed

    private void txtcariKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcariKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            datatable();
        }
    }//GEN-LAST:event_txtcariKeyPressed

    private void kButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton5ActionPerformed
        datatable();
    }//GEN-LAST:event_kButton5ActionPerformed

    private void tblplgnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblplgnMouseClicked
        int bar = tblplgn.getSelectedRow();
        String a = tabmode.getValueAt(bar, 0).toString();
        String b = tabmode.getValueAt(bar, 1).toString();
        String c = tabmode.getValueAt(bar, 2).toString();
        String d = tabmode.getValueAt(bar, 3).toString();
        txtid.setEditable(false);
        txtid.setText(a);
        txtnm.setText(b);
        txtalamat.setText(c);
        txttelp.setText(d);
    }//GEN-LAST:event_tblplgnMouseClicked

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

    private void jMenu7MenuKeyPressed(javax.swing.event.MenuKeyEvent evt) {//GEN-FIRST:event_jMenu7MenuKeyPressed

    }//GEN-LAST:event_jMenu7MenuKeyPressed

    private void jMenu7MenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jMenu7MenuSelected
        dispose();
        karyawan karyaw = new karyawan();
        karyaw.componentDidUpdate(roleUser, userName);
        karyaw.setVisible(true);
    }//GEN-LAST:event_jMenu7MenuSelected

    private void jMenu7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu7MousePressed

    }//GEN-LAST:event_jMenu7MousePressed

    private void jMenu7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu7ActionPerformed

    }//GEN-LAST:event_jMenu7ActionPerformed

    private void jMenu8MenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jMenu8MenuSelected
        dispose();
        users use = new users();
        use.componentDidUpdate(roleUser, userName);
        use.setVisible(true);
    }//GEN-LAST:event_jMenu8MenuSelected

    private void jMenu8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu8MousePressed

    }//GEN-LAST:event_jMenu8MousePressed

    private void jMenu8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu8ActionPerformed

    }//GEN-LAST:event_jMenu8ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        dispose();
        new fLogin().setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenu9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu9MousePressed
        //        dispose();
        //        new fLogin().setVisible(true);
    }//GEN-LAST:event_jMenu9MousePressed

    private void jMenu9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu9ActionPerformed

    }//GEN-LAST:event_jMenu9ActionPerformed

    private void jMenuBar1ComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jMenuBar1ComponentAdded

    }//GEN-LAST:event_jMenuBar1ComponentAdded

    private void jMenuBar1ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jMenuBar1ComponentShown

    }//GEN-LAST:event_jMenuBar1ComponentShown

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       if (this.roleUser.equals("Karyawan")) {
            jMenu7.setEnabled(false);
            jMenu8.setEnabled(false);
        }
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(karyawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(karyawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(karyawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(karyawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new karyawan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private keeptoo.KButton kButton1;
    private keeptoo.KButton kButton2;
    private keeptoo.KButton kButton3;
    private keeptoo.KButton kButton4;
    private keeptoo.KButton kButton5;
    private keeptoo.KButton kButton6;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JMenu mnKendaraan;
    private javax.swing.JMenuItem mnMerek;
    private javax.swing.JMenu mnPelanggan;
    private javax.swing.JMenu mnPemilik;
    private javax.swing.JMenu mnSopir;
    private javax.swing.JMenuItem mnTipe;
    private javax.swing.JMenu mnTransaksi;
    private javax.swing.JTable tblplgn;
    private javax.swing.JTextArea txtalamat;
    private javax.swing.JTextField txtcari;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtnm;
    private javax.swing.JTextField txttelp;
    // End of variables declaration//GEN-END:variables

    private void kosong() {
        txtid.setText("");
        txtnm.setText("");
        txttelp.setText("");
        txtalamat.setText("");
        txtcari.setText("");
    }

    private void aktif() {
        txtid.requestFocus();
    }

    private void datatable() {
        Object[] Baris = {"No KTP", "Nama", "Alamat", "No. Telepon"};
        tabmode = new DefaultTableModel(null, Baris);
        String cariitem = txtcari.getText();
        try {
            String sql = "SELECT * FROM karyawan where nik like '%" + cariitem + "%' or nama like '%" + cariitem + "%' order by nik asc ";
            Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while (hasil.next()) {
                tabmode.addRow(new Object[]{
                    hasil.getString(1),
                    hasil.getString(2),
                    hasil.getString(3),
                    hasil.getString(4)
                });
            }
            tblplgn.setModel(tabmode);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "data gagal dipanggil" + e);
        }
    }
    
    public void componentDidUpdate(String role, String usern) {
        jMenu9.setText("        Hi, "+usern);
        changeString(role,usern);
    }

    private String changeString(String s,String u) {
        this.userName = u;
        return this.roleUser = s;
    }
}

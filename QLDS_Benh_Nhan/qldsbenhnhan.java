package phauhoang;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class qldsbenhnhan extends javax.swing.JFrame {

    Vector bn = new Vector();
    Vector databn = new Vector();

    public qldsbenhnhan() {
        initComponents();
        setLocationRelativeTo(null);

        bn.add("Mã bệnh nhân");
        bn.add("Tên bệnh nhân");
        bn.add("Địa chỉ");
        bn.add("Điện thoại");
        bn.add("Giới tính");
        bn.add("Ngày sinh");
        bn.add("Bảo hiểm y tế");

        bn.add("Mã bệnh án");
        bn.add("Tên bệnh án");
        bn.add("Khoa");
        bn.add("Phòng");
        bn.add("Ngày vào");
        bn.add("Ngày ra");
        bn.add("Viện phí");

        jTable1.setModel(new DefaultTableModel(databn, bn));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtDiaChi = new javax.swing.JTextField();
        txtDienThoai = new javax.swing.JTextField();
        txtTenBN = new javax.swing.JTextField();
        txtMaBN = new javax.swing.JTextField();
        txtGioiTinh = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtTenBA = new javax.swing.JTextField();
        txtMaBA = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtKhoa = new javax.swing.JTextField();
        txtPhong = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        options = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        txtVienPhi = new javax.swing.JTextField();
        txtNgaySinh = new javax.swing.JTextField();
        txtBHYT = new javax.swing.JTextField();
        txtNgayRa = new javax.swing.JTextField();
        txtNgayVao = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();

        jMenu1.setText("File");
        jMenuBar2.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar2.add(jMenu2);

        jMenu3.setText("File");
        jMenuBar3.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar3.add(jMenu4);

        jMenu5.setText("jMenu5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("QUẢN LÝ DANH SÁCH BỆNH NHÂN");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Mã bệnh nhân");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Tên bệnh nhân");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Địa chỉ");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Điện thoại");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Giới tính");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Ngày sinh");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Bảo hiểm y tế");

        txtDiaChi.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtDiaChi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiaChiActionPerformed(evt);
            }
        });

        txtDienThoai.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txtTenBN.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txtMaBN.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtMaBN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaBNActionPerformed(evt);
            }
        });

        txtGioiTinh.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setText("Mã bệnh án");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setText("Tên bệnh án");

        txtTenBA.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtTenBA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenBAActionPerformed(evt);
            }
        });

        txtMaBA.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel11.setText("Ngày vào");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel12.setText("Ngày ra");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel13.setText("Phòng");

        txtKhoa.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txtPhong.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhongActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel14.setText("Khoa");

        options.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        options.setMaximumRowCount(10);
        options.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1. Tổng số tiền viện phí thu được trong quý 1/2021", "2. Danh sách bệnh nhân nam 30 tuổi nằm viện trong quý 1/2021", "3. Danh sách các bệnh nhi dưới 10 tuổi nằm viện trong quý 1/2021", "4. Danh sách bệnh nhi đang điều trị tại Khoa Nhi" }));
        options.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionsActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton2.setText("Chọn");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("Hãy chọn yêu cầu dưới đây: ");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N
        jLabel16.setText("HỒ SƠ NHẬP LIỆU THÔNG TIN CÁ NHÂN");

        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton3.setText("Thêm");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel17.setText("Viện phí");

        txtVienPhi.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtVienPhi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVienPhiActionPerformed(evt);
            }
        });

        txtNgaySinh.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txtBHYT.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txtNgayRa.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtNgayRa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNgayRaActionPerformed(evt);
            }
        });

        txtNgayVao.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtNgayVao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNgayVaoActionPerformed(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã bệnh nhân", "Tên bệnh nhân", "Địa chỉ", "Điện thoại", "Giới tính", "Ngày sinh", "Bảo hiểm y tế", "Mã bệnh án", "Tên bệnh án", "Khoa", "Phòng", "Ngày vào", "Ngày ra", "Viện phí"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setRowHeight(30);
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(12).setResizable(false);
        }

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1652, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 721, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addGap(9, 9, 9))
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel6))
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtTenBN, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtDiaChi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtMaBN, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtGioiTinh, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNgaySinh, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(txtBHYT, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtNgayRa, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel14)
                                                .addComponent(jLabel13))
                                            .addGap(45, 45, 45))
                                        .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel17))
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtKhoa)
                                    .addComponent(txtTenBA)
                                    .addComponent(txtPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMaBA, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtVienPhi)
                                    .addComponent(txtNgayVao, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(71, 71, 71)
                                        .addComponent(jLabel8))
                                    .addComponent(options, javax.swing.GroupLayout.PREFERRED_SIZE, 704, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMaBN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTenBN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel9)
                                        .addComponent(txtMaBA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel10)
                                        .addComponent(txtTenBA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(options, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton2))))
                            .addGap(15, 15, 15)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel14)
                                .addComponent(txtKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel13)
                                .addComponent(txtPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel11)
                                .addComponent(txtNgayVao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(24, 24, 24)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel12)
                                .addComponent(txtNgayRa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel17)
                                .addComponent(txtVienPhi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton3)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtBHYT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(39, 39, 39)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTenBAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenBAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenBAActionPerformed

    private void txtPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhongActionPerformed

    private void txtMaBNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaBNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaBNActionPerformed

    public void resetForm() {
        txtTenBN.setText("");
        txtMaBN.setText("");
        txtDiaChi.setText("");
        txtDienThoai.setText("");
        txtGioiTinh.setText("");
        txtNgaySinh.setText("");
        txtBHYT.setText("");

        txtTenBA.setText("");
        txtMaBA.setText("");
        txtKhoa.setText("");
        txtPhong.setText("");
        txtNgayVao.setText("");
        txtNgayRa.setText("");
        txtVienPhi.setText("");
    }

    public boolean checkValidateForm() {
        if (txtMaBN.getText().isEmpty() || txtTenBN.getText().isEmpty()
                || txtKhoa.getText().isEmpty() || txtGioiTinh.getText().isEmpty()
                || txtDienThoai.getText().isEmpty() || txtMaBA.getText().isEmpty()
                || txtPhong.getText().isEmpty() || txtTenBA.getText().isEmpty()
                || txtVienPhi.getText().isEmpty() || txtNgayRa.getText().isEmpty()
                || txtBHYT.getText().isEmpty() || txtNgayVao.getText().isEmpty()
                || txtNgaySinh.getText().isEmpty() || txtDiaChi.getText().isEmpty()) {
            return false;
        }
        return true;
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:

        String mabn = txtMaBN.getText();
        String tenbn = txtTenBN.getText();
        String diachi = txtDiaChi.getText();
        String dienthoai = txtDienThoai.getText();
        String gioitinh = txtGioiTinh.getText();
        String ngaysinh = txtNgaySinh.getText();
        String bhyt = txtBHYT.getText();

        String maba = txtMaBA.getText();
        String tenba = txtTenBA.getText();
        String khoa = txtKhoa.getText();
        String ngayvao = txtNgayVao.getText();
        String ngayra = txtNgayRa.getText();

        Vector add = new Vector();
        add.add(mabn);
        add.add(tenbn);
        add.add(diachi);
        add.add(dienthoai);
        add.add(gioitinh);
        add.add(ngaysinh);
        add.add(bhyt);

        add.add(maba);
        add.add(tenba);
        add.add(khoa);

        int phong = Integer.parseInt(txtPhong.getText());
        add.add(phong);

        add.add(ngayvao);
        add.add(ngayra);

        int vienphi = Integer.parseInt(txtVienPhi.getText());
        add.add(vienphi);

        databn.add(add);
        jTable1.setModel(new DefaultTableModel(databn, bn));

        JOptionPane.showMessageDialog(this, "Bạn đã thêm thành công!");
        resetForm();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtDiaChiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiaChiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiaChiActionPerformed

    private void optionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optionsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_optionsActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String selectedOption = (String) options.getSelectedItem();

        if (selectedOption.startsWith("1. Tổng số tiền viện phí thu được trong quý 1/2021")) {
            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
            Date startDate = null, endDate = null;

            try {
                startDate = format.parse("01/01/2021");
                endDate = format.parse("31/03/2021");
            } catch (ParseException ex) {
                // xử lý khi parse ngày thất bại
            }
            int sumTien2 = 0;
            for (int i = 0; i < databn.size(); i++) {
                Vector benhNhan = (Vector) databn.get(i);
                String ngayBN = (String) benhNhan.get(11);
                Date ngayBenhNhan;
                try {
                    ngayBenhNhan = format.parse(ngayBN);
                } catch (ParseException ex) {
                    // xử lý khi parse ngày thất bại
                    continue;
                }
                if (ngayBenhNhan.after(startDate) && ngayBenhNhan.before(endDate)) {
                    int tongTien = (int) benhNhan.get(13);
                    sumTien2 += tongTien;
                }
            }
            String message1 = "THÔNG BÁO:\n"
                    + "Tổng tiền =  " + sumTien2 + "\n";
            JOptionPane.showMessageDialog(this, message1);
        }
        //------------------------
        if (selectedOption.startsWith("2. Danh sách bệnh nhân nam 30 tuổi nằm viện trong quý 1/2021")) {
            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
            Date startDate = null, endDate = null;

            try {
                startDate = format.parse("01/01/2021");
                endDate = format.parse("31/03/2021");
            } catch (ParseException ex) {
                // xử lý khi parse ngày thất bại
            }
            String[] columnNames = {"Mã bệnh nhân", "Tên bệnh nhân", "Địa chỉ", "Điện thoại", "Giới tính", "Ngày sinh", "Bảo hiểm y tế", "Mã bệnh án", "Tên bệnh án", "Khoa", "Phòng", "Ngày vào", "Ngày ra", "Viện phí"};
            DefaultTableModel model = new DefaultTableModel(columnNames, 0);
            for (int i = 0; i < databn.size(); i++) {
                Vector benhNhan = (Vector) databn.get(i);
                String ngayBN = (String) benhNhan.get(11);
                Date ngayBenhNhan;
                try {
                    ngayBenhNhan = format.parse(ngayBN);
                } catch (ParseException ex) {
                    // xử lý khi parse ngày thất bại
                    continue;
                }
                if (ngayBenhNhan.after(startDate) && ngayBenhNhan.before(endDate)) {
                    String gioitinh = (String) benhNhan.get(4);
                    if (gioitinh.equals("Nam")) {
                        String tuoi = (String) benhNhan.get(5);
                        Date date = null;
                        try {
                            date = format.parse(tuoi);
                        } catch (ParseException ex) {
                            // xử lý khi parse ngày thất bại
                        }
                        Calendar calendar = Calendar.getInstance();
                        calendar.setTime(date);
                        int year = calendar.get(Calendar.YEAR);
                        if (2023 - year == 30) {
                            Object[] row = {benhNhan.get(0), benhNhan.get(1), benhNhan.get(2), benhNhan.get(3), benhNhan.get(4), benhNhan.get(5), benhNhan.get(6), benhNhan.get(7), benhNhan.get(8), benhNhan.get(9), benhNhan.get(10), benhNhan.get(11), benhNhan.get(12), benhNhan.get(13)};
                            model.addRow(row);
                        }
                    }
                }
            }
            // Hiển thị danh sách bệnh nhân lên một bảng
            JTable table = new JTable(model);
            JScrollPane scrollPane = new JScrollPane(table);
            JFrame frame = new JFrame("Danh sách");
            frame.setSize(1500, 300);
            // Lấy kích thước của màn hình
            Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
            // Tính toán tọa độ x, y để JFrame nằm ở giữa màn hình
            int x = (int) ((screenSize.getWidth() - frame.getWidth()) / 2);
            int y = (int) ((screenSize.getHeight() - frame.getHeight()) / 2);
            // Đặt tọa độ cho JFrame mới
            frame.setLocation(x, y);
            frame.setVisible(true);
            frame.add(scrollPane);
        }
        //-----------------------------
        if (selectedOption.startsWith("3. Danh sách các bệnh nhi dưới 10 tuổi nằm viện trong quý 1/2021")) {
            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
            Date startDate = null, endDate = null;

            try {
                startDate = format.parse("01/01/2021");
                endDate = format.parse("31/03/2021");
            } catch (ParseException ex) {
                // xử lý khi parse ngày thất bại
            }
            String[] columnNames = {"Mã bệnh nhân", "Tên bệnh nhân", "Địa chỉ", "Điện thoại", "Giới tính", "Ngày sinh", "Bảo hiểm y tế", "Mã bệnh án", "Tên bệnh án", "Khoa", "Phòng", "Ngày vào", "Ngày ra", "Viện phí"};
            DefaultTableModel model = new DefaultTableModel(columnNames, 0);
            for (int i = 0; i < databn.size(); i++) {
                Vector benhNhan = (Vector) databn.get(i);
                String ngayBN = (String) benhNhan.get(11);
                Date ngayBenhNhan;
                try {
                    ngayBenhNhan = format.parse(ngayBN);
                } catch (ParseException ex) {
                    // xử lý khi parse ngày thất bại
                    continue;
                }
                if (ngayBenhNhan.after(startDate) && ngayBenhNhan.before(endDate)) {
                    String tuoi = (String) benhNhan.get(5);
                    Date date = null;
                    try {
                        date = format.parse(tuoi);
                    } catch (ParseException ex) {
                        // xử lý khi parse ngày thất bại
                    }
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTime(date);
                    int year = calendar.get(Calendar.YEAR);
                    if (2023 - year < 10) {
                        Object[] row = {benhNhan.get(0), benhNhan.get(1), benhNhan.get(2), benhNhan.get(3), benhNhan.get(4), benhNhan.get(5), benhNhan.get(6), benhNhan.get(7), benhNhan.get(8), benhNhan.get(9), benhNhan.get(10), benhNhan.get(11), benhNhan.get(12), benhNhan.get(13)};
                        model.addRow(row);
                    }
                }
            }
            // Hiển thị danh sách bệnh nhân lên một bảng
            JTable table = new JTable(model);
            JScrollPane scrollPane = new JScrollPane(table);
            JFrame frame = new JFrame("Danh sách");
            frame.setSize(1500, 300);
            // Lấy kích thước của màn hình
            Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
            // Tính toán tọa độ x, y để JFrame nằm ở giữa màn hình
            int x = (int) ((screenSize.getWidth() - frame.getWidth()) / 2);
            int y = (int) ((screenSize.getHeight() - frame.getHeight()) / 2);
            // Đặt tọa độ cho JFrame mới
            frame.setLocation(x, y);
            frame.setVisible(true);
            frame.add(scrollPane);
        }
        //---------------------------------------
        if (selectedOption.startsWith("4. Danh sách bệnh nhi đang điều trị tại Khoa Nhi")) {
            String[] columnNames = {"Mã bệnh nhân", "Tên bệnh nhân", "Địa chỉ", "Điện thoại", "Giới tính", "Ngày sinh", "Bảo hiểm y tế", "Mã bệnh án", "Tên bệnh án", "Khoa", "Phòng", "Ngày vào", "Ngày ra", "Viện phí"};
            DefaultTableModel model = new DefaultTableModel(columnNames, 0);
            for (int i = 0; i < databn.size(); i++) {
                Vector benhNhan = (Vector) databn.get(i);
                String khoa = (String) benhNhan.get(9);
                if (khoa.equals("Nhi")) {
                    Object[] row = {benhNhan.get(0), benhNhan.get(1), benhNhan.get(2), benhNhan.get(3), benhNhan.get(4), benhNhan.get(5), benhNhan.get(6), benhNhan.get(7), benhNhan.get(8), benhNhan.get(9), benhNhan.get(10), benhNhan.get(11), benhNhan.get(12), benhNhan.get(13)};
                    model.addRow(row);
                }
            }
            // Hiển thị danh sách bệnh nhân lên một bảng
            JTable table = new JTable(model);
            JScrollPane scrollPane = new JScrollPane(table);
            JFrame frame = new JFrame("Danh sách");
            frame.setSize(1500, 300);
            // Lấy kích thước của màn hình
            Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
            // Tính toán tọa độ x, y để JFrame nằm ở giữa màn hình
            int x = (int) ((screenSize.getWidth() - frame.getWidth()) / 2);
            int y = (int) ((screenSize.getHeight() - frame.getHeight()) / 2);
            // Đặt tọa độ cho JFrame mới
            frame.setLocation(x, y);
            frame.setVisible(true);
            frame.add(scrollPane);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtVienPhiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVienPhiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVienPhiActionPerformed

    private void txtNgayRaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNgayRaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNgayRaActionPerformed

    private void txtNgayVaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNgayVaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNgayVaoActionPerformed

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
            java.util.logging.Logger.getLogger(qldsbenhnhan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(qldsbenhnhan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(qldsbenhnhan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(qldsbenhnhan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new qldsbenhnhan().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<String> options;
    private javax.swing.JTextField txtBHYT;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtDienThoai;
    private javax.swing.JTextField txtGioiTinh;
    private javax.swing.JTextField txtKhoa;
    private javax.swing.JTextField txtMaBA;
    private javax.swing.JTextField txtMaBN;
    private javax.swing.JTextField txtNgayRa;
    private javax.swing.JTextField txtNgaySinh;
    private javax.swing.JTextField txtNgayVao;
    private javax.swing.JTextField txtPhong;
    private javax.swing.JTextField txtTenBA;
    private javax.swing.JTextField txtTenBN;
    private javax.swing.JTextField txtVienPhi;
    // End of variables declaration//GEN-END:variables
}

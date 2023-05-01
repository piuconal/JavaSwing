package phauhoang;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class qldsbenhnhan extends javax.swing.JFrame {

    public qldsbenhnhan() {
        initComponents();
        setLocationRelativeTo(null);
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
        txtBHYT = new javax.swing.JTextField();
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
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        txtVienPhi = new javax.swing.JTextField();
        txtBHYT1 = new javax.swing.JTextField();
        txtBHYT2 = new javax.swing.JTextField();
        txtVienPhi1 = new javax.swing.JTextField();
        txtVienPhi2 = new javax.swing.JTextField();
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

        txtBHYT.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

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
        options.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1. Tổng số tiền viện phí thu được trong quý 1 năm 2021(từ 1/1/2021-31/3/2021)", "2. Danh sách bệnh nhân nam 30 tuổi nằm viện trong quý 1", "3. Danh sách các bênh nhi dưới 10 tuổi nằm viện trong quý 1/2021", "4. Danh sách bệnh nhi đang điều trị tại Khoa Nhi" }));
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

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/phauhoang/picture.png"))); // NOI18N

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

        txtBHYT1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txtBHYT2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txtVienPhi1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtVienPhi1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVienPhi1ActionPerformed(evt);
            }
        });

        txtVienPhi2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtVienPhi2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVienPhi2ActionPerformed(evt);
            }
        });
        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(31, 31, 31)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 721, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
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
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel3))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtTenBN, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtDiaChi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtMaBN, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtBHYT, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtBHYT1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(txtBHYT2, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 247, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                                .addComponent(txtVienPhi1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                                    .addComponent(txtKhoa, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                                    .addComponent(txtTenBA)
                                    .addComponent(txtPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMaBA, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtVienPhi)
                                    .addComponent(txtVienPhi2))))
                        .addGap(113, 113, 113))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(options, javax.swing.GroupLayout.PREFERRED_SIZE, 708, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jLabel8)))
                        .addContainerGap(342, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(542, 542, 542))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtMaBA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtTenBA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                            .addComponent(txtVienPhi2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txtVienPhi1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel17)
                                .addComponent(txtVienPhi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7)
                                .addComponent(txtBHYT2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                            .addComponent(txtBHYT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtBHYT1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addGap(9, 9, 9)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(options, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(137, 137, 137))
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
        txtBHYT.setText("");
        txtTenBA.setText("");
        txtMaBA.setText("");
        txtKhoa.setText("");
        txtPhong.setText("");
        txtVienPhi.setText("");
    }

    public boolean checkValidateForm() {
        if (txtMaBN.getText().isEmpty() || txtTenBN.getText().isEmpty() || txtDiaChi.getText().isEmpty()
                || txtKhoa.getText().isEmpty() || txtBHYT.getText().isEmpty()
                || txtDienThoai.getText().isEmpty() || txtMaBA.getText().isEmpty()
                || txtPhong.getText().isEmpty() || txtTenBA.getText().isEmpty() || txtVienPhi.getText().isEmpty()) {
            return false;
        }
        return true;
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        if (!checkValidateForm()) {
            JOptionPane.showMessageDialog(this, "Bạn chưa điền đủ thông tin");
        }
        if (checkValidateForm()) {
            JOptionPane.showMessageDialog(this, "Bạn đã thêm thành công!");
            resetForm();
        }
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

        if (selectedOption.startsWith("1. Tổng số tiền viện phí thu được trong quý 1 năm 2021")) {
            // Tạo một JFrame mới
            JFrame newFrame = new JFrame("1. Tổng số tiền viện phí thu được trong quý 1 năm 2021(từ 1/1/2021-31/3/2021)");
            // Cấu hình kích thước của JFrame mới
            newFrame.setSize(800, 120);
            // Lấy kích thước của màn hình
            Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
            // Tính toán tọa độ x, y để JFrame nằm ở giữa màn hình
            int x = (int) ((screenSize.getWidth() - newFrame.getWidth()) / 2);
            int y = (int) ((screenSize.getHeight() - newFrame.getHeight()) / 2);
            // Đặt tọa độ cho JFrame mới
            newFrame.setLocation(x, y);
            // Hiển thị JFrame mới
            newFrame.setVisible(true);
            setLocationRelativeTo(null);

            //Câu 1-----------------------------------------------
            // Tạo một bảng (JTable) mới
            String[] columnNames = {"Tổng tiền (đơn vị: nghìn đồng)"};
            Object[][] data = {
                {"1020000"},};
            JTable table = new JTable(data, columnNames);

            // Tạo một đối tượng JScrollPane để bọc JTable
            JScrollPane scrollPane = new JScrollPane(table);

            // Thêm JScrollPane vào JFrame mới
            newFrame.getContentPane().add(scrollPane);

        }
        //------------------------
        if (selectedOption.startsWith("2. Danh sách bệnh nhân nam 30 tuổi nằm viện trong quý 1")) {
            // Tạo một JFrame mới
            JFrame newFrame = new JFrame("2. Danh sách bệnh nhân nam 30 tuổi nằm viện trong quý 1");
            // Cấu hình kích thước của JFrame mới
            newFrame.setSize(1600, 400);
            // Lấy kích thước của màn hình
            Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
            // Tính toán tọa độ x, y để JFrame nằm ở giữa màn hình
            int x = (int) ((screenSize.getWidth() - newFrame.getWidth()) / 2);
            int y = (int) ((screenSize.getHeight() - newFrame.getHeight()) / 2);
            // Đặt tọa độ cho JFrame mới
            newFrame.setLocation(x, y);
            // Hiển thị JFrame mới
            newFrame.setVisible(true);
            setLocationRelativeTo(null);

            //Câu 1-----------------------------------------------
            // Tạo một bảng (JTable) mới
            String[] columnNames = {"Mã bệnh nhân", "Tên bệnh nhân", "Địa chỉ", "Giới tính", "Điện thoại", "Ngày sinh", "Bảo hiểm y tế", "Mã bệnh án", "Tên bệnh án", "Phòng", "Khoa", "Ngày vào", "Ngày ra", "Viện phí"};
            Object[][] data = {
                {"BN123", "Mai Văn Hoàng", "Hà Nội", "Nam", "09711106020", "11/06/1993", "123456789", "BA123", "Viêm họng", "103", "Tai-Mũi-Họng", "12/03/2023", "15/03/2023", "500000"},};
            JTable table = new JTable(data, columnNames);

            // Tạo một đối tượng JScrollPane để bọc JTable
            JScrollPane scrollPane = new JScrollPane(table);

            // Thêm JScrollPane vào JFrame mới
            newFrame.getContentPane().add(scrollPane);
        }
        //-----------------------------
        if (selectedOption.startsWith("3. Danh sách các bênh nhi dưới 10 tuổi nằm viện trong")) {
            // Tạo một JFrame mới
            JFrame newFrame = new JFrame("3. Danh sách các bênh nhi dưới 10 tuổi nằm viện trong quý 1/2021");
            // Cấu hình kích thước của JFrame mới
            newFrame.setSize(1600, 400);
            // Lấy kích thước của màn hình
            Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
            // Tính toán tọa độ x, y để JFrame nằm ở giữa màn hình
            int x = (int) ((screenSize.getWidth() - newFrame.getWidth()) / 2);
            int y = (int) ((screenSize.getHeight() - newFrame.getHeight()) / 2);
            // Đặt tọa độ cho JFrame mới
            newFrame.setLocation(x, y);
            // Hiển thị JFrame mới
            newFrame.setVisible(true);
            setLocationRelativeTo(null);

            //Câu 1-----------------------------------------------
            // Tạo một bảng (JTable) mới
            String[] columnNames = {"Mã bệnh nhân", "Tên bệnh nhân", "Địa chỉ", "Giới tính", "Điện thoại", "Ngày sinh", "Bảo hiểm y tế", "Mã bệnh án", "Tên bệnh án", "Phòng", "Khoa", "Ngày vào", "Ngày ra", "Viện phí"};
            Object[][] data = {
                {"BN123", "Mai Văn Hoàng", "Hà Nội", "Nam", "09711106020", "11/06/2002", "321321654", "BA113", "Viêm họng", "103", "Tai-Mũi-Họng", "12/03/2023", "15/03/2023", "500000"},};
            JTable table = new JTable(data, columnNames);

            // Tạo một đối tượng JScrollPane để bọc JTable
            JScrollPane scrollPane = new JScrollPane(table);

            // Thêm JScrollPane vào JFrame mới
            newFrame.getContentPane().add(scrollPane);
        }
        //---------------------------------------
        if (selectedOption.startsWith("4. Danh sách bệnh nhi đang điều trị tại Khoa Nhi")) {
            // Tạo một JFrame mới
            JFrame newFrame = new JFrame("4. Danh sách bệnh nhi đang điều trị tại Khoa Nhi");
            // Cấu hình kích thước của JFrame mới
            newFrame.setSize(1600, 400);
            // Lấy kích thước của màn hình
            Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
            // Tính toán tọa độ x, y để JFrame nằm ở giữa màn hình
            int x = (int) ((screenSize.getWidth() - newFrame.getWidth()) / 2);
            int y = (int) ((screenSize.getHeight() - newFrame.getHeight()) / 2);
            // Đặt tọa độ cho JFrame mới
            newFrame.setLocation(x, y);
            // Hiển thị JFrame mới
            newFrame.setVisible(true);
            setLocationRelativeTo(null);

            //Câu 1-----------------------------------------------
            // Tạo một bảng (JTable) mới
            String[] columnNames = {"Mã bệnh nhân", "Tên bệnh nhân", "Địa chỉ", "Giới tính", "Điện thoại", "Ngày sinh", "Bảo hiểm y tế", "Mã bệnh án", "Tên bệnh án", "Phòng", "Khoa", "Ngày vào", "Ngày ra", "Viện phí"};
            Object[][] data = {
                {"BN123", "Mai Văn Hoàng", "Hà Nội", "Nam", "09711106020", "11/06/2002", "321321654", "BA113", "Viêm họng", "103", "Tai-Mũi-Họng", "12/03/2023", "15/03/2023", "500000"},};
            JTable table = new JTable(data, columnNames);

            // Tạo một đối tượng JScrollPane để bọc JTable
            JScrollPane scrollPane = new JScrollPane(table);

            // Thêm JScrollPane vào JFrame mới
            newFrame.getContentPane().add(scrollPane);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtVienPhiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVienPhiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVienPhiActionPerformed

    private void txtVienPhi1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVienPhi1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVienPhi1ActionPerformed

    private void txtVienPhi2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVienPhi2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVienPhi2ActionPerformed

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
    private javax.swing.JLabel jLabel15;
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
    private javax.swing.JComboBox<String> options;
    private javax.swing.JTextField txtBHYT;
    private javax.swing.JTextField txtBHYT1;
    private javax.swing.JTextField txtBHYT2;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtDienThoai;
    private javax.swing.JTextField txtKhoa;
    private javax.swing.JTextField txtMaBA;
    private javax.swing.JTextField txtMaBN;
    private javax.swing.JTextField txtPhong;
    private javax.swing.JTextField txtTenBA;
    private javax.swing.JTextField txtTenBN;
    private javax.swing.JTextField txtVienPhi;
    private javax.swing.JTextField txtVienPhi1;
    private javax.swing.JTextField txtVienPhi2;
    // End of variables declaration//GEN-END:variables
}

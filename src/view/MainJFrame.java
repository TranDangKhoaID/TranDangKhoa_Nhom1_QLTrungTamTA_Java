/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.DanhMucBean;
import controller.ChuyenManHinhController;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    public MainJFrame() {
        initComponents();
        
        setTitle("Quản lý trung tâm Anh Ngữ");
        ChuyenManHinhController controller = new ChuyenManHinhController(jPView);
        controller.setView(jPTrangChu, jlbTrangChu);
        
        List<DanhMucBean> list = new ArrayList();
        list.add(new DanhMucBean("TrangChu",jPTrangChu,jlbTrangChu));
        list.add(new DanhMucBean("HocVien",jPHocVien,jlbHocVien));
        list.add(new DanhMucBean("GiangVien",jPGiangVien,jlbGiangVien));
        list.add(new DanhMucBean("KhoaHoc",jPKhoaHoc,jlbKhoaHoc));
        list.add(new DanhMucBean("LopHoc",jPLopHoc,jlbLopHoc));
        list.add(new DanhMucBean("BaoCao",jPBaoCao,jlbBaoCao));
        list.add(new DanhMucBean("CaiDat",jPCaiDat,jlbCaiDat));
        
        controller.setEvent(list);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPRoot = new javax.swing.JPanel();
        jPMenu = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPTrangChu = new javax.swing.JPanel();
        jlbTrangChu = new javax.swing.JLabel();
        jPHocVien = new javax.swing.JPanel();
        jlbHocVien = new javax.swing.JLabel();
        jPGiangVien = new javax.swing.JPanel();
        jlbGiangVien = new javax.swing.JLabel();
        jPKhoaHoc = new javax.swing.JPanel();
        jlbKhoaHoc = new javax.swing.JLabel();
        jPLopHoc = new javax.swing.JPanel();
        jlbLopHoc = new javax.swing.JLabel();
        jPBaoCao = new javax.swing.JPanel();
        jlbBaoCao = new javax.swing.JLabel();
        jPCaiDat = new javax.swing.JPanel();
        jlbCaiDat = new javax.swing.JLabel();
        jPView = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 34, 68));

        jPRoot.setBackground(new java.awt.Color(255, 255, 255));

        jPMenu.setBackground(new java.awt.Color(0, 50, 99));

        jPanel3.setBackground(new java.awt.Color(0, 34, 68));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo_mini.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
        );

        jPTrangChu.setBackground(new java.awt.Color(0, 50, 99));
        jPTrangChu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jlbTrangChu.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jlbTrangChu.setForeground(new java.awt.Color(255, 255, 255));
        jlbTrangChu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbTrangChu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-home-page-24.png"))); // NOI18N
        jlbTrangChu.setText("Trang Chủ");

        javax.swing.GroupLayout jPTrangChuLayout = new javax.swing.GroupLayout(jPTrangChu);
        jPTrangChu.setLayout(jPTrangChuLayout);
        jPTrangChuLayout.setHorizontalGroup(
            jPTrangChuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPTrangChuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbTrangChu, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPTrangChuLayout.setVerticalGroup(
            jPTrangChuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPTrangChuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbTrangChu, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPHocVien.setBackground(new java.awt.Color(0, 50, 99));
        jPHocVien.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jlbHocVien.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jlbHocVien.setForeground(new java.awt.Color(255, 255, 255));
        jlbHocVien.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbHocVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-student-center-30.png"))); // NOI18N
        jlbHocVien.setText("Học Viên");

        javax.swing.GroupLayout jPHocVienLayout = new javax.swing.GroupLayout(jPHocVien);
        jPHocVien.setLayout(jPHocVienLayout);
        jPHocVienLayout.setHorizontalGroup(
            jPHocVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPHocVienLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbHocVien, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPHocVienLayout.setVerticalGroup(
            jPHocVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPHocVienLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbHocVien, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPGiangVien.setBackground(new java.awt.Color(0, 50, 99));
        jPGiangVien.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jlbGiangVien.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jlbGiangVien.setForeground(new java.awt.Color(255, 255, 255));
        jlbGiangVien.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbGiangVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-tuition-30.png"))); // NOI18N
        jlbGiangVien.setText("Giảng Viên");

        javax.swing.GroupLayout jPGiangVienLayout = new javax.swing.GroupLayout(jPGiangVien);
        jPGiangVien.setLayout(jPGiangVienLayout);
        jPGiangVienLayout.setHorizontalGroup(
            jPGiangVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPGiangVienLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbGiangVien, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPGiangVienLayout.setVerticalGroup(
            jPGiangVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPGiangVienLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbGiangVien, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPKhoaHoc.setBackground(new java.awt.Color(0, 50, 99));
        jPKhoaHoc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jlbKhoaHoc.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jlbKhoaHoc.setForeground(new java.awt.Color(255, 255, 255));
        jlbKhoaHoc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbKhoaHoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-calendar-30.png"))); // NOI18N
        jlbKhoaHoc.setText("Khóa Học");

        javax.swing.GroupLayout jPKhoaHocLayout = new javax.swing.GroupLayout(jPKhoaHoc);
        jPKhoaHoc.setLayout(jPKhoaHocLayout);
        jPKhoaHocLayout.setHorizontalGroup(
            jPKhoaHocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPKhoaHocLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbKhoaHoc, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPKhoaHocLayout.setVerticalGroup(
            jPKhoaHocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPKhoaHocLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbKhoaHoc, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPLopHoc.setBackground(new java.awt.Color(0, 50, 99));
        jPLopHoc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jlbLopHoc.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jlbLopHoc.setForeground(new java.awt.Color(255, 255, 255));
        jlbLopHoc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbLopHoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-classroom-30.png"))); // NOI18N
        jlbLopHoc.setText("Lớp Học");

        javax.swing.GroupLayout jPLopHocLayout = new javax.swing.GroupLayout(jPLopHoc);
        jPLopHoc.setLayout(jPLopHocLayout);
        jPLopHocLayout.setHorizontalGroup(
            jPLopHocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPLopHocLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbLopHoc, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPLopHocLayout.setVerticalGroup(
            jPLopHocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPLopHocLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbLopHoc, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPBaoCao.setBackground(new java.awt.Color(0, 50, 99));
        jPBaoCao.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jlbBaoCao.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jlbBaoCao.setForeground(new java.awt.Color(255, 255, 255));
        jlbBaoCao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbBaoCao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-increase-24.png"))); // NOI18N
        jlbBaoCao.setText("Báo Cáo");

        javax.swing.GroupLayout jPBaoCaoLayout = new javax.swing.GroupLayout(jPBaoCao);
        jPBaoCao.setLayout(jPBaoCaoLayout);
        jPBaoCaoLayout.setHorizontalGroup(
            jPBaoCaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPBaoCaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbBaoCao, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPBaoCaoLayout.setVerticalGroup(
            jPBaoCaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPBaoCaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbBaoCao, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPCaiDat.setBackground(new java.awt.Color(0, 50, 99));
        jPCaiDat.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jlbCaiDat.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jlbCaiDat.setForeground(new java.awt.Color(255, 255, 255));
        jlbCaiDat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbCaiDat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-settings-24.png"))); // NOI18N
        jlbCaiDat.setText("Cài Đặt");

        javax.swing.GroupLayout jPCaiDatLayout = new javax.swing.GroupLayout(jPCaiDat);
        jPCaiDat.setLayout(jPCaiDatLayout);
        jPCaiDatLayout.setHorizontalGroup(
            jPCaiDatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPCaiDatLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbCaiDat, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPCaiDatLayout.setVerticalGroup(
            jPCaiDatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlbCaiDat, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPMenuLayout = new javax.swing.GroupLayout(jPMenu);
        jPMenu.setLayout(jPMenuLayout);
        jPMenuLayout.setHorizontalGroup(
            jPMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPCaiDat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPBaoCao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPLopHoc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPKhoaHoc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPGiangVien, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPHocVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPTrangChu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPMenuLayout.setVerticalGroup(
            jPMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPMenuLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPTrangChu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPHocVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPGiangVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPKhoaHoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPLopHoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPBaoCao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPCaiDat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jPView.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPViewLayout = new javax.swing.GroupLayout(jPView);
        jPView.setLayout(jPViewLayout);
        jPViewLayout.setHorizontalGroup(
            jPViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 616, Short.MAX_VALUE)
        );
        jPViewLayout.setVerticalGroup(
            jPViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 653, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPRootLayout = new javax.swing.GroupLayout(jPRoot);
        jPRoot.setLayout(jPRootLayout);
        jPRootLayout.setHorizontalGroup(
            jPRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 839, Short.MAX_VALUE)
            .addGroup(jPRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPRootLayout.createSequentialGroup()
                    .addComponent(jPMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jPView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPRootLayout.setVerticalGroup(
            jPRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 664, Short.MAX_VALUE)
            .addGroup(jPRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPMenu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPRootLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPRoot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPRoot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPBaoCao;
    private javax.swing.JPanel jPCaiDat;
    private javax.swing.JPanel jPGiangVien;
    private javax.swing.JPanel jPHocVien;
    private javax.swing.JPanel jPKhoaHoc;
    private javax.swing.JPanel jPLopHoc;
    private javax.swing.JPanel jPMenu;
    private javax.swing.JPanel jPRoot;
    private javax.swing.JPanel jPTrangChu;
    private javax.swing.JPanel jPView;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel jlbBaoCao;
    private javax.swing.JLabel jlbCaiDat;
    private javax.swing.JLabel jlbGiangVien;
    private javax.swing.JLabel jlbHocVien;
    private javax.swing.JLabel jlbKhoaHoc;
    private javax.swing.JLabel jlbLopHoc;
    private javax.swing.JLabel jlbTrangChu;
    // End of variables declaration//GEN-END:variables
}
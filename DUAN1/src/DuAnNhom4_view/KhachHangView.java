/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package DuAnNhom4_view;

import Click.AutoClick;
import Click.ChuyenManKH;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dell
 */
public class KhachHangView extends javax.swing.JFrame {

    /**
     * Creates new form KhachHangView
     */
    public KhachHangView() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("DopeStore");
        ChuyenManKH con = new ChuyenManKH(jpnTable);
        con.setView(jpnDonDatHang, jlbDonDatHang);

        List<AutoClick> listItem = new ArrayList<>();
        listItem.add(new AutoClick("TrangChu", jpnTrangChu, jlbTrangChu));
        listItem.add(new AutoClick("SanPham", jpnSanPham, jlbSanPham));
        listItem.add(new AutoClick("GioHang", jpnGioHang, jlbGioHang));
        listItem.add(new AutoClick("DonDatHang", jpnDonDatHang, jlbDonDatHang));
        listItem.add(new AutoClick("HoSoCaNhan", jpnHoSo, jlbHoSo));
        con.setEvent(listItem);
        
       
      
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jpnMenu = new javax.swing.JPanel();
        jpnSanPham = new javax.swing.JPanel();
        jlbSanPham = new javax.swing.JLabel();
        jpnTrangChu = new javax.swing.JPanel();
        jlbTrangChu = new javax.swing.JLabel();
        jpnGioHang = new javax.swing.JPanel();
        jlbGioHang = new javax.swing.JLabel();
        jpnDonDatHang = new javax.swing.JPanel();
        jlbDonDatHang = new javax.swing.JLabel();
        jpnHoSo = new javax.swing.JPanel();
        jlbHoSo = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jpnTable = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setToolTipText("");

        jpnMenu.setBackground(new java.awt.Color(102, 102, 102));

        jpnSanPham.setBackground(new java.awt.Color(102, 102, 102));

        jlbSanPham.setBackground(new java.awt.Color(102, 102, 102));
        jlbSanPham.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlbSanPham.setForeground(new java.awt.Color(255, 255, 255));
        jlbSanPham.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbSanPham.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search (4).png"))); // NOI18N
        jlbSanPham.setText("S???n ph???m");

        javax.swing.GroupLayout jpnSanPhamLayout = new javax.swing.GroupLayout(jpnSanPham);
        jpnSanPham.setLayout(jpnSanPhamLayout);
        jpnSanPhamLayout.setHorizontalGroup(
            jpnSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlbSanPham, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpnSanPhamLayout.setVerticalGroup(
            jpnSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlbSanPham, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        jpnTrangChu.setBackground(new java.awt.Color(102, 102, 102));

        jlbTrangChu.setBackground(new java.awt.Color(102, 102, 102));
        jlbTrangChu.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlbTrangChu.setForeground(new java.awt.Color(255, 255, 255));
        jlbTrangChu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbTrangChu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/home-button.png"))); // NOI18N
        jlbTrangChu.setText("Trang ch???");

        javax.swing.GroupLayout jpnTrangChuLayout = new javax.swing.GroupLayout(jpnTrangChu);
        jpnTrangChu.setLayout(jpnTrangChuLayout);
        jpnTrangChuLayout.setHorizontalGroup(
            jpnTrangChuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlbTrangChu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpnTrangChuLayout.setVerticalGroup(
            jpnTrangChuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlbTrangChu, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        jpnGioHang.setBackground(new java.awt.Color(102, 102, 102));

        jlbGioHang.setBackground(new java.awt.Color(102, 102, 102));
        jlbGioHang.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlbGioHang.setForeground(new java.awt.Color(255, 255, 255));
        jlbGioHang.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbGioHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/empty-cart.png"))); // NOI18N
        jlbGioHang.setText("Gi??? h??ng");

        javax.swing.GroupLayout jpnGioHangLayout = new javax.swing.GroupLayout(jpnGioHang);
        jpnGioHang.setLayout(jpnGioHangLayout);
        jpnGioHangLayout.setHorizontalGroup(
            jpnGioHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlbGioHang, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpnGioHangLayout.setVerticalGroup(
            jpnGioHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnGioHangLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jlbGioHang, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jpnDonDatHang.setBackground(new java.awt.Color(102, 102, 102));

        jlbDonDatHang.setBackground(new java.awt.Color(102, 102, 102));
        jlbDonDatHang.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlbDonDatHang.setForeground(new java.awt.Color(255, 255, 255));
        jlbDonDatHang.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbDonDatHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/clipboard.png"))); // NOI18N
        jlbDonDatHang.setText("????n ?????t h??ng ");

        javax.swing.GroupLayout jpnDonDatHangLayout = new javax.swing.GroupLayout(jpnDonDatHang);
        jpnDonDatHang.setLayout(jpnDonDatHangLayout);
        jpnDonDatHangLayout.setHorizontalGroup(
            jpnDonDatHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlbDonDatHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpnDonDatHangLayout.setVerticalGroup(
            jpnDonDatHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnDonDatHangLayout.createSequentialGroup()
                .addComponent(jlbDonDatHang, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jpnHoSo.setBackground(new java.awt.Color(102, 102, 102));

        jlbHoSo.setBackground(new java.awt.Color(102, 102, 102));
        jlbHoSo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlbHoSo.setForeground(new java.awt.Color(255, 255, 255));
        jlbHoSo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbHoSo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/user (1).png"))); // NOI18N
        jlbHoSo.setText("H??? s?? c?? nh??n ");

        javax.swing.GroupLayout jpnHoSoLayout = new javax.swing.GroupLayout(jpnHoSo);
        jpnHoSo.setLayout(jpnHoSoLayout);
        jpnHoSoLayout.setHorizontalGroup(
            jpnHoSoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlbHoSo, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
        );
        jpnHoSoLayout.setVerticalGroup(
            jpnHoSoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlbHoSo, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logout.png"))); // NOI18N
        jLabel2.setText("????ng xu???t");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jpnMenuLayout = new javax.swing.GroupLayout(jpnMenu);
        jpnMenu.setLayout(jpnMenuLayout);
        jpnMenuLayout.setHorizontalGroup(
            jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpnSanPham, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnTrangChu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnGioHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnDonDatHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnHoSo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jpnMenuLayout.setVerticalGroup(
            jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnMenuLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jpnTrangChu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jpnSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jpnGioHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jpnDonDatHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jpnHoSo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jpnTable.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jpnTableLayout = new javax.swing.GroupLayout(jpnTable);
        jpnTable.setLayout(jpnTableLayout);
        jpnTableLayout.setHorizontalGroup(
            jpnTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jpnTableLayout.setVerticalGroup(
            jpnTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/s (2).png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jpnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 1549, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel13)
                .addGap(2, 2, 2)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jpnMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1553, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 363, Short.MAX_VALUE))
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
            java.util.logging.Logger.getLogger(KhachHangView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KhachHangView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KhachHangView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KhachHangView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KhachHangView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel jlbDonDatHang;
    private javax.swing.JLabel jlbGioHang;
    private javax.swing.JLabel jlbHoSo;
    private javax.swing.JLabel jlbSanPham;
    private javax.swing.JLabel jlbTrangChu;
    private javax.swing.JPanel jpnDonDatHang;
    private javax.swing.JPanel jpnGioHang;
    private javax.swing.JPanel jpnHoSo;
    private javax.swing.JPanel jpnMenu;
    private javax.swing.JPanel jpnSanPham;
    private javax.swing.JPanel jpnTable;
    private javax.swing.JPanel jpnTrangChu;
    // End of variables declaration//GEN-END:variables
}

/*
 * Click nbfs            @Override
            public Dimension getScreenSize() throws HeadlessException {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public int getScreenResolution() throws HeadlessException {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public ColorModel getColorModel() throws HeadlessException {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public String[] getFontList() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public FontMetrics getFontMetrics(Font font) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public void sync() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public Image getImage(String filename) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public Image getImage(URL url) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public Image createImage(String filename) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public Image createImage(URL url) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public boolean prepareImage(Image image, int width, int height, ImageObserver observer) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public int checkImage(Image image, int width, int height, ImageObserver observer) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public Image createImage(ImageProducer producer) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public Image createImage(byte[] imagedata, int imageoffset, int imagelength) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public PrintJob getPrintJob(Frame frame, String jobtitle, Properties props) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public void beep() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public Clipboard getSystemClipboard() throws HeadlessException {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            protected EventQueue getSystemEventQueueImpl() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public boolean isModalityTypeSupported(Dialog.ModalityType modalityType) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public boolean isModalExclusionTypeSupported(Dialog.ModalExclusionType modalExclusionType) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public Map<TextAttribute, ?> mapInputMethodHighlight(InputMethodHighlight highlight) throws HeadlessException {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        }//nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;
import components.LoginInfo;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import javax.swing.ImageIcon;
import java.awt.*;
import javax.swing.JFrame;

/**
 *
 * @author ACER
 */
public class DangNhap extends javax.swing.JFrame {

    /**
     * Creates new form Login_Page
     */
    public DangNhap() {
        initComponents();
        Image img = new ImageIcon(getClass().getResource("/icon/logo.jpg")).getImage();
        setIconImage(img);
        setLocationRelativeTo(null);
//        myModifyCode();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jP_main = new javax.swing.JPanel();
        jP_logo = new javax.swing.JPanel();
        jL_logo = new javax.swing.JLabel();
        jP_wel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jP_loginArea = new javax.swing.JPanel();
        txt_matKhau = new javax.swing.JTextField();
        jL_matKhau = new javax.swing.JLabel();
        jL_taiKhoan = new javax.swing.JLabel();
        txt_taiKhoan = new javax.swing.JTextField();
        btn_thoat = new javax.swing.JButton();
        btn_dangNhap = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setAlwaysOnTop(true);
        setResizable(false);

        jP_main.setBackground(new java.awt.Color(255, 255, 255));
        jP_main.setMaximumSize(new java.awt.Dimension(1000, 700));
        jP_main.setMinimumSize(new java.awt.Dimension(1000, 700));

        jP_logo.setBackground(new java.awt.Color(255, 255, 255));
        jP_logo.setLayout(null);

        jL_logo.setBackground(new java.awt.Color(255, 255, 255));
        jL_logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jL_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/K3TD Pharmacy.png"))); // NOI18N
        jP_logo.add(jL_logo);
        jL_logo.setBounds(110, 10, 760, 220);

        jP_wel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Welcome!");

        javax.swing.GroupLayout jP_welLayout = new javax.swing.GroupLayout(jP_wel);
        jP_wel.setLayout(jP_welLayout);
        jP_welLayout.setHorizontalGroup(
            jP_welLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jP_welLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(412, 412, 412))
        );
        jP_welLayout.setVerticalGroup(
            jP_welLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_welLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jP_loginArea.setBackground(new java.awt.Color(255, 255, 255));
        jP_loginArea.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_matKhau.setToolTipText("Mật khẩu ...");
        txt_matKhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_matKhauActionPerformed(evt);
            }
        });
        jP_loginArea.add(txt_matKhau, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, 500, 50));

        jL_matKhau.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        jL_matKhau.setText("Mật khẩu: ");
        jP_loginArea.add(jL_matKhau, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, -1, -1));

        jL_taiKhoan.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        jL_taiKhoan.setText("Tài khoản: ");
        jP_loginArea.add(jL_taiKhoan, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, -1, -1));

        txt_taiKhoan.setToolTipText("Mã nhân viên");
        txt_taiKhoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_taiKhoanActionPerformed(evt);
            }
        });
        jP_loginArea.add(txt_taiKhoan, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, 500, 50));

        btn_thoat.setBackground(new java.awt.Color(193, 219, 208));
        btn_thoat.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        btn_thoat.setText("Thoát");
        btn_thoat.setMaximumSize(new java.awt.Dimension(160, 40));
        btn_thoat.setMinimumSize(new java.awt.Dimension(160, 40));
        btn_thoat.setPreferredSize(new java.awt.Dimension(160, 40));
        btn_thoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_thoatActionPerformed(evt);
            }
        });
        jP_loginArea.add(btn_thoat, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 250, -1, -1));
        btn_thoat.getAccessibleContext().setAccessibleDescription("");

        btn_dangNhap.setBackground(new java.awt.Color(193, 219, 208));
        btn_dangNhap.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        btn_dangNhap.setText("Đăng nhập");
        btn_dangNhap.setMaximumSize(new java.awt.Dimension(160, 40));
        btn_dangNhap.setMinimumSize(new java.awt.Dimension(160, 40));
        btn_dangNhap.setPreferredSize(new java.awt.Dimension(160, 40));
        btn_dangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dangNhapActionPerformed(evt);
            }
        });
        jP_loginArea.add(btn_dangNhap, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, -1, -1));

        jLabel2.setText("* By Nhom_02 PhatTrienUngDung DHKHMT17CTT");
        jP_loginArea.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 340, -1, -1));

        javax.swing.GroupLayout jP_mainLayout = new javax.swing.GroupLayout(jP_main);
        jP_main.setLayout(jP_mainLayout);
        jP_mainLayout.setHorizontalGroup(
            jP_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jP_logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jP_wel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jP_loginArea, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
        );
        jP_mainLayout.setVerticalGroup(
            jP_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_mainLayout.createSequentialGroup()
                .addComponent(jP_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jP_wel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jP_loginArea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jP_main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jP_main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_matKhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_matKhauActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_matKhauActionPerformed

    private void txt_taiKhoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_taiKhoanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_taiKhoanActionPerformed

    private void btn_thoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_thoatActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btn_thoatActionPerformed

    private void btn_dangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dangNhapActionPerformed
        // TODO add your handling code here
    	if(!KiemTraDangNhap())
    		return;
    	
        this.setVisible(false);
        RootFrame rf =  new RootFrame();
        LoginInfo.addRootframe(rf);
        rf.setExtendedState(JFrame.MAXIMIZED_BOTH);
        rf.setVisible(true);
    }//GEN-LAST:event_btn_dangNhapActionPerformed
    
    

	private boolean KiemTraDangNhap() {
		
		return true;
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
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DangNhap dangNhap = new DangNhap();
                dangNhap.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_dangNhap;
    private javax.swing.JButton btn_thoat;
    private javax.swing.JLabel jL_logo;
    private javax.swing.JLabel jL_matKhau;
    private javax.swing.JLabel jL_taiKhoan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jP_loginArea;
    private javax.swing.JPanel jP_logo;
    private javax.swing.JPanel jP_main;
    private javax.swing.JPanel jP_wel;
    private javax.swing.JTextField txt_matKhau;
    private javax.swing.JTextField txt_taiKhoan;
    // End of variables declaration//GEN-END:variables

    private void myModifyCode() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//        Image img = new Image("D:\\Nam3\\HK2\\PhatTrienUngDung\\HinhAnh\\K3TD_logo_small.png");
//        setIconImage(img.getImage());
//        setIconImage(new ImageIcon("D:\\Nam3\\HK2\\PhatTrienUngDung\\HinhAnh\\K3TD_logo_small.png").getImage());
//        Image img; 
//		img = Toolkit.getDefaultToolkit().createImage("img\\img_logoSmall.png");
//		setIconImage(img);
    }
}

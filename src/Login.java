
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.MessageFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gerald junha
 */
public class Login extends javax.swing.JFrame {
    java.util.Date tglsekarang = new java.util.Date();
    private SimpleDateFormat smpdtfmt = new SimpleDateFormat("dd MMMMMMMMM yyyy", Locale.getDefault());
//diatas adalah pengaturan format penulisan, bisa diubah sesuai keinginan.
    private String tanggal = smpdtfmt.format(tglsekarang);
    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        labeltanggal.setText(tanggal);
        SetJam();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        labeltanggal = new javax.swing.JLabel();
        labeljam = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtNIS = new javax.swing.JTextField();
        txtNama = new javax.swing.JTextField();
        txtKelas = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        rdLaki = new javax.swing.JRadioButton();
        rdPerempuan = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAlamat = new javax.swing.JTextArea();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtTempatLahir = new javax.swing.JTextField();
        Tanggal = new com.toedter.calendar.JDateChooser();
        jPanel3 = new javax.swing.JPanel();
        btnAdd = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        Reset = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnPrint = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblData = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 255, 255));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("FORM BIODATA SISWA SMK TELKOM");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 10, 380, 40);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("The Real Informatic Schools");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 50, 230, 30);

        labeltanggal.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jPanel1.add(labeltanggal);
        labeltanggal.setBounds(950, 10, 180, 40);

        labeljam.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jPanel1.add(labeljam);
        labeljam.setBounds(950, 50, 220, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1180, 90);

        jPanel2.setBackground(new java.awt.Color(0, 153, 255));
        jPanel2.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setText("Isian Data SISWA");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(10, 0, 110, 30);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setText("NIS");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(10, 40, 110, 30);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setText("Nama");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(10, 90, 110, 30);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setText("Jenis Kelamin");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(10, 240, 110, 30);

        jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel7.setText("Kelas");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(10, 290, 110, 30);

        jLabel8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel8.setText("Email");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(10, 340, 110, 30);

        jLabel9.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel9.setText("Alamat");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(10, 400, 110, 30);
        jPanel2.add(txtNIS);
        txtNIS.setBounds(10, 60, 160, 30);
        jPanel2.add(txtNama);
        txtNama.setBounds(10, 110, 160, 30);
        jPanel2.add(txtKelas);
        txtKelas.setBounds(10, 310, 160, 30);
        jPanel2.add(txtEmail);
        txtEmail.setBounds(10, 360, 160, 30);

        buttonGroup1.add(rdLaki);
        rdLaki.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        rdLaki.setText("Laki-Laki");
        jPanel2.add(rdLaki);
        rdLaki.setBounds(10, 270, 90, 21);

        buttonGroup1.add(rdPerempuan);
        rdPerempuan.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        rdPerempuan.setText("Perempuan");
        jPanel2.add(rdPerempuan);
        rdPerempuan.setBounds(110, 270, 90, 21);

        txtAlamat.setColumns(20);
        txtAlamat.setRows(5);
        txtAlamat.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane1.setViewportView(txtAlamat);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(10, 430, 240, 110);
        jPanel2.add(jSeparator1);
        jSeparator1.setBounds(0, 32, 290, 2);

        jLabel10.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel10.setText("Tempat Lahir");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(10, 140, 110, 30);

        jLabel11.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel11.setText("Tanggal Lahir");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(10, 190, 110, 30);
        jPanel2.add(txtTempatLahir);
        txtTempatLahir.setBounds(10, 170, 160, 30);
        jPanel2.add(Tanggal);
        Tanggal.setBounds(10, 220, 160, 30);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(10, 100, 290, 560);

        jPanel3.setBackground(new java.awt.Color(0, 153, 255));
        jPanel3.setLayout(null);

        btnAdd.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnAdd.setText("Save");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jPanel3.add(btnAdd);
        btnAdd.setBounds(10, 10, 80, 30);

        btnDelete.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel3.add(btnDelete);
        btnDelete.setBounds(100, 10, 80, 30);

        Reset.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Reset.setText("Clear");
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });
        jPanel3.add(Reset);
        Reset.setBounds(190, 10, 80, 30);

        btnRefresh.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });
        jPanel3.add(btnRefresh);
        btnRefresh.setBounds(280, 10, 80, 30);

        btnEdit.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        jPanel3.add(btnEdit);
        btnEdit.setBounds(370, 10, 80, 30);

        btnPrint.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnPrint.setText("Print");
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });
        jPanel3.add(btnPrint);
        btnPrint.setBounds(460, 10, 80, 30);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(310, 100, 870, 50);

        jPanel4.setBackground(new java.awt.Color(0, 153, 255));
        jPanel4.setLayout(null);

        tblData.setBackground(new java.awt.Color(0, 204, 255));
        tblData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nis ", "NamaSiswa", "Tempat Lahir", "Tanggal Lahir", "JenisKelamin", "Kelas", "Email", "Alamat"
            }
        ));
        tblData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDataMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblData);

        jPanel4.add(jScrollPane2);
        jScrollPane2.setBounds(10, 20, 850, 350);

        getContentPane().add(jPanel4);
        jPanel4.setBounds(310, 160, 870, 500);

        setBounds(0, 0, 1221, 695);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyy-MM-dd");
        String tanggal = dateFormat.format(Tanggal.getDate());
        
        String JK = "";
                if (rdLaki.isSelected()) {
                    JK = "L";
                } else {
                    JK = "P";
                }
        
          if ("".equals(txtNIS.getText()) || "".equals(txtAlamat.getText()) || "".equals(txtKelas.getText()) || "".equals(txtNama.getText()) || "".equals(txtEmail.getText())) {
              JOptionPane.showMessageDialog(this, "Harap Lengkapi Data","Error",JOptionPane.WARNING_MESSAGE);
          } else {
            
         String SQL = "INSERT INTO t_siswa VALUES" 
                 + "('"+txtNIS.getText()+"','"+txtNama.getText()+"','"+txtTempatLahir.getText()+"','"+tanggal+"','"+JK+"','"+txtKelas.getText()+"','"+txtEmail.getText()+"','"+txtAlamat.getText()+"')";
          int status = KoneksiDB.execute(SQL);
          if (status == 1) {
              JOptionPane.showMessageDialog(this, "Data berhasil ditambahkan","Sukses", JOptionPane.INFORMATION_MESSAGE);
              selectData();
          }else {
                JOptionPane.showMessageDialog(this, "Data gagal ditambahkan", "Sukses", JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_btnAddActionPerformed
  }
 }
    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int baris = tblData.getSelectedRow();
        if (baris >= 0) {
            String NIS = tblData.getValueAt(baris, 0).toString();
            String SQL = "Delete FROM t_siswa WHERE NIS='"+NIS+"'";
            int status = KoneksiDB.execute(SQL);
            if (status==1){
                 JOptionPane.showMessageDialog(this, "Data berhasil dihapus","Sukses", JOptionPane.INFORMATION_MESSAGE);
            }else {
                 JOptionPane.showMessageDialog(this, "Data gagal dihapus","Sukses", JOptionPane.WARNING_MESSAGE);
            }
        }else {
             JOptionPane.showMessageDialog(this, "Pilih Baris Data Terlebih dahulu","Error", JOptionPane.INFORMATION_MESSAGE);
        }
        
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void tblDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDataMouseClicked
        // TODO add your handling code here:
         int baris = tblData.getSelectedRow();
            if(baris !=1){
            txtNIS.setText(tblData.getValueAt(baris, 0).toString());
            txtNama.setText((String) tblData.getValueAt(baris, 1));

            SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
            Date dateFormat = null;
            try {
            dateFormat = date.parse(tblData.getValueAt(baris, 2).toString());
            } catch (ParseException ex) {
            Logger.getLogger(frmMain.class.getName()).log(Level.SEVERE, null, ex);
            }

            Tanggal.setDate(dateFormat);
            String jk = tblData.getValueAt(baris, 4).toString();
            if(jk.equals("Laki - Laki"))
            rdLaki.setSelected(true);
            else 
            rdPerempuan.setSelected(true);
            txtKelas.setText(tblData.getValueAt(baris, 5).toString());
            txtEmail.setText(tblData.getValueAt(baris, 6).toString());
            txtAlamat.setText(tblData.getValueAt(baris, 7).toString());
}
    }//GEN-LAST:event_tblDataMouseClicked

    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed
        // TODO add your handling code here:
        txtNama.setText("");
        txtTempatLahir.setText("");
        txtNIS.setText("");
        txtKelas.setText("");
        buttonGroup1.clearSelection();
        txtEmail.setText("");
        txtAlamat.setText("");
       
        
    }//GEN-LAST:event_ResetActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        selectData();
            
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyy-MM-dd");
        String tanggal = dateFormat.format(Tanggal.getDate());
        
         int baris = tblData.getSelectedRow();
            String NIS = tblData.getValueAt(baris, 0).toString();
         if ("".equals(txtNIS.getText()) || "".equals(txtAlamat.getText()) || 
                  "".equals(txtKelas.getText()) || "".equals(txtNama.getText()) || "".equals(txtEmail.getText())) {
              JOptionPane.showMessageDialog(this, "Harap Lengkapi Data","Error",JOptionPane.WARNING_MESSAGE);
          } else {
            String JK = "";
                if (rdLaki.isSelected()) {
                    JK = "L";
                } else {
                    JK = "P";
                }
         String SQL = "UPDATE t_siswa SET NIS='"+txtNIS.getText()
                 +"',NamaSiswa='"+txtNama.getText()
                 +"',TempatLahir='"+txtTempatLahir.getText()
                 +"',TanggalLahir='"+tanggal
                 +"',JenisKelamin='"+JK
                 +"',Kelas='"+txtKelas.getText()
                 +"',Email='"+txtEmail.getText()
                 +"',Alamat='"+txtAlamat.getText()
                 +"' WHERE NIS="+NIS;

          int status = KoneksiDB.execute(SQL);
          if (status == 1) {
              JOptionPane.showMessageDialog(this, "Data berhasil diupdate","Sukses", JOptionPane.INFORMATION_MESSAGE);
              selectData();
          }else {
                JOptionPane.showMessageDialog(this, "Data gagal diupdate", "Eror", JOptionPane.WARNING_MESSAGE);
    }                                      
  }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        // TODO add your handling code here:
        MessageFormat header = new MessageFormat("Biodata Siswa SMK Telkom Malang");
        MessageFormat footer = new MessageFormat("Page (0,number,integer)"      );
        try {
            tblData.print(JTable.PrintMode.FIT_WIDTH, header, footer, true, null, true, null);
        }catch (java.awt.print.PrinterException e){
            System.err.format("Cannot print %s%n", e.getMessage());
        }

    }//GEN-LAST:event_btnPrintActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Reset;
    private com.toedter.calendar.JDateChooser Tanggal;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnPrint;
    private javax.swing.JButton btnRefresh;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labeljam;
    private javax.swing.JLabel labeltanggal;
    private javax.swing.JRadioButton rdLaki;
    private javax.swing.JRadioButton rdPerempuan;
    private javax.swing.JTable tblData;
    private javax.swing.JTextArea txtAlamat;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtKelas;
    private javax.swing.JTextField txtNIS;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtTempatLahir;
    // End of variables declaration//GEN-END:variables

    private void selectData() {
        String kolom[] = {"NIS","NamaSiswa","TempatLahir","TanggalLahir","JenisKelamin","Kelas","Email","Alamat"};
        DefaultTableModel dtm = new DefaultTableModel (null, kolom);
        String SQL = "SELECT * FROM t_siswa";
        ResultSet rs = KoneksiDB.executeQuery(SQL);
        try {
            while(rs.next()) {
                String NIS = rs.getString(1);
                String NamaSiswa = rs.getString(2);
                String TempatLahir = rs.getString(3);
                String TanggalLahir = rs.getString(4);
                String JenisKelamin = "";
                if ("L".equals(rs.getString(5))) {
                    JenisKelamin = "Laki-Laki";
                } else {
                    JenisKelamin = "Perempuan";
                }
                String Kelas = rs.getString(6);
                String Email = rs.getString(7);
                String Alamat = rs.getString(8);
                String data [] = {NIS,NamaSiswa,TempatLahir,TanggalLahir,JenisKelamin,Kelas,Email,Alamat};
                dtm.addRow(data);
            }
        }catch (SQLException ex) {
            Logger.getLogger(frmMain.class.getName()).log(Level.SEVERE, null, ex);
        }
        tblData.setModel(dtm);
    }
public void setTanggal(){
    java.util.Date skrg = new java.util.Date();
    java.text.SimpleDateFormat kal = new
    java.text.SimpleDateFormat("dd/MM/yyyy");
    labeltanggal.setText(kal.format(skrg));
    
}

public void SetJam(){
    ActionListener taskPerformer = new ActionListener() {

            @Override
        public void actionPerformed(ActionEvent evt) {
        String nol_jam = "", nol_menit = " ",nol_detik = "";

        java.util.Date dateTime = new java.util.Date();
        int nilai_jam = dateTime.getHours();
        int nilai_menit = dateTime.getMinutes();
        int nilai_detik = dateTime.getSeconds();

        if(nilai_jam <= 9) nol_jam= "0";
        if(nilai_menit <= 9) nol_menit= "0";
        if(nilai_detik <= 9) nol_detik= "0";

        String jam = nol_jam + Integer.toString(nilai_jam);
        String menit = nol_menit + Integer.toString(nilai_menit);
        String detik = nol_detik + Integer.toString(nilai_detik);

        labeljam.setText(jam+":"+menit+":"+detik+"");
      }
    };
        new Timer(1000, taskPerformer).start();
}


}

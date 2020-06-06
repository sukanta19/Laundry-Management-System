
import java.awt.Image;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author iimsu
 */
public class UserProfileDeletionNewJInternalFrame extends javax.swing.JInternalFrame {

    /**
     * Creates new form UserProfileDeletionNewJInternalFrame
     */
    
    public String userID;
    public String userPW;
    public JFileChooser chooser=null;//new JFileChooser();
    public File f=null;//chooser.getSelectedFile();
    public String filename=null;//f.getAbsolutePath();
    public UserProfileDeletionNewJInternalFrame() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setTitle("SS-LMS 19.2K");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setText("Last Name");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setText("Email");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setText("Mobile");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setText("Stree");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel6.setText("City");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel7.setText("Pin");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel8.setText("Date of Birth");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel9.setText("Date of Creation ");

        jButton1.setBackground(new java.awt.Color(51, 255, 204));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 51, 255));
        jButton1.setText("Cancel");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(204, 255, 204));
        jTextField1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(51, 0, 255));

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(204, 255, 204));
        jTextField2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(51, 0, 255));

        jTextField3.setEditable(false);
        jTextField3.setBackground(new java.awt.Color(204, 255, 204));
        jTextField3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(51, 0, 255));

        jTextField4.setEditable(false);
        jTextField4.setBackground(new java.awt.Color(204, 255, 204));
        jTextField4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(51, 0, 255));

        jTextField5.setEditable(false);
        jTextField5.setBackground(new java.awt.Color(204, 255, 204));
        jTextField5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(51, 0, 255));

        jTextField6.setBackground(new java.awt.Color(204, 255, 204));
        jTextField6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(51, 0, 255));

        jTextField7.setEditable(false);
        jTextField7.setBackground(new java.awt.Color(204, 255, 204));
        jTextField7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jTextField7.setForeground(new java.awt.Color(51, 0, 255));

        jTextField8.setEditable(false);
        jTextField8.setBackground(new java.awt.Color(204, 255, 204));
        jTextField8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jTextField8.setForeground(new java.awt.Color(51, 0, 255));

        jLabel10.setText("                    My Image");
        jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 255), 4));

        jButton2.setBackground(new java.awt.Color(102, 255, 204));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(51, 51, 255));
        jButton2.setText("View");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel11.setBackground(new java.awt.Color(102, 255, 153));
        jLabel11.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 51, 51));

        jButton4.setBackground(new java.awt.Color(102, 255, 204));
        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 0, 255));
        jButton4.setText("Delete Profile");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel12.setText("First Name");

        jTextField10.setEditable(false);
        jTextField10.setBackground(new java.awt.Color(204, 255, 204));
        jTextField10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jTextField10.setForeground(new java.awt.Color(51, 0, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("User Profile Deletion");

        jLabel13.setBackground(new java.awt.Color(0, 255, 204));
        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 51, 51));

        jLabel14.setForeground(new java.awt.Color(240, 240, 240));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel12))
                        .addGap(69, 69, 69)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField10)
                            .addComponent(jTextField7)
                            .addComponent(jTextField6)
                            .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 386, Short.MAX_VALUE)
                            .addComponent(jTextField2)
                            .addComponent(jTextField3)
                            .addComponent(jTextField4)
                            .addComponent(jTextField5)
                            .addComponent(jTextField8, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(77, 77, 77)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(67, 67, 67))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addGap(33, 33, 33))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(jButton2)
                        .addGap(53, 53, 53)
                        .addComponent(jButton4)))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public UserProfileDeletionNewJInternalFrame(String uID) {
        initComponents();
        userID=uID;
        jLabel13.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel13.setText("User ID :"+userID);   
    }
    
  
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // view USER profile

        String USERNAME="root";
        String PASSWORD="";
        String CONN_STRING="jdbc:mysql://localhost:3308/test";
        Connection conn=null;
        try
        {
            conn=DriverManager.getConnection( CONN_STRING,USERNAME,PASSWORD);
            //System.out.print("Connected");
            Statement stmt=conn.createStatement();
            ResultSet rs=stmt.executeQuery("select * from user_profile");
            String user="";
            String pw="";

            boolean found=false;
            String uname="";
            while(rs.next()){
                user=rs.getString("username");
                if(user.equals(userID)==true)// && pw.equals(pwtext)==true)
            {
                found=true;
                String st1="",st2="",st3="",st4="",st5="",st6="",st7="",st8="",st9="",st10="",st11="",st12="";
                st1=rs.getString("username");
                st2=rs.getString("password");
                userPW=st2.trim();
                st3=rs.getString("firstname");
                st4=rs.getString("lastname");
                st5=rs.getString("email");
                st6=rs.getString("mobile");
                st7=rs.getString("street");
                st8=rs.getString("city");
                st9=rs.getString("pin");
                st10=rs.getString("date_of_birth");
                st11=rs.getString("date_of_creation");
                st12=rs.getString("image");
                filename=st12;

                jTextField10.setText(st3);//FIRST NAME
                jTextField1.setText(st4);//LAST NAME NAME
                jTextField2.setText(st5);//EMAIL
                jTextField3.setText(st6);//MOBOILE
                jTextField4.setText(st7);//STREET
                jTextField5.setText(st8);//CITY
                jTextField6.setText(st9);//PIN
                jTextField7.setText(st10);//DATE OF BIRTH
                jTextField8.setText(st11);//DATE OF CREATION
                //jTextField9.setText(st2);//password
                jLabel14.setText(st2);
                jLabel11.setText(st3+" "+st4);
                jLabel11.setHorizontalAlignment(SwingConstants.CENTER);

                jLabel13.setText("User ID : "+st1);
                jLabel13.setHorizontalAlignment(SwingConstants.CENTER);

                String filename=st12;
                ImageIcon myimage=new ImageIcon(filename);
                Image img1=myimage.getImage();
                Image img2=img1.getScaledInstance(jLabel10.getWidth(),jLabel10.getHeight(),Image.SCALE_SMOOTH);
                ImageIcon i=new ImageIcon(img2);
                jLabel10.setHorizontalAlignment(SwingConstants.CENTER);
                jLabel10.setIcon(i);

                conn.close();
                break;
            }
        }
        }
        catch(SQLException e)
        {
            System.err.print("Data Error");
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // UPDATE USER PROFILE

        String Q="";
        String USERNAME="root";
        String PASSWORD="";
        String CONN_STRING="jdbc:mysql://localhost:3308/test";
        Connection conn=null;
        try
        {

            conn=DriverManager.getConnection( CONN_STRING,USERNAME,PASSWORD);
            Statement stmt=conn.createStatement();
            String st1="",st2="",st3="",st4="",st5="",st6="",st7="",st8="",st9="",st10="",st11="",st12="";

            st1=userID;
            st2=jLabel14.getText().trim()+" "+filename.trim();  // password
            st2=userPW;
            st3=jTextField10.getText().trim(); //first name

            st4=jTextField1.getText().trim();    //last name
            st5=jTextField2.getText().trim();  //email
            st6=jTextField3.getText().trim();    //mobile no
            st7=jTextField4.getText().trim();     //street name
            st8=jTextField5.getText().trim();    // city
            st9=jTextField6.getText().trim();      //  pin number
            st10=jTextField7.getText();   //date of birth
            st11=jTextField8.getText();     //date of creation

            st12=filename.replace("\\","\\\\");// st1); // image path

                String EMAIL_REGEX = "^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$";
                Pattern pattern=Pattern.compile(EMAIL_REGEX, Pattern.CASE_INSENSITIVE);
                Matcher matcher = pattern.matcher(st5);

                boolean flag1=true;
                if(matcher.matches()==false)
                {
                    flag1=false;
                    JFrame f=new JFrame();
                    JOptionPane.showMessageDialog(f,"Invalid email ID","SS-LMS 19.2K",JOptionPane.WARNING_MESSAGE);
                }

                boolean flag2=true;
                if(st1.length()==0 || st2.length()==0 ||st3.length()==0 || st4.length()==0 || st5.length()==0 || st6.length()==0 || st7.length()==0 || st8.length()==0 || st9.length()==0 || st10.length()==0 || st11.length()==0 || st12.length()==0)
                {
                    flag2=false;
                    JFrame f=new JFrame();
                    JOptionPane.showMessageDialog(f,"Some Fields are empty or Image not attached","SS-LMS 19.2K",JOptionPane.WARNING_MESSAGE);
                }

                if(flag1==true && flag2==true)// && flag3==true)
            {
                String sql="Delete from user_profile where username='"+st1+"' ";
                int rs=stmt.executeUpdate(sql);
                JFrame f=new JFrame();
                JOptionPane.showMessageDialog(f,st3+" "+st4+" Your Profile has been Deleted sucessfully","SS-LMS 19.2K",JOptionPane.WARNING_MESSAGE);                
                this.dispose();
                System.exit(0);
            }

        }
        catch(SQLException e)
        {
            JFrame f=new JFrame();
            JOptionPane.showMessageDialog(f,"Some Fields are empty or Invalid Data Entry"+e,"SS-LMS 19.2K",JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_jButton4ActionPerformed
/*
*/
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
}

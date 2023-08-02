
package Main;

import javax.swing.JOptionPane;
import javax.swing.*;
/** 
 * The Vm_Home2 class serves as the create screen of the vending machines.
 * It extends javax.swing.JFrame for GUI elements.
 */
public class Vm_Home2 extends javax.swing.JFrame {

    private Vm_Home parentFrame;
/** 
 * This method initializes the GUI elements required for this window
 */
    public Vm_Home2(Vm_Home parentFrame) {
        initComponents();
        this.parentFrame = parentFrame;
    }


    @SuppressWarnings("unchecked")
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Regular = new javax.swing.JButton();
        Special = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 153, 51));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); 
        jLabel1.setText("Select the type of Vending Machine");
        jLabel1.setToolTipText("");

        Regular.setBackground(new java.awt.Color(153, 255, 153));
        Regular.setFont(new java.awt.Font("Segoe UI", 1, 18)); 
        Regular.setText("Regular Vending Machine");
        Regular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegularActionPerformed(evt);
            }
        });

        Special.setBackground(new java.awt.Color(102, 255, 204));
        Special.setFont(new java.awt.Font("Segoe UI", 1, 18)); 
        Special.setText("Special Vending Machine");
        Special.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SpecialActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(78, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(135, 135, 135))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Special, javax.swing.GroupLayout.PREFERRED_SIZE, 626, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Regular, javax.swing.GroupLayout.PREFERRED_SIZE, 626, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(65, 65, 65))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(Regular, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addComponent(Special, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(129, Short.MAX_VALUE))
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
    }
/** 
 * <p>
 * This method creates an instance of a regular vending machine
 * @param evt The action is triggered when the button is clicked.
 */
    private void RegularActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(this, "Regular vending machine created");
        parentFrame.setRegularButtonClicked(true); 
        parentFrame.setVisible(true);
        this.dispose();
    }
/** 
 * <p>
 * This method creates an instance of a special vending machine
 * @param evt The action is triggered when the button is clicked.
 */
    private void SpecialActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(this, "Special vending machine created");
        parentFrame.setSpecialButtonClicked(true); 
        parentFrame.setVisible(true);
        this.dispose();
    }

 
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vm_Home2(null).setVisible(true);
            }
        });
    }

    private javax.swing.JButton Regular;
    private javax.swing.JButton Special;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;

}

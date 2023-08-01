package Main;

import javax.swing.*;

public class Vm_Home extends javax.swing.JFrame {
 private boolean regularButtonClicked = false;
    private boolean specialButtonClicked = false;

    public Vm_Home() {
        initComponents();
        
    }

    
    @SuppressWarnings("unchecked")
    
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Create = new javax.swing.JButton();
        Test = new javax.swing.JButton();
        Exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 153, 51));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); 
        jLabel1.setText("Welcome to the Vending Machine Factory!");
        jLabel1.setToolTipText("");

        Create.setBackground(new java.awt.Color(153, 255, 153));
        Create.setFont(new java.awt.Font("Segoe UI", 1, 18)); 
        Create.setText("Create a vending Machine");
        Create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateActionPerformed(evt);
            }
        });

        Test.setBackground(new java.awt.Color(102, 255, 204));
        Test.setFont(new java.awt.Font("Segoe UI", 1, 18)); 
        Test.setText("Test the Vending Machine");
        Test.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TestActionPerformed(evt);
            }
        });

        Exit.setBackground(new java.awt.Color(255, 102, 102));
        Exit.setFont(new java.awt.Font("Segoe UI", 1, 18)); 
        Exit.setText("EXIT");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(79, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(103, 103, 103))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Test, javax.swing.GroupLayout.PREFERRED_SIZE, 626, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Create, javax.swing.GroupLayout.PREFERRED_SIZE, 626, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 626, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(64, 64, 64))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(Create, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addComponent(Test, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
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

    private void CreateActionPerformed(java.awt.event.ActionEvent evt) {
        Vm_Home2 vmHome2 = new Vm_Home2(this);
        vmHome2.setVisible(true);
        this.setVisible(false);
    }

    private void TestActionPerformed(java.awt.event.ActionEvent evt) {
 if (regularButtonClicked) {
            Vm_Home3 vmHome3 = new Vm_Home3();
            vmHome3.setVisible(true);
            this.setVisible(false);
        } else if (specialButtonClicked) {
            Vm_Home4 vmHome4 = new Vm_Home4();
            vmHome4.setVisible(true);
            this.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(this, "No vending machine created yet, please create and select Regular or Special.");
        }
    }

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(0);
    }
    public void setSpecialButtonClicked(boolean clicked) {
        specialButtonClicked = clicked;
    }
    
      public void setRegularButtonClicked(boolean clicked) {
        regularButtonClicked = clicked;
    }
    
  
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Vm_Home vmHome = new Vm_Home();
            vmHome.setVisible(true);
        });
    }

    private javax.swing.JButton Create;
    private javax.swing.JButton Exit;
    private javax.swing.JButton Test;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
}

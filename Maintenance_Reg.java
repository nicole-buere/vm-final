
package Main;
import javax.swing.*;

public class Maintenance_Reg extends javax.swing.JFrame {
    private RegularItemsTableModel model; 
    private Regular_Items regularItemsFrame;
    private MoneyBox moneyBoxFrame;
    
    public Maintenance_Reg() {
        initComponents();
        model = new RegularItemsTableModel();

    }
   
    @SuppressWarnings("unchecked")
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Restock_Items = new javax.swing.JButton();
        Proceed = new javax.swing.JButton();
        Collect_Money = new javax.swing.JButton();
        Print_Summary = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 153, 51));

        Restock_Items.setBackground(new java.awt.Color(153, 255, 153));
        Restock_Items.setFont(new java.awt.Font("Segoe UI", 1, 18)); 
        Restock_Items.setText("Restock Items");
        Restock_Items.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Restock_ItemsActionPerformed(evt);
            }
        });

        Proceed.setBackground(new java.awt.Color(102, 255, 204));
        Proceed.setFont(new java.awt.Font("Segoe UI", 1, 18)); 
        Proceed.setText("Proceed");
        Proceed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProceedActionPerformed(evt);
            }
        });

        Collect_Money.setBackground(new java.awt.Color(255, 153, 153));
        Collect_Money.setFont(new java.awt.Font("Segoe UI", 1, 18)); 
        Collect_Money.setText("Collect Money");
        Collect_Money.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Collect_MoneyActionPerformed(evt);
            }
        });

        Print_Summary.setBackground(new java.awt.Color(255, 255, 153));
        Print_Summary.setFont(new java.awt.Font("Segoe UI", 1, 18)); 
        Print_Summary.setText("Print Summary");
        Print_Summary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Print_SummaryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(78, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Print_Summary, javax.swing.GroupLayout.PREFERRED_SIZE, 626, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Proceed, javax.swing.GroupLayout.PREFERRED_SIZE, 626, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Restock_Items, javax.swing.GroupLayout.PREFERRED_SIZE, 626, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Collect_Money, javax.swing.GroupLayout.PREFERRED_SIZE, 626, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(Print_Summary, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(Restock_Items, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(Collect_Money, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(Proceed, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
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

    private void Restock_ItemsActionPerformed(java.awt.event.ActionEvent evt) {
String slotInput = JOptionPane.showInputDialog(this, "Enter slot number:");
        if (slotInput == null || slotInput.isEmpty()) {
            return;
        }

        String nameInput = JOptionPane.showInputDialog(this, "Enter item name:");
        if (nameInput == null || nameInput.isEmpty()) {
            return;
        }

        String caloriesInput = JOptionPane.showInputDialog(this, "Enter item calories:");
        if (caloriesInput == null || caloriesInput.isEmpty()) {
            return;
        }

        String priceInput = JOptionPane.showInputDialog(this, "Enter item price:");
        if (priceInput == null || priceInput.isEmpty()) {
            return;
        }

        try {
            int slot = Integer.parseInt(slotInput);
            int calories = Integer.parseInt(caloriesInput);
            int price = Integer.parseInt(priceInput);
            int quantity = 10; 

            
            model.addRow(new Object[]{slot, nameInput, calories, quantity, price});
            JOptionPane.showMessageDialog(this, "Item restocked successfully.");

         
            if (regularItemsFrame == null) {
                regularItemsFrame = new Regular_Items(model);
            } else {
                
                regularItemsFrame.updateTableData(model.getData());
            }
            regularItemsFrame.setVisible(true);
            dispose();

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Invalid input. Please enter valid numbers.");
        }                               
    }

    private void ProceedActionPerformed(java.awt.event.ActionEvent evt) {
      
        if (moneyBoxFrame == null) {
            moneyBoxFrame = new MoneyBox();
        }

        moneyBoxFrame.setVisible(true); // Show the MoneyBox frame
        this.setVisible(false); // Hide the Maintenance_Reg frame
    }

    private void Collect_MoneyActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(this, "Money collected successfully.");
    }
    private void Print_SummaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Print_SummaryActionPerformed
        StringBuilder summary = new StringBuilder();
        for (int i = 0; i < model.getRowCount(); i++) {
            int slot = (int) model.getValueAt(i, 0);
            String name = (String) model.getValueAt(i, 1);
            int quantitySold = 10 - (int) model.getValueAt(i, 3); 

            summary.append("Slot ").append(slot).append(": ").append(name).append(", Quantity Sold: ").append(quantitySold).append("\n");
        }

        JOptionPane.showMessageDialog(this, "Summary:\n" + summary.toString());
    
    }

   
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Maintenance_Reg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Maintenance_Reg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Maintenance_Reg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Maintenance_Reg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Maintenance_Reg().setVisible(true);
            }
        });
    }

    private javax.swing.JButton Collect_Money;
    private javax.swing.JButton Print_Summary;
    private javax.swing.JButton Proceed;
    private javax.swing.JButton Restock_Items;
    private javax.swing.JPanel jPanel1;

}

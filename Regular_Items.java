package Main;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.List;

/**
 * This class will instantiate each object row that is to be displayed 
 * in the RegularItemTableModel class.
 */
public class Regular_Items extends javax.swing.JFrame {
        private MoneyBox moneyBoxFrame;
         private RegularItemsTableModel model; 

    /**
     * <p>
     * This constructor will set the model in which the Object arrays  
     * will be viewed and also calls the method that will instantiate 
     * the components for the GUI.
     *
     * @param model is an object generated from the RegularItemsTableModel class.
     */
    public Regular_Items(RegularItemsTableModel model) {
        initComponents();
        this.model = model;
        jTable1.setModel(model); 
    }

    /**
     * <p>
     * This constructor will set the Money Box and also regenerates the model   
     * into a new blank one and also calls the method that will instantiate 
     * the components for the GUI.
     *
     * @param moneyBoxFrame is an object generated from the MoneyBox class.
     */
    public Regular_Items(MoneyBox moneyBoxFrame) {
        initComponents();
        this.moneyBoxFrame = moneyBoxFrame;
        
        model = new RegularItemsTableModel(); 

        jTable1.setModel(model);
    }
        
    /**
     * <p>
     * This method will re-add the List of Object Arrays into the new model.
     *
     * @param slot is the slot number of the current Object Array.
     * @param name is the name of the current Object Array.
     * @param calories is the calorie count of the current Object Array.
     * @param quantity is the quantity count of the current Object Array.
     * @param price is the price of the current Object Array.
     */
    public void addRestockedItem(int slot, String name, int calories, int quantity, int price) {
        model.addRow(new Object[]{slot, name, calories, quantity, price});
    }
    
    /**
     * <p>
     * This method will update the data saved on the table model.
     *
     * @param data is an Object Array of the current row.
     */
    public void updateTableData(List<Object[]> data) {
        model.setRowCount(0);

        for (Object[] rowData : data) {
            model.addRow(rowData);
        }
    }
        
        
   
    @SuppressWarnings("unchecked")
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Buy = new javax.swing.JButton();
        Cancel = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 153, 51));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); 
        jLabel1.setText("Select Slot :");
        jLabel1.setToolTipText("");

        Buy.setFont(new java.awt.Font("Segoe UI", 1, 18)); 
        Buy.setText("Buy");
        Buy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuyActionPerformed(evt);
            }
        });

        Cancel.setFont(new java.awt.Font("Segoe UI", 1, 18)); 
        Cancel.setText("Cancel");
        Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "SLOT", "Name", "Calories", "Quantity", "Price"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 752, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Buy, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Buy, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(267, Short.MAX_VALUE))
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
     * Action performed when the "Buy" button is clicked.
     * Proceeds to the insert cash window whilst decreasing the amount
     * displayed on the current window for the selected item.
     *
     * @param evt The action event triggered when the button is clicked.
     */
    private void BuyActionPerformed(java.awt.event.ActionEvent evt) {
        int selectedRow = jTable1.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select an item from the table.");
            return;
        }

        int selectedSlot = (int) jTable1.getValueAt(selectedRow, 0);
        String itemName = (String) jTable1.getValueAt(selectedRow, 1);
        int selectedCalories = (int) jTable1.getValueAt(selectedRow, 2);
        int selectedQuantity = (int) jTable1.getValueAt(selectedRow, 3);
        int selectedPrice = (int) jTable1.getValueAt(selectedRow, 4);

        int totalAmount = moneyBoxFrame.getTotalAmount();
        if (totalAmount >= selectedPrice) {
            int change = totalAmount - selectedPrice;
            JOptionPane.showMessageDialog(this, "Success! Your change is: " + change);
            moneyBoxFrame.setVisible(true);

           
            if (selectedQuantity > 0) {
                jTable1.setValueAt(selectedQuantity - 1, selectedRow, 3);
            } else {
                JOptionPane.showMessageDialog(this, "No more items left in slot " + selectedSlot + ".");
            }

            moneyBoxFrame.setTotalAmount(0); 
            moneyBoxFrame.setChangeAmount(change); 

            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Insufficient funds.");
        }
    }

    /**
     * Action performed when the "Cancel" button is clicked.
     * Proceeds to the cancel the transaction.
     *
     * @param evt The action event triggered when the button is clicked.
     */
    private void CancelActionPerformed(java.awt.event.ActionEvent evt) {
        moneyBoxFrame.setVisible(true);
        this.dispose();
    }

   
    private javax.swing.JButton Buy;
    private javax.swing.JButton Cancel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;

}

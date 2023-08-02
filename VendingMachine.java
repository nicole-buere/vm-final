
package Main;

import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import java.util.List;

/** 
 * The VendingMachine class serves as the super class for RegularItemsTableModel and SpecialItemsTableModel
 */
public class VendingMachine {
    protected DefaultTableModel model;
/**
    * <p>
    * The constructor will instantiate the new model with column names.
    * @param columnNames are String of the names of the columns.
    */
    public VendingMachine(String[] columnNames) {
        model = new DefaultTableModel(columnNames, 0);
    }
   /**
    * <p>
    * addRow will add the Object Array row information into a new row of the model.
    * @param rowData are the List row from the List of Object Arrays.
    */
    public void addRow(Object[] rowData) {
        model.addRow(rowData);
    }
/**
     * <p>
     * This method will add the given values into the model.
     *
     * @param slot is the slot number of the current Object Array.
     * @param name is the name of the current Object Array.
     * @param calories is the calorie count of the current Object Array.
     * @param quantity is the quantity count of the current Object Array.
     * @param price is the price of the current Object Array.
     */
    public void restockItem(int slot, String name, int calories, int price, int quantity) {
        for (int i = 0; i < model.getRowCount(); i++) {
            int currentSlot = (int) model.getValueAt(i, 0);
            if (currentSlot == slot) {
                model.setValueAt(name, i, 1);
                model.setValueAt(calories, i, 2);
                model.setValueAt(price, i, 4);
                model.setValueAt(quantity, i, 3);
                return;
            }
        }

        addRow(new Object[]{slot, name, calories, quantity, price});
    }
/**
     * <p>
     * This method will return the model.
     * @return an object of DefaultTableModel.
     */
    public DefaultTableModel getModel() {
        return model;
    }
}

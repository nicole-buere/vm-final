/**
 * This class represents a custom Table Model for regular items in a menu.
 * It extends the DefaultTableModel to provide additional functionality
 * for managing regular items data.
 */
package Main;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.AbstractTableModel;


public class RegularItemsTableModel extends DefaultTableModel {
/**
*<p>
* Constructs a RegularItemsTableModel object with predefined columns and rows.
* Each row represents a regular item with its properties: Slot, Name, Calories,
* Quantity, and Price.
*/
    public RegularItemsTableModel() {
        addColumn("Slot");
        addColumn("Name");
        addColumn("Calories");
        addColumn("Quantity");
        addColumn("Price");

        addRow(new Object[]{1, "cheesy nachos", 345, 10, 120});
        addRow(new Object[]{2, "salsa nachos", 289, 10, 210});
        addRow(new Object[]{3, "guacamole nachos", 254, 10, 170});
        addRow(new Object[]{4, "sour cream nachos", 345, 10, 240});
        addRow(new Object[]{5, "ranch nachos", 389, 10, 280});
        addRow(new Object[]{6, "jalapeno nachos", 263, 10, 260});
        addRow(new Object[]{7, "barbeque nachos", 293, 10, 150});
        addRow(new Object[]{8, "truffle nachos", 352, 10, 310});
    
    }
    /**
     * Retrieves the data from the table model and returns it as a List of Object arrays.
     * @return A List containing Object arrays, where each array represents a row of data.
     */
     public List<Object[]> getData() {
        List<Object[]> data = new ArrayList<>();
        for (int row = 0; row < getRowCount(); row++) {
            Object[] rowData = new Object[getColumnCount()];
            for (int col = 0; col < getColumnCount(); col++) {
                rowData[col] = getValueAt(row, col);
            }
            data.add(rowData);
        }
        return data;
    }
    /**
     * Notifies all listeners that the table data has changed.
     * This method is used to refresh the table when the underlying data is modified.
     */
      public void fireTableDataChanged() {
        fireTableChanged(null);
    }
/**
* Specifies whether a cell is editable or not.
* In this implementation, all cells are set as non-editable.
* @param row The row index of the cell.
* @param column The column index of the cell.
* @return false to make the cell non-editable, true otherwise.
*/
    @Override
    public boolean isCellEditable(int row, int column) {
        return false;
    }
}

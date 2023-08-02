
package Main;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 * This class represents a custom Table Model for special items in a menu.
 * It extends the DefaultTableModel to provide additional functionality
 * for managing special items data.
 */
public class SpecialItemsTableModel extends DefaultTableModel {
    /**
     *<p> 
     * Constructs a SpecialTableModel instance with predefined columns and rows.
     * Each row has its corresponding columns of its slot number, name, calories, quantity and price.
     */
    public SpecialItemsTableModel() {

        addColumn("Slot");
        addColumn("Name");
        addColumn("Calories");
        addColumn("Quantity");
        addColumn("Price");

    
        addRow(new Object[]{1, "tortilla chips", 235, 10, 150});
        addRow(new Object[]{2, "ground pork", 342, 10, 185});
        addRow(new Object[]{3, "ground beef sauce", 368, 10, 250});
        addRow(new Object[]{4, "ground chicken sauce", 226, 10, 130});
        addRow(new Object[]{5, "onions", 68, 10, 125});
        addRow(new Object[]{6, "cheddar cheese", 356, 10, 217});
        addRow(new Object[]{7, "guacamole sauce", 224, 10, 150});
        addRow(new Object[]{8, "salsa sauce", 217, 10, 145});
    }
        /**
         *<p> 
         * Retrieves the data from the table model and returns the List of Object arrays.
         * @return  A List containing Object arrays, where each index of the List is a row from the table model.
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
     * Specifies whether a cell is editable or not.
     * In this implementation, all cells are set as non-editable.
     * @param row The row index of the cell.
     * @param column The column index of the cell.
     * @return false to make the cell non-editable.
     */
    @Override
    public boolean isCellEditable(int row, int column) {
       
        return false;
    }
}


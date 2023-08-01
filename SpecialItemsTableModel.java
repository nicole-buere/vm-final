
package Main;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class SpecialItemsTableModel extends DefaultTableModel {

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
    
    @Override
    public boolean isCellEditable(int row, int column) {
       
        return false;
    }
}


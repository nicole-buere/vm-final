
package Main;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.AbstractTableModel;


public class RegularItemsTableModel extends DefaultTableModel {

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
    
      public void fireTableDataChanged() {
        fireTableChanged(null);
    }

    @Override
    public boolean isCellEditable(int row, int column) {
        return false;
    }
}

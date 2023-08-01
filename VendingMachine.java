
package Main;

import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    protected DefaultTableModel model;

    public VendingMachine(String[] columnNames) {
        model = new DefaultTableModel(columnNames, 0);
    }

    public void addRow(Object[] rowData) {
        model.addRow(rowData);
    }

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

    public DefaultTableModel getModel() {
        return model;
    }
}

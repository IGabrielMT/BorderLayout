package co.uptc.edu.view.windowForManagerPerson;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class TableForWindowForManagerPerson {
    private static JTable table;

    public TableForWindowForManagerPerson() {
        createTable();
    }
    private void createTable() {
        String[] columnNames = {"Documento", "Nombre", "Apellido", "Fecha de Nacimiento", "Genero"};
        DefaultTableModel model = new DefaultTableModel(null, columnNames);
        table = new JTable(model);
    }
    public static JTable getTable() {
        return table;
    }
}

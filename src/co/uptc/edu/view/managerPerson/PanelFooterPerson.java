package co.uptc.edu.view.managerPerson;

import java.awt.Dimension;
import javax.swing.*;
import co.uptc.edu.view.Global;
import co.uptc.edu.view.windowForManagerPerson.TableForWindowForManagerPerson;

import javax.swing.table.DefaultTableModel;

public class PanelFooterPerson extends JPanel {
    private final JTable table;
    private final FilePanelBodyPerson filePanelBodyPerson;

    public PanelFooterPerson(FilePanelBodyPerson filePanelBodyPerson){
        this.table = TableForWindowForManagerPerson.getTable();
        this.filePanelBodyPerson = filePanelBodyPerson;
        initPanel();
        createEraseBtn();
        createAddBtn();
    }
    private void initPanel() {
        setBackground(Global.FOOTER_BACKGROUND_COLOR);
    }
    private void createAddBtn(){
        JButton button = new JButton("Añadir");
        Dimension d = button.getPreferredSize();
        button.setSize(d);
        button.addActionListener(e -> {
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            String[] row = new String[5];
            row[0] = filePanelBodyPerson.getTxtDocumentNumber().getText();
            row[1] = filePanelBodyPerson.getTxtName().getText();
            row[2] = filePanelBodyPerson.getTxtLastName().getText();
            // Convertir la fecha a String
            row[3] = filePanelBodyPerson.getTxtBirthDate().getDate().toString();
            row[4] = (String) filePanelBodyPerson.getTxtGender().getSelectedItem();
            model.addRow(row);
        });
        add(button);
    }
    private void createEraseBtn(){
        JButton button = new JButton("Borrar");
        Dimension d = button.getPreferredSize();
        button.setSize(d);
        button.addActionListener(e -> {
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            int[] rows = table.getSelectedRows();
            for (int i = 0; i < rows.length; i++) {
                model.removeRow(rows[i] - i);
            }
        });
        add(button);
    }
}
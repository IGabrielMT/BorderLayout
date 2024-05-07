package co.uptc.edu.view.managerPerson;

import co.uptc.edu.view.MainView;
import co.uptc.edu.view.windowForManagerPerson.TableForWindowForManagerPerson;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class ManagerPersonView extends JDialog {

    private FilePanelBodyPerson filePanelBodyPerson;

    public ManagerPersonView() {
        super(MainView.getInstance(), true);
        initDialog();
        createPanelHeader();
        createPanelBody();
        createPanelFooter();
    }

    private void initDialog() {
        setTitle("Manager Person");
        setSize(600, 400);
        setLocationRelativeTo(MainView.getInstance());
        setLayout(new BorderLayout());
    }
    public void begin(){
        setVisible(true);
    }
    private void createPanelHeader(){
        PanelHeaderPerson panelHeaderPerson = new PanelHeaderPerson();
        add(panelHeaderPerson, BorderLayout.NORTH);
    }
    private void createPanelBody(){
        filePanelBodyPerson = new FilePanelBodyPerson();
        add(filePanelBodyPerson, BorderLayout.CENTER);
    }
    private void createPanelFooter(){
        PanelFooterPerson panelFooterPerson = new PanelFooterPerson(filePanelBodyPerson);
        add(panelFooterPerson, BorderLayout.SOUTH);
    }
    public void deletePerson() {
        int selectedRow = TableForWindowForManagerPerson.getTable().getSelectedRow();
        if (selectedRow != -1) { // -1 means no row is selected
            DefaultTableModel model = (DefaultTableModel) TableForWindowForManagerPerson.getTable().getModel();
            model.removeRow(selectedRow);
        }
    }
}

package co.uptc.edu.view.managerPerson;

import co.uptc.edu.view.MainView;

import javax.swing.*;
import java.awt.*;

public class ManagerPersonView extends JDialog {


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
        FilePanelBodyPerson filePanelBodyPerson = new FilePanelBodyPerson();
        add(filePanelBodyPerson, BorderLayout.CENTER);
    }
    private void createPanelFooter(){
        PanelFooterPerson panelFooterPerson = new PanelFooterPerson();
        add(panelFooterPerson, BorderLayout.SOUTH);
    }
}

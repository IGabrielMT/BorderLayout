package co.uptc.edu.view.managerPerson;

import javax.swing.*;
import java.awt.*;

public class PanelFooterPerson extends JPanel {
    public PanelFooterPerson(){
        initPanel();
    }
    private void initPanel() {
        setBackground(Color.CYAN);
        setLayout(null);
    }
    private void createLabelDocType(){
        JLabel docType = new JLabel("Tipo de documento: ");
        docType.setBounds(20, 10, 200, 30);
        add(docType);
    }
}

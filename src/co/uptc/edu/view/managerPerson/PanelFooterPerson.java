package co.uptc.edu.view.managerPerson;

import java.awt.Dimension;

import javax.swing.*;

import co.uptc.edu.view.Global;


public class PanelFooterPerson extends JPanel {
    public PanelFooterPerson(){
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
        add(button);
    }
    private void createEraseBtn(){
        JButton button = new JButton("Borrar");
        Dimension d = button.getPreferredSize();
        button.setSize(d);
        add(button);
    }
}

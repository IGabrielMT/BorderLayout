package co.uptc.edu.view.managerPerson;

import javax.swing.*;

import co.uptc.edu.view.Global;

import java.awt.*;

public class PanelFooterPerson extends JPanel {
    public PanelFooterPerson(){
        initPanel();
        createAddBtn();
        createEraseBtn();
    }
    private void initPanel() {
        setBackground(Global.FOOTER_BACKGROUND_COLOR);
        setLayout(null);
    }
    private void createAddBtn(){
        JButton button = new JButton("Añadir");
        button.setBounds(10, 10, 80, 30);
        add(button);
    }
    private void createEraseBtn(){
        JButton button = new JButton("Borrar");
        button.setBounds(10, 40, 80, 30);
        add(button);
    }
}

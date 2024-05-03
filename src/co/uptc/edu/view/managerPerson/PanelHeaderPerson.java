package co.uptc.edu.view.managerPerson;

import javax.swing.*;

import co.uptc.edu.view.Global;


public class PanelHeaderPerson extends JPanel {
    public PanelHeaderPerson(){
        initPanel();
    }

    private void initPanel() {
        setBackground(Global.HEADER_BACKGROUND_COLOR);
        createTitle();
    }
    private void createTitle() {
        JLabel title = new JLabel("Manejador de personas");
        add(title);
    }

}

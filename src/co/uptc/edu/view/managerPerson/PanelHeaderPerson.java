package co.uptc.edu.view.managerPerson;

import javax.swing.*;
import java.awt.*;

public class PanelHeaderPerson extends JPanel {
    public PanelHeaderPerson(){
        initPanel();
    }

    private void initPanel() {
        setBackground(Color.BLUE);

        createTitle();
    }
    private void createTitle() {
        JLabel title = new JLabel("Manejador de personas");
        add(title);
    }

}

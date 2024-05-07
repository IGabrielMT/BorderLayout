package co.uptc.edu.view.windowForManagerPerson;

import co.uptc.edu.view.Global;

import javax.swing.*;
import java.awt.*;

public class HeaderForWindowsMP extends JPanel {
    public HeaderForWindowsMP(){
        initHeader();
    }
    private void initHeader() {
        setBackground(Global.HEADER_BACKGROUND_COLOR);
        setForeground(Global.HEADER_TEXT_COLOR);
        add(createTitle());
    }
    private JLabel createTitle(){
        JLabel title = new JLabel("Manejador de personas");
        title.setFont(new java.awt.Font("Tahoma", Font.BOLD, 24));
        return title;
    }
}

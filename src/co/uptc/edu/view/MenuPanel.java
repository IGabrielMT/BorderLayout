package co.uptc.edu.view;

import javax.swing.*;
import java.awt.*;

public class MenuPanel extends JPanel {
    public MenuPanel(){
        initPanel();
    }
    private void initPanel(){
        setBackground(Global.MENU_BACKGROUND_COLOR);
        setPreferredSize(new Dimension(200, 0));
        
    }
}

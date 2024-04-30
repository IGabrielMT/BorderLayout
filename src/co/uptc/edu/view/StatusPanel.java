package co.uptc.edu.view;

import javax.swing.*;
import java.awt.*;

public class StatusPanel extends JPanel {
    public StatusPanel(){
        initPanel();
    }
    private void initPanel(){
        setBackground(Color.YELLOW);
        setPreferredSize(new Dimension(0, 30));
    }
}

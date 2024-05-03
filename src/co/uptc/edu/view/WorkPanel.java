package co.uptc.edu.view;

import javax.swing.*;
import java.awt.*;

public class WorkPanel extends JPanel {
    public WorkPanel(){
        initPanel();
        createTitle();
        createButton();
    }
    private void createTitle() {
    }

    private void createButton() {
    }

    private void initPanel(){
        setBackground(Global.WORK_BACKGROUND_COLOR);
        setLayout(new GridBagLayout());
    }
}

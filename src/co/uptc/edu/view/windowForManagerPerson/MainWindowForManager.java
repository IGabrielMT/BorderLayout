package co.uptc.edu.view.windowForManagerPerson;

import co.uptc.edu.view.MainView;

import javax.swing.*;
import java.awt.*;

public class MainWindowForManager extends JDialog {
    public MainWindowForManager(){
        super(MainView.getInstance(), true);
        initWindow();
        createPanelHeader();
        createWorkPanel();
        createButtonsPanel();
    }
    private void createButtonsPanel() {
        ButtonsPanelForMP buttonsPanelForMP = new ButtonsPanelForMP();
        add(buttonsPanelForMP, BorderLayout.SOUTH);
    }
    private void initWindow() {
        setTitle("Manejador de personas");
        setSize(800, 600);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(MainView.getInstance());
        setLayout(new BorderLayout());

    }
    private void createPanelHeader(){
        HeaderForWindowsMP headerForWindowsMP = new HeaderForWindowsMP();
        add(headerForWindowsMP, BorderLayout.NORTH);
    }
    private void createWorkPanel(){
        WorkPanelForMP workPanelForMP = new WorkPanelForMP();
        add(workPanelForMP, BorderLayout.CENTER);
    }

}

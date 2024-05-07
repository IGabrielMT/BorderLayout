package co.uptc.edu.view.windowForManagerPerson;

import co.uptc.edu.view.Global;

import javax.swing.*;

public class WorkPanelForMP extends JPanel {
    public WorkPanelForMP(){
        initWorkPanel();
    }
    private void initWorkPanel() {
        setBackground(Global.WORK_BACKGROUND_COLOR);
        setForeground(Global.WORK_TEXT_COLOR);
        createTable();
    }
    private void createTable(){
        new TableForWindowForManagerPerson();
        add(new JScrollPane(TableForWindowForManagerPerson.getTable()));
    }
}

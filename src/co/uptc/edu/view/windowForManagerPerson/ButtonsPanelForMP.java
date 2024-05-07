package co.uptc.edu.view.windowForManagerPerson;

import co.uptc.edu.view.Global;
import co.uptc.edu.view.managerPerson.ManagerPersonView;

import javax.swing.*;
import java.awt.*;

public class ButtonsPanelForMP extends JPanel {
    public ButtonsPanelForMP(){
        initButtonsPanel();
    }
    private void initButtonsPanel() {
        setBackground(Global.FOOTER_BACKGROUND_COLOR);
        setForeground(Global.FOOTER_TEXT_COLOR);
        createButton();
        createDeleteButton();
    }
    private void createButton(){
        JButton button = new JButton("Agregar persona");
        Dimension d = button.getPreferredSize();
        button.setSize(d);
        button.addActionListener(e -> createManagerPersonView());
        add(button);
    }
    private void createDeleteButton(){
        JButton button = new JButton("Eliminar persona");
        Dimension d = button.getPreferredSize();
        button.setSize(d);
        button.addActionListener(e -> {
            ManagerPersonView managerPersonView = new ManagerPersonView();
            managerPersonView.deletePerson();
        });
        add(button);
    }
    private void createManagerPersonView(){
        ManagerPersonView managerPersonView = new ManagerPersonView();
        managerPersonView.begin();
    }

}

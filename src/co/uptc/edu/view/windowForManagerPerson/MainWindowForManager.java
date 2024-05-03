package co.uptc.edu.view.windowForManagerPerson;

import co.uptc.edu.view.MainView;
import co.uptc.edu.view.managerPerson.ManagerPersonView;

import javax.swing.*;
import java.awt.*;

public class MainWindowForManager extends JDialog {
    public MainWindowForManager(){
        super(MainView.getInstance(), true);
        initWindow();
        createButton();
    }

    private void initWindow() {
        setTitle("Manejador de personas");
        setSize(200,200 );
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(MainView.getInstance());
    }
    private void createButton(){
        JButton button = new JButton("Agregar persona");
        Dimension d = button.getPreferredSize();
        button.setSize(d);
        button.addActionListener(e -> createManagerPersonView());
        add(button);
    }
    private void createManagerPersonView(){
        ManagerPersonView managerPersonView = new ManagerPersonView();
        managerPersonView.begin();
    }
}

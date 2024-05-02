package co.uptc.edu.view.windowForManagerPerson;

import co.uptc.edu.view.MainView;
import co.uptc.edu.view.managerPerson.ManagerPersonView;

import javax.swing.*;
import java.awt.*;

public class MainWindowForManager extends JDialog {
    public MainWindowForManager(){
        initWindow();
        createButton();
    }

    private void initWindow() {
        setTitle("Manejador de personas");
        setSize(800, 600);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(MainView.getInstance());
        setLayout(null);
    }
    private void createButton(){
        JButton button = new JButton("Agregar persona");
        Dimension d = button.getPreferredSize();
        button.setBounds(10, 10, d.width, d.height);
        button.addActionListener(e -> createManagerPersonView());
        add(button);
    }
    private void createManagerPersonView(){
        ManagerPersonView managerPersonView = new ManagerPersonView();
        managerPersonView.begin();
    }
}

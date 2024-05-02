package co.uptc.edu.view;


import co.uptc.edu.view.windowForManagerPerson.MainWindowForManager;

import javax.swing.*;

public class MenuHeader extends JMenuBar {

    public MenuHeader() {
        initMenu();
        createMenuFile();
    }

    private void initMenu() {
        this.setOpaque(false);
    }
    private void createMenuFile(){
        JMenu menu = new JMenu("File");
        createBtnPeople(menu);
        createBtnExit(menu);
        this.add(menu);
    }
    private void createBtnPeople(JMenu menu){
        JMenuItem menuItem = new JMenuItem("People");
        menuItem.addActionListener(e -> createWindowForManager());
        menu.add(menuItem);
    }
    private void createBtnExit(JMenu menu){
        JMenuItem menuItem = new JMenuItem("Exit");
        menuItem.addActionListener(e -> System.exit(0));
        menu.add(menuItem);
    }
    private void createWindowForManager(){
        MainWindowForManager mainWindowForManager = new MainWindowForManager();
        mainWindowForManager.setVisible(true);
    }

}

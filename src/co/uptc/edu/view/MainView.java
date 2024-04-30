package co.uptc.edu.view;

import javax.swing.*;
import java.awt.*;

public class MainView extends JFrame {
    public MainView(){
        initFrame();
        createPanels();
    }
    private void createPanels(){
        createMenuPanel();
        createStatusPanel();
        createNewsPanel();
        createWorkPanel();
        createHeaderPanel();
    }
    private void initFrame(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Taller de programacion");
        setSize(800, 600);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
    }
    public void begin(){
        setVisible(true);
    }
    private void createMenuPanel(){
        MenuPanel menuPanel = new MenuPanel();
        add(menuPanel, BorderLayout.EAST);
    }
    private void createStatusPanel(){
        StatusPanel statusPanel = new StatusPanel();
        add(statusPanel, BorderLayout.SOUTH);
    }
    private void createNewsPanel(){
        NewsPanel newsPanel = new NewsPanel();
        add(newsPanel, BorderLayout.WEST);
    }
    private void createWorkPanel(){
        WorkPanel workPanel = new WorkPanel();
        add(workPanel, BorderLayout.CENTER);
    }
    private void createHeaderPanel(){
        HeaderPanel headerPanel = new HeaderPanel();
        add(headerPanel, BorderLayout.NORTH);
    }

}

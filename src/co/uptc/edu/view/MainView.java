package co.uptc.edu.view;

import javax.swing.*;
import java.awt.*;

public class MainView extends JFrame {
    private static final MainView instance = new MainView();
    private MainView(){
        initFrame();
        createPanels();
    }
    private void createPanels(){
        createMenuPanel();
        createStatusPanel();
        createNewsPanel();
        createWorkPanel();
        createHeaderPanel();
        createMenuBar();
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
        NewsPanel menuPanel = new NewsPanel();
        add(menuPanel, BorderLayout.EAST);
    }
    private void createStatusPanel(){
        StatusPanel statusPanel = new StatusPanel();
        add(statusPanel, BorderLayout.SOUTH);
    }
    private void createNewsPanel(){
        MenuPanel newsPanel = new MenuPanel();
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
    private void createMenuBar(){
        MenuHeader menuHeader = new MenuHeader();
        setJMenuBar(menuHeader);
    }
    public static MainView getInstance(){
        return instance;
    }
}

package co.uptc.edu.view;

import javax.swing.*;
import java.awt.*;

public class NewsPanel extends JPanel {
    public NewsPanel() {
        initPanel();
    }

    private void initPanel() {
        setBackground(Global.NEWS_BACKGROUND_COLOR);
        setPreferredSize(new Dimension(200, 0));
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.WHITE); // Color del círculo
        int radius = 100; // Radio del círculo
        int x = (getWidth() - radius) / 2; // Centra el círculo horizontalmente
        int y = (getHeight() - radius) / 2; // Centra el círculo verticalmente
        g.fillOval(x, y, radius, radius); // Dibuja el círculo
    }



}

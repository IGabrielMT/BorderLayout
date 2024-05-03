package co.uptc.edu.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class HeaderPanel extends JPanel {

    public HeaderPanel() {
        initPanel();
        createTitle();
        createBtnSize();
        autoCenter();
    }

    private void initPanel() {
        setBackground(Global.HEADER_BACKGROUND_COLOR);
        setPreferredSize(new Dimension(0, 100));
        setLayout(null);
    }

    private void createTitle() {
        JLabel title = new JLabel("UNIVERSIDAD PEDAGOGIA Y TECONOLOGIA DE COLOMBIA");
        title.setFont(new Font("Arial", Font.ITALIC, 15));
        title.setForeground(Global.HEADER_TEXT_COLOR);
        Dimension titleSize = title.getPreferredSize();
        title.setBounds(0, 10, getPreferredWidthWithFont(title), titleSize.height);
        add(title);
        JLabel title2 = new JLabel("FACULTAD DE INGENIERIA");
        title2.setFont(new Font("Arial", Font.BOLD, 10));
        title2.setForeground(Global.HEADER_TEXT_COLOR);
        titleSize = title2.getPreferredSize();
        title2.setBounds(0, 30, getPreferredWidthWithFont(title2), titleSize.height);
        add(title2);
        JLabel title3 = new JLabel("PROGRAMA DE INGENIERIA DE SISTEMAS");
        title3.setForeground(Global.HEADER_TEXT_COLOR);
        titleSize = title3.getPreferredSize();
        title3.setBounds(0, 50, getPreferredWidthWithFont(title3), titleSize.height);
        add(title3);
    }
    private void changeSize(JComponent component){
        Container parent = component.getParent();
        if (parent != null) {
            int x = parent.getSize().width / 2 - component.getSize().width / 2;
            int y = component.getLocation().y;
            component.setLocation(x, y);
        }
    }
    private void createBtnSize(){
        JButton btnSize = new JButton("Size");
        Dimension btnSizeSize = btnSize.getPreferredSize();
        btnSize.setBounds(0, 70, getPreferredWidthWithFont(btnSize), btnSizeSize.height);
        btnSize.addActionListener(e -> centerComponents());
        add(btnSize);
    }
    private void centerComponents() {
        for (Component component : getComponents()) {
            if (component instanceof JComponent) {
                changeSize((JComponent) component);
            }
        }
    }
    private void autoCenter(){
        addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                centerComponents();
            }
        });
    }

    private int getPreferredWidthWithFont(Component component){
        int extraSpace = 10;
        int extraSpaceLabel = 15;
        int extraSpaceButton = 40;
        if (component instanceof JLabel label) {
            FontMetrics fm = label.getFontMetrics(label.getFont());
            return fm.stringWidth(label.getText()) + extraSpaceLabel;
        } else if (component instanceof JButton button) {
            FontMetrics fm = button.getFontMetrics(button.getFont());
            return fm.stringWidth(button.getText()) + extraSpaceButton;
        }
        return component.getSize().width + extraSpace;
    }
}
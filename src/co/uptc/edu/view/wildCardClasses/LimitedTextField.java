package co.uptc.edu.view.wildCardClasses;
import javax.swing.*;
import javax.swing.text.*;

public class LimitedTextField extends JTextField {
    public LimitedTextField(int limit) {
        setDocument(new PlainDocument() {
            @Override
            public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
                if (getLength() + str.length() <= limit) {
                    super.insertString(offs, str, a);
                }
            }
        });
    }
}
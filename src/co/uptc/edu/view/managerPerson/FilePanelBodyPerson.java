package co.uptc.edu.view.managerPerson;

import co.uptc.edu.view.Global;
import co.uptc.edu.view.wildCardClasses.LimitedTextField;
import co.uptc.edu.view.wildCardClasses.NumericTextField;
import com.toedter.calendar.JDateChooser;


import javax.swing.*;

public class FilePanelBodyPerson extends JPanel {
    private NumericTextField txtDocumentNumber;
    private LimitedTextField txtName;
    private LimitedTextField txtLastName;
    private JDateChooser txtBirthDate;
    private JComboBox<String> txtGender;

    public FilePanelBodyPerson(){
        initPanel();
        createLabels();
        createFieldsForLabels();
    }
    private void createFieldsForLabels() {
        createTextFieldDocumentType();
        createTextFieldDocumentNumber();
        createTextFieldName();
        createTextFieldLastName();
        createTextFieldBirthDate();
        createTextFieldGender();
    }
    private void createLabels() {
        createLblDocumentType();
        createLblDocumentNumber();
        createLblName();
        createLblGender();
        createLblLastName();
        createLblBirthDate();
    }

    private void initPanel() {
        setBackground(Global.WORK_BACKGROUND_COLOR);
        setLayout(null);
    }
    private void createLblDocumentType(){
        JLabel lblDocumentType = new JLabel("Tipo de documento: ");
        lblDocumentType.setBounds(20, 10, 200, 30);
        add(lblDocumentType);
    }
    private void createLblDocumentNumber(){
        JLabel lblDocumentNumber = new JLabel("Numero de documento: ");
        lblDocumentNumber.setBounds(20, 50, 200, 30);
        add(lblDocumentNumber);
    }
    private void createLblName(){
        JLabel lblName = new JLabel("Nombre: ");
        lblName.setBounds(20, 90, 200, 30);
        add(lblName);
    }
    private void createLblLastName(){
        JLabel lblLastName = new JLabel("Apellido: ");
        lblLastName.setBounds(20, 130, 200, 30);
        add(lblLastName);
    }
    private void createLblBirthDate(){
        JLabel lblBirthDate = new JLabel("Fecha de nacimiento: ");
        lblBirthDate.setBounds(20, 170, 200, 30);
        add(lblBirthDate);
    }
    private void createLblGender(){
        JLabel lblGender = new JLabel("Genero: ");
        lblGender.setBounds(20, 210, 200, 30);
        add(lblGender);
    }
    private void createTextFieldDocumentType(){
        JList<String> list = new JList<>(new String[]{"Cedula de ciudadania", "Tarjeta de identidad", "Cedula de extranjeria"});
        JScrollPane txtDocumentType = new JScrollPane(list);
        txtDocumentType.setBounds(210, 15, 200, 20);
        add(txtDocumentType);
    }
    private void createTextFieldDocumentNumber(){
        txtDocumentNumber = new NumericTextField();
        txtDocumentNumber.setBounds(210, 55, 200, 20);
        add(txtDocumentNumber);
    }
    private void createTextFieldName(){
        txtName = new LimitedTextField(40);
        txtName.setBounds(210, 95, 200, 20);
        add(txtName);
    }
    private void createTextFieldLastName(){
        txtLastName = new LimitedTextField(40);
        txtLastName.setBounds(210, 135, 200, 20);
        add(txtLastName);
    }
    private void createTextFieldBirthDate(){
        txtBirthDate = new JDateChooser();
        txtBirthDate.setBounds(210, 175, 200, 20);
        add(txtBirthDate);
    }
    private void createTextFieldGender(){
        txtGender = new JComboBox<>(new String[] { "Masculino", "Femenino" });
        txtGender.setBounds(210, 215, 200, 20);
        add(txtGender);
    }

    public NumericTextField getTxtDocumentNumber() {
        return txtDocumentNumber;
    }

    public LimitedTextField getTxtName() {
        return txtName;
    }

    public LimitedTextField getTxtLastName() {
        return txtLastName;
    }

    public JDateChooser getTxtBirthDate() {
        return txtBirthDate;
    }

    public JComboBox<String> getTxtGender() {
        return txtGender;
    }
}

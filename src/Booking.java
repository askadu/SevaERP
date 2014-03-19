
import java.awt.Button;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.EventListener;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author NIKESH
 */
public class Booking extends Frame implements ActionListener {

    Label lblBookingDetails, lblCustomerId, lblBookingDate;
    TextField txtCustomerId, txtBookingDate;

    Label lblCustomerInformationSep, lblTitle, lblFname, lblMname, lblLname, lblAddress, lblCity, lblState,
            lblDistrict, lblPin, lblEmail, lblPhone, lblMobile, lblPanNo, lblDob;
    TextField txtFname, txtMname, txtLname, txtCity, txtState, txtDistrict, txtPin, txtEmail,
            txtPhone, txtMobile, txtPanNo, txtDob;
    TextArea txtAreaAddress;
    Choice chTitle;

    Label lblModelDetailsSep, lblModel, lblColor, lblPrice, lblHp, lblBookingPerson;
    TextField txtPrice, txtHp;
    Choice chModel;
    Choice chColor;
    Choice chBookingPerson;

    Button btnSave, btnClear, btnExit;

    public Booking() {
        setTitle("Booking Form");
        this.setLayout(null);
        setLocation(100, 100);

        Calendar currentDate = Calendar.getInstance();
        SimpleDateFormat formatter  = new SimpleDateFormat("dd-MM-yyyy ");
        String dateNow = formatter.format(currentDate.getTime());

        Font f=new Font("Serif",Font.BOLD,24);
        
        lblBookingDetails = new Label("Booking Details");
        //lblBookingDetails.setBackground(Color.green);
        lblBookingDetails.setBounds(180, 20, 500, 40);
        lblBookingDetails.setFont(f);
        add(lblBookingDetails);

        lblCustomerId = new Label("Customer ID ");
        lblCustomerId.setBounds(300, 80, 80, 20);
        add(lblCustomerId);

        txtCustomerId = new TextField();
        txtCustomerId.setBounds(400, 80, 100, 20);
        add(txtCustomerId);

        lblBookingDate = new Label("Booking Date ");
        lblBookingDate.setBounds(10, 80, 100, 20);
        add(lblBookingDate);

        txtBookingDate = new TextField(dateNow);
        txtBookingDate.setBounds(120, 80, 120, 20);
        add(txtBookingDate);
        txtBookingDate.enable(false);

        lblCustomerInformationSep = new Label("Customer Information");
        lblCustomerInformationSep.setBackground(Color.red);
        lblCustomerInformationSep.setBounds(10, 110, 500, 20);
        add(lblCustomerInformationSep);

        lblTitle = new Label("Title");
        lblTitle.setBounds(10, 160, 80, 20);
        add(lblTitle);

        chTitle = new Choice();
        chTitle.setBounds(100, 160, 50, 20);
        chTitle.add("Mr.");
        chTitle.add("Mrs.");
        chTitle.add("Miss.");
        add(chTitle);

        lblFname = new Label("First Name");
        lblFname.setBounds(150, 140, 120, 20);
        add(lblFname);
        txtFname = new TextField();
        txtFname.setBounds(150, 160, 120, 20);
        add(txtFname);

        lblMname = new Label("Middle Name");
        lblMname.setBounds(270, 140, 120, 20);
        add(lblMname);
        txtMname = new TextField();
        txtMname.setBounds(270, 160, 120, 20);
        add(txtMname);

        lblLname = new Label("Last Name");
        lblLname.setBounds(390, 140, 120, 20);
        add(lblLname);
        txtLname = new TextField();
        txtLname.setBounds(390, 160, 120, 20);
        add(txtLname);

        lblAddress = new Label("Address");
        lblAddress.setBounds(10, 200, 100, 20);
        add(lblAddress);

        txtAreaAddress = new TextArea(4, 4);
        txtAreaAddress.setBounds(120, 200, 400, 100);
        add(txtAreaAddress);

        lblState = new Label("State");
        lblState.setBounds(120, 310, 50, 20);
        add(lblState);

        txtState = new TextField();
        txtState.setBounds(170, 310, 100, 20);
        add(txtState);

        lblCity = new Label("City");
        lblCity.setBounds(280, 310, 50, 20);
        add(lblCity);

        txtCity = new TextField();
        txtCity.setBounds(330, 310, 100, 20);
        add(txtCity);

        lblDistrict = new Label("District");
        lblDistrict.setBounds(120, 340, 50, 20);
        add(lblDistrict);

        txtDistrict = new TextField();
        txtDistrict.setBounds(170, 340, 100, 20);
        add(txtDistrict);

        lblPin = new Label("Pin");
        lblPin.setBounds(280, 340, 50, 20);
        add(lblPin);

        txtPin = new TextField();
        txtPin.setBounds(330, 340, 100, 20);
        add(txtPin);

        lblEmail = new Label("Email");
        lblEmail.setBounds(10, 370, 100, 20);
        add(lblEmail);

        txtEmail = new TextField();
        txtEmail.setBounds(120, 370, 300, 20);
        add(txtEmail);

        lblPhone = new Label("Phone");
        lblPhone.setBounds(10, 400, 50, 20);
        add(lblPhone);

        txtPhone = new TextField();
        txtPhone.setBounds(120, 400, 150, 20);
        add(txtPhone);

        lblMobile = new Label("Mobile");
        lblMobile.setBounds(270, 400, 50, 20);
        add(lblMobile);

        txtMobile = new TextField();
        txtMobile.setBounds(320, 400, 150, 20);
        add(txtMobile);

        lblPanNo = new Label("PAN No");
        lblPanNo.setBounds(0, 0, 0, 0);
        add(lblPanNo);

        txtPanNo = new TextField();
        txtPanNo.setBounds(0, 0, 0, 0);
        add(txtPanNo);

        lblDob = new Label("D.O.B.");
        lblDob.setBounds(0, 0, 0, 0);
        add(lblDob);

        txtDob = new TextField();
        txtDob.setBounds(0, 0, 0, 0);
        add(txtDob);

        lblModelDetailsSep = new Label("Model Details");
        lblModelDetailsSep.setBackground(Color.red);
        lblModelDetailsSep.setBounds(10, 430, 500, 20);
        add(lblModelDetailsSep);

        lblModel = new Label("Model");
        lblModel.setBounds(100, 460, 100, 20);
        add(lblModel);
        chModel = new Choice();
        chModel.setBounds(100, 480, 100, 20);
        chModel.add("Alto");
        chModel.add("Omni");
        chModel.add("Swift");
        chModel.add("Swift Dzire");
        chModel.add("SX4");
        chModel.add("Celerio");
        chModel.add("Ertiga");
        add(chModel);

        lblColor = new Label("Color");
        lblColor.setBounds(320, 460, 100, 20);
        add(lblColor);
        chColor = new Choice();
        chColor.setBounds(320, 480, 120, 20);
        chColor.add("Artic White");
        chColor.add("Firebrick Red");
        chColor.add("Midnight Black");
        chColor.add("Glisring Gray");
        chColor.add("Silky Silver");
        add(chColor);

        lblPrice = new Label("Price");
        lblPrice.setBounds(0, 0, 0, 0);
        add(lblPrice);

        txtPrice = new TextField();
        txtPrice.setBounds(0, 0, 0, 0);
        add(txtPrice);

        lblHp = new Label("H.P.");
        lblHp.setBounds(0, 0, 0, 0);
        add(lblHp);

        txtHp = new TextField();
        txtHp.setBounds(0, 0, 0, 0);
        add(txtHp);

        lblBookingPerson = new Label("Booking Person");
        lblBookingPerson.setBounds(0, 0, 0, 0);
        add(lblBookingPerson);

        chBookingPerson = new Choice();
        chBookingPerson.setBounds(0, 0, 0, 0);
        chBookingPerson.add("Sumit");
        chBookingPerson.add("Harsh");
        chBookingPerson.add("Aditya");
        chBookingPerson.add("Jay");
        add(chModel);

        btnSave = new Button("Save");
        btnSave.setBounds(410, 520, 80, 30);
        add(btnSave);
        btnSave.addActionListener(this);

        btnClear = new Button("Clear");
        btnClear.setBounds(200, 520, 80, 30);
        add(btnClear);
        btnClear.addActionListener(this);

        btnExit = new Button("Exit");
        btnExit.setBounds(200, 520, 80, 30);
        add(btnExit);
        //    btnExit.addActionListener(this);
        this.setSize(600, 600);
        this.setVisible(true);//here we set frame visible property true 

        //this code for close the window
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent we) {
                dispose();
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnSave) {
            System.out.println("Save button Clicked");
            System.out.println("FirstName: " + txtFname.getText());
        }
        if (e.getSource() == btnClear) {
            System.out.println("clear button clicked");
            txtFname.setText(" ");
        }
    }
}

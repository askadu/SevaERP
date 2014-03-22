
import java.awt.Button;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.EventListener;


public class Booking extends Frame implements ActionListener{

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

        lblBookingDetails = new Label("Booking Details");
        lblBookingDetails.setBounds(250, 40, 500, 20);
        add(lblBookingDetails);

        lblCustomerId = new Label("Customer ID ");
        lblCustomerId.setBounds(10, 70, 100, 20);
        add(lblCustomerId);

        txtCustomerId = new TextField();
        txtCustomerId.setBounds(120, 70, 120, 20);
        add(txtCustomerId);

        lblBookingDate = new Label("Booking Date ");
        lblBookingDate.setBounds(300, 70, 80, 20);
        add(lblBookingDate);

        Calendar currentDate = Calendar.getInstance();
        SimpleDateFormat formatter
                = new SimpleDateFormat("dd-MM-yyyy ");
        String dateNow = formatter.format(currentDate.getTime());

        txtBookingDate = new TextField(dateNow);
        txtBookingDate.setBounds(400, 70, 100, 20);
        add(txtBookingDate);
        txtBookingDate.enable(false);

        lblCustomerInformationSep = new Label("Customer Information");
        lblCustomerInformationSep.setBackground(Color.red);
        lblCustomerInformationSep.setBounds(10, 100, 600, 20);
        add(lblCustomerInformationSep);

        lblTitle = new Label("Title");
        lblTitle.setBounds(10, 140, 80, 20);
        add(lblTitle);

        chTitle = new Choice();
        chTitle.setBounds(100, 140, 50, 20);
        chTitle.add("Mr.");
        chTitle.add("Mrs.");
        chTitle.add("Miss.");
        add(chTitle);

        lblFname = new Label("First Name");
        lblFname.setBounds(150, 120, 120, 20);
        add(lblFname);
        txtFname = new TextField();
        txtFname.setBounds(150, 140, 120, 20);
        add(txtFname);

        lblMname = new Label("Middle Name");
        lblMname.setBounds(270, 120, 120, 20);
        add(lblMname);
        txtMname = new TextField();
        txtMname.setBounds(270, 140, 120, 20);
        add(txtMname);

        lblLname = new Label("Last Name");
        lblLname.setBounds(390, 120, 120, 20);
        add(lblLname);
        txtLname = new TextField();
        txtLname.setBounds(390, 140, 120, 20);
        add(txtLname);

        lblAddress = new Label("Address");
        lblAddress.setBounds(10, 180, 100, 20);
        add(lblAddress);

        txtAreaAddress = new TextArea(4, 4);
        txtAreaAddress.setBounds(110, 180, 400, 50);
        add(txtAreaAddress);

        lblCity = new Label("City");
        lblCity.setBounds(110, 250, 50, 20);
        add(lblCity);

        txtCity = new TextField();
        txtCity.setBounds(160, 250, 150, 20);
        add(txtCity);

        lblDistrict = new Label("District");
        lblDistrict.setBounds(320, 250, 50, 20);
        add(lblDistrict);

        txtDistrict = new TextField();
        txtDistrict.setBounds(370, 250, 140, 20);
        add(txtDistrict);

        lblState = new Label("State");
        lblState.setBounds(110, 280, 50, 20);
        add(lblState);

        txtState = new TextField();
        txtState.setBounds(160, 280, 150, 20);
        add(txtState);

        lblPin = new Label("Pin");
        lblPin.setBounds(320, 280, 50, 20);
        add(lblPin);

        txtPin = new TextField();
        txtPin.setBounds(370, 280, 140, 20);
        add(txtPin);

        lblEmail = new Label("Email");
        lblEmail.setBounds(10, 320, 100, 20);
        add(lblEmail);

        txtEmail = new TextField();
        txtEmail.setBounds(110, 320, 300, 20);
        add(txtEmail);

        lblPhone = new Label("Phone");
        lblPhone.setBounds(10, 350, 50, 20);
        add(lblPhone);

        txtPhone = new TextField();
        txtPhone.setBounds(110, 350, 150, 20);
        add(txtPhone);

        lblMobile = new Label("Mobile");
        lblMobile.setBounds(270, 350, 50, 20);
        add(lblMobile);

        txtMobile = new TextField();
        txtMobile.setBounds(320, 350, 120, 20);
        add(txtMobile);

        lblPanNo = new Label("PAN No");
        lblPanNo.setBounds(10, 380, 50, 20);
        add(lblPanNo);

        txtPanNo = new TextField();
        txtPanNo.setBounds(110, 380, 150, 20);
        add(txtPanNo);

        lblDob = new Label("D.O.B.");
        lblDob.setBounds(270, 380, 50, 20);
        add(lblDob);

        txtDob = new TextField();
        txtDob.setBounds(320, 380, 120, 20);
        add(txtDob);

        lblModelDetailsSep = new Label("Model Details");
        lblModelDetailsSep.setBackground(Color.red);
        lblModelDetailsSep.setBounds(10, 410, 600, 20);
        add(lblModelDetailsSep);

        lblModel = new Label("Model");
        lblModel.setBounds(10, 440, 50, 20);
        add(lblModel);
        chModel = new Choice();
        chModel.setBounds(70, 440, 100, 20);
        chModel.add("Alto");
        chModel.add("Omni");
        chModel.add("Swift");
        chModel.add("Swift Dzire");
        chModel.add("SX4");
        chModel.add("Celerio");
        chModel.add("Ertiga");
        add(chModel);

        lblColor = new Label("Color");
        lblColor.setBounds(190, 440, 50, 20);
        add(lblColor);
        chColor = new Choice();
        chColor.setBounds(250, 440, 120, 20);
        chColor.add("Artic White");
        chColor.add("Firebrick Red");
        chColor.add("Midnight Black");
        chColor.add("Glistring Gray");
        chColor.add("Silky Silver");
        add(chColor);

        lblPrice = new Label("Price");
        lblPrice.setBounds(390, 440, 50, 20);
        add(lblPrice);

        txtPrice = new TextField();
        txtPrice.setBounds(440, 440, 100, 20);
        add(txtPrice);

        lblHp = new Label("H.P.");
        lblHp.setBounds(10, 480, 40, 20);
        add(lblHp);

        txtHp = new TextField();
        txtHp.setBounds(70, 480, 260, 20);
        add(txtHp);

        lblBookingPerson = new Label("Booking Person");
        lblBookingPerson.setBounds(350, 480, 100, 20);
        add(lblBookingPerson);

        chBookingPerson = new Choice();
        chBookingPerson.setBounds(460, 480, 80, 20);
        chBookingPerson.add("Sumit");
        chBookingPerson.add("Harsh");
        chBookingPerson.add("Aditya");
        chBookingPerson.add("Jay");
        add(chBookingPerson);

        btnSave = new Button("Save");
        btnSave.setBounds(120, 520,90, 30);
        add(btnSave);
        btnSave.addActionListener(this);

        btnClear = new Button("Clear");
        btnClear.setBounds(260, 520, 90, 30);
        add(btnClear);
            btnClear.addActionListener(this);

        btnExit = new Button("Exit");
        btnExit.setBounds(400, 520, 90, 30);
        add(btnExit);
        btnExit.addActionListener(this);
         this.setSize(600, 600);
        this.setVisible(true); 
        
        
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent we) {
                dispose();
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btnSave) {
            System.out.println("Save button Clicked");
            System.out.println("FirstName: " + txtFname.getText());
        }
        if(e.getSource() == btnExit){
             dispose();
        }
    }
    
    
}

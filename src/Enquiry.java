
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.EventListener;

public class Enquiry extends Frame  implements ActionListener, EventListener {
    
    Label lblEnquiryDetails, lblCustomerId, lblEnquiryDate;
    TextField txtCustomerId, txtEnquiryDate;
    Panel enquiryDetails;
    
    Label lblAddressSep, lblTitle, lblFname, lblMname, lblLname, lblAddress, lblCity, lblState, 
            lblDistrict, lblPin, lblEmail, lblPhone, lblMobile;
    TextField txtFname, txtMname, txtLname, txtCity, txtState, txtDistrict, txtPin, txtEmail, 
            txtPhone, txtMobile;
    TextArea txtAreaAddress;
    Choice chTitle;
    
    Label lblEnqSep, lblModel, lblColor;
    Choice chColor;
    Choice chModel;
    
    Button btnSave, btnClear, btnExit;
    
    public Enquiry() {
        
        setTitle("Enquiry Form"); 
        this.setLayout(null);
        setLocation(100, 100); 
        
        lblEnquiryDetails = new Label("Enquiry Form");  
       
        lblEnquiryDetails.setBounds(250, 40, 500, 20);
        add(lblEnquiryDetails); 
        
        
        lblCustomerId = new Label("Customer ID ");
        lblCustomerId.setBounds(300, 70, 80, 20);
        add(lblCustomerId);
        
        txtCustomerId = new TextField();
        txtCustomerId.setBounds(400, 70, 100, 20);
        add(txtCustomerId);
        
        lblEnquiryDate = new Label("Enquiry Date ");
        lblEnquiryDate.setBounds(10, 70, 100, 20);
        add(lblEnquiryDate);
        
        Calendar currentDate = Calendar.getInstance();
        SimpleDateFormat formatter
                = new SimpleDateFormat("dd-MM-yyyy ");
        String dateNow = formatter.format(currentDate.getTime());
        
        txtEnquiryDate = new TextField(dateNow);
        txtEnquiryDate.setBounds(120, 70, 120, 20);
        add(txtEnquiryDate);
        txtEnquiryDate.enable(false);
      
        

        lblAddressSep = new Label("Customer Information");
        lblAddressSep.setBackground(Color.red);
        lblAddressSep.setBounds(10, 100, 600, 20);
        add(lblAddressSep);
        
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
        txtFname.setBounds(150, 160, 120, 20 );
        add(txtFname);
        
        lblMname = new Label("Middle Name");
        lblMname.setBounds(270, 140, 120, 20);
        add(lblMname);
        txtMname = new TextField();
        txtMname.setBounds(270, 160, 120, 20 );
        add(txtMname);
        
        lblLname = new Label("Last Name");
        lblLname.setBounds(390, 140, 120, 20);
        add(lblLname);
        txtLname = new TextField();
        txtLname.setBounds(390, 160, 120, 20 );
        add(txtLname);
        
        lblAddress = new Label("Address");
        lblAddress.setBounds(10, 200, 100, 20);
        add(lblAddress);
        
        txtAreaAddress = new TextArea(4, 4);
        txtAreaAddress.setBounds(120, 200, 400, 100);
        add(txtAreaAddress);
        
        lblCity = new Label("City");
        lblCity.setBounds(120, 310, 50, 20);
        add(lblCity);
        
        txtCity = new TextField();
        txtCity.setBounds(170, 310, 100, 20);
        add(txtCity);
        
        lblDistrict = new Label("District");
        lblDistrict.setBounds(280, 310, 50, 20);
        add(lblDistrict);
        
        txtDistrict = new TextField();
        txtDistrict.setBounds(330, 310, 100, 20);
        add(txtDistrict);
        
        lblState = new Label("State");
        lblState.setBounds(120, 340, 50, 20);
        add(lblState);
        
        txtState = new TextField();
        txtState.setBounds(170, 340, 100, 20);
        add(txtState);
        
        
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
        
        lblEnqSep = new Label("Enquired Model");
        lblEnqSep.setBackground(Color.red);
        lblEnqSep.setBounds(10, 430, 600, 20);
        add(lblEnqSep);
        
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
        chColor.add("Glistring Gray");
        chColor.add("Silky Silver");
        add(chColor);
        
        btnSave = new Button("Save");
        btnSave.setBounds(100, 520, 80, 30 );
        add(btnSave);
        btnSave.addActionListener(this);
        
        btnClear = new Button("Clear");
        btnClear.setBounds(200, 520, 80, 30);
        add(btnClear);
        btnClear.addActionListener(this);
        
        btnExit = new Button("Exit");
        btnExit.setBounds(300, 520, 80, 30);
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
        
         if (e.getSource() == btnSave) {
            System.out.println("Add button Clicked");
        
        }
        if (e.getSource() == btnExit) {
            dispose();
        }
    }
    
}

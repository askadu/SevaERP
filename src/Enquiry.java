/*
 *  2014 Roza Infotech Inc. 
 *
 */

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.EventListener;

/**
 *
 * @author Akshay Kadu <akshay@rozainfotech.com>
 */
public class Enquiry extends Frame implements ActionListener, EventListener {

    Label lblEnquiryDetails, lblEnquiryNo, lblEnquiryDate, lblCustomerType, lblCreatedBy;
    TextField txtEnquiryNo, txtEnquiryDate, txtCreatedBy;
    Choice chCustomerType;
    Panel enquiryDetails;

    //address detail
    Label lblAddressSep, lblTitle, lblFname, lblMname, lblLname, lblAddress, lblCity, lblState,
            lblDistrict, lblPin, lblEmail, lblPhone, lblMobile;
    TextField txtFname, txtMname, txtLname, txtCity, txtState, txtDistrict, txtPin, txtEmail,
            txtPhone, txtMobile;
    TextArea txtAreaAddress;
    Choice chTitle;

    //model details: declare all variables for model 
    Label lblEnqSep, lblModel, lblVariant, lblColor;
    TextField txtVariant, txtColor;
    Choice chModel;

    //command buttons
    Button btnSave, btnCancel;

    /**
     * This is constructor when object will create it automatically get called. we initialize all
     * AWT component for form design
     *
     */
    public Enquiry() {

        setTitle("Enquiry Form"); //it will set the title of your Enquiry Form
        this.setLayout(null);  // initially we set Layout to null
        setLocation(100, 100); //this is the location where on the screen form will be displayed

        lblEnquiryDetails = new Label("Enquiry Details");  // set lable name ( Lable class cunstroctor)
        lblEnquiryDetails.setBackground(Color.red); // set background collor for Enquiry details
        lblEnquiryDetails.setBounds(10, 10, 500, 20); // this is the location where on the form this label will display(set all 4 coordinates)
        add(lblEnquiryDetails); //finally add the label in to the form that means component

        lblCreatedBy = new Label("Created By ");
        lblCreatedBy.setBounds(10, 40, 100, 20);
        add(lblCreatedBy);

        txtCreatedBy = new TextField();
        txtCreatedBy.setBounds(120, 40, 120, 20);
        add(txtCreatedBy);

        lblEnquiryNo = new Label("Enquiry# ");
        lblEnquiryNo.setBounds(300, 40, 80, 20);
        add(lblEnquiryNo);

        txtEnquiryNo = new TextField();
        txtEnquiryNo.setBounds(400, 40, 100, 20);
        add(txtEnquiryNo);

        lblEnquiryDate = new Label("Enquiry Date ");
        lblEnquiryDate.setBounds(10, 70, 100, 20);
        add(lblEnquiryDate);

        //for system dates
        Calendar currentDate = Calendar.getInstance();
        SimpleDateFormat formatter
                = new SimpleDateFormat("dd-MM-yyyy ");
        String dateNow = formatter.format(currentDate.getTime());

        txtEnquiryDate = new TextField(dateNow);
        txtEnquiryDate.setBounds(120, 70, 100, 20);
        add(txtEnquiryDate);
        txtEnquiryDate.enable(false);

        lblCustomerType = new Label("Customer Type");
        lblCustomerType.setBounds(300, 70, 100, 20);
        add(lblCustomerType);

        chCustomerType = new Choice();
        chCustomerType.setBounds(400, 70, 100, 20);
        chCustomerType.add("Individual");
        chCustomerType.add("Coroporate");
        add(chCustomerType);

        ////////////////////////////////////////////////////
        lblAddressSep = new Label("Address");
        lblAddressSep.setBackground(Color.red);
        lblAddressSep.setBounds(10, 100, 500, 20);
        add(lblAddressSep);

        lblTitle = new Label("Title");
        lblTitle.setBounds(10, 160, 80, 20);
        add(lblTitle);

        chTitle = new Choice();
        chTitle.setBounds(100, 160, 50, 20);
        chTitle.add("Mr.");
        chTitle.add("Ms.");
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

        ////////////////////////////////////////////////////
        lblEnqSep = new Label("Enquired Model");
        lblEnqSep.setBackground(Color.red);
        lblEnqSep.setBounds(10, 430, 500, 20);
        add(lblEnqSep);

        lblModel = new Label("Model");
        lblModel.setBounds(100, 460, 100, 20);
        add(lblModel);
        chModel = new Choice();
        chModel.setBounds(100, 480, 100, 20);
        chModel.add("Swift");
        chModel.add("Alto");
        chModel.add("sample");
        add(chModel);

        lblVariant = new Label("Variant");
        lblVariant.setBounds(210, 460, 100, 20);
        add(lblVariant);
        txtVariant = new TextField();
        txtVariant.setBounds(210, 480, 100, 20);
        add(txtVariant);

        lblColor = new Label("Color");
        lblColor.setBounds(320, 460, 100, 20);
        add(lblColor);
        txtColor = new TextField();
        txtColor.setBounds(320, 480, 100, 20);
        add(txtColor);

        btnSave = new Button("Save");
        btnSave.setBounds(100, 520, 80, 30);
        add(btnSave);
        btnSave.addActionListener(this);

        btnCancel = new Button("Cancel");
        btnCancel.setBounds(200, 520, 80, 30);
        add(btnCancel);
        btnCancel.addActionListener(this);

        this.setSize(600, 600);
        this.setVisible(true);

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
           setData(); 
        }
        if (e.getSource() == btnCancel) {
            dispose();
        }
    }
    public void setData(){
        Model model = new Model();
        String[] data = new String[17];
        data[0] = txtCreatedBy.getText();
        data[1] = chCustomerType.getSelectedItem();
        data[2] = chTitle.getSelectedItem();
        data[3] = txtFname.getText();
        data[4] = txtMname.getText();
        data[5] = txtLname.getText();
        data[6] = txtAreaAddress.getText();
        data[7] = txtState.getText();
        data[8] = txtCity.getText();
        data[9] = txtDistrict.getText();
        data[10] = txtPin.getText();
        data[11] = txtEmail.getText();
        data[12] = txtPhone.getText();
        data[13] = txtMobile.getText();
        data[14] = chModel.getSelectedItem();
        data[15] = txtVariant.getText();
        data[16] = txtColor.getText();
        
        model.addEnquiry(data);
    }

}

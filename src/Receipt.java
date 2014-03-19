
import java.awt.Button;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
public class Receipt extends Frame  implements ActionListener, EventListener {
    Label lblReceiptDetails, lblCustomerId, lblReceiptNo, lblReceiptDate;
    TextField txtCustomerId, txtReceiptNo, txtReceiptDate;
    Panel ReceiptDetails;
    
    Label lblName, lblAddress, lblMobile, lblModel, lblColor;
    TextField txtName, txtMobile, txtModel, txtColor;
    TextArea txtAreaAddress;
    
    
    Label lblPaymentDetailsSep, lblModeOfPayment, lblChqNo, lblHp, lblBankName, lblReceiptAmount;
    TextField txtChqNo, txtBankName, txtHp, txtReceiptAmount;
    Choice chModeOfPayment;
    
     Button btnSave, btnClear, btnExit;
     
     public Receipt(){
     
     setTitle("Receipt Form"); 
     this.setLayout(null);
     setLocation(100, 100); 
     
        lblReceiptDetails = new Label("Receipt Details");  
        lblReceiptDetails.setBackground(Color.green); 
        lblReceiptDetails.setBounds(0, 0, 0, 0);
        add(lblReceiptDetails); 
        
        
        lblCustomerId = new Label("Customer ID ");
        lblCustomerId.setBounds(0, 0, 0, 0);
        add(lblCustomerId);
        
        txtCustomerId = new TextField();
        txtCustomerId.setBounds(0, 0, 0, 0);
        add(txtCustomerId);
        
        lblReceiptNo = new Label("Receipt No");
        lblReceiptNo.setBounds(0, 0, 0, 0);
        add(lblReceiptNo);
        
        txtReceiptNo = new TextField();
        txtReceiptNo.setBounds(0, 0, 0,0 );
        add(txtReceiptNo);
        
       
        lblReceiptDate = new Label("Receipt Date ");
        lblReceiptDate.setBounds(0, 0, 0, 0);
        add(lblReceiptDate);
        
        Calendar currentDate = Calendar.getInstance();
        SimpleDateFormat formatter
                = new SimpleDateFormat("dd-MM-yyyy ");
        String dateNow = formatter.format(currentDate.getTime());
        
        txtReceiptDate = new TextField(dateNow);
        txtReceiptDate.setBounds(0, 0, 0, 0);
        add(txtReceiptDate);
        txtReceiptDate.enable(false);

        lblName = new Label("Customer Name");
        lblName.setBounds(0, 0, 0, 0);
        add(lblName);
        
        
        lblAddress = new Label("Address");
        lblAddress.setBounds(0, 0, 0, 0);
        add(lblAddress);
        
        txtAreaAddress = new TextArea(4, 4);
        txtAreaAddress.setBounds(0, 0, 0, 0);
        add(txtAreaAddress);
        
        lblMobile = new Label("Mobile");
        lblMobile.setBounds(0, 0, 0, 0);
        add(lblMobile);
        
        txtMobile = new TextField();
        txtMobile.setBounds(0, 0, 0, 0);
        add(txtMobile);
        
        lblModel = new Label("Model");
        lblModel.setBounds(0, 0, 0, 0);
        add(lblModel);
        
        txtModel = new TextField();
        txtModel.setBounds(0, 0, 0, 0);
        add(txtModel);
        
        lblPaymentDetailsSep = new Label("Payment Details");
        lblPaymentDetailsSep.setBackground(Color.red);
        lblPaymentDetailsSep.setBounds(0, 0, 0, 0);
        add(lblPaymentDetailsSep);
        
        lblModeOfPayment = new Label("Mode Of Payment");
        lblModeOfPayment.setBounds(0, 0, 0, 0);
        add(lblModeOfPayment);
        chModeOfPayment = new Choice();
        chModeOfPayment.setBounds(0, 0, 0, 0);
        chModeOfPayment.add("Cash");
        chModeOfPayment.add("Personal Chq.");
        chModeOfPayment.add("Bankers Chq.");
        chModeOfPayment.add("RTGS/NEFT");
        chModeOfPayment.add("Credit/Debit Card");
        add(chModeOfPayment);
        
        lblChqNo = new Label("Cheque/DD No");
        lblChqNo.setBounds(0, 0, 0, 0);
        add(lblChqNo);
        
        txtChqNo = new TextField();
        txtChqNo.setBounds(0, 0, 0, 0);
        add(txtChqNo);
        
        lblHp = new Label("H.P.");
        lblHp.setBounds(0, 0, 0, 0);
        add(lblHp);
        
        txtHp = new TextField();
        txtHp.setBounds(0, 0, 0, 0);
        add(txtHp);
        
        lblReceiptAmount = new Label("Cheque/DD No");
        lblReceiptAmount.setBounds(0, 0, 0, 0);
        add(lblReceiptAmount);
        
        txtReceiptAmount = new TextField();
        txtReceiptAmount.setBounds(0, 0, 0, 0);
        add(txtReceiptAmount);
        
        btnSave = new Button("Save");
        btnSave.setBounds(0, 0, 0, 0 );
        add(btnSave);
        btnSave.addActionListener(this);
        
        btnClear = new Button("Clear");
        btnClear.setBounds(0, 0, 0, 0);
        add(btnClear);
        btnClear.addActionListener(this);
        
        btnExit = new Button("Exit");
        btnExit.setBounds(0, 0, 0, 0);
        add(btnExit);
        btnExit.addActionListener(this);
        
        this.setVisible(true);
        this.setSize(600, 600);
     }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

 
    
}

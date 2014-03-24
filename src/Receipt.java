
import com.sun.org.apache.bcel.internal.generic.RETURN;
import java.awt.Button;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.EventListener;
import java.awt.print.*;

public class Receipt extends Frame implements ActionListener, EventListener {

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
    PrinterJob printstart;

    public Receipt() {

        setTitle("Receipt Form");
        this.setLayout(null);
        setLocation(100, 100);

        lblReceiptDetails = new Label("Receipt Details");
        lblReceiptDetails.setBackground(Color.red);
        lblReceiptDetails.setBounds(10, 40, 600, 20);
        add(lblReceiptDetails);


        lblCustomerId = new Label("Customer ID ");
        lblCustomerId.setBounds(10, 120, 100, 20);
        add(lblCustomerId);

        txtCustomerId = new TextField();
        txtCustomerId.setBounds(130, 120, 120, 20);
        add(txtCustomerId);

        lblReceiptNo = new Label("Receipt No");
        lblReceiptNo.setBounds(10, 80, 100, 20);
        add(lblReceiptNo);

        txtReceiptNo = new TextField();
        txtReceiptNo.setBounds(130, 80, 120, 20);
        add(txtReceiptNo);


        lblReceiptDate = new Label("Receipt Date ");
        lblReceiptDate.setBounds(300, 80, 80, 20);
        add(lblReceiptDate);

        Calendar currentDate = Calendar.getInstance();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy ");
        String dateNow = formatter.format(currentDate.getTime());

        txtReceiptDate = new TextField(dateNow);
        txtReceiptDate.setBounds(400, 80, 100, 20);
        add(txtReceiptDate);
        txtReceiptDate.enable(false);

        lblName = new Label("Customer Name");
        lblName.setBounds(10, 160, 100, 20);
        add(lblName);

        txtName = new TextField();
        txtName.setBounds(130, 160, 200, 20);
        add(txtName);

        lblAddress = new Label("Address");
        lblAddress.setBounds(10, 200, 100, 20);
        add(lblAddress);

        txtAreaAddress = new TextArea(4, 4);
        txtAreaAddress.setBounds(130, 200, 400, 50);
        add(txtAreaAddress);


        lblMobile = new Label("Mobile");
        lblMobile.setBounds(10, 270, 100, 20);
        add(lblMobile);

        txtMobile = new TextField();
        txtMobile.setBounds(130, 270, 100, 20);
        add(txtMobile);

        lblModel = new Label("Model");
        lblModel.setBounds(10, 310, 100, 20);
        add(lblModel);

        txtModel = new TextField();
        txtModel.setBounds(130, 310, 100, 20);
        add(txtModel);

        lblColor = new Label("Color");
        lblColor.setBounds(300, 310, 100, 20);
        add(lblColor);

        txtColor = new TextField();
        txtColor.setBounds(400, 310, 100, 20);
        add(txtColor);

        lblPaymentDetailsSep = new Label("Payment Details");
        lblPaymentDetailsSep.setBackground(Color.red);
        lblPaymentDetailsSep.setBounds(10, 350, 600, 20);
        add(lblPaymentDetailsSep);

        lblModeOfPayment = new Label("Mode Of Payment");
        lblModeOfPayment.setBounds(10, 380, 100, 20);
        add(lblModeOfPayment);
        chModeOfPayment = new Choice();
        chModeOfPayment.setBounds(130, 380, 200, 20);
        chModeOfPayment.add("Cash");
        chModeOfPayment.add("Personal Chq.");
        chModeOfPayment.add("Bankers Chq.");
        chModeOfPayment.add("RTGS/NEFT");
        chModeOfPayment.add("Credit/Debit Card");
        add(chModeOfPayment);

        lblChqNo = new Label("Cheque/DD No");
        lblChqNo.setBounds(10, 420, 100, 20);
        add(lblChqNo);

        txtChqNo = new TextField();
        txtChqNo.setBounds(130, 420, 80, 20);
        add(txtChqNo);

        lblHp = new Label("H.P.");
        lblHp.setBounds(10, 460, 50, 20);
        add(lblHp);

        txtHp = new TextField();
        txtHp.setBounds(130, 460, 200, 20);
        add(txtHp);

        lblReceiptAmount = new Label("Receipt Amount");
        lblReceiptAmount.setBounds(10, 500, 100, 20);
        add(lblReceiptAmount);

        txtReceiptAmount = new TextField();
        txtReceiptAmount.setBounds(130, 500, 80, 20);
        add(txtReceiptAmount);

        btnSave = new Button("Save");
        btnSave.setBounds(120, 540, 90, 30);
        add(btnSave);
        btnSave.addActionListener(this);

        btnClear = new Button("Clear");
        btnClear.setBounds(260, 540, 90, 30);
        add(btnClear);
        btnClear.addActionListener(this);

        btnExit = new Button("Exit");
        btnExit.setBounds(400, 540, 90, 30);
        add(btnExit);
        btnExit.addActionListener(this);

        this.setVisible(true);
        this.setSize(600, 600);

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
            System.out.println(" ");
        }
        if (e.getSource() == btnClear) {
            printstart = PrinterJob.getPrinterJob();
            printstart.setPrintable(new PrintDoc());
            if (printstart.printDialog()) {
                try {
                    printstart.print();
                } catch (Exception e1) {
                    setTitle("no printer found");
                    System.out.println(e1.getMessage());
                }
            }
        }
        if (e.getSource() == btnExit) {
            dispose();
        }
    }

    class PrintDoc implements Printable {

        public int print(Graphics g, PageFormat orei, int nopage) {
            if (nopage == 0) {
                //g.drawString(lblBillNo.getText(),50,150);
                g.drawString(lblAddress.getText(), 150, 100);
                g.drawString(lblName.getText(), 10, 70);
                g.drawString(lblColor.getText(), 10, 80);
                g.drawString(txtHp.getText(), 50, 80);
                return (PAGE_EXISTS);
            }//if
            else {
                return (NO_SUCH_PAGE);
            }
        }//print
    }//print doc
}

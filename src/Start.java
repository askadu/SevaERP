/*
 *  2014 Roza Infotech Inc. 
 *
 */

import java.sql.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.EventListener;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Akshay Kadu <akshay@rozainfotech.com>
 */

public class Start extends Frame implements ActionListener,EventListener{

    // variable declaration
    MenuBar menuBar;
    Menu menu;
    MenuItem menuItem1;
    Button btnBooking,btnEnquiry, btnReceipt;
    Choice ch1;
    Label lblMobile;
    TextField txtMobile;
    Panel p,p1;
    Connection con;
    Statement stmt;
    ResultSet rs;
    Image img;
    String id;
    //Constructor
    public Start() {
        setTitle("Maruti Seva ERP");
        this.setLayout(null);
        setLocation(0, 0);

        MediaTracker mt = new MediaTracker(this);
        img = Toolkit.getDefaultToolkit().getImage("boquet.JPG");
        
        Dimension dem = Toolkit.getDefaultToolkit().getScreenSize();
   
        setSize(dem);
        setExtendedState(MAXIMIZED_BOTH);
       
        menuBar = new MenuBar();
        setMenuBar(menuBar);

        menu = new Menu("File");
        menuBar.add(menu);

        btnEnquiry = new Button("Enquiry");
        btnEnquiry.setBounds(250, 100, 150, 40);
        add(btnEnquiry);
        
        btnBooking = new Button("Booking");
        btnBooking.setBounds(250, 300, 150, 40);
        add(btnBooking);
        
        btnReceipt = new Button("Receipt");
        btnReceipt.setBounds(250, 500, 150, 40);
        add(btnReceipt);

       
        btnBooking.addActionListener(this);
        btnEnquiry.addActionListener(this);
        btnReceipt.addActionListener(this);

        menuItem1 = new MenuItem("Enquiry");
        menu.add(menuItem1);
        menuItem1.addActionListener(this);
        
        this.setVisible(true);

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

   
    @Override
        public void paint(Graphics g) {
        if (img != null) {
            g.drawImage(img, 0, 30, this);
        } else {
            g.clearRect(0, 0, getSize().width, getSize().height);
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btnBooking){
            Booking booking = new Booking();
        }else if(e.getSource() == btnEnquiry ){
            Model model = new Model();
            try {
                id = model.generateId();
            } catch (SQLException ex) {
                Logger.getLogger(Start.class.getName()).log(Level.SEVERE, null, ex);
            }
            Enquiry enqNew = new Enquiry(id);
        }else if(e.getSource() == btnReceipt ){
            Receipt recNew = new Receipt();
        }else if(e.getSource()== menuItem1){
            Enquiry enqNew = new Enquiry();
        }
    }
    
    public static void main(String[] args) {
        Start s = new Start();
    }

}

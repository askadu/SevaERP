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
/**
 *
 * @author Akshay Kadu <akshay@rozainfotech.com>
 */

public class Start extends Frame implements ActionListener,EventListener{

    // variable declaration
    MenuBar menuBar;
    Menu menu;
    MenuItem menuItem1;
    Button btnBooking,btnEnquiry;
    Choice ch1;
    Label lblMobile;
    TextField txtMobile;
    Panel p,p1;
    Connection con;
    Statement stmt;
    ResultSet rs;
    Image img;

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
        btnBooking.setBounds(500, 100, 150, 40);
        add(btnBooking);

       
        btnBooking.addActionListener(this);
        btnEnquiry.addActionListener(this);

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
            Enquiry enqNew = new Enquiry();
        }else if(e.getSource()== menuItem1){
            Enquiry enqNew = new Enquiry();
        }
    }

}

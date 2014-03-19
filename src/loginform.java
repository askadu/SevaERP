
import java.awt.*;
import java.awt.event.*;
import java.awt.Graphics;

class LoginForm extends Frame implements ActionListener {

    Label l1, l2, l3, l4, lmsg;
    Button btnLogin, btnCancel, ok, b3;
    TextField txtUserName, txtPassword;
   
    int x1 = 0;

    Image img, img1;
    int a, b, c, d;
    int x = 0, y = 0;
    String msg = "";

    public LoginForm() {
        setLocation(100, 100);
        setBackground(Color.pink);
        l1 = new Label("Enter your ID & Password");
        l1.setFont(new Font("Times New Roman", Font.BOLD, 25));
        l1.setForeground(Color.blue);
        l1.setBounds(80, 50, 430, 30);
        add(l1);
        
        l2 = new Label("USER NAME :");
        l2.setBackground(Color.pink);
        l2.setFont(new Font("Times New Roman", Font.BOLD, 15));
        l2.setForeground(Color.blue);
        l2.setBounds(100, 150, 100, 20);
        add(l2);
        
        l3 = new Label("PASSWORD :");
        l3.setFont(new Font("Times New Roman", Font.BOLD, 15));
        l3.setForeground(Color.blue);
        l3.setBounds(100, 220, 100, 20);
        add(l3);
        
        CloseWindowClass close = new CloseWindowClass(this);
        addWindowListener(close);

        txtUserName = new TextField(15);
        txtPassword = new TextField(15);
        txtPassword.setEchoChar('*');
        txtUserName.setBounds(230, 150, 80, 30);
        txtPassword.setBounds(230, 220, 80, 30);
        add(txtUserName);
        add(txtPassword);

        btnLogin = new Button("LOGIN");
        btnLogin.setFont(new Font("Times New Roman", Font.BOLD, 15));
        btnLogin.setForeground(Color.blue);

        btnCancel = new Button("CANCEL");
        btnCancel.setFont(new Font("Times New Roman", Font.BOLD, 15));
        btnCancel.setForeground(Color.blue);

        btnLogin.setBounds(100, 300, 70, 30);
        btnCancel.setBounds(230, 300, 70, 30);

        add(btnLogin);
        add(btnCancel);

        setSize(800, 600);
        setLayout(null);

        btnLogin.addActionListener(this);
        btnCancel.addActionListener(this);

        ok = new Button("OK");
        ok.setSize(10, 10);
        ok.setFont(new Font("Times New Roman", Font.BOLD, 15));
        ok.setForeground(Color.blue);
        ok.addActionListener(this);
        
        lmsg = new Label("");
        lmsg.setFont(new Font("Times New Roman", Font.BOLD, 15));
        lmsg.setForeground(Color.RED);
        lmsg.setBounds(100, 260, 300, 20);
        add(lmsg);

        MediaTracker mt = new MediaTracker(this);
        img = Toolkit.getDefaultToolkit().getImage("maruti.jpg");
        img1 = Toolkit.getDefaultToolkit().getImage("login.jpg");
        mt.addImage(img, 0);
        mt.addImage(img1, 0);

    }//constructor

    public void actionPerformed(ActionEvent ae) {
           if (ae.getSource() == btnCancel) {
                dispose();
            }
            if (ae.getSource() == ok) {
                dispose();
                LoginForm m = new LoginForm();
                m.setVisible(true);

            }
            if(ae.getSource() == btnLogin) {
                if(txtUserName.getText().equals("nikesh") && txtPassword.getText().equals("nikesh")){
                    this.dispose();
                    Start s = new Start();
                }else {
                    lmsg.setText("Invalid Username & Password");
                    txtUserName.setText("");
                    txtPassword.setText("");
                }
            }
    }//actionPerformed

    public void update(Graphics g) {
        paint(g);
    }

    public void paint(Graphics g) {
        g.drawLine(a, b, c, d);
        g.drawString(msg, x, y);
        g.setFont(new Font("ARIAL", Font.BOLD + Font.ITALIC, 54));
        g.setColor(Color.BLACK);
        g.drawString(msg, x, y);
        if (img != null) {
            g.drawImage(img, x, y, this);
            g.drawImage(img1, 400, 130, this);
        } else {
            g.clearRect(0, 0, getSize().width, getSize().height);
        }
    }//paint

    class CloseWindowClass extends WindowAdapter {

        LoginForm bio;

        public CloseWindowClass(LoginForm bio) {
            this.bio = bio;
        }

        public void windowClosing(WindowEvent we) {
            bio.setVisible(false);
        }
    }

}//class

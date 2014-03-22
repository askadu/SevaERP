import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.lang.Thread;
import java.awt.Graphics;
class login extends Frame implements Runnable
{
	Label l1,l2,l3,l4,lmsg;
	int x1=0;

	Image img,img1;
	int a,b,c,d;
	int x=0, y=0;
	String msg="";

	public login()
	{
		setLocation(100,100);
		setBackground(Color.pink);
		l1=new Label("Welcome to Maruti Suzuki");
		l1.setBackground(Color.white);
		l1.setFont(new Font("Comic Sanse",Font.BOLD,25));
		l1.setForeground(Color.blue);

		l2=new Label("Developed By: ");
		l2.setBackground(Color.white);
		l2.setFont(new Font("Comic sanse",Font.BOLD,25));
		l2.setForeground(Color.blue);


		l3=new Label("Nikesh Korde & ");
		l3.setBackground(Color.white);
		l3.setFont(new Font("Comic sanse",Font.BOLD,25));
		l3.setForeground(Color.blue);
                
                l4=new Label("Gaurav Mangalkar ");
		l4.setBackground(Color.white);
		l4.setFont(new Font("Comic sanse",Font.BOLD,25));
		l4.setForeground(Color.blue);

		CloseWindowClass close = new CloseWindowClass(this);
		addWindowListener(close);

		l1.setBounds(60,80,460,30);
		l2.setBounds(300,300,460,30);
		l3.setBounds(350,350,460,30);
                l4.setBounds(400,400,460,30);

		add(l1);
		add(l2);
		add(l3);
                add(l4);

		setSize(800,600);
		setLayout(null);

	}
	public void run()
	{
		login obj=new login();
		obj.setVisible(true);
		obj.setTitle("Welcome Screen");
		try
		{
			repaint();
			Thread.sleep(3000);
		}
		catch (Exception e)
		{
		}
		finally
		{
			obj.dispose();
			LoginForm p = new LoginForm();
			p.setVisible(true);
			p.setTitle("Logni Form");
		}

	}
	public void update(Graphics g)
	{
		paint(g);
	}
	public void paint(Graphics g)
	{


	}
	class CloseWindowClass extends WindowAdapter
	{
		login bio;
		public CloseWindowClass(login bio)
		{
			this.bio = bio;
		}
		public void windowClosing(WindowEvent we)
		{
			bio.setVisible(false);
		}
	}
	public static void main(String arg[])
	{
		login obj1 = new login();
		obj1.dispose();

		Thread t = new Thread(obj1);
		t.start();
	}
}
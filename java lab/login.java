import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Login implements ActionListener
{
	JLabel l1;
	JLabel l2;
	
	JTextField t1;
	JTextField t2;
	
	
	JButton b1;
	JButton b2;
	
	Login()
	{
		JFrame f=new JFrame("LOGIN");
		l1=new JLabel("User Name");
		l2=new JLabel("password");
		t1=new JTextField("25");
		t2=new JTextField("8");
		b1=new JButton("Clear");
		b2=new JButton("Login");
		JPanel p = new JPanel(new GridLayout(3,1));
		p.add(l1);
		p.add(l2);
		p.add(t1);
		p.add(t2);
		p.add(b1);
		p.add(b2);
		b1.addActionListener(this);
		b2.addActionListener(this);
		f.add(p);
		f.setSize(350,350);
		f.show();
	}
	public void actionPerformed(ActionEvent e)
	{ 
		String s=e.getActionCommand();
		if (s.equals("login"))
		{		
			l1.setText(t1.getText());
			t1.setText(" ");
			}
		else if (s.equals("clear"))
		{		
			l2.setText(t2.getText());
			t2.setText(" ");
			}
	}
	public static void main(String args[])
	{
	Login t=new Login();
	}
}	
	  

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class text implements ActionListener
{
	JLabel l;
	JTextField t;
	JButton b;
	
	text()
	{
		JFrame f = new JFrame("Text heading");
		l=new JLabel("Blank");
		t= new JTextField(16);
		b=new JButton("Submit");
		JPanel p= new JPanel(new GridLayout(3,1));
		p.add(l);
		p.add(t);
		p.add(b);
		b.addActionListener(this);
		f.add(p);
		f.setSize(300,300);
		f.show();
	}
	public void actionPerformed(ActionEvent e)
	{
	
		String s=e.getActionCommand();
		if(s.equals("submit"))
		{
			l.setText(t.getText());
			t.setText(" ");
			}
		}
		public static void main(String args[])
		{
			text t=new text();
		}
		}
		

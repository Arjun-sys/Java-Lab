package lab10;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class MultiCastEvent extends JPanel implements ActionListener{
	private int counter=0;
	private JButton closeAllButton;
	public MultiCastEvent()
	{
		JButton newButton=new JButton("new");
		add(newButton);
		newButton.addActionListener(this);
		closeAllButton=new JButton("CloseAll");
		add(closeAllButton);
	}
	public void actionPerformed(ActionEvent evt)
	{
		CloseFrame f=new CloseFrame();
		counter++;
		f.setTitle("window" + counter);
		f.setSize(200,150);
		f.setLocation(30*counter,30*counter);
		f.show();
		closeAllButton.addActionListener(f);
		
	}
	public static void main(String[] args )
	{
		JFrame frame=new JFrame();
		frame.setTitle("MulticastTest");
		frame.setSize(300,200);
		frame.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
				
			}
		});
		Container contentPane=frame.getContentPane();
		contentPane.add(new MultiCastEvent());
		frame.show();
	}
	class CloseFrame extends JFrame implements ActionListener{
		public void actionPerformed(ActionEvent evt)
		{
			
		}
	}

}

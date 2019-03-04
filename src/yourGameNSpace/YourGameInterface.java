package yourGameNSpace;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;
import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.border.Border;
@SuppressWarnings("unused")

public class YourGameInterface {

	private JFrame frame;
	private JLabel lbl0;
	private JLabel lbl1;
	private JLabel lbl2;
	private JLabel lbl3;
	private JLabel lbl4;
	private JLabel lbl5;
	private JLabel lbl6;
	private JLabel lbl7;
	private JLabel lbl8;
	private Border border;
	private ImageIcon cross = new ImageIcon("Images/BlackCross.gif");
	private ImageIcon knot = new ImageIcon("Images/BlackCircle.gif");
	private Boolean user = true;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					YourGameInterface window = new YourGameInterface();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public YourGameInterface() {
		initialize();
		simpleAI();
	}
	
	/*
	 * Set's icon
	 */
	private void setIcon(JLabel label) {
		if (label.getIcon() == null) {
			if (user == true) {
				label.setIcon(cross);
			}
			else {
				label.setIcon(knot);
			}
		}
		else {
			simpleAI();
		}
	}
	
	/*
	 * AI turn
	 */
	private void simpleAI() {
		user = false;
		Random box = new Random();
		int n = box.nextInt(9);
		JLabel[] lbl = {lbl0, lbl1,lbl2,lbl3,lbl4,lbl5,lbl6,lbl7,lbl8};
		setIcon(lbl[n]);
		user = true;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame(); 
		frame.setBounds(100, 100, 250, 250); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		frame.getContentPane().setLayout(new GridLayout(3, 3, 1, 1)); 
		
		border = BorderFactory.createLineBorder(Color.BLACK,1);
		
		lbl0 = new JLabel("");
		lbl0.setBorder(border);
		lbl0.addMouseListener(new MouseAdapter()  
		{  
		    public void mouseClicked(MouseEvent e)  
		    {  
		    	if (lbl0.getIcon() == null) {
			    	setIcon(lbl0);
			    	simpleAI();
		    	}
		    }  
		}); 
		frame.getContentPane().add(lbl0);
		
		lbl1 = new JLabel("");
		lbl1.setBorder(border);
		lbl1.addMouseListener(new MouseAdapter()  
		{  
		    public void mouseClicked(MouseEvent e)  
		    {  
		    	if (lbl1.getIcon() == null) {
			    	setIcon(lbl1);
			    	simpleAI();
		    	}
		    }  
		}); 
		frame.getContentPane().add(lbl1);
		
		lbl2 = new JLabel("");
		lbl2.setBorder(border);
		lbl2.addMouseListener(new MouseAdapter()  
		{  
		    public void mouseClicked(MouseEvent e)  
		    {  
		    	if (lbl2.getIcon() == null) {
			    	setIcon(lbl2);
			    	simpleAI();
		    	}
		    }  
		}); 
		frame.getContentPane().add(lbl2);
		
		lbl3 = new JLabel("");
		lbl3.setBorder(border);
		lbl3.addMouseListener(new MouseAdapter()  
		{  
		    public void mouseClicked(MouseEvent e)  
		    {  
		    	if (lbl3.getIcon() == null) {
			    	setIcon(lbl3);
			    	simpleAI();
		    	}
		    }  
		}); 
		frame.getContentPane().add(lbl3);
		
		lbl4 = new JLabel("");
		lbl4.setBorder(border);
		lbl4.addMouseListener(new MouseAdapter()  
		{  
		    public void mouseClicked(MouseEvent e)  
		    {  
		    	if (lbl4.getIcon() == null) {
			    	setIcon(lbl4);
			    	simpleAI();
		    	}
		    }  
		}); 
		frame.getContentPane().add(lbl4);
		
		lbl5 = new JLabel("");
		lbl5.setBorder(border);
		lbl5.addMouseListener(new MouseAdapter()  
		{  
		    public void mouseClicked(MouseEvent e)  
		    {  
		    	if (lbl5.getIcon() == null) {
			    	setIcon(lbl5);
			    	simpleAI();
		    	}
		    }  
		}); 
		frame.getContentPane().add(lbl5);
		
		lbl6 = new JLabel("");
		lbl6.setBorder(border);
		lbl6.addMouseListener(new MouseAdapter()  
		{  
		    public void mouseClicked(MouseEvent e)  
		    {  
		    	if (lbl6.getIcon() == null) {
			    	setIcon(lbl6);
			    	simpleAI();
		    	}
		    }  
		}); 
		frame.getContentPane().add(lbl6);
		
		lbl7 = new JLabel("");
		lbl7.setBorder(border);
		lbl7.addMouseListener(new MouseAdapter()  
		{  
		    public void mouseClicked(MouseEvent e)  
		    {  
		    	if (lbl7.getIcon() == null) {
			    	setIcon(lbl7);
			    	simpleAI();
		    	}
		    }  
		}); 
		frame.getContentPane().add(lbl7);
		
		lbl8 = new JLabel("");
		lbl8.setBorder(border);
		lbl8.addMouseListener(new MouseAdapter()  
		{  
		    public void mouseClicked(MouseEvent e)  
		    {  
		    	if (lbl8.getIcon() == null) {
			    	setIcon(lbl8);
			    	simpleAI();
		    	}
		    }  
		}); 
		frame.getContentPane().add(lbl8);
		
	}
}

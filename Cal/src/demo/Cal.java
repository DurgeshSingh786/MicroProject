package demo;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import java.awt.*;


public class Cal {
	public Cal() 
		// TODO Auto-generated constructor stub
	
	{
		// TODO Auto-generated constructor stub
	
		JFrame  f = new JFrame("Mini calculator");
		f.setLayout(null);
		f.setLocationRelativeTo(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(400,300);
		
		JLabel btn=new JLabel("val 1 :");
		btn.setFont(new Font("Verdana", Font.LAYOUT_NO_LIMIT_CONTEXT,15));
		btn.setBounds(30,10,50,30);
		f.add(btn);
		
		JTextField txt =new JTextField("");
		txt.setBorder(null);
		txt.setHorizontalAlignment(JTextField.RIGHT);
		txt.setFont(new Font("Verdana", Font.LAYOUT_NO_LIMIT_CONTEXT,14));
		txt.setBounds(90,10,200,30);
		f.add(txt);
		
		
		JLabel btn2=new JLabel("val 2 :");
		btn2.setFont(new Font("Verdana", Font.LAYOUT_NO_LIMIT_CONTEXT,15));
		btn2.setBounds(30,70,50,30);
		f.add(btn2);
		
		JTextField txt2 =new JTextField("");
		txt2.setHorizontalAlignment(JTextField.RIGHT);
		txt2.setBounds(90,70,200,30);
		txt2.setFont(new Font("Verdana", Font.LAYOUT_NO_LIMIT_CONTEXT,14));
		txt2.setBorder(null);
		f.add(txt2);
		
		JButton addbutton=new JButton("ADD");
        addbutton.setBounds(20, 120, 80, 30);
        addbutton.setBackground(new Color(79,195,121));
        addbutton.setForeground(Color.WHITE);
        addbutton.setBorder(null);
        addbutton.setFont(new Font("Verdana", Font.LAYOUT_NO_LIMIT_CONTEXT,15));
        
        f.add(addbutton);
        
        JButton subbutton=new JButton("SUB");
        subbutton.setBounds(110, 120, 80, 30);
        subbutton.setBackground(new Color(79,195,121));
        subbutton.setForeground(Color.WHITE);
        subbutton.setBorder(null);
        subbutton.setFont(new Font("Verdana", Font.LAYOUT_NO_LIMIT_CONTEXT,15));
        f.add(subbutton);
        
        JButton mulbutton=new JButton("MUL");
        mulbutton.setBounds(200, 120, 80, 30);
        mulbutton.setBackground(new Color(79,195,121));
        mulbutton.setForeground(Color.WHITE);
        mulbutton.setBorder(null);
        mulbutton.setFont(new Font("Verdana", Font.LAYOUT_NO_LIMIT_CONTEXT,15));
        f.add(mulbutton);
        
        JButton divbutton=new JButton("DIV");
        divbutton.setBounds(290, 120, 80, 30);
        divbutton.setBackground(new Color(79,195,121));
        divbutton.setForeground(Color.WHITE);
        divbutton.setBorder(null);
        divbutton.setFont(new Font("Verdana", Font.LAYOUT_NO_LIMIT_CONTEXT,15));
        f.add(divbutton);
        
        JLabel btn3=new JLabel("Result:");
		btn3.setBounds(45,180,80,30);
		btn3.setFont(new Font("Verdana", Font.LAYOUT_NO_LIMIT_CONTEXT,15));
		f.add(btn3);
        
		JLabel btn4=new JLabel("");
		btn4.setBounds(155,180,80,30);
		
		btn4.setFont(new Font("Verdana", Font.LAYOUT_NO_LIMIT_CONTEXT,15));
		f.add(btn4);
		
		JLabel deg=new JLabel("Made by__Durgesh");
		deg.setBounds(255,222,400,30);
        deg.setBackground(Color.GREEN);
        deg.setForeground(Color.BLACK);
        deg.setBorder(null);
        deg.setFont(new Font("Verdana", Font.ITALIC,12));
		f.add(deg);
		
		
		
	         addbutton.addActionListener(new ActionListener() 
	         {
				@Override
				public void actionPerformed(ActionEvent e) 
				{
					// TODO Auto-generated method stub
					float x=Float.parseFloat(txt.getText());
					float y=Float.parseFloat(txt2.getText());
					float sum=x+y;
					btn4.setText(String.valueOf(sum));
				}
			  });	
	         
	         subbutton.addActionListener(new ActionListener() 
	         {
				@Override
				public void actionPerformed(ActionEvent e) 
				{
					// TODO Auto-generated method stub
					float x=Float.parseFloat(txt.getText());
					float y=Float.parseFloat(txt2.getText());
					float sub=x-y;
					btn4.setText(String.valueOf(sub));
				}
			  });
	         
	         mulbutton.addActionListener(new ActionListener() 
	         {
				@Override
				public void actionPerformed(ActionEvent e) 
				{
					// TODO Auto-generated method stub
					float x=Float.parseFloat(txt.getText());
					float y=Float.parseFloat(txt2.getText());
					float mul=x*y;
					btn4.setText(String.valueOf(mul));
				}
			  });	
	         
	         
	         divbutton.addActionListener(new ActionListener() 
	         {
				@Override
				public void actionPerformed(ActionEvent e) 
				{
					// TODO Auto-generated method stub
					float x=Float.parseFloat(txt.getText());
					float y=Float.parseFloat(txt2.getText());
					float sum=x/y;
					btn4.setText(String.valueOf(sum));
				}
			  });	
	}
		   public static void main(String args[])
			{
				SwingUtilities.invokeLater(new Runnable()
				{
					public void run()
					{
						Cal objCal=new Cal();
					}
				});
			}
		
}




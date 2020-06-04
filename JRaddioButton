package ilk;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.border.EmptyBorder;

public class Main {
	public static void main(String[] args) {
		
		JFrame f =new JFrame("bahar");
		JLabel l1=new JLabel();
		l1.setBounds(100, 20, 200, 40);
		l1.setText("Bahar sınavı geçti mi?");
		
		JRadioButton r1=new JRadioButton("Geçti");
		r1.setBounds(100,50, 120,30);
		r1.setActionCommand("Geçti");
		
		JRadioButton r2=new JRadioButton("Geçemedi");
		r2.setBounds(100,100, 120,30);
		r2.setActionCommand("Geçemedi");
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		
		JButton btn = new JButton("Gönder");
		btn.setBounds(100, 200,100,30);
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(bg.getSelection().getActionCommand());
				
			}
		});
	
		f.add(l1);
        f.add(r1);
        f.add(r2);
        f.add(btn);
		f.setSize(300,300);
		f.setLayout(null);
		f.setVisible(true);
		
	}
	
}

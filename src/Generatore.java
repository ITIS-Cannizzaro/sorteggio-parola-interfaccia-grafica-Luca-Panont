

import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class Generatore extends JFrame implements ActionListener{

	Font fontt= new Font("Bodoni MT", Font.PLAIN, 16);
	Font font= new Font("Bodoni MT", Font.PLAIN, 14); 
	Font fonttt= new Font("Bodoni MT", Font.PLAIN, 18); 
	
	JButton bgen= new JButton ("GENERA");
	JButton bcanc= new JButton ("CANCELLA");
	JButton bagg= new JButton ("AGGIUNGI");


	JLabel label0= new JLabel ("GENERATORE PAROLA RANDOM");
	JLabel label1= new JLabel ("Parola da aggiungere: ");
	JLabel label2= new JLabel ("Parola random: ");
	JLabel label3= new JLabel ("Parole: ");
	JLabel label= new JLabel ("");
	
	JTextArea a= new JTextArea(4,15);
	JTextArea b= new JTextArea(4,15);
	
	JTextArea t1= new JTextArea(4,15);
	JTextArea t2= new JTextArea(4,15);
	JTextArea t3= new JTextArea(4,15);
	JTextArea t4= new JTextArea(4,15);
	JTextArea t5= new JTextArea(4,15);
	JTextArea t6= new JTextArea(4,15);
	JTextArea t7= new JTextArea(4,15);
	JTextArea t8= new JTextArea(4,15);
	JTextArea t9= new JTextArea(4,15);
	
	String [] s=new String[9];
	int c=1;

	public Generatore() {
		super("Generatore Parola Random");
		
		setSize (400, 500);
		Container cont= this.getContentPane();
		
		cont.add(label0);
		label0.setBounds(50, 30, 300, 50);
		label0.setFont(fonttt);
		
		cont.add(label1);
		label1.setBounds(50, 70, 200, 50);
		label1.setFont(fontt);
		cont.add(a);
		a.setFont(fontt);
		a.setBounds(220, 80, 125, 30);
		
		cont.add(bagg);
		bagg.setBounds(125, 125, 130, 30);
		bagg.setFont(font);
		
		cont.add(label3);
		label3.setBounds(50, 150, 200, 50);
		label3.setFont(fontt);
		
		
		cont.add(t1);
		t1.setFont(font);
		t1.setBounds(50, 200, 80, 20);
		cont.add(t2);
		t2.setFont(font);
		t2.setBounds(158, 200, 80, 20);
		cont.add(t3);
		t3.setFont(font);
		t3.setBounds(265, 200, 80, 20);
		
		cont.add(t4);
		t4.setFont(font);
		t4.setBounds(50, 240, 80, 20);
		cont.add(t5);
		t5.setFont(font);
		t5.setBounds(158, 240, 80, 20);
		cont.add(t6);
		t6.setFont(font);
		t6.setBounds(265, 240, 80, 20);
		
		cont.add(t7);
		t7.setFont(font);
		t7.setBounds(50, 280, 80, 20);
		cont.add(t8);
		t8.setFont(font);
		t8.setBounds(158, 280, 80, 20);
		cont.add(t9);
		t9.setFont(font);
		t9.setBounds(265, 280, 80, 20);
		
		
		cont.add(bgen);
		bgen.setBounds(125, 320, 130, 30);
		bgen.setFont(font);
		
		cont.add(bcanc);
		bcanc.setBounds(125, 410, 130, 30);
		bcanc.setFont(font);
		
		
		cont.add(label2);
		label2.setBounds(50, 360, 200, 50);
		label2.setFont(fontt);
		cont.add(b);
		b.setFont(fontt);
		b.setBounds(190, 370, 155, 30);
	
		cont.add(label);
		setVisible(true);
		
		bagg.addActionListener(this);
		bcanc.addActionListener(this);
		bgen.addActionListener(this);

	}
	public void actionPerformed(ActionEvent e) {
	
		if (e.getSource() == bagg) {
			
			switch(c) {
				case 1:
					t1.setText(""+a.getText());
					break;
				case 2:
					t2.setText(""+a.getText());
					break;
				case 3:
					t3.setText(a.getText());
					break;
				case 4:
					t4.setText(a.getText());
					break;
				case 5:
					t5.setText(a.getText());
					break;
				case 6:
					t6.setText(a.getText());
					break;
				case 7:
					t7.setText(a.getText());
					break;
				case 8:
					t8.setText(a.getText());
					break;
				case 9:
					t9.setText(a.getText());
					break;
			}
			s[c-1]=a.getText();
			c++;
			a.setText("");
	
		}else if (e.getSource() == bcanc) {
			for(int j=0; j<9; j++) {
				s[j]=null;
			}
			t1.setText("");
			t2.setText("");
			t3.setText("");
			t4.setText("");
			t5.setText("");
			t6.setText("");
			t7.setText("");
			t8.setText("");
			t9.setText("");
			b.setText("");
			a.setText("");
			c=1;
		}else if (e.getSource() == bgen) {
			int nn=(int)(+(Math.random()*9));
			String parola= s[nn];
			b.setText(""+parola);
		}
	}
	

}

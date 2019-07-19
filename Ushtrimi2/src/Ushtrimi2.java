import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Ushtrimi2 extends JFrame implements ActionListener {
	
	//Krijimi i te gjithe Komponenteve te gui . Emri mbiemri , kredia
	JLabel emri = new JLabel("Emri :");
	//Madhesia e fushes qe do te mbushet nga useri .
	JTextField in = new JTextField(7);
	JLabel mbiemri = new JLabel("Mbiemri :");
	JTextField in2= new JTextField(7);
	JLabel kredia = new JLabel("Kredia :");
	JTextField in3 = new JTextField(7);
	//Label qe tregon se sa eshte interesi i kredise . 
	JLabel interesi =new JLabel("Interesi i kredise = 11%");
	JPanel emriPanel = new JPanel();
	JPanel mbiemriPanel=new JPanel();
	JPanel krediaPanel = new JPanel();
	JTextArea text = new JTextArea(2,25);
	
	public Ushtrimi2() {
		//super perdoret per te thirrur konstruktorin
		super ("Debt-i qe duhet te paguani");
		/**Madhesia/visible ben te mundur qe frame te shihet , setDefaultOperation bene qe programi te mbyllet dhe mos te rri hapur ne memorje pasi mbyllet
		e frame ose kornizes */
		setSize(350,225);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Krijimi i containerit , pjesa brenda frame qe do te mbaj komponent e GUI 
		Container content = getContentPane();
		//Krijon nje layout(Menyra e prezantimit) shume basik/basic per GUI-ne
		FlowLayout lay = new
	    FlowLayout(FlowLayout.LEFT);
		content.setLayout(lay);
		//ActionListener = bene qe gui te marri user input pasi ato mbushen nga user dhe klikohet enter
		in.addActionListener(this);
		in2.addActionListener(this);
		in3.addActionListener(this);
		//Insertimi i komponenteve ne container
		emriPanel.add(emri);
		emriPanel.add(in);
		mbiemriPanel.add(mbiemri);
		mbiemriPanel.add(in2);
		krediaPanel.add(kredia);
		krediaPanel.add(in3);
		content.setLayout(lay);
		content.add(emriPanel);
		content.add(mbiemriPanel);
		content.add(krediaPanel);
		content.add(text);
		content.add(interesi);
		setContentPane(content);
	}
	
	
	
public void actionPerformed(ActionEvent event) {

	//Eshte nje klase eventi , qe bene qe programi te marri inputin e userit pasi eshte klikuar operatori enter nga useri . 
	String kredia2 = in3.getText();
	double kredia = Double.parseDouble(kredia2);
	
	//Kushtet qe kredia nuk mund te jete <=0
	if(kredia==0) {
		String temp2 = "Smund te marresh kredi te = 0";
		text.setText(temp2);
		
	}
	else if(kredia <0) {
		
		String temp4= "Nuk mund te merrni kredi negative";
		text.setText(temp4);
	}
	else {
		//Formula qe na jep kredi*interes=debt
		kredia = kredia * 0.11+kredia;
		String temp3 = "Debti ose borxhi qe i detyroheni bankes =" + kredia;
		text.setText(temp3);}
	
	}
}



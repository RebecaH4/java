package estructure_data;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class wine {

	private JFrame frame;
	private JTextField output;
	public double value1 = 0;
	public double value2 = 0;
	public int operacion = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					wine window = new wine();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public wine() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 468, 328);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		output = new JTextField();
		output.setHorizontalAlignment(SwingConstants.RIGHT);
		output.setBounds(12, 12, 422, 78);
		frame.getContentPane().add(output);
		output.setColumns(10);
		
		
		JButton ca_btn = new JButton("CA");
		ca_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				output.setText("");
				value1=0;
				value2=0;
				operacion=0;
			}
		});
		ca_btn.setBounds(12, 100, 98, 25);
		frame.getContentPane().add(ca_btn);
		
		JButton btn_1 = new JButton("1");
		btn_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				wine w = new wine();	
				output.setText(w.addValue(output, w.getValue(btn_1)));

			}
		});
		btn_1.setBounds(12, 137, 98, 25);
		frame.getContentPane().add(btn_1);
		
		JButton btn_4 = new JButton("4");
		btn_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				wine w = new wine();	
				output.setText(w.addValue(output, w.getValue(btn_4)));
			}
		});
		btn_4.setBounds(12, 174, 98, 25);
		frame.getContentPane().add(btn_4);
		
		JButton btn_7 = new JButton("7");
		btn_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				wine w = new wine();	
				output.setText(w.addValue(output, w.getValue(btn_7)));
			}
		});
		btn_7.setBounds(12, 211, 98, 25);
		frame.getContentPane().add(btn_7);
		
		JButton btn_2 = new JButton("2");
		btn_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				wine w = new wine();	
				output.setText(w.addValue(output, w.getValue(btn_2)));
			}
		});
		btn_2.setBounds(120, 137, 98, 25);
		frame.getContentPane().add(btn_2);
		
		JButton btn_5 = new JButton("5");
		btn_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				wine w = new wine();	
				output.setText(w.addValue(output, w.getValue(btn_5)));
			}
		});
		btn_5.setBounds(120, 174, 98, 25);
		frame.getContentPane().add(btn_5);
		
		JButton btn_8 = new JButton("8");
		btn_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				wine w = new wine();	
				output.setText(w.addValue(output, w.getValue(btn_8)));
			}
		});
		btn_8.setBounds(120, 211, 98, 25);
		frame.getContentPane().add(btn_8);
		
		JButton btn_3 = new JButton("3");
		btn_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				wine w = new wine();	
				output.setText(w.addValue(output, w.getValue(btn_3)));
			}
		});
		btn_3.setBounds(230, 137, 98, 25);
		frame.getContentPane().add(btn_3);
		
		JButton btn_6 = new JButton("6");
		btn_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				wine w = new wine();	
				output.setText(w.addValue(output, w.getValue(btn_6)));
			}
		});
		btn_6.setBounds(230, 174, 98, 25);
		frame.getContentPane().add(btn_6);
		
		JButton btn_9 = new JButton("9");
		btn_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				wine w = new wine();	
				output.setText(w.addValue(output, w.getValue(btn_9)));
			}
		});
		btn_9.setBounds(230, 211, 98, 25);
		frame.getContentPane().add(btn_9);
		
		JButton suma = new JButton("+");
		suma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value1=Double.parseDouble(output.getText());
				output.setText("");
				operacion=1;
			}
		});
		suma.setBounds(340, 137, 98, 25);
		frame.getContentPane().add(suma);
		
		JButton btn_0 = new JButton("0");
		btn_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				wine w = new wine();	
				output.setText(w.addValue(output, w.getValue(btn_0)));
			}
		});
		btn_0.setBounds(120, 248, 98, 25);
		frame.getContentPane().add(btn_0);
		
		JButton resta = new JButton("-");
		resta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value1=Double.parseDouble(output.getText());
				output.setText("");
				operacion=2;
			}
		});
		resta.setBounds(340, 174, 98, 25);
		frame.getContentPane().add(resta);
		
		JButton division = new JButton("/");
		division.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value1=Double.parseDouble(output.getText());
				output.setText("");
				operacion=3;
			}
		});
		division.setBounds(340, 211, 98, 25);
		frame.getContentPane().add(division);
		
		JButton multi = new JButton("x");
		multi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value1=Double.parseDouble(output.getText());
				output.setText("");
				operacion=4;
			}
		});
		multi.setBounds(340, 248, 98, 25);
		frame.getContentPane().add(multi);
		
		JButton btnNewButton_1 = new JButton("=");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2=Double.parseDouble(output.getText());
				output.setText(String.valueOf(calcularValorOperacion(operacion,value1,value2)));
				
			}
		});
		btnNewButton_1.setBounds(120, 102, 98, 25);
		frame.getContentPane().add(btnNewButton_1);
	}
	
	public String getValue(JButton btn) {
		
		String value = btn.getText();
		
		return value;
	} 
	
	public double calcularValorOperacion(int op,double v1,double v2) {
		
		double value=0;
		
		switch (op) {
		
		case 1: 
			value = v1 + v2;
		break;
		case 2:
			value = v1 - v2;
		break;
		case 3:
			value = v1 / v2;
		break;
		case 4:
			value = v1 * v2;
		break;
		
		}
		
		return value;
	}
	
	public String addValue(JTextField casilla, String valor) {
		
		String value = casilla.getText();
		
		if(!(value.isEmpty()) || value!=null) {
			
			value=value+valor;
		}
		
		return value;
		
	}
	
	
}

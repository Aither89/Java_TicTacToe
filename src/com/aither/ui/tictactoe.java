package com.aither.ui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class tictactoe {

	int cpt_tour = 1;
	Color color_button;
	private JFrame frame;
	private CustomButton btn1;
	private CustomButton btn8;
	private CustomButton btn3;
	private CustomButton btn4;	
	private CustomButton btn7;
	private CustomButton btn6;
	private CustomButton btn5;
	private CustomButton btn2;
	private CustomButton btn9;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tictactoe window = new tictactoe();
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
	public tictactoe() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(0, 3, 0, 0));
		
		btn1 = new CustomButton("");
		btn1.addActionListener(btnClickListener);
		btn1.setBackground(Color.WHITE);
		frame.getContentPane().add(btn1);
		
		btn2 = new CustomButton("");
		btn2.addActionListener(btnClickListener);
		btn2.setBackground(Color.WHITE);
		frame.getContentPane().add(btn2);
		
		btn3 = new CustomButton("");
		btn3.addActionListener(btnClickListener);
		btn3.setBackground(Color.WHITE);
		frame.getContentPane().add(btn3);
		
		btn4 = new CustomButton("");
		btn4.addActionListener(btnClickListener);
		btn4.setBackground(Color.WHITE);
		frame.getContentPane().add(btn4);
		
		btn5 = new CustomButton("");
		btn5.addActionListener(btnClickListener);
		btn5.setBackground(Color.WHITE);
		frame.getContentPane().add(btn5);
		
		btn6 = new CustomButton("");
		btn6.addActionListener(btnClickListener);
		btn6.setBackground(Color.WHITE);
		frame.getContentPane().add(btn6);
		
		btn7 = new CustomButton("");
		btn7.addActionListener(btnClickListener);
		btn7.setBackground(Color.WHITE);
		frame.getContentPane().add(btn7);
		
		btn8 = new CustomButton("");
		btn8.addActionListener(btnClickListener);
		btn8.setBackground(Color.WHITE);
		frame.getContentPane().add(btn8);
		
		btn9 = new CustomButton("");
		btn9.addActionListener(btnClickListener);
		btn9.setBackground(Color.WHITE);
		frame.getContentPane().add(btn9);
	}

	public ActionListener btnClickListener =  new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			CustomButton jbutton = (CustomButton)arg0.getSource();
			if(jbutton.getEtat() != CustomButton.ETAT_DEFAULT) return;
			if( cpt_tour %2 == 1 ){
				jbutton.setEtat(CustomButton.ETAT_X);
			} else{
				jbutton.setEtat(CustomButton.ETAT_O);
			}
			cpt_tour++;
			test_gagnant();
		}
	};

	public void test_gagnant(){
		if( ((btn1.getEtat()== btn2.getEtat())&&(btn2.getEtat()== btn3.getEtat())&&(btn1.getEtat()!= 0))
				||((btn4.getEtat()== btn5.getEtat())&&(btn5.getEtat()== btn6.getEtat())&&(btn4.getEtat()!= 0))
			||((btn7.getEtat()== btn8.getEtat())&&(btn8.getEtat()== btn9.getEtat())&&(btn7.getEtat()!= 0))
			||((btn1.getEtat()== btn4.getEtat())&&(btn4.getEtat()== btn7.getEtat())&&(btn7.getEtat()!= 0))
			||((btn2.getEtat()== btn5.getEtat())&&(btn5.getEtat()== btn8.getEtat())&&(btn8.getEtat()!= 0))
			||((btn3.getEtat()== btn6.getEtat())&&(btn6.getEtat()== btn9.getEtat())&&(btn9.getEtat()!= 0))
			||((btn1.getEtat()== btn5.getEtat())&&(btn5.getEtat()== btn9.getEtat())&&(btn9.getEtat()!= 0))
			||((btn3.getEtat()== btn5.getEtat())&&(btn5.getEtat()== btn7.getEtat())&&(btn7.getEtat()!= 0)))
		{
			javax.swing.JOptionPane.showMessageDialog(null, "le joueur "+ cpt_tour %2+" a gagné");
			System.exit(0);
		}
		else if((btn1.getEtat()!= 0)&&(btn2.getEtat()!= 0)
				&&(btn3.getEtat()!= 0)&&(btn4.getEtat()!= 0)
				&&(btn5.getEtat()!= 0)&&(btn6.getEtat()!= 0)
				&&(btn7.getEtat()!= 0)&&(btn8.getEtat()!= 0)
				&&(btn9.getEtat()!= 0))
		{
			javax.swing.JOptionPane.showMessageDialog(null, "Match nul !");
			System.exit(0);
		}
	};
	
}
package br.com.interfacegrafica;

import javax.swing.JFrame;
import javax.swing.JButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
public class Eventos extends JFrame implements ActionListener{
	
	public Eventos() {
		super ("Meu Frame");
		
		JButton	botao = new JButton("Clique");
		botao.addActionListener(this);
	
		getContentPane().add(botao);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,300);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Eventos();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Você clicou!");
	}

}

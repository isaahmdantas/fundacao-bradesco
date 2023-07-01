package br.com.interfacegrafica;

import javax.swing.JFrame;
import javax.swing.JButton;

import java.awt.BorderLayout;
import java.awt.Container;

@SuppressWarnings("serial")
public class Layouts extends JFrame{
	
	public Layouts() {
		super ("Meu Layout");
		
		Container c = getContentPane();
		
		c.add(BorderLayout.NORTH, new JButton("Botao Norte!"));
		c.add(BorderLayout.SOUTH, new JButton("Botao Sul!"));
		c.add(BorderLayout.CENTER, new JButton("Botao Centro!"));
		c.add(BorderLayout.EAST, new JButton("Botao Leste!"));
		c.add(BorderLayout.WEST, new JButton("Botao Oeste!"));
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,300);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Layouts();
	}

}

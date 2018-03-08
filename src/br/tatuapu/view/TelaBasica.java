package br.tatuapu.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Rectangle;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.omg.CORBA.Bounds;

public class TelaBasica extends JFrame {

	private JPanel contentPane;
	private String title;
	private Rectangle bounds;
	
	public static void main(String[] args) {
		TelaBasica tb =new TelaBasica();
		tb.setVisible(true);
	}

	/**
	 * Create the frame.
	 */
	public TelaBasica() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setBounds(100, 100, 450, 300);
		setBounds(getBounds());
		setTitle(getTitle());
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));	
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

	public String getTitle() {
		if(title == null) {
			return "LotoEasy ";
		}else
			return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Rectangle getBounds() {
		if (bounds==null)
			return new Rectangle(100, 100, 450, 300);
		else
			return bounds;
	}

	public void setBounds(Rectangle bounds) {
		this.bounds = bounds;
	}

}

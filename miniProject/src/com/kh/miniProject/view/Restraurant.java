package com.kh.miniProject.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Restraurant extends JPanel {
	private JFrame start;

	private JPanel restraurant;

	public Restraurant(JFrame start) {
		this.start = start;
		restraurant = this;
		this.setBounds(0, 0, 960, 720);
		this.setLayout(null);
//			JLabel RestraurantBack = new JLabel(
//					new ImageIcon(new ImageIcon("images/영화관.PNG").getImage().getScaledInstance(960, 720, 0)));
//			RestraurantBack.setBounds(0, 0, 960, 720);
		this.setBackground(Color.ORANGE);
		System.out.println("패널 생성");

		RestraurantInit();

	}

	public void RestraurantInit() {
		System.out.println("Restraurant 내부 인터");
		restraurant.setVisible(true);
		JButton exit = new JButton();
		exit.setLocation(850, 50);
		exit.setSize(30, 30);
		exit.setText("x");
		exit.addActionListener(new ChangeMain());

		restraurant.add(exit);

	}

	class ChangeMain implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			ChangePanel.ChangePanel(start, restraurant, new MiniMap(start));
		}

	}
}

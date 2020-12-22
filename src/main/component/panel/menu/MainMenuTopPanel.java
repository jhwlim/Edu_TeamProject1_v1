package main.component.panel.menu;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import main.component.label.LogoLabel;

public class MainMenuTopPanel extends JPanel {
	
	private static final int COLOR_INT = 0xCCE3EE;
	public static final Color COLOR = new Color(COLOR_INT);
	
	public static final int WIDTH = 0;
	public static final int HEIGHT = 340;
	
	public MainMenuTopPanel() {
		setDefaultConfig();
		setComponents();
	}
	
	private void setDefaultConfig() {
		setBackground(COLOR);
		setPreferredSize(new Dimension(WIDTH, HEIGHT));
		setLayout(new CardLayout());
	
	}
	
	private void setComponents() {
		String text = "Welcome CAFE!";
		JLabel label = new JLabel(text,
								  LogoLabel.getImgIcon(), 
								  SwingConstants.CENTER);// 텍스트 + 이미지 합침
		label.setFont(new Font("맑은 고딕", Font.BOLD, 68));
		label.setForeground(Color.white);// 텍스트 컬러
		
		
		add(label);
		
		label.setHorizontalAlignment(SwingConstants.CENTER);
	
	}
	
}

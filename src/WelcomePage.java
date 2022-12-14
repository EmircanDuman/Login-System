import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class WelcomePage {
	
	JFrame frame = new JFrame();
	JLabel welcomeLabel = new JLabel();
	
	WelcomePage(String name){
		welcomeLabel.setBounds(0, 0, 200, 35);
		welcomeLabel.setFont(new Font("Arial", Font.PLAIN, 25));
		welcomeLabel.setText("Hello " + name);
		
		frame.add(welcomeLabel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420, 420);
		frame.setLayout(null);
		frame.setVisible(true);
	}
}

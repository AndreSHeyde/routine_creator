import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

public abstract class AppMainMenuPanel 
{
	static JPanel p;
	
	public static void init(guiClass g)
	{
		p = new JPanel(null);
		p.setSize(800,500);
		
		JButton goToSearchButton = new JButton("Search Exercises");
		goToSearchButton.setBounds(600,150,140,30);
		
		goToSearchButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				g.changeState(2);
			}
		});
		
		JButton goToCreatePlanButton = new JButton("Create Plan");
		goToCreatePlanButton.setBounds(400,150,140,30);
		
		goToCreatePlanButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				g.changeState(3);
			}
		});
		
		p.add(goToSearchButton);
		p.add(goToCreatePlanButton);
		
	}
	
	public static void setVisible(boolean b)
	{
		p.setVisible(b);
	}

	public static JPanel getPanel()
	{
		return p;
	}
}

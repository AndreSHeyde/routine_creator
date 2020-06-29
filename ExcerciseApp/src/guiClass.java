import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class guiClass
{
	JFrame frame = new JFrame("ExerciseApp");
	
	public guiClass()
	{
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(900,600);
		
		AppMainMenuPanel.init(this);
		SearchExercisePanel.init(this);
		CreateExercisePlanPanel.init(this);

		frame.add(AppMainMenuPanel.getPanel());
		frame.add(SearchExercisePanel.getPanel());
		frame.add(CreateExercisePlanPanel.getPanel());
		
		frame.setLayout(null);
	
	}
	
	public void display()
	{
		this.changeState(1);
		frame.setVisible(true);
	}
	
	public void changeState(int i)
	{
		AppMainMenuPanel.setVisible(false);
		SearchExercisePanel.setVisible(false);
		CreateExercisePlanPanel.setVisible(false);
		
		switch (i) {
			case 1:
				AppMainMenuPanel.setVisible(true);
				break;
			case 2:
				SearchExercisePanel.setVisible(true);
				break;
			case 3:
				CreateExercisePlanPanel.setVisible(true);
				break;
			default:
				throw new NullPointerException("Accessing Illegal JPanel");
		}
	}

}

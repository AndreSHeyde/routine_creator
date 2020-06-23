import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

public abstract class CreateExercisePlanPanel 
{
	static JPanel p;
	ExerciseTable table;
	
	public static void init(guiClass g)
	{
		p = new JPanel(null);
		p.setSize(800,500);
		
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

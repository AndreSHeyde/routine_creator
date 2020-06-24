import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

public abstract class SearchExercisePanel
{
	static JPanel p;
	ExerciseTable table;
	
	
	public static void init(guiClass g, ExerciseTable t)
	{	
		p = new JPanel(null);
		p.setSize(800,500);
		
		JComboBox muscleGroupDropDown = new JComboBox(MuscleGroup.values());
		muscleGroupDropDown.setBounds(50,150,140,30);
		
		JComboBox muscleExercisesDropDown = new JComboBox();
		muscleExercisesDropDown.setBounds(200,150,140,30);
		
		JTextArea exerciseDescription = new JTextArea();
		exerciseDescription.setBounds(400,150,400,200);
		exerciseDescription.setRows(10);
		exerciseDescription.setColumns(80);
		exerciseDescription.setEditable(false);
		
		JButton goBackButton = new JButton("Go Back");
		goBackButton.setBounds(50,300,140,50);
		
		muscleGroupDropDown.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				muscleExercisesDropDown.removeAllItems();
				ArrayList<ExerciseClass> exerciseList = t.getList(((MuscleGroup)muscleGroupDropDown.getSelectedItem()));
				for(int i = 0; i < exerciseList.size(); i++)
				{
					muscleExercisesDropDown.addItem(exerciseList.get(i).getName());
				}
			}
		});
		
		muscleExercisesDropDown.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try 
				{
					ArrayList<ExerciseClass> exerciseList = t.getList(((MuscleGroup)muscleGroupDropDown.getSelectedItem()));
					exerciseDescription.setText(exerciseList.get(muscleExercisesDropDown.getSelectedIndex()).toString());
				} 
				catch (NullPointerException n) 
				{
					exerciseDescription.setText("");
				}
				catch (IndexOutOfBoundsException n)
				{
					exerciseDescription.setText("");
				}
			}
		});
		
		goBackButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				g.changeState(1);
			}
		});
		
		p.add(muscleGroupDropDown);
		p.add(muscleExercisesDropDown);
		p.add(exerciseDescription);
		p.add(goBackButton);
	}
	
	public static JPanel getPanel()
	{
		return p;
	}
	
	public static void setVisible(boolean b)
	{
		p.setVisible(b);
	}
}

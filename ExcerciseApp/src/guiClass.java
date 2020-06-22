import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class guiClass
{
	JFrame frame;
	ExerciseTable table;
	//Will change to static table later
	
	public guiClass(ExerciseTable t)
	{
		frame = new JFrame("Main Menu");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(900,500);
		table = t;
		
		JComboBox muscleGroupDropDown = new JComboBox(MuscleGroup.values());		
		muscleGroupDropDown.setBounds(50,frame.getHeight()/2,140,30);
		
		JComboBox muscleExercisesDropDown = new JComboBox();
		muscleExercisesDropDown.setBounds(200,frame.getHeight()/2,140,30);
		
		JTextArea exerciseDescription = new JTextArea();
		exerciseDescription.setBounds(400,frame.getHeight()/3,400,200);
		exerciseDescription.setRows(10);
		exerciseDescription.setColumns(80);
		exerciseDescription.setEditable(true);
		
		muscleGroupDropDown.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				muscleExercisesDropDown.removeAllItems();
				ArrayList<ExerciseClass> exerciseList = t.getList(((MuscleGroup)muscleGroupDropDown.getSelectedItem()).getLocation());
				for(int i = 0; i < exerciseList.size(); i++)
				{
					muscleExercisesDropDown.addItem(exerciseList.get(i).getName());
				}
			}
		});
		
		muscleExercisesDropDown.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				exerciseDescription.setText(t.getExercise(muscleExercisesDropDown.getSelectedItem().toString()).toString());
				} catch (NullPointerException n) {
					exerciseDescription.setText("");
				}
			}
		});
		

		frame.add(muscleGroupDropDown);
		frame.add(muscleExercisesDropDown);
		frame.add(exerciseDescription);
		frame.setLayout(null);
	
	}
	
	public void display()
	{
		frame.setVisible(true);
	}

}

import java.io.*;
public class test 
{
	//Simple Test Cases
	public static void main(String[] args)
	{
		//Creates excercise
		ExcerciseClass a = new ExcerciseClass("Pull-Ups", "Pull Yourself Up", MuscleGroup.BACK);
		a.addSuppMuscle(MuscleGroup.BICEPS);
		a.addSuppMuscle(MuscleGroup.SHOULDERS);
		a.addEquipment("Bar");
		
		//Creates excercise
		ExcerciseClass b = new ExcerciseClass("Push Up", "Push off the ground", MuscleGroup.CHEST);
		b.addSuppMuscle(MuscleGroup.BICEPS);
		b.addSuppMuscle(MuscleGroup.TRICEPS);
		
		//Creates excercise
		ExcerciseClass c = new ExcerciseClass("Barbell Bench", "Push a heavy Stick", MuscleGroup.CHEST);
		c.addSuppMuscle(MuscleGroup.BICEPS);
		c.addSuppMuscle(MuscleGroup.SHOULDERS);
		c.addEquipment("Barbell");
		c.addEquipment("Bench Press");
		
		//Creates table and adds excercise to table
		ExcerciseTable table = new ExcerciseTable();
		table.addExcercise(a);
		table.addExcercise(b);
		table.addExcercise(c);
		
		//Prints out excercises in table
		System.out.println(table.toString());

	}

}

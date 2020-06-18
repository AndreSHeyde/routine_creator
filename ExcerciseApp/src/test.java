import java.io.*;
public class test 
{
	//Simple Test Cases
	public static void main(String[] args)
	{
		ExcerciseClass a = new ExcerciseClass("Pull-Ups", "Pull Yourself Up", MuscleGroup.BACK);
		a.addSuppMuscle(MuscleGroup.BICEPS);
		a.addSuppMuscle(MuscleGroup.SHOULDERS);
		a.addEquipment("Bar");
		
		ExcerciseClass b = new ExcerciseClass("Push Up", "Push off the ground", MuscleGroup.CHEST);
		b.addSuppMuscle(MuscleGroup.BICEPS);
		b.addSuppMuscle(MuscleGroup.TRICEPS);
		
		ExcerciseClass c = new ExcerciseClass("Barbell Bench", "Push a heavy Stick", MuscleGroup.CHEST);
		c.addSuppMuscle(MuscleGroup.BICEPS);
		c.addSuppMuscle(MuscleGroup.SHOULDERS);
		c.addEquipment("Barbell");
		c.addEquipment("Bench Press");
		
		ExcerciseTable table = new ExcerciseTable();
		table.addExcercise(a);
		table.addExcercise(b);
		table.addExcercise(c);
		System.out.println(table.toString());

	}

}

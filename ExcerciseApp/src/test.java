import java.io.*;
public class test 
{
	//Simple Test Cases
	public static void main(String[] args)
	{
		//Creates excercise
		ExerciseClass a = new ExerciseClass("Pull-Ups", "Pull Yourself Up", MuscleGroup.BACK);
		a.addSuppMuscle(MuscleGroup.BICEPS);
		a.addSuppMuscle(MuscleGroup.SHOULDERS);
		a.addEquipment("Bar");
		
		//Creates excercise
		ExerciseClass b = new ExerciseClass("Push Up", "Push off the ground", MuscleGroup.CHEST);
		b.addSuppMuscle(MuscleGroup.BICEPS);
		b.addSuppMuscle(MuscleGroup.TRICEPS);
		
		//Creates excercise
		ExerciseClass c = new ExerciseClass("Barbell Bench", "Push a heavy Stick", MuscleGroup.CHEST);
		c.addSuppMuscle(MuscleGroup.BICEPS);
		c.addSuppMuscle(MuscleGroup.SHOULDERS);
		c.addEquipment("Barbell");
		c.addEquipment("Bench Press");
		
		//Creates table and adds excercise to table
		ExerciseTable table = new ExerciseTable();
		table.addExercise(a);
		table.addExercise(b);
		table.addExercise(c);
		
		//Prints out excercises in table
		System.out.println(table.toString());
		
		try {
			FileOutputStream fos = new FileOutputStream("Database.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(table);
			oos.close();
			fos.close();
			System.out.println("Serialized");
		} catch (IOException i) {
			i.printStackTrace();
		}
		

	}

}

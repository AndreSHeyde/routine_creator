import java.io.*;
public class test 
{
	public static void main(String[] args)
	{
		ExcerciseClass a = new ExcerciseClass("Pull-Ups", "Pull Yourself Up", MuscleGroup.BACK);
		a.addSuppMuscle(MuscleGroup.BICEPS);
		a.addSuppMuscle(MuscleGroup.SHOULDERS);
		a.addEquipment("Bar");
		//a.printExcercise();
		
		ExcerciseTable table = new ExcerciseTable();
		table.addExcercise(a);
		for (int i = 0; i < 11; i++)
		{
			System.out.println(table[i].toString());
		}
		

	}

}

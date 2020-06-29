import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public abstract class ExerciseTable implements java.io.Serializable
{
	static ArrayList<ExerciseClass>[] exerciseTable;
	
	public static void init()
	{
		try {
			FileInputStream fis = new FileInputStream("Database.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			exerciseTable = (ArrayList<ExerciseClass>[]) ois.readObject();
			ois.close();
			fis.close();
		} catch (IOException i) {
			i.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static void addExercise(ExerciseClass e)
	{
		exerciseTable[e.getPrimMuscle().getLocation()].add(e);
	}
	
	public static ArrayList<ExerciseClass> getList(int i)
	{
		return exerciseTable[i];
	}
	
	public static ArrayList<ExerciseClass> getList(MuscleGroup m)
	{
		return exerciseTable[m.getLocation()];
	}
	
	
	public static ExerciseClass getExercise(String n)
	{
		for (MuscleGroup i : MuscleGroup.values())
		{
			ArrayList<ExerciseClass> muscleExercises = exerciseTable[i.getLocation()];
			for (int j = 0; j < muscleExercises.size(); j++)
			{
				ExerciseClass ret = muscleExercises.get(j);
				if (ret.getName().contentEquals(n))
				{
					return ret;
				}
			}
		}
		return null;
	}
	
	public ExerciseClass removeExercise(String n)
	{
		for (MuscleGroup i : MuscleGroup.values())
		{
			ArrayList<ExerciseClass> muscleExercises = exerciseTable[i.getLocation()];
			for (int j = 0; j < muscleExercises.size(); j++)
			{
				ExerciseClass ret = muscleExercises.get(j);
				if (ret.getName().contentEquals(n))
				{
					return muscleExercises.remove(j);
				}
			}
		}
		return null;
	}
	
	//Converts entire table to a string
	public static String staticToString()
	{
		String ret = "";
		for (MuscleGroup i : MuscleGroup.values())
		{
			ArrayList<ExerciseClass> muscleExercises = exerciseTable[i.getLocation()];
			ret = ret + i.toString() + "\n========================\n";
			for (int j = 0; j < muscleExercises.size(); j++)
			{
				ret = ret + muscleExercises.get(j).toString() + "\n----------------\n";
			}
		}
		return ret;
	}

}

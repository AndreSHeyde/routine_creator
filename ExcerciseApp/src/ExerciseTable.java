import java.util.ArrayList;

public class ExerciseTable 
{
	ArrayList<ExerciseClass>[] exerciseTable;
	
	public ExerciseTable()
	{
		exerciseTable = new ArrayList[11];
		for (int i = 0; i < 11; i++)
		{
			exerciseTable[i] = new ArrayList<ExerciseClass>();
		}
	}
	
	public void addExercise(ExerciseClass e)
	{
		exerciseTable[e.getPrimMuscle().getLocation()].add(e);
	}
	
	public ArrayList<ExerciseClass> getList(int i)
	{
		return exerciseTable[i];
	}
	
	public ExerciseClass getExercise(String n)
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
	public String toString()
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

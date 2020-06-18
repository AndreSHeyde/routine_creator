import java.util.ArrayList;

public class ExcerciseTable 
{
	ArrayList<ExcerciseClass>[] excerciseTable;
	
	public ExcerciseTable()
	{
		excerciseTable = new ArrayList[11];
		for (int i = 0; i < 11; i++)
		{
			excerciseTable[i] = new ArrayList<ExcerciseClass>();
		}
	}
	
	public void addExcercise(ExcerciseClass e)
	{
		excerciseTable[e.getPrimMuscle().getLocation()].add(e);
	}
	
	public ArrayList<ExcerciseClass> getList(int i)
	{
		return excerciseTable[i];
	}
	
	//helps in ArrayList printing each exercise
	public String toStringHelper(String r)
	{
		return r;
	}
	
	//Converts entire table to a string
	public String toString()
	{
		String ret = "";
		for (MuscleGroup i : MuscleGroup.values())
		{
			ArrayList<ExcerciseClass> muscleExcercises = excerciseTable[i.getLocation()];
			ret = ret + i.toString() + "\n========================\n";
			for (int j = 0; j < muscleExcercises.size(); j++)
			{
				ret = ret + muscleExcercises.get(j).toString() + "\n----------------\n";
			}
		}
		return ret;
	}

}

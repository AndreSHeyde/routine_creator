
public enum MuscleGroup {
	NECK      (0), 
	SHOULDERS (1), 
	TRICEPS   (2), 
	BICEPS	  (3), 
	FOREARMS  (4), 
	BACK      (5), 
	CHEST     (6), 
	WAIST     (7), 
	HIPS      (8), 
	THIGHS    (9), 
	CALVES    (10)
	;
	
	private final int arrayLocation;
	
	MuscleGroup(int location) 
	{
		this.arrayLocation = location;
	}
	
	public int getLocation()
	{
		return this.arrayLocation;
	}
	
	public static int muscleNum()
	{
		return 11;
	}
}

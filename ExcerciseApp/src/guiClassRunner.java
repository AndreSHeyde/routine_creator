import java.io.FileInputStream;
import java.io.*;
import java.io.ObjectInputStream;

public class guiClassRunner 
{
	public static void main(String args[])
	{	
		ExerciseTable.init();
		guiClass window = new guiClass();
		window.display();
		
	}

}

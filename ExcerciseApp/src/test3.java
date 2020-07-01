import java.io.*;
public class test3 
{
	//Simple Test Cases
	public static void main(String[] args)
	{
		/*
		//Creates exercise
		ExerciseClass pullUp = new ExerciseClass("Pull-Ups", "Pull Yourself Up", MuscleGroup.BACK);
		pullUp.addSuppMuscle(MuscleGroup.BICEPS);
		pullUp.addSuppMuscle(MuscleGroup.SHOULDERS);
		pullUp.addEquipment("Pullup Bar");
		
		ExerciseClass deadlift = new ExerciseClass("Dealift", "Pick up a barbell off the ground to your waist", MuscleGroup.BACK);
		deadlift.addSuppMuscle(MuscleGroup.SHOULDERS);
		deadlift.addSuppMuscle(MuscleGroup.THIGHS);
		deadlift.addSuppMuscle(MuscleGroup.ABS);
		deadlift.addEquipment("Barbell");
		
		ExerciseClass barbellRow = new ExerciseClass("Barbell Row", "Perform a row motion with a barbell up to your chest while bent over", MuscleGroup.BACK);
		barbellRow.addSuppMuscle(MuscleGroup.BICEPS);
		barbellRow.addSuppMuscle(MuscleGroup.THIGHS); 	
		barbellRow.addEquipment("Barbell");
		
		ExerciseClass latPullDown = new ExerciseClass("Lat Pull Down", "Pull a bar from overhead down to your chest", MuscleGroup.BACK);
		latPullDown.addSuppMuscle(MuscleGroup.BICEPS);
		latPullDown.addSuppMuscle(MuscleGroup.SHOULDERS);
		latPullDown.addEquipment("Pulldown machine");
		
		ExerciseClass farmersWalk = new ExerciseClass("Farmer's Walk", "Carry dumbbells by your side and walk", MuscleGroup.BACK);
		farmersWalk.addSuppMuscle(MuscleGroup.SHOULDERS);
		farmersWalk.addSuppMuscle(MuscleGroup.THIGHS);
		farmersWalk.addSuppMuscle(MuscleGroup.ABS);
		farmersWalk.addSuppMuscle(MuscleGroup.CALVES);
		farmersWalk.addSuppMuscle(MuscleGroup.FOREARMS);
		farmersWalk.addSuppMuscle(MuscleGroup.TRICEPS);
		farmersWalk.addSuppMuscle(MuscleGroup.BICEPS);
		farmersWalk.addEquipment("Dumbells");
		
		
		
		ExerciseClass bicepCurl = new ExerciseClass("Bicep Curls", "Curl dumbbells while standing", MuscleGroup.BICEPS);
		bicepCurl.addSuppMuscle(MuscleGroup.FOREARMS);
		bicepCurl.addEquipment("Dumbbell");
		
		ExerciseClass hammerCurl = new ExerciseClass("Hammer Curls", "Curl dumbbells while standing with the dumbbell sideways", MuscleGroup.BICEPS);
		hammerCurl.addSuppMuscle(MuscleGroup.FOREARMS);
		hammerCurl.addEquipment("Dumbbell");
		
		ExerciseClass chinUp = new ExerciseClass("Chin ups", "Pull yourself with your hands facing you", MuscleGroup.BICEPS);
		chinUp.addSuppMuscle(MuscleGroup.FOREARMS);
		chinUp.addSuppMuscle(MuscleGroup.BACK);
		chinUp.addEquipment("Pullup bar");
		
		ExerciseClass seatedRow = new ExerciseClass("Seated rows", "Sit with your legs extended and pull cables towards your lower chest", MuscleGroup.BICEPS);
		seatedRow.addSuppMuscle(MuscleGroup.BACK);
		seatedRow.addSuppMuscle(MuscleGroup.SHOULDERS);
		seatedRow.addEquipment("Cable row machine");
		
		ExerciseClass negativeChinUp = new ExerciseClass("Negative Chin Up", "Start in the high chin up position and slowly lower yourself down", MuscleGroup.BICEPS);
		negativeChinUp.addSuppMuscle(MuscleGroup.FOREARMS);
		negativeChinUp.addSuppMuscle(MuscleGroup.BACK);
		negativeChinUp.addEquipment("Pullup bar");
		
		
		
		ExerciseClass barbellSquat = new ExerciseClass("Barbell squats", "Squat up and down with a barbell on your shoulders", MuscleGroup.THIGHS);
		barbellSquat.addSuppMuscle(MuscleGroup.ABS);
		barbellSquat.addEquipment("Barbell");
		
		ExerciseClass standingCalfRaise = new ExerciseClass("Standing calf raise", "Extend your calves with a barbell on your shoulders", MuscleGroup.CALVES);
		standingCalfRaise.addEquipment("Barbell");
		
		ExerciseClass legExtension = new ExerciseClass("Leg Extensions", "Extend your legs using a leg extension machine", MuscleGroup.THIGHS);
		legExtension.addSuppMuscle(MuscleGroup.CALVES);
		legExtension.addEquipment("Leg extension machine");
		
		ExerciseClass gobletSquat = new ExerciseClass("Goblet squats", "Squat up and down with a dumbbell held to your chest", MuscleGroup.THIGHS);
		gobletSquat.addSuppMuscle(MuscleGroup.ABS);
		gobletSquat.addEquipment("Dumbbell or kettle bell");
		
		ExerciseClass wallSit = new ExerciseClass("Wall sits", "Hold a squat position with your back against the wall", MuscleGroup.THIGHS);
		wallSit.addSuppMuscle(MuscleGroup.ABS);
		wallSit.addSuppMuscle(MuscleGroup.CALVES);
		wallSit.addEquipment("Wall");
		
		
		
		ExerciseClass plank = new ExerciseClass("Plank", "Hold a plank position", MuscleGroup.ABS);
		
		ExerciseClass russianTwist = new ExerciseClass("Russian Twists", "Sit with your legs in the air and twist your upper body back and forth", MuscleGroup.ABS);
		russianTwist.addEquipment("Dumbbell or Kettlebell");

		ExerciseClass captainsChairLegRaise = new ExerciseClass("Captain's Chair Leg raise", "Raise your legs while sitting in the captain's chair", MuscleGroup.ABS);
		captainsChairLegRaise.addEquipment("Captain's chair");
		
		ExerciseClass lyingLegRaise = new ExerciseClass("Lying Leg Raises", "Lie flat on your back and raise your legs in the air", MuscleGroup.ABS);

		ExerciseClass abRollOut = new ExerciseClass("Ab Roll Outs", "Sit with your knees on the ground and move the ab wheel away from you", MuscleGroup.ABS);
		captainsChairLegRaise.addEquipment("Ab wheel or barbell");
		
		
		
		//Creates exercise
		ExerciseClass pushUp = new ExerciseClass("Push Up", "Push off the ground", MuscleGroup.CHEST);
		pushUp.addSuppMuscle(MuscleGroup.BICEPS);
		pushUp.addSuppMuscle(MuscleGroup.TRICEPS);
		
		//Creates exercise
		ExerciseClass barbellBenchPress = new ExerciseClass("Barbell Bench Press", "Push a heavy Stick", MuscleGroup.CHEST);
		barbellBenchPress.addSuppMuscle(MuscleGroup.BICEPS);
		barbellBenchPress.addSuppMuscle(MuscleGroup.SHOULDERS);
		barbellBenchPress.addEquipment("Barbell");
		barbellBenchPress.addEquipment("Bench");

		ExerciseClass dumbbellFly = new ExerciseClass("Dumbell Flyes", "Contract your chest muscles with dumbbells", MuscleGroup.CHEST);
		dumbbellFly.addSuppMuscle(MuscleGroup.SHOULDERS);
		dumbbellFly.addEquipment("Dumbbells");
		dumbbellFly.addEquipment("Bench");
		
		ExerciseClass dips = new ExerciseClass("Dips", "Push yourself up using your arms while hanging", MuscleGroup.CHEST);
		dips.addSuppMuscle(MuscleGroup.TRICEPS);
		dips.addEquipment("Barbell");
		
		ExerciseClass inclineDumbbellPress = new ExerciseClass("Incline Dumbbell Press", "Push dumbbels up from your chest from an incline position", MuscleGroup.CHEST);
		inclineDumbbellPress.addSuppMuscle(MuscleGroup.TRICEPS);
		inclineDumbbellPress.addEquipment("Dumbbells");
		inclineDumbbellPress.addEquipment("Incline Bench");
		
		ExerciseClass cableFly = new ExerciseClass("Cable Fly", "Hold cables arms extended and bring them in towards your chest keeping them extended", MuscleGroup.CHEST);
		cableFly.addEquipment("Cable Machine");
		
		

		ExerciseClass skullCrusher = new ExerciseClass("Skull Crushers", "Push an ez-bar from your head and extend your arms while lying flat", MuscleGroup.TRICEPS);
		skullCrusher.addEquipment("Barbell or EZ-Bar");
		skullCrusher.addEquipment("Bench");
		
		ExerciseClass tricepPulldown = new ExerciseClass("Tricep Pulldown", "Pull cables down by extending your arms from your chest to your thighs", MuscleGroup.TRICEPS);
		tricepPulldown.addEquipment("Cable Machine");
		
		ExerciseClass closeGripBenchPress = new ExerciseClass("Close Grip Bench Press", "Bench a barbell with your hands close together", MuscleGroup.TRICEPS);
		closeGripBenchPress.addSuppMuscle(MuscleGroup.CHEST);
		closeGripBenchPress.addEquipment("Barbell");
		closeGripBenchPress.addEquipment("Bench");
		
		ExerciseClass diamondPushup = new ExerciseClass("Diamond Pushups", "Perform a pushup with your hands together", MuscleGroup.TRICEPS);
		diamondPushup.addSuppMuscle(MuscleGroup.CHEST);
		
		ExerciseClass overheadTricepExtension = new ExerciseClass("Overhead Tricep Extension", "Hold a dumbbell behind your neck and extend it over your head", MuscleGroup.TRICEPS);
		overheadTricepExtension.addEquipment("Dumbbell");
		
		
		
		
		//Creates table and adds exercise to table
		ExerciseTable.initEmpty();
	
		ExerciseTable.addExercise(pullUp);
		ExerciseTable.addExercise(deadlift);
		ExerciseTable.addExercise(barbellRow);
		ExerciseTable.addExercise(latPullDown);
		ExerciseTable.addExercise(farmersWalk);
		ExerciseTable.addExercise(bicepCurl);
		ExerciseTable.addExercise(hammerCurl);
		ExerciseTable.addExercise(chinUp);
		ExerciseTable.addExercise(seatedRow);
		ExerciseTable.addExercise(negativeChinUp);
		ExerciseTable.addExercise(barbellSquat);
		ExerciseTable.addExercise(gobletSquat);
		ExerciseTable.addExercise(standingCalfRaise);
		ExerciseTable.addExercise(legExtension);
		ExerciseTable.addExercise(wallSit);
		ExerciseTable.addExercise(plank);
		ExerciseTable.addExercise(russianTwist);
		ExerciseTable.addExercise(captainsChairLegRaise);
		ExerciseTable.addExercise(lyingLegRaise);
		ExerciseTable.addExercise(abRollOut);
		ExerciseTable.addExercise(barbellBenchPress);
		ExerciseTable.addExercise(inclineDumbbellPress);
		ExerciseTable.addExercise(pushUp);
		ExerciseTable.addExercise(cableFly);
		ExerciseTable.addExercise(dumbbellFly);
		ExerciseTable.addExercise(dips);
		ExerciseTable.addExercise(overheadTricepExtension);
		ExerciseTable.addExercise(skullCrusher);
		ExerciseTable.addExercise(tricepPulldown);
		ExerciseTable.addExercise(closeGripBenchPress);
		ExerciseTable.addExercise(diamondPushup);
		
		//Prints out exercises in table
		System.out.println(ExerciseTable.staticToString());
		ExerciseTable.save();*/
		
		/*
		try {
			FileOutputStream fos = new FileOutputStream("Database.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(table);
			oos.close();
			fos.close();
			System.out.println("Serialized");
		} catch (IOException i) {
			i.printStackTrace();
		}*/
		

	}

}

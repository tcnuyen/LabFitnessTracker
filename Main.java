import java.util.Scanner;

class Workout{
   String Type;
   int duration;

   void showWorkout(){
       System.out.println("Workout Type: " + Type + "\nDuration: " + duration +" minutes");
   }

}

class RunningWorkout extends Workout{
    double Distance;

    void showDetails(){
        System.out.println("Distance: " + Distance + " km\nCalories Burned: " + Distance*60 +" kCal");
    }
}

public class Main {
    public static void main(String[] args) {


        RunningWorkout Workout1 = new RunningWorkout();

        Scanner In = new Scanner(System.in);

        System.out.println("Enter Workout Type: ");
        Workout1.Type = In.nextLine();

        System.out.println("Enter duration (minutes): ");
        Workout1.duration = In.nextInt();

        System.out.println("Enter Distance (km): ");
        Workout1.Distance = In.nextDouble();

        System.out.println("--- Workout Summary ---");
        Workout1.showWorkout();
        Workout1.showDetails();


    }
}
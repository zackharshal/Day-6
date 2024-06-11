import java.util.Scanner;

public class Stopwatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the start time: ");
        System.out.print("Enter start time hours: ");
        int startTimeHours = sc.nextInt();
        System.out.print("Enter start time minutes: ");
        int startTimeMinutes = sc.nextInt();
        System.out.println("Enter the end time: ");
        System.out.print("Enter end time hours: ");
        int endTimeHours = sc.nextInt();
        System.out.print("Enter end time minutes: ");
        int endTimeMinutes = sc.nextInt();
        if(startTimeHours > endTimeHours){
            System.out.println("Please enter a proper time.");
            return;
        }
        int totalTime = 0;
        if(startTimeHours == endTimeHours){
            totalTime = endTimeMinutes - startTimeMinutes;
            System.out.println("The elapsed time is " + totalTime + " minutes");
            return;
        }else{
            totalTime  = 60 - startTimeMinutes;
            startTimeHours++;
        }
        boolean end = true;
        while (end){
            if(startTimeHours != endTimeHours){
                totalTime += 60;
                startTimeHours++;
            }else{
                totalTime += endTimeMinutes;
                end = false;
            }
        }
        int finalMinutes = totalTime % 60;
        int finalHours = totalTime / 60;
        System.out.println("The elapsed time is " + finalHours + " Hours " + finalMinutes + " Minutes.");
    }
}

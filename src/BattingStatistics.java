/**
 * Calculate batting statistics.

 Calculate the batting average and slugging percentage for one or more baseball/softball players.

 First ask for the number of at bats.

 For each at bat, ask the user for the number of bases earned by the batter.

 After all of the at-bats are entered, display the batting average and slugging percentage of the batter.

 Use an Array to store the at-bat results for each player.

 Validate the input so that the user can only enter positive integers. For the at-bat results, the user can only enter 0, 1, 2, 3, or 4.

 Validate the user’s response to the question "Another batter?" so that the user can only enter Y, y, N, or n. If the user chooses N or n, end the program.

 Format the batting average and slugging percentages such that three decimal places are shown.

 Batting average is total number of at-bats for which the player earned at least one base, divided by the total number of at-bats.

 Slugging percentage is the total number of bases earned divided by the total number of at-bats.
 *
 * Created by anthonyfortney on 11/21/16.
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class BattingStatistics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfAtBats;
        double battingAverage;
        double sluggingAverage;
        System.out.println("How many at bats?");
        numberOfAtBats = sc.nextInt();
        int[] atBats = new int[numberOfAtBats];
        for (int i = 0; i  <atBats.length; i++) {
            atBats[i] = getBasesEarned(sc);
        }
        battingAverage = getBattingAverage(atBats);
        sluggingAverage = getSluggingAverage(atBats);
        System.out.println("The batting average is: " + battingAverage);
        System.out.println("The slugging average is: " + sluggingAverage);
    }

    public static int getBasesEarned(Scanner sc) {
        System.out.println("How many bases were earned?");
        int answer;
        try {
            answer = sc.nextInt();
            if (answer <= 4 && answer >= 0) {
                return answer;
            } else
                throw new IllegalArgumentException("Response must be 0, 1, 2, 3, 4.");
        } catch (InputMismatchException e) {
            sc.next();
            System.out.println("Response must be 0, 1, 2, 3, 4.");
            return getBasesEarned(sc);
        }catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return getBasesEarned(sc);
        }
    }

    public static double getBattingAverage(int[] atBats){
        double baseCounter = 0;
        for (int bases : atBats) {
            if (bases != 0)
                baseCounter++;
        }
        return baseCounter / atBats.length ;
    }

    public static double getSluggingAverage(int[] atBats) {
        double total = 0;
        for (int bases : atBats) {
            total += bases;
        }
        return total/atBats.length;

    }
}
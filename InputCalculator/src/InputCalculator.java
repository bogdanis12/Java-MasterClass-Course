import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        //double average = 0.0;
        int counter = 0;

        boolean isAnInt = scanner.hasNextInt();

        while(scanner.hasNextInt()){
            int number = scanner.nextInt();
            if(isAnInt){
                sum = sum + number;
                counter++;
            }
            //scanner.nextLine();
        }
        System.out.println("SUM = " + sum + " AVG = " + Math.round((double) sum/counter));
        scanner.close();
    }
}

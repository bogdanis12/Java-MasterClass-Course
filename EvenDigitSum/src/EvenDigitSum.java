public class EvenDigitSum {
    public static int getEvenDigitSum(int number){
        if(number<0){
            return -1;
        }
        int sum = 0;
        int copy = 0;
        while(number > 0) {
            copy = number % 10;
            number = number/10;
            if(copy % 2 == 0){
                sum = sum + copy;
            }
        }
        return sum;
    }
}

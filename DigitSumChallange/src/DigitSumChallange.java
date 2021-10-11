public class DigitSumChallange {
    public static int sumDigits(int number){
        int sum = 0;
        while(number != 0){
            if(number >= 10){
                sum = sum + number % 10;
                number = number / 10;
            }
            else{
                return -1;
            }
        }
        return sum;
    }
}

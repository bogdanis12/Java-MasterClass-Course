public class NumberPalindrome {
    public static boolean isPalindrome(int number){
        int numberOK = number;
        int reverse = 0;
        while(number != 0){
            reverse = reverse*10 + number%10;
            number = number/10;
        }
        if (numberOK == reverse){
            return true;}
        return false;
    }

}

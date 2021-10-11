public class NumberToWords {
    public static void numberToWords(int number){
        if(number<0){
            System.out.println("Invalid Value");
        }
        int reversedNumber = reverse(number);
        for(int i = 0; i<getDigitCount(number);i++){
            switch (reversedNumber%10){
                case 0:
                    System.out.println("Zero ");
                    break;
                case 1:
                    System.out.println("One ");
                    break;
                case 2:
                    System.out.println("Two ");
                    break;
                case 3:
                    System.out.println("Three ");
                    break;
                case 4:
                    System.out.println("Four ");
                    break;
                case 5:
                    System.out.println("Five ");
                    break;
                case 6:
                    System.out.println("Six ");
                    break;
                case 7:
                    System.out.println("Seven ");
                    break;
                case 8:
                    System.out.println("Eight ");
                    break;
                case 9:
                    System.out.println("Nine ");
                    break;
                default:
                    break;
            }
            reversedNumber=reversedNumber/10;
        }
        System.out.println();

    }
    public static int getDigitCount(int number){
        if(number<0){
            return -1;
        }
        int counter = 1;
        while(number>9){
            counter++;
            number=number/10;
        }
        return counter;
    }
    public static int reverse(int number){
        int reveseNumber = 0;
        while(number!=0){
            reveseNumber=reveseNumber*10 + number%10;
            number=number/10;
        }
        return reveseNumber;

    }
}

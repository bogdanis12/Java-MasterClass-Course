public class SharedDigit {
    public static boolean hasSharedDigit(int numberOne, int numberTwo){
        if((numberOne < 10 || numberOne >99) || (numberTwo<10 || numberTwo>99)){
            return false;
        }
        int numberOneA = numberOne % 10;
        int numberOneB = numberOne / 10;
        int numberTwoA = numberTwo % 10;
        int numberTwoB = numberTwo /10;
        if ((numberOneA == numberTwoA || numberOneA ==numberTwoB) || (numberOneB == numberTwoA || numberOneB==numberTwoB)){
            return true;
        }
        return false;
    }
}

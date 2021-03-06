public class NumberOfDaysInMonth {
    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        } else if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return true;
        }
        return false;
    }
    public static int getDaysInMonth(int month, int year){
        if(month < 1 || month > 12){
            return -1;
        }
        if(year < 1 || year > 9999){
            return -1;
        }
        if(isLeapYear(year) && month == 2){
            return 29;
        }
        switch (month){
            case 11: case 9: case 6: case 4:
                return 30;
            case 2:
                return 28;
            default:
                return 31;
        }
    }
}

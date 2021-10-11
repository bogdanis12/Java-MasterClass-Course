public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double var1, double var2) {
        int firstCheck = (int) ((double) var1 * 1000);
        int secondCheck = (int) ((double) var2 * 1000);
        if (firstCheck - secondCheck == 0) {
            return true;
        } else {
            return false;
        }
    }
}


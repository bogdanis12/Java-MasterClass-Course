public class AreaCalculator {
    public static double area (double radius){
        if (radius < 0.0){
            //System.out.println("Invalid value");
            return -1.0;
        }
        double circusArea = radius*radius*Math.PI;
        return circusArea;
    }
    public static double area (double x, double y){
        if( x < 0.0 || y < 0.0){
            //System.out.println("Invalid values");
            return -1.0;
        }
        double rectangleArea = x * y;
        return rectangleArea;
    }
}

public class area {

    
    public int areacal(int sides) {
        int area = sides * sides;
        return area;
    }

   
    public int areacal(int l, int b) {
        int area = l * b;
        return area;
    }

   
    public double areacal(double radius) {
        double piv = 3.14;
        double area = piv * radius * radius;
        return area;
    }

   
    public double areacal(int b, double h) {
        double area = 0.5 * b * h;
        return area;
    }

    public static void main(String[] args) {
       
        area areaCalculator = new area();

        
        int squareArea = areaCalculator.areacal(5); 
        System.out.println("Area of square: " + squareArea);

        int rectangleArea = areaCalculator.areacal(4, 6); 
        System.out.println("Area of rectangle: " + rectangleArea);

        double circleArea = areaCalculator.areacal(3.5); 
        System.out.println("Area of circle: " + circleArea);

        double triangleArea = areaCalculator.areacal(4, 6.5); 
        System.out.println("Area of triangle: " + triangleArea);
    }
}

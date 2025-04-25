public class Circle {
    public static void main(String[] args) {
        
        double radius = 5.0;
        double area = Math.PI * Math.pow(radius, 2); 
        double circumference = 2 * Math.PI * radius; 
        System.out.println("Radius of the circle: " + radius);
        System.out.println("Area of the circle: " + area);
        System.out.println("Circumference of the circle: " + circumference);
    }
}

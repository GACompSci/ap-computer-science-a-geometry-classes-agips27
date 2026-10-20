public class App {
    public static void main(String[] args) throws Exception {
        // Create your objects and call their method here
        
        System.out.println(MathTools.randint(2, 7));
        System.out.println(MathTools.round(45.678, 2));
        System.out.println(MathTools.distance(new Point(5, 10), new Point(3, 4)));
        System.out.println(MathTools.slope(new Point(1, 2), new Point(3, 6)));

        Point a = new Point(2,4);
        Point b = new Point(9, 5);
        
        Circle one = new Circle(5, a);
        System.out.println(one.getRadius());
        System.out.println(one.getArea());
        System.out.println(a.getX());


        
    }
}

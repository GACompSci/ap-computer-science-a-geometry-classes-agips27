public class App {
    public static void main(String[] args) throws Exception {
        // Create your objects and call their method here
        
        //MathTools
        System.out.println(MathTools.randint(2, 7));
        System.out.println(MathTools.round(45.678, 2));
        System.out.println(MathTools.distance(new Point(5, 10), new Point(3, 4)));
        System.out.println(MathTools.slope(new Point(1, 2), new Point(3, 6)));

        Point a = new Point(2,4);
        Point b = new Point(9, 5);
        
        //Random Circle
        Point circlePoint = new Point(MathTools.randint(1, 10),MathTools.randint(1, 10));
        Circle test1 = new Circle(MathTools.randint(1, 10), circlePoint);
        System.out.println(test1.getRadius());
        System.out.println(test1.getArea());
        
        //Random Rectangle
        Point rectangleStart=new Point(MathTools.randint(1, 10), MathTools.randint(1, 10));
        Rectangle test2 = new Rectangle(rectangleStart, MathTools.randint(1, 10), MathTools.randint(1, 10));
        System.out.println(test2.getArea());

        //Random Triangle
        Point p1=new Point(MathTools.randint(1, 10), MathTools.randint(1, 10));
        Point p2=new Point(MathTools.randint(1, 10), MathTools.randint(1, 10));
        Point p3=new Point(MathTools.randint(1, 10), MathTools.randint(1, 10));
        Triangle test3 = new Triangle(p1, p2, p3);
        System.out.println(test3.getArea());


        
    }
}

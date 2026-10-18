public class App {
    public static void main(String[] args) throws Exception {
        // Create your objects and call their method here
        
        System.out.println(MathTools.randint(2, 7));
        System.out.println(MathTools.round(45.678, 2));
        System.out.println(MathTools.distance(new Point(0, 0), new Point(3, 4)));
        System.out.println(MathTools.slope(new Point(1, 2), new Point(3, 6)));



        
    }
}

public class Circle {
    private int radius;
    private Point center;


    public Circle(int r, Point start){
        radius = r;
        center = start;
    }

    public double getRadius(){
        return MathTools.round(radius, 2);
    }

    public double getArea(){
        return MathTools.round((Math.pow(radius, 2)*Math.PI),2) ;
    }

}

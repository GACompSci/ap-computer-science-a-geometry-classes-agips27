public class Triangle {
    private Point one;
    private Point two;
    private Point three;

    public Triangle(Point one,Point two,Point three){
        this.one=one;
        this.two=two;
        this.three=three;
    }

    public double getArea(){
        int x1 =one.getX();
        int x2 =two.getX();
        int x3 =three.getX();
        int y1=one.getY();
        int y2=two.getY();
        int y3=three.getY();

        double area = (double)(0.5*(x1*(y2-y3)+x2*(y3-y1)+x3*(y1-y2)));
        return MathTools.round(Math.abs(area), 2);

    }
}

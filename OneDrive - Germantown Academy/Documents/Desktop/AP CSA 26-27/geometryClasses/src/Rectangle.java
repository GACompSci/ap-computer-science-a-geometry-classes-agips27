public class Rectangle {
   private Point topLeft;
   private int length;
   private int width;
   
   public Rectangle(Point start, int l, int w){
    topLeft = start;
    length=l;
    width=w;
   }

   public int getLength(){
    return length;
   }

   public int getWidth(){
    return width;
   }

   public double getArea(){
    return MathTools.round((double)(length *width), 2);
   }
}

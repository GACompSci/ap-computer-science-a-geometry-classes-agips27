public class MathTools {
    //Create the static MathTools methods in this file
    /*
    randInt(int min, int max)
    round(double num, int places)
    distance(Point a, Point b)
    slope(Point a, Point b)
    */
   public static int randint(int min, int max){
        return (int) (Math.random()*(max-min+1))+min;   
   }

   public static double round(double num, int places){
     double factor = Math.pow(10, places); 
     num*=factor;
     int rounded = (int)(num+0.5);
     return(rounded/factor);

   }
   
   public static double distance(Point a, Point b) {
    double dx = b.getX() - a.getX();
    double dy = b.getY() - a.getY();
    
    return round(Math.sqrt(dx * dx + dy * dy), 2);
   }
   
   public static double slope(Point a, Point b) {
    return (double) (b.getY() - a.getY())/ (b.getX() - a.getX());
   }
    

}

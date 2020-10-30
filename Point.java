public class Point{
  private double x,y;

  //construct a point given coordinates
  public Point(double X, double Y){
    x=X;
    y=Y;
  }

  //construct a point given a point  (redundant , just provides flexibility)
  public Point(Point p){
    x= p.x;  //private access in the same file is allowed!
    y= p.y;
  }

  public double getX(){
    return x;
  }

  public double getY(){
    return y;
  }

  // 2.3a) The distanceTo method returns the Euclidean distance from this point
  // to the other point. Please DO NOT round.

  public double distanceTo(Point other){
    return Math.sqrt(
    Math.pow( (x - other.x), 2)
    +
    Math.pow( (y - other.y), 2)
    );
  }

}

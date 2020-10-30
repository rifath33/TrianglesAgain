public class Triangle{
  private Point v1, v2, v3;

  // choose points for triangle
  public Triangle(Point a, Point b, Point c){
    v1 = a;
    v2 = b;
    v3 = c;
  }

  // create points for the triangle by giving x and y values
  public Triangle(double x1, double y1, double x2, double y2,double x3, double y3){
    v1 = new Point(x1,y1);
    v2 = new Point(x2,y2);
    v3 = new Point(x3,y3);
  }

  // c) Four accessors:  (the first three are the same as the old assignment with rounding modifications)
  //
  // public double getPerimeter()
  //    Return the perimeter without any rounding.

  public double getPerimeter(){
    return ( v1.distanceTo(v2) + v2.distanceTo(v3) + v1.distanceTo(v3) );
  }

    /*
  public double getArea()
     Return the area using Heron's formula without any rounding.

  public String classify()    *spelling correction*
      Return the "equilateral" "isosceles" or "scalene" Round distances to the nearest tenthousandths for your classifications.

  public String toString()
       The format should be "v1(23.0, 4.0) v2(-2.3, 5.001) v3(5.0, 0.52)"

  -One mutator
  public void setVertex(int index, Point newP) - replace the specified Point (0,1, or 2) with the new Point
  */
}

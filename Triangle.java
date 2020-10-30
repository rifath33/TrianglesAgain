// CREDIT TO RENG ZHENG FOR HIS AWESOME TESTER

public class Triangle{
  private Point v1, v2, v3;

  // choose points for triangle
  // triangle defined by given points
  public Triangle(Point a, Point b, Point c){
    v1 = a;
    v2 = b;
    v3 = c;
  }

  // create points for the triangle by giving x and y values
  // triangle defined by given x and y values
  public Triangle(double x1, double y1, double x2, double y2,double x3, double y3){
    v1 = new Point(x1,y1);
    v2 = new Point(x2,y2);
    v3 = new Point(x3,y3);
  }

  // calculates the perimeter of a triangle
  public double getPerimeter(){
    double sideA = v1.distanceTo(v2);
    double sideB = v2.distanceTo(v3);
    double sideC = v1.distanceTo(v3);

    return (sideA + sideB + sideC);
  }

  // Returns the area of a triangle using Heron's formula without any rounding.
  public double getArea(){
    double sideA = v1.distanceTo(v2);
    double sideB = v2.distanceTo(v3);
    double sideC = v1.distanceTo(v3);

    double semiPerimeter = (sideA + sideB + sideC) / 2 ;

    return Math.sqrt(
    semiPerimeter * (semiPerimeter-sideA) * (semiPerimeter-sideB) *
    (semiPerimeter-sideC)
    );
  }

  // Return the "equilateral" "isosceles" or "scalene" Round distances to the
  // nearest tenthousandths for your classifications.
  public String classify(){
    double sideA = (Math.round(v1.distanceTo(v2) * 10000) ) / 10000. ;
    double sideB = (Math.round(v2.distanceTo(v3) * 10000) ) / 10000. ;
    double sideC = (Math.round(v1.distanceTo(v3) * 10000) ) / 10000. ;

    if(sideA == sideB && sideA == sideC) // this also means sideB == side C
    return "equilateral";
    else{
      if((sideA == sideB) || (sideA == sideC) || (sideB == sideC))
      return "isosceles";
      else return "scalene";
    }

  }

  // The format should be "v1(23.0, 4.0) v2(-2.3, 5.001) v3(5.0, 0.52)"
  public String toString(){
    return
    "v1(" + v1.getX() + ", " + v1.getY() + ")" +
     " v2(" + v2.getX() + ", " + v2.getY() + ")" +
     " v3(" + v3.getX() + ", " + v3.getY() + ")";
  }

  // mutator...
  // replace the specified Point (0,1, or 2) with the new Point
  public void setVertex(int index, Point newP){
    if(index == 0)
    v1 = newP;
    else{
      if(index == 1)
      v2 = newP;
      else{
        if(index == 2)
        v3 = newP;
        // no other cases because the index has to either be 0, 1 or 2
      }
    }
  }


}

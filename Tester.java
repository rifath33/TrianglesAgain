public class Tester{
  public static void main(String[] args){

    Triangle Rifath = new Triangle(2,3,4,7,7,4);

    //System.out.println(Rifath.classify());

    Triangle Shufaat = new Triangle(13,-2,9,-8,5,-2);

    System.out.println(Shufaat.toString());

    Point k = new Point(3,4);

    Shufaat.setVertex(0,k);

    System.out.println(Shufaat.toString());

  }
}

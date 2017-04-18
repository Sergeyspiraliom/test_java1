package ru.stqa.pft.firstpro_test;

public class lsnone {

  public static void main(String[] args) {
    hello("world");
    hello("user");
    hello("sergey");

    Square s = new Square(5);
    s.l = 5;
    System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());

    Rectagle r = new Rectagle(4, 6);
    r.a = 4;
    r.b = 6;
    System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());

    Point p1 = new Point(1, 3);
//Point p1 = new Point(3, 4);
//p1.y = 3;
    //System.out.println(p1.x);

    Point p2 = new Point(9, 8);
//    Point p2 = new Point(14, 3.5);
    //System.out.println(p2.x);
    //p2.x = 9;
    //p2.y = 8;
    //System.out.println(p2.y);
double rr;
rr = p1.distance (p2);
    System.out.println (rr);
  }

// // public static double distance(Point p1, Point p2){
//    double dx;
//    double dy;
//    dx = p1.x - p2.x;
//    dy = p1.y - p2.y;

//    return Math.sqrt((dx*dx)+(dy*dy));
//  }

  public static void hello(String somebody ) {
    System.out.println("Hello, " + somebody + "!");
  }

}
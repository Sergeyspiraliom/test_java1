package ru.stqa.pft.firstpro_test;

/**
 * Created by user on 14.04.2017.
 */

class Point {
  double x, y;

  public Point(double x, double y) {
    this.x = x;
    this.y = y;
  }



  public double distance(Point Point2){
    double dx;
    double dy;
    dx = this.x - Point2.x;
    dy = this.y - Point2.y;


    return Math.sqrt((dx*dx)+(dy*dy));

  }

}

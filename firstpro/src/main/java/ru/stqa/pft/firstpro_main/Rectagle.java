package ru.stqa.pft.firstpro_main;

/**
 * Created by user on 14.04.2017.
 */
public class Rectagle {
  public double a;
  public double b;
  public Rectagle (double a, double b) {
    this.a = a;
    this.b = b;
  }

  public double area() {
    return this.a * this.b;
  }
}

package ru.stqa.pft.firstpro_main;

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
  }

  public static void hello(String somebody ) {
    System.out.println("Hello, " + somebody + "!");
  }


}
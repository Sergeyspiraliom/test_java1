package ru.stqa.pft.firstpro_test;


import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by user on 18.04.2017.
 */
public class SquareTests {

  @Test
  public void testArea() {
    Square s = new Square(5);
    Assert.assertEquals( s.area(), 25.0);
  }
}
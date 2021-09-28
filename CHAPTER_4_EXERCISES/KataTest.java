package chapterFour;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KataTest {

    // @Test
    // void calculateFactorialTest(){
    // Kata kata = new Kata();
    //  int result = kata.calculateFactorialOf(i:3);
    // assertEquals(6,result);

@Test
 public void testDrillerOneToFourCopiesTest(){
Kata kata = new Kata();
int amount = kata.numberOfCopies(4);
assertEquals(6000,amount);
assertEquals(4500,kata.numberOfCopies(3));
assertEquals(3000,kata.numberOfCopies(2));
}

@Test
 public void testDrillerFiveToNineCopiesTest(){
 Kata kata = new Kata();
 int amount = kata.numberOfCopies(9);
 assertEquals(12600,amount);
 assertEquals(7000,kata.numberOfCopies(5));
 assertEquals(9800,kata.numberOfCopies(7));
}
@Test
 public void testDrillerTenToTwentyNineCopies() {
 Kata kata = new Kata();
 int amount = kata.numberOfCopies(29);
 assertEquals(34800, amount);
 assertEquals(12000, kata.numberOfCopies(10));
 assertEquals(18000,kata.numberOfCopies(15));
}

 @Test
 public void testDrillerThirtyToFortyNineCopies(){
  Kata kata = new Kata();
  int amount = kata.numberOfCopies(49);
  assertEquals(53900,amount);
  assertEquals(33000,kata.numberOfCopies(30));
  assertEquals(44000,kata.numberOfCopies(40));
 }
 @Test
 public void testDrillerFiftyToNinetyNineCopies() {
  Kata kata = new Kata();
  int amount = kata.numberOfCopies(99);
  assertEquals(99000, amount);
  assertEquals(50000, kata.numberOfCopies(50));
  assertEquals(60000,kata.numberOfCopies(60));
 }

 @Test
 public void testDrillerHundredToOneNinetyNineCopies() {
  Kata kata = new Kata();
  int amount = kata.numberOfCopies(199);
  assertEquals(179100, amount);
  assertEquals(90000, kata.numberOfCopies(100));
  assertEquals(135000,kata.numberOfCopies(150));
 }

 @Test
 public void testDrillerTwoHundredAndAboveCopies() {
  Kata kata = new Kata();
  int amount = kata.numberOfCopies(200);
  assertEquals(160000, amount);
  assertEquals(320000,kata.numberOfCopies(400));
  assertEquals(240000,kata.numberOfCopies(300));
 }


 }

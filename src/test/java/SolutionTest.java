import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
  final private Solution sol = new Solution();
  final private double tolerance = 0.00001;
  @Test
  void myPowExample1() {
    assertEquals( 1024.00000, sol.myPow(2.00000, 10), tolerance);
  }
  @Test
  void myPowExample2() {
    assertEquals( 9.26100, sol.myPow(2.10000, 3), tolerance);
  }
  @Test
  void myPowExample3() {
    assertEquals( 0.25000, sol.myPow(2.00000, -2), tolerance);
  }
}
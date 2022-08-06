public class Solution {
  public double recursive(double x, int n) {
    n = Math.abs(n);
    if (x == 0) {
      return 0;
    }
    if (x == 1 || n == 0){
      return 1;
    }
    double res = recursive(x, n/2);
    res *= res;
    if (n %2 == 1) {
      res *= x;
    }
    return res;
  }
  public double myPow(double x, int n) {
    double result = recursive(x, n);
    return (n < 0)? 1/result: result;
  }
}

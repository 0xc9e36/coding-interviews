public class Solution {
    /**
     * 简单题
     */
    public double Power(double base, int exponent) {
        if (exponent >= 0) {
            return power(base, exponent);
        }
        return 1 / power(base, -exponent);
    }
    
    public double power(double base, int exponent) {
        if (exponent == 0) {
            return 1;
        }
        double half = Power(base, exponent / 2);
        if (exponent % 2 == 0) {
            return  half*half;
        } else {
            return half*half*base;
        }
    }
}

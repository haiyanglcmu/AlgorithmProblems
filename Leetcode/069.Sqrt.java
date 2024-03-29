package Leetcode;
/**
 * @author xiangfeidong
 *
 * 69.Sqrt(x)
 *
 * Binary search from 1 ~ x.
 * Start, end, mid must be convert to long, because mid*mid may be larget than max int.
 */
public class Sqrt {
    public int mySqrt(int x) {
        long start = 1, end = x;
        while (start + 1 < end) {
            long mid = start + (end - start) / 2;
            if (mid == x / mid) {
                return (int) mid;
            } else if (mid < x / mid) {
                start = mid;
            } else {
                end = mid - 1;
            }
        }

        if (end * end <= x) {
            return (int) end;
        } else {
            return (int) start;
        }
    }
}

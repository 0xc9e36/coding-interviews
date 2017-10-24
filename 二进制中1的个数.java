public class Solution {
    public int NumberOf1(int n) {
        if (n == Integer.MIN_VALUE) {return 1;}
        int[] map = new int[33];
        if (n < 0) {
            map[1] = 1;
            n = Math.abs(n);
        }
        int i = 32;
        while(n != 0) {
            map[i--] = n % 2;
            n /= 2;
        }
        if(map[1] == 1) {
            for(i = 2; i <= 32; i++) {
                map[i] = map[i]^1;
            }
            i = 32;
            int add = 1;
            while(true) {
                if(add == 0) {
                    break;
                }
                int val = (map[i] + add) / 2;
                map[i] = (map[i] + add) % 2;
                add = val;
                i--;
            }
        }

        int count = 0;
        for(i = 1; i <= 32; i++) {
            count += map[i];
        }
        return count;
    }
}

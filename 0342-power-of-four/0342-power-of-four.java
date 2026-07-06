class Solution {
    public boolean isPowerOfFour(int n) {
        //long max = Integer.MAX_VALUE;
        return n>0 && (n & (n - 1)) == 0 && (n & 0x55555555) != 0;
    }
}
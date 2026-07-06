class Solution {
    public boolean isPowerOfThree(int n) {
        double pow = Math.pow(n,3);
        int maxThreepow=1162261467;
        return n > 0 && maxThreepow % n ==0 ;
    }
}
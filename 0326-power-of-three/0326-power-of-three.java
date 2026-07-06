class Solution {
    public boolean isPowerOfThree(int n) {
        //while (n <= 0)return false;

        int pow = (int)Math.pow(n,3);
        int maxThreepow=1162261467;
        return n>0 && maxThreepow % n==0;      
    }
}
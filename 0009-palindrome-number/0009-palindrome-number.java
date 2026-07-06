class Solution {
    public boolean isPalindrome(int x) {
        int sum = 0;
        int temp = x;
        if (x < 0)return false;
        while (x != 0){
            int rev = x %10;
            x = x/10;
            sum = sum * 10 + rev;
        }
        if (temp == sum) return true;
        return false;
    }
}
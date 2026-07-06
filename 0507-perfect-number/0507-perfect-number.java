class Solution {
    public boolean checkPerfectNumber(int num) {
        int i = 1;
        int sum = 0;
        int temp = num;
        while (i != num){
            if ( num % i == 0){
                sum = sum + i;
            }
            i++;
        }
        if (temp == sum) {
            return true;
        }else {
            return false;
        }
    }
}
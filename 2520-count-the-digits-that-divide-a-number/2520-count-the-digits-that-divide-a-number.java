class Solution {
    public int countDigits(int num) {
        int temp = num;
        int count = 0;

        while(temp > 0){
            int no = temp % 10;
            if(num % no == 0)count++;
                temp /= 10;
        }
        return count;
    }
}
class Solution {
    public boolean isAnagram(String s, String t) {
        
        if(s.length()!=t.length())return false;
        char ch1[] = s.toCharArray();
        char ch2[] = t.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);
        boolean flag = true;
        for(int i=0;i<ch1.length;i++){
            if(ch1[i]!=ch2[i]){
                flag = false;
            }
        }
        if(flag)return true;
        return false;
    }
}
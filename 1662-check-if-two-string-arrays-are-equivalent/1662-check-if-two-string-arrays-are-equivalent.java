class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String ch1 = "";
        String ch2 = "";
        for (int i = 0; i < word1.length; i++) {
            ch1 = ch1 + word1[i];
        }
        for (int i = 0; i < word2.length; i++) {
            ch2 = ch2 + word2[i];
        }
        boolean flag = true;
        
        for (int i = 0; i < ch1.length(); i++) {
            if (ch1.length() != ch2.length()) {
                flag = false;
            }else{
            if (ch1.charAt(i) != ch2.charAt(i)) {
                flag = false;
                break;
            }
            }
        }
        if (flag) {
            return true;
        } else {
            return false;
        }
    }
}
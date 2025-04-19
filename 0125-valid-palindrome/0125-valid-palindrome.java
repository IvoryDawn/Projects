class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder obj1 = new StringBuilder();
        s = s.toLowerCase();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) >= '0' && s.charAt(i) <= '9' || s.charAt(i) >= 'a' && s.charAt(i) <= 'z'){
                obj1.append(s.charAt(i));
            }
        }
        return obj1.toString().equals(obj1.reverse().toString());
    }
}
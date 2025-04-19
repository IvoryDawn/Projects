class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder obj1 = new StringBuilder();
        s = s.toLowerCase();
        for(int i = 0; i < s.length(); i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                obj1.append(s.charAt(i));
            }
        }
        String obj2 = new StringBuilder(obj1).reverse().toString();
        return obj1.toString().equals(obj2);
    }
}
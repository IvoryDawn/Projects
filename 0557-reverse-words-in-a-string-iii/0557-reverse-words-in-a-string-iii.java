class Solution {
    public String reverseWords(String s) {
        if(s.length() == 1){
            return s;
        }
        StringBuilder sb = new StringBuilder();
        String[] words = s.split(" ");
        for(int i = 0 ; i < words.length; i++){
            StringBuilder wrd = new StringBuilder();
            wrd.append(words[i]);
            sb.append(wrd.reverse());
            if(i != words.length - 1){
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}
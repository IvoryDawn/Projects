class Solution {
    public String restoreString(String s, int[] indices) {
        char result[] = new char[s.length()];
        for(int i = 0; i < s.length(); i++){
            result[indices[i]] = s.charAt(i);
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < result.length; i++){
            sb.append(result[i]);
        }
        return sb.toString();
    }
}
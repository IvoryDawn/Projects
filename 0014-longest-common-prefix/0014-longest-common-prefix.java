class Solution {
    public String longestCommonPrefix(String[] strs) {
        String commonprefix = strs[0];
        for(int i = 0; i < strs.length ; i++)
        {
          String currentstr = strs[i];
          int j = 0 ;
          while(j < currentstr.length() && j < commonprefix.length() && currentstr.charAt(j) == commonprefix.charAt(j))
          {
            j++;
          }
          commonprefix = commonprefix.substring(0,j);
          if(commonprefix.isEmpty())
          {
              return commonprefix;
          }
        }
        return commonprefix;
    }
}
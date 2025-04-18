class Solution {
    public String interpret(String command) {
        int i = 0;
        StringBuilder sb = new StringBuilder();
        while(i < command.length()){
            char ch = command.charAt(i);
            if(ch == 'G'){
                sb.append('G');
                i++;
            }
            else if(ch == '('){
                if(command.charAt(i + 1) == ')'){
                    sb.append('o');
                    i += 2;
                }
                else if(command.charAt(i + 1) =='a' && command.charAt(i + 2) == 'l' && command.charAt(i + 3) == ')'){
                    sb.append("al");
                    i += 4;
                }
            }
        }
        return sb.toString();
    }
}
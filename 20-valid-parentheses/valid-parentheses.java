class Solution {
    public boolean isValid(String s) {
        Stack<Character> opened = new Stack();
        for(int i = 0; i < s.length(); i++){
            char item = s.charAt(i);
            if(item == '(' || item == '[' || item == '{'){
                opened.push(item);
            }else if(item == ')'){
                if(opened.isEmpty()){
                    return false;
                }
                if(opened.peek() == '('){
                    opened.pop();
                }else{
                    return false;
                }
            }else if(item == ']'){
                if(opened.isEmpty()){
                    return false;
                }
                if(opened.peek() == '['){
                    opened.pop();
                }else{
                    return false;
                }
            }else if(item == '}'){
                if(opened.isEmpty()){
                    return false;
                }
                if(opened.peek() == '{'){
                    opened.pop();
                }else{
                    return false;
                }
            }
        }
        return opened.isEmpty();
    }
}
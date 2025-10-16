class Solution {
    public int lengthOfLastWord(String s) {
        int count = 0;
        int maxcount = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ' '){
                if(count != 0){
                    maxcount = count;
                }
                count = 0;
            }else{
                count++;
                System.out.println(count);
            }
        }
        if(count != 0){
            maxcount = count;
        }
        return maxcount;
    }
}
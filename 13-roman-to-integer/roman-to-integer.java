class Solution {
    public int romanToInt(String s) {
        int sum = 0;
        int add = 0;
        int[] integer = new int[s.length()];
        for(int i = 0; i < s.length(); i++){
            char[] roman = s.toCharArray();
            if(roman[i] == 'I'){
                integer[i] = 1;
            } else if(roman[i] == 'V'){
                integer[i] = 5;
            }else if(roman[i] == 'X'){
                integer[i] = 10;
            }else if(roman[i] == 'L'){
                integer[i] = 50;
            }else if(roman[i] == 'C'){
                integer[i] = 100;
            }else if(roman[i] == 'D'){
                integer[i] = 500;
            }else{
                integer[i] = 1000;
            }
            if(i > 0 && integer[i-1] < integer[i]){
                sum = sum + integer[i] - 2 * integer[i-1];
            }else{
                sum+= integer[i];
            }
        }
        return sum;
    }
}
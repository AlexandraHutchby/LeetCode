class Solution {
    public int mySqrt(int x) {
        if(x == 0){
            return 0;
        }
        int base = 1, max = x;
        while(base <= max){
            int mid = base + (max - base) / 2;
            if(mid == x / mid){
                return mid;
            }else if(mid > x / mid){
                max = mid -1;
            }else{
                base = mid + 1;
            }
        }
        return max;
    }
}
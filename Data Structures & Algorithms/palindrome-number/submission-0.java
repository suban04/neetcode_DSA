class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int origin =x;
        int num =x;
        int revers =0;

        while(num!=0){
            int digit =num%10 ;
            revers =revers *10 +digit;
            num = num/10;
        }
        return origin==revers;
        
    }
}
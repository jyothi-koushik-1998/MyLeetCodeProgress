class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0 || ((x != 0) && x%10 == 0)){
            return false;
        }
        int rev = 0;
        while(x > rev) {
            int rem = x%10;
            rev = (rev * 10) + rem;
            x /= 10;
        }

        return (rev == x) || (x == rev/10);
    }
}
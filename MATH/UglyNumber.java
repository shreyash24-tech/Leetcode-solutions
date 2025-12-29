// Leetcode : Ugly Number

// Explanation :
// Take a input for a number.
// Check wheather the number is <=0 
//   then return false    --(There are no prime factors present i.e {2, 3,5})
// Iterate the loop until n%2==0 --> n = n/2
// repeate the same step for 3 and 5
//   return n==1       --(It will return True if n value become 1 Otherwise it will return False )


class Solution {
    public boolean isUgly(int n) {
        if(n <= 0)
        {
            return false ;
        }
    while(n %2==0) n = n/2;
    while(n %3==0) n = n/3;
    while(n %5==0) n = n/5;
    
        return n==1;
    }
}

// Leetcode : Sqrt(x)
  
// As there is restricted to use inbuilt function -
// Therefore we are using logic of Binary search 
// initialize --low =0
//              high = x
//              long result = (long) mid * mid          -- using long to handle overflow

// calculate square -- sqr = (mid *mid )                -- in case if there exact square root exist
// return mid

// sqaure < x 
// put square in some variable 
// update low = mid +1
// sqaure > x
// update high = mid -1



  
class Solution {
    public int mySqrt(int x) {
         if(x == 0 || x == 1)
        {
            return x;
        }

        int sum =0;
        int low = 0;
        int high = x;
       

        while (low <= high )
        {
            int mid = (low + high )/2;
            long square =(long)mid * mid;

            if(square == x)
            {
                return mid;

            }
            else if(square < x)
            {
                sum = mid;
                low = mid +1;
            }
            else
            {
                high = mid -1;
            }
           
        }
        return sum;
    }
}

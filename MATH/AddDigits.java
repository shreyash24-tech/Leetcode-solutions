// LeetCode : Add Digits 
// Constraints : 0 <= num <= 2^31 - 1
// Hint : num == 0   return 0
//        num % 9==0 return 9
//        else num % 9 

class Solution {
    public int addDigits(int num) {
      if (num ==0)

      {
        return 0;
      }
         if(num %9 == 0)
        {
            return 9;
        }
    
        else 
        {
            return num%9;
        }
        
    }
}

// Leetcode : Roman To Integer
//  Important Rule (Subtraction Rule)
// If a smaller value comes before a larger value, subtract it.

// Valid cases:
// - I before V or X → 4, 9
// - X before L or C → 40, 90
// - C before D or M → 400, 900

//  Example: IV

// - I = 1  
// - V = 5  
// - I comes before V → subtract  
//   I < V
//   for i =0
//   total -= I
//   total = -1
//   for i =1
//   V is last element (No elements further)
//   total += v
//   -1 + 5
//   4
//   Answer IV = 4 

class Solution {
    public int romanToInt(String s) {
        int total= 0;
        for (int i=0; i<s.length(); i++)
        {
            
            int curr = value(s.charAt(i));

            if((i+1)< s.length() && curr < value(s.charAt(i+1)))
            {
                total -= curr;
            }
            else
            {
                total += curr;
            }
           
        }
         return total;
    }
        private int value(char c)
        {
            switch(c){

                case 'I': return 1;
                case 'V': return 5;
                case 'X': return 10;
                case 'L': return 50;
                case 'C': return 100;
                case 'D': return 500;
                case 'M': return 1000;
            }
            return 0;
        }
        
    
}

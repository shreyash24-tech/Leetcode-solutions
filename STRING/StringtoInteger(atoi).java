// Leetcode : String to Integer (atoi)

//   Explainnation :

// Initialize the variables 
//   i=0
//   sign = +1
//   result =0
//   n = length of string 

// Traverse the loop until i<n
//   check wheather Initially if there are some spaces " " - continue
//   Then check wheather the sign is present - if present then store that
//   and after that check wheather the character is Digit then do following steps 

//   in some variables (digit) store the value at that index .
//   and do result = result *10 +digit 

//   After all the steps multiply result * sign 
//   return the result






class Solution {
    public int myAtoi(String s) {
        int i=0;
        int sign = +1;
        int result =0;
        int n =s.length();

        while(i < n && s.charAt(i) ==' ')
            i+=1;
        
        if(i < n && s.charAt(i)== '-')
        
        {
            sign =-1;
            i++;
        }
        else if(i<n && s.charAt(i) == '+')
        {
            i++;
        }


        while(i < n && Character.isDigit(s.charAt(i)))
        {
            int digit =s.charAt(i)-'0';

             if (result > (Integer.MAX_VALUE - digit) / 10) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            result = result *10 + digit;

            i++;

        }

        return result * sign;
        
    }
}

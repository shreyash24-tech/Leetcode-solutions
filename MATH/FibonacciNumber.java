// Leetcode : Fibonacci Number
  
// Explaination : 
// Take a input for number .
// - Check  wheather number is <= 1
//   return that number
// - Initialize a & b to 0 and 1 respectively.
//   Iterate the loop which starts with 2 (As first 2 numbers are known a & b) upto <=n .
// Intialize the sum of a & b to anoher variable c
//   - c = a + b
//   - a = b
//   - b = c
//   return b (sum of previous 2 fib numbers of n)

class Solution {
    public int fib(int n) {
       if(n<=1)
       {
        return n;
       }
        int a =0, b=1;

       for(int i =2 ; i<=n ; i++)
       {
        int c = a + b;
        a = b;
        b = c;
       }
       return b;
    }
}

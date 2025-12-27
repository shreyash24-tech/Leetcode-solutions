// Leetcode : Pow(x,n)
// Explaination:

// - With using inbuilt java function
// - Math.pow(x, n)

// - Without using inbuilt java function
//   Create a function :-
//   pass the value and power(n)
//   create another variable (pow)
//   pass n to pow 
//   -pow = n
//   cheak if power is negative 
//   pow = -pow
//   x = 1 / x    (Taking reciprocal as power is negative)

//   Reverse the loop until pow > 0
//   take one variable of type (long)
  
//   if(pow % 2==1)
//   then result = result * x;

//   x = x*x
//   pow = pow / 2

//   return result
  


class Solution {
    public double myPow(double x, int n) {
      double result= res(x , n);
      return result;
    }
    public double res(double x, int n)
    {
       long pow = n;
       double result =1;
       if(pow<0)
       {
       x =1/x;
        pow = -pow;
       } 

       while (pow > 0)
       {
        if(pow %2 == 1)
        {
            result = result * x;
        }
        x = x* x;
        pow = pow / 2;

       }
       return result ;
    }
}

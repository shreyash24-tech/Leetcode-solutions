// Leetcode : Integer to Roman

// Explaination :
// Create the two arrays of Integer and String respectively.
// Intialze :-
// Values     Symbol
// 1000        M
// 900         CM
// 500         D
// 400         CD
// 100         C
// 90          XC
// 50          L
// 40          XL
// 10          X
// 9           IX
// 5           V
// 4           IV 
// 1           I

// Create a one String ( Use String Builder) , As we'll need to append the Symbols in each iteration .

// Travese the loop according to Values.length
// check wheather the input number is greater than values[i]
// num -= values[i]
// result.append(symbol[i])
// After the complition of loop -
// convert the result to the string & return result
// return result.toString()

class Solution {
    public String intToRoman(int num) {
        int [] values = {
            1000, 900 , 500 , 400, 100 , 90 , 50 , 40 , 10 , 9 , 5 , 4 , 1

        };

        String[] symbol =
        {
        "M" , "CM" , "D" , "CD" , "C" , "XC" , "L" , "XL" , "X" ,"IX" , "V" ,"IV" , "I"
        };

        StringBuilder result = new StringBuilder();
        for(int i =0; i< values.length; i++)
        {
            while(num>= values[i])
            {
                num -=  values[i];
                result.append(symbol[i]);
            }
        }
        return result.toString();
    }
}

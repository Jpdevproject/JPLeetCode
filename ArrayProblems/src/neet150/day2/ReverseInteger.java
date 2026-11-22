package neet150.day2;
/*
Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

Assume the environment does not allow you to store 64-bit integers (signed or unsigned).



Example 1:

Input:
int x = 123;

Output: 321
Example 2:

Input:
int x = -123;

Output: -321
Example 3:

Input:
int x = 120;

Output: 21


Constraints:

-231 <= x <= 231 - 1
 */

public class ReverseInteger {
    public static void main(String[] args) {
        int x=123;
        int rev=reverseInteger(x);
        System.out.print(rev);
    }

    private static int reverseInteger(int x) {
        int rev=0;
        while (x!=0){
            int digit=x%10;
            if(rev==Integer.MAX_VALUE/10 || (rev>Integer.MAX_VALUE/10 && digit>7)){
                return 0;
            }
            if(rev==Integer.MIN_VALUE/10 ||(rev<Integer.MIN_VALUE/10 && digit< -8)){
                return 0;
            }
            rev=rev*10+digit;
            x/=10;
        }
        return rev;
    }

}

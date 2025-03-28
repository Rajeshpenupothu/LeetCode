//Given an integer x, return true if x is a palindrome, and false otherwise.

class Solution {
    public boolean isPalindrome(int x) {
        int rev=0;
        int copy=x;
        if(x<0){
            return false;
        }
        while(x>0){
            rev=(rev*10)+(x%10);
            x=x/10;
        }
    return rev==copy;
}
}
/*To do that, we use an remainder of devided by 10.

121 % 10 = 1
reverse = 1

1 is ones place of 121. Next, we need 2 to create reversed number of 121. How can we get 2 from 121.

I think the easiest way to get 2 is that devide by 10 before we get 2. This is just an answer of division, not an remainder.

121 // 10 = 12
We use 12 to get 2.

Next, we do the same thing. Devide by 10 and get an remainder.

12 % 10 = 2
But problem is how can we create 12 as a reversed number. If we add 2 to reverse, we will get 3 which we don't want.

reverse = 1 + 2
= 3
To create 12 as the reversed number, we should mutiply 10 with reversed number before we add the new remainder(= 2).

reverse * 10
= 1 * 10
= 10
After that, add 2 to 10, so that we can create 12 as the reversed number.

reverse = 12
We will repeat the same algorithm. I'll speed up.

x = 1
remainder = 1 % 10 = 1
reverse = 12 * 10 = 120 + remainder(= 1)
= 121
Now, we have 121 as a complete reversed number. All we have to do is just compare the reversed number(= 121) with original input number(= 121).

But there is another problem. We divide the input number by 10, so now the number is not 121, it's actually 0 now.

To avoid the problem, we copy the input number before we start the main algorithm above, so that we can easily compare the two numbers.

return reverse == xcopy
= 121 == 121
= True*/
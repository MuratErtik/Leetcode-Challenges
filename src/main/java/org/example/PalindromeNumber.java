package org.example;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        else{

            String num = Integer.toString(x);

            int len = num.length();

            int half = len/2;

            if(len%2==0){
                //1441  o 1    3 2     n=2

                int count = 0;
                while(count<=half){
                    if(num.charAt(count) == num.charAt(len-1)){
                        count++;
                        len--;
                    }
                    else{
                        return false;
                    }
                }
                return true;


            }
            else{
                //13231 n-i.  n+i.     n=3
                int count = 1;

                while(count<=half){
                    if(num.charAt(half-count) == num.charAt(half+count)){
                        count++;

                    }
                    else{
                        return false;
                    }

                }
                return true;

            }







        }
    }
}

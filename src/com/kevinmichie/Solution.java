package com.kevinmichie;

import java.util.*;


//Create a Palindrome
public class Solution {

    public boolean Palindrome(char[] charHolder){
        for(int i = 0; i < charHolder.length; i++){
            if(charHolder[i] != charHolder[charHolder.length-1 - i]){
            return false;
                }
            }
        return true;
        }

    public void returnResult(boolean result){
        if(result == true){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }


    public static void main(String[] args) {
        Solution solution = new Solution();

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        char[] charHolder = new char[A.length()];

        for(int i = 0; i < charHolder.length; i++){
            charHolder[i]= A.charAt(i);
        }

        solution.returnResult(solution.Palindrome(charHolder));

    }
}
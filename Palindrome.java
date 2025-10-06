import java.util.*;

class Solution {
    public static boolean isPalindrome(int x) {
        
         int org = x;
         int box = 0;
         while(x>0){
            int digit =  x%10;
            box = box * 10 + digit;
            x = x/10;
         }
        return org == box;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        isPalindrome(input);
    }
}
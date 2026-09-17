class Solution {
     public static boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        s = s.toLowerCase();
        char[] arr = s.toCharArray();
        char[] newArr  = new char[arr.length] ;
        int n = arr.length;
        for (int i = 0; i < n; i++) {          
            newArr[i] = arr[n-i-1];
        }
        for (int i = 0; i < n; i++) {
            if (newArr[i] != arr[i]) {
                return false;
            }
        }
        return true;
    }
}

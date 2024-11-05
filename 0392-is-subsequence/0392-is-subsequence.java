class Solution {
    public boolean isSubsequence(String s, String t) {
        /**
        appear in order
        two pointer
        if find s pointer ++
        pointer == t.length() - 1 retrun true;
         */
         int pointer = 0;

         for (int i = 0; i < t.length(); i++) {
            if (pointer < s.length() && s.charAt(pointer) == t.charAt(i)) pointer++;
            if (pointer == s.length()) return true;
         }

         return pointer == s.length();
    }
}
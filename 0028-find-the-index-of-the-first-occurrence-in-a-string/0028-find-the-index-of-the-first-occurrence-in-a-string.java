class Solution {
  public int strStr(String haystack, String needle) {
    String tmp = haystack;
    for (int i = 0; i <= haystack.length() - 1; i++) {
      if (tmp.startsWith(needle)) {
        return i;
      }
      tmp = haystack.substring(i + 1);
    }
    return -1;
  }
}
import java.util.*;

class Solution {
    public int addDigits(int num) {
    int result = num;

    while (result >= 10) {
      int tmp = 0;
      String strNum = String.valueOf(result);

      for (int i = 0; i < strNum.length(); i++) {
        tmp += Character.getNumericValue(strNum.charAt(i));
      }

      result = tmp;
    }

    return result;
  }
}
public class ValidPalindrome04 {
  public boolean isPalindrome(String s) {
    s = removeNonChars(s.toLowerCase());
    int len = s.length();

    if(len < 2) return true;

    int left = 0;
    int right = len - 1;
    int mid = right / 2;

    for( ; left <= mid; left++, right--){
      if(s.charAt(left) != s.charAt(right)){
        return false;
      }
    }
    return true;
  }

  public String removeNonChars(String s){
    int minAlpha = 'a', maxAlpha = 'z';
    int minNumeric = '0', maxNumeric = '9';

    StringBuilder sb = new StringBuilder();

    for(int i = 0; i < s.length(); i++){
      int current = s.charAt(i);
      if((current >= minAlpha && current <= maxAlpha) || (current >= minNumeric && current <= maxNumeric)){
        sb.append(s.charAt(i));
      }
    }

    return sb.toString();
  }
}

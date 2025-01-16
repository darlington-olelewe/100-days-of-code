public class ReverseString03 {
  public void reverseString(char[] s) {

    int len = s.length;
    int halfLen = len / 2;

    int j = len - 1;
    for(int i = 0; i < halfLen; i++, j--){
      char left = s[i];
      char right = s[j];
      s[i] = right;
      s[j] = left;
    }

  }
}

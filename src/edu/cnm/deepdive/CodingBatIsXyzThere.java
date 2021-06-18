package edu.cnm.deepdive;

/*
Return true if the given string contains an appearance of "xyz" where the xyz is not directly
preceded by a period (.).

xyzThere("abcxyz") → true
xyzThere("abc.xyz") → false
xyzThere("xyz.abc") → true
 */

public class CodingBatIsXyzThere {

  public static void main(String[] args) {
    System.out.printf("with the String %s, the outcome is " + xyzThere("abcxyz") + ".\n", "abcxyz");
    System.out.printf("with the String %s, the outcome is " + xyzThere("abc.xyz") + ".\n", "abc.xyz");
    System.out.printf("with the String %s, the outcome is " + xyzThere("xyz.abc") + ".\n", "xyz.abc");
  }

  public static boolean xyzThere(String str) {

    for (int i = 0; i < str.length() - 2; i++) {
      if (str.charAt(i) == '.') {
        i++;
      } else if (str.substring(i, i + 3).equals("xyz")) {
        return true;
      }
    }
    return false;
  }

}

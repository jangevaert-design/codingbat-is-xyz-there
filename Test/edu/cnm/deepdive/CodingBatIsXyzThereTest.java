package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CodingBatIsXyzThereTest {

  private String[] xyzParams = {
      "abcxyz",
      "abc.xyz",
      "xyz.abc",
      "abcxy",
      "xyz",
      "xy",
      "x",
      "",
      "abc.xyzxyz",
      "abc.xxyz",
      ".xyz",
      "12.xyz",
      "12xyz",
      "1.xyz.xyz2.xyz"
  };

  private boolean[] xyzExpected = {true, false, true, false, true, false, false, false, true, true,
  false, false, true, false};

  @Test
  void xyzTest() {
    for (int i = 0; i < xyzParams.length; i++) {
      boolean actual = CodingBatIsXyzThere.xyzThere(xyzParams[i]);
      Assertions.assertEquals(actual, xyzExpected[i]);

    }
  }

}
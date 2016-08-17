package asd;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Created by DaneasaV on 16.08.2016.
 */
public class Tests {

  @Test
  public void multiplicationOfZeroIntegersShouldReturnZero() {
    assertEquals("10 x 0 must be 0", 0, 10 * 0);
  }

  @Test
  public void addZeroToAnIntegerWouldYieldTheSameResult() {
    assertEquals("10 + 0 must be 10", 10, 10 + 0);
  }

}

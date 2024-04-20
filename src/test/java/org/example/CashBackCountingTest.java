package org.example;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CashBackCountingTest {

  @Test
  public void shouldCalculateForAmount900AndGetExtra100() {
    CashBackCounting service = new CashBackCounting();
    int expected = 100;
    int actual = service.remain(900);
    assertEquals(actual, expected);
  }

}
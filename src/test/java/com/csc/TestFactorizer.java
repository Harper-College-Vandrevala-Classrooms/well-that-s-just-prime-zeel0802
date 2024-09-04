package com.csc;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestFactorizer {

  Factorizer factorizer;

  @BeforeEach
  void setUp() {
    factorizer = new Factorizer();
  }

  @Test
  public void testPrimeFactorsOfZero() {
    assertNull(factorizer.prime_factors(0)); // Should return null for 0
  }

  @Test
  public void testPrimeFactorsOfOne() {
    assertNull(factorizer.prime_factors(1)); // Should return null for 1
  }

  @Test
  public void testPrimeFactorsOfPrimeNumber() {
    List<Integer> expected = Arrays.asList(17);
    assertEquals(expected, factorizer.prime_factors(17)); // Prime number should return itself
  }

  @Test
  public void testPrimeFactorsOfCompositeNumber() {
    List<Integer> expected = Arrays.asList(2, 2, 5, 5);
    assertEquals(expected, factorizer.prime_factors(100)); // Composite number should return factors
  }

  @Test
  public void testPrimeFactorsOfAnotherCompositeNumber() {
    List<Integer> expected = Arrays.asList(2, 3, 3);
    assertEquals(expected, factorizer.prime_factors(18)); // Composite number example
  }
}
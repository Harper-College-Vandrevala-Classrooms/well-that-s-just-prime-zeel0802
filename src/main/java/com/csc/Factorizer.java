package com.csc;

import java.util.ArrayList;
import java.util.List;

public class Factorizer {

  // Method to compute prime factors
  public List<Integer> prime_factors(int number) {
    if (number <= 1) {
      return null; // Returning null for numbers <= 1 as per the requirements
    }

    List<Integer> factors = new ArrayList<>();

    // Start with the smallest prime number
    for (int i = 2; i <= number; i++) {
      while (number % i == 0) {
        factors.add(i); // Add factor
        number /= i; // Divide number by its prime factor
      }
    }

    return factors;
  }
}
package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;



public class NumberTheoryTest  {


    // Prime Number

    @Test
    public void test_smallprime() {
        assertEquals(NumberTheory.isPrime(2), true);
    }

    @Test
    public void test_nonprime() {
        assertEquals(NumberTheory.isPrime(12), false);
    }

    @Test
    public void test_prime() {
        assertEquals(NumberTheory.isPrime(19), true);
    }

    @Test
    public void test_invalid() {
        assertEquals(NumberTheory.isPrime(-1), false);
    }


    // Perfect Number

    @Test
    public void test_perfect_number() {
        assertEquals(NumberTheory.isPerfect(28), true);
    }

    @Test
    public void test_nonperfect_number() {
        assertEquals(NumberTheory.isPerfect(12), false);
    }

    @Test
    public void test_edge_case() {
        assertEquals(NumberTheory.isPerfect(1), false);
    }

    @Test
    public void test_another_perfect_number() {
        assertEquals(NumberTheory.isPerfect(496), true);
    }


    // Harshad Number

    @Test
    public void test_harshad_number() {
        assertEquals(NumberTheory.isHarshad(18), true);
    }

    @Test
    public void test_nonharshad_number() {
        assertEquals(NumberTheory.isHarshad(23), false);
    }

    @Test
    public void test_edge_case_harshad() {
        assertEquals(NumberTheory.isHarshad(0), false);
    }

    @Test
    public void test_larger_harshad_number() {
        assertEquals(NumberTheory.isHarshad(27), true);
    }


    // HNumberTheoryy Number

    @Test
    public void test_happy_number() {
        assertEquals(NumberTheory.isHappynumber(19), true);
    }

    @Test
    public void test_nonhappy_number() {
        assertEquals(NumberTheory.isHappynumber(22), false);
    }

    @Test
    public void test_edge_case_hNumberTheoryy() {
        assertEquals(NumberTheory.isHappynumber(1), true);
    }

    @Test
    public void test_larger_hNumberTheoryy_number() {
        assertEquals(NumberTheory.isHappynumber(82), true);
    }


    // Triangular Number

    @Test
    public void test_triangular_number_0() {
        assertEquals(NumberTheory.isTriangular(0), true);
    }

    @Test
    public void test_nontriangular_number() {
        assertEquals(NumberTheory.isTriangular(5), false);
    }

    @Test
    public void test_larger_triangular_number() {
        assertEquals(NumberTheory.isTriangular(10), true);
    }

    @Test
    public void test_another_nontriangular_number() {
        assertEquals(NumberTheory.isTriangular(696), false);
    }


    // Palindrome Numbers

    @Test
    public void test_nonpalindrome_number() {
        assertEquals(NumberTheory.isPalindrome(456), false);
    }

    @Test
    public void test_single_digit_number() {
        assertEquals(NumberTheory.isPalindrome(7), true);
    }

    @Test
    public void test_larger_palindrome_number() {
        assertEquals(NumberTheory.isPalindrome(1221), true);
    }

    @Test
    public void test_another_nonpalindrome_number() {
        assertEquals(NumberTheory.isPalindrome(12345), false);
    }


    // Armstrong Numbers

    @Test
    public void test_armstrong_number() {
        assertEquals(NumberTheory.isArmstrong(153), true);
    }

    @Test
    public void test_nonarmstrong_number() {
        assertEquals(NumberTheory.isArmstrong(1253), false);
    }

    @Test
    public void test_single_digit_armstrong_number() {
        assertEquals(NumberTheory.isArmstrong(5), true);
    }

    @Test
    public void test_larger_armstrong_number() {
        assertEquals(NumberTheory.isArmstrong(1634), true);
    }

    @Test
    public void test_another_nonarmstrong_number() {
        assertEquals(NumberTheory.isArmstrong(123), false);
    }


    // Perfect Squares

    @Test
    public void test_perfect_square() {
        assertEquals(NumberTheory.isPerfectSquare(16), true);
    }

    @Test
    public void test_nonperfect_square() {
        assertEquals(NumberTheory.isPerfectSquare(10), false);
    }

    @Test
    public void test_smallest_perfect_square() {
        assertEquals(NumberTheory.isPerfectSquare(1), true);
    }

    @Test
    public void test_larger_perfect_square() {
        assertEquals(NumberTheory.isPerfectSquare(81), true);
    }


    // Square Free Numbers

    @Test
    public void test_square_free_number() {
        assertEquals(NumberTheory.isSquareFree(17), true);
    }

    @Test
    public void test_nonsquare_free_number() {
        assertEquals(NumberTheory.isSquareFree(16), false);
    }

    @Test
    public void test_larger_square_free_number() {
        assertEquals(NumberTheory.isSquareFree(19), true);
    }

    @Test
    public void test_smallest_square_free_number() {
        assertEquals(NumberTheory.isSquareFree(1), true);
    }


    // Narcissistic Numbers

    @Test
    public void test_narcissistic_number() {
        assertEquals(NumberTheory.isNarcissistic(153), true);
    }

    @Test
    public void test_nonnarcissistic_number() {
        assertEquals(NumberTheory.isNarcissistic(129), false);
    }

    @Test
    public void test_smallest_narcissistic_number() {
        assertEquals(NumberTheory.isNarcissistic(0), true);
    }

    @Test
    public void test_larger_narcissistic_number() {
        assertEquals(NumberTheory.isNarcissistic(9474), true);
    }


    // Powerful Number

    @Test
    public void testPowerfulNumber() {
        assertEquals(NumberTheory.isPowerful(16), true);
    }

    @Test
    public void testNonPowerfulNumber() {
        assertEquals(NumberTheory.isPowerful(12), false);
    }

    @Test
    public void testSmallestPowerfulNumber() {
        assertEquals(NumberTheory.isPowerful(1), true);
    }

    @Test
    public void testAnotherNonPowerfulNumber() {
        assertEquals(NumberTheory.isPowerful(30), false);
    }


    // Achilles Number

    @Test
    public void testAchillesNumber() {
        assertEquals(NumberTheory.isAchillesNumber(72), true);
    }

    @Test
    public void testNonAchillesNumber() {
        assertEquals(NumberTheory.isAchillesNumber(16), false);
    }

    @Test
    public void testAnotherAchillesNumber() {
        assertEquals(NumberTheory.isAchillesNumber(392), true);
    }

    @Test
    public void testAnotherNonAchillesNumber() {
        assertEquals(NumberTheory.isAchillesNumber(25), false);
    }


    // Sterling Numbers

    @Test
    public void testStirling() {
        assertEquals(NumberTheory.isStirling(5, 2), 15);
    }

    @Test
    public void testNegativeN() {
        assertEquals(NumberTheory.isStirling(-1, 2), 1);
    }

    @Test
    public void testNEqualsK() {
        assertEquals(NumberTheory.isStirling(3, 3), 1);
    }

    @Test
    public void testNLessThanK() {
        assertEquals(NumberTheory.isStirling(2, 5), 0);
    }


    // Eulerian Numbers

    @Test
    public void testEulerianCase1() {
        assertEquals(NumberTheory.isEulerian(3, 1), 4);
    }

    @Test
    public void testEulerianCase2() {
        assertEquals(NumberTheory.isEulerian(4, 1), 11);
    }

}
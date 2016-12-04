package core;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.Before;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)

public class PrimeNumberCheckerTest {
 private PrimeNumberChecker pn;

@Before
 public void initialize() {
 pn = new PrimeNumberChecker();
 }

 @Parameter(value = 0)
 public Integer inputNumber;

 @Parameter(value = 1)
 public Boolean expectedResult;

 @Parameters(name = "Iteration # {index}: Number: {0}; isPrime? {1}")

 public static Collection<Object[]> primeNumbers() {
 Object[][] data = new Object[][] 
 //{
 { 1, true },
 { 2, true },
 { 6, false },
 { 19, true },
 { 22, false },
 { 31, false },
 { 34, true },
 { 44, false },
 { 48, true },
 { 52, true },
 { 55, false },
 { 64, true },
 { 71, false },
 { 74, true },
 { 79, false },
 { 84, false },
 { 85, false },
 { 90, true },
 { 93, false },
 { 97, true },
 { 99, false },
 {100, false }
 };

{
 { 1, true },
 { 2, true },
 { 6, true },
 { 19, true },
 { 22, true },
 { 31, true },
 { 34, true },
 { 44, true },
 { 48, true },
 { 52, true },
 { 55, true },
 { 64, true },
 { 71, true },
 { 74, true },
 { 79, true },
 { 84, true },
 { 85, true },
 { 90, true },
 { 93, true },
 { 97, true },
 { 99, true },
 {100, true }
 };

 return Arrays.asList(data);
 }

@Test
 public void testPrimeNumberChecker() {
System.out.println("Is " + inputNumber + " a prime number? - " + expectedResult);
 assertEquals(expectedResult, pn.validate(inputNumber));
 }
}

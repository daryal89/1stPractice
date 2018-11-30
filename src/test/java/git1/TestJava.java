package git1;

public class TestJava {

	public static void main(String[] args) {
		int[] a = { 2, 4, 6, 8, 10, 12, 14, 2, 4 };
		int[] b = { 1, 2, 3, 5, 7, 9, 11, 13, 15, 5, 15 };
		int[] c = { 5, 10, 15, 20, 25, 30, 35, 40, 45, 5, 10, 15, 12, -100, 200, -189, 350 };

		String[] d = { "ram", "mohan", "deepak", "shyam", "nikhil", "ram" };
		String[] e = { "rupesh", "himesh", "prakash", "mohan", "deepak", "himesh", "mohan" };
		String[] f = { "dipesh", "rupak", "mohan", "ram", "dipesh" };

		JavaMethods im = new JavaMethods();
		im.addNumbers(10);
		im.addNumbers(50);

		im.factorial(0);
		im.factorial(1);
		im.factorial(5);

		im.reverseString("Hello");
		im.reverseString("mohan");

		im.reverseNumber(12345);
		im.reverseNumber(12);
		im.reverseNumber(123);

		im.checkAnagram("Ram");
		im.checkAnagram("madam");
		im.checkAnagram("Madam");
		im.checkAnagram("dad");

		im.fibonacciSeries(5);
		im.fibonacciSeries(10);
		im.fibonacciSeries(20);

		im.swapNumbers(20, 200);
		im.swapNumbers(10, 100);

		im.checkArmstrong(1);
		im.checkArmstrong(0);
		im.checkArmstrong(10);
		im.checkArmstrong(151);
		im.checkArmstrong(370);
		im.checkArmstrong(371);
		im.checkArmstrong(407);
		im.checkArmstrong(429);

		im.digitCount(5);
		im.digitCount(12);
		im.digitCount(1234);
		im.digitCount(1000000001);

		im.checkPrime(1);
		im.checkPrime(2);
		im.checkPrime(3);
		im.checkPrime(4);
		im.checkPrime(5);
		im.checkPrime(7);

		im.checkMinMax(a);
		im.checkMinMax(b);
		im.checkMinMax(c);

		im.sumArray(a);
		im.sumArray(b);
		im.sumArray(c);

		im.checkEvenOdd(0);
		im.checkEvenOdd(-10);
		im.checkEvenOdd(1);
		im.checkEvenOdd(-3);
		im.checkEvenOdd(101);
		im.checkEvenOdd(100);

		im.checkNegativePositive(-1);
		im.checkNegativePositive(0);
		im.checkNegativePositive(1);
		im.checkNegativePositive(-100);
		im.checkNegativePositive(100);

		im.sumEven(10);
		im.sumEven(50);
		im.sumEven(100);

		im.sumOdd(10);
		im.sumOdd(50);
		im.sumOdd(100);

		im.multiplication(2);
		im.multiplication(5);
		im.multiplication(10);
		im.multiplication(20);

		im.swapString("Hari", "Narayan");
		im.swapString("Om", "Shivaya");
		im.swapString("laxmi", "sharma");

		im.duplicateValueOfIntArray(a);
		im.duplicateValueOfIntArray(b);
		im.duplicateValueOfIntArray(c);

		im.duplicateValuesOfStringArray(d);
		im.duplicateValuesOfStringArray(e);

		im.areaOfCircle(5.0);
		im.areaOfCircle(10.0);
		im.areaOfCircle(4.0);

		im.areaOfTriangle(2, 3, 4);
		im.areaOfTriangle(5, 6, 7);
		im.areaOfTriangle(10, 20, 30);

		im.findCommonElementsOfIntArray(a, b);
		im.findCommonElementsOfIntArray(a, c);
		im.findCommonElementsOfIntArray(b, c);

		im.findCommonElementsOfStringArray(d, e);
		im.findCommonElementsOfStringArray(e, f);
		im.findCommonElementsOfStringArray(d, f);

		im.printArrayElement(a);
		im.printArrayElement(b);
		im.printArrayElement(c);

		im.printStringArrayElements(d);
		im.printStringArrayElements(e);
		im.printStringArrayElements(f);

		im.findDuplicateByHashSet(a);
		im.findDuplicateByHashSet(b);
		im.findDuplicateByHashSet(c);

		im.duplicaeStringElementByHashSet(d);
		im.duplicaeStringElementByHashSet(e);
		im.duplicaeStringElementByHashSet(f);

		im.reverseStringUsingStringBuilder("Himalaya");
		im.reverseStringUsingStringBuilder("haripala");
		im.reverseStringUsingStringBuilder("NewYork");

		im.checkPerfectNumber(6);
		im.checkPerfectNumber(14);
		im.checkPerfectNumber(28);

		im.pattern1(5);
		im.pattern1(6);

		im.pattern2(5);
		im.pattern2(6);

		im.pattern4(7);
		im.pattern4(6);

		im.pattern3();

		im.pattern5();

		im.pattern6(7);

		im.pattern7(9);

		im.checkMaximum(c);

		im.checkMin(c);

		im.pattern(5);
	}

}
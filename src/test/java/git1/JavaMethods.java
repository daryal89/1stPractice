package git1;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class JavaMethods {

	// 1. Adding natural numbers upto given digit
	public void addNumbers(int a) {
		int sum = 0;
		for (int i = 0; i <= a; i++) {
			sum = sum + i;
		}
		System.out.println("Sum of 0 upto " + a + ": " + sum);
	}

	// 2. finding factorial
	public void factorial(int a) {
		int fact = 1;
		for (int i = 1; i <= a; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial of " + a + " is :" + fact);
	}

	// 3. Reversing String
	public void reverseString(String str) {
		String a = str;
		String reverse = "";
		for (int i = a.length() - 1; i >= 0; i--) {
			reverse = reverse + a.charAt(i);
		}
		System.out.println(reverse + " is the reverse of " + a);
	}

	// 4. Reversing a number
	public void reverseNumber(int a) {
		int num = a;
		int reverse = 0;
		while (num != 0) {
			reverse = reverse * 10 + num % 10;
			num /= 10;
		}
		System.out.println(reverse + " is the reverse of a number " + a);
	}

	// 5. Checking Palindrome
	public void checkAnagram(String a) {
		String b = a;
		String rev = "";
		for (int i = b.length() - 1; i >= 0; i--) {
			rev = rev + b.charAt(i);
		}
		if (a.equals(rev)) {
			System.out.println(a + " is an Anagram");
		} else {
			System.out.println(a + " is not an anagram");
		}
	}

	// 6. Writing a fibonacci series
	public void fibonacciSeries(int a) {
		int num1 = 0;
		int num2 = 1;
		System.out.print(num1 + " " + num2 + " ");
		int sum;
		for (int i = 2; i < a; i++) {
			sum = num1 + num2;
			num1 = num2;
			num2 = sum;
			System.out.print(sum + " ");
		}
		System.out.println();
	}

	// 7. Swaping two numbers
	public void swapNumbers(int num1, int num2) {
		int temp;
		temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("After swaping: " + "num1 is: " + num1 + " num2 is: " + num2);
	}

	// 8. Check Armstrong Number
	public void checkArmstrong(int a) {
		int num1 = a;
		int total = 0;
		int temp;
		while (num1 != 0) {
			temp = num1 % 10;
			total = total + temp * temp * temp;
			num1 = num1 / 10;
		}
		if (a == total) {
			System.out.println(a + " is an armstrong number");
		} else {
			System.out.println(a + " is not an armstrong number");
		}
	}

	// 9. Digit count of a given number
	public void digitCount(int a) {
		int num = a;
		int count = 0;
		while (num != 0) {
			num = num / 10;
			count++;
		}
		System.out.println(count + " is the digit count of number " + a);
	}

	// 10. Check prime number or not a prime number
	public void checkPrime(int a) {
		int num = a;
		boolean flag = false;
		if (num <= 0) {
			flag = true;
		}
		for (int i = 2; i <= num / 2; ++i) {
			// condition for non-prime number
			if (num % i == 0) {
				flag = true;
				break;
			}
		}

		if (!flag)
			System.out.println(num + " is a prime number.");
		else
			System.out.println(num + " is not a prime number.");
	}

	// 11. Find minimum and maximum of an array
	public void checkMinMax(int[] a) {
		int min = a[0];
		int max = a[0];
		for (int i = 0; i < a.length; i++) {

			// finding minimum
			if (min > a[i]) {
				min = a[i];
			}

			// finding maximum
			if (max < a[i]) {
				max = a[i];
			}
		}
		System.out.println("Minimum in the given array is: " + min);
		System.out.println("maximum in the given array is: " + max);
	}

	// 12. Summing the elements of an array
	public void sumArray(int[] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		System.out.println("The sum of given array is: " + sum);
	}

	// 13. check even/ odd numbers
	public void checkEvenOdd(int a) {
		if (a % 2 == 0)
			System.out.println(a + " is an even number ");
		else
			System.out.println(a + " is an Odd numver");
	}

	// 14. Check Negative/Positive numbers
	public void checkNegativePositive(int a) {
		if (a > 0)
			System.out.println(a + " is a positive numver");
		else if (a < 0)
			System.out.println(a + " is a negative number");
		else
			System.out.println(a + "  is neither negative nor positive number it is zero");
	}

	// 15. Sum of Even numbers
	public void sumEven(int a) {
		int sum = 0;
		for (int i = 0; i <= a; i = i + 2) {
			sum = sum + i;
		}
		System.out.println("The Even sum upto " + a + " is: " + sum);
	}

	// 16. Sum of Odd Numbers
	public void sumOdd(int a) {
		int sum = 0;
		for (int i = 1; i <= a; i = i + 2) {
			sum = sum + i;
		}
		System.out.println("The Odd sum upto " + a + " is: " + sum);
	}

	// 17. multiplication of natural numbers
	public void multiplication(int a) {
		int multi = 1;
		for (int i = 1; i <= a; i++) {
			multi = multi * i;
		}
		System.out.println("Multiplication of 1 to " + a + " is: " + multi);
	}

	// 18. swaping two strings : mohan + shyam = mohanshyam
	public void swapString(String str1, String str2) {
		str1 = str1 + str2;
		str2 = str1.substring(0, str1.length() - str2.length());
		str1 = str1.substring(str2.length());
		System.out.println("Value of str1: " + str1 + " value of str2: " + str2);
	}

	// 19. Finding Duplicate element of an String array
	public void duplicateValuesOfStringArray(String[] a) {
		String duplicate = "";
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if ((a[i].equals(a[j])) && (i != j)) {
					duplicate = a[j];
					System.out.println("The duplicate element is: " + duplicate);
				}
			}
		}
	}

	// 20. Finding Duplicate element of an int array
	public void duplicateValueOfIntArray(int[] a) {
		int duplicate = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if ((a[i] == (a[j])) && (i != j)) {
					duplicate = a[j];
					System.out.println("The duplicate int is: " + duplicate);
				}
			}
		}
	}

	// 21. Find Area of a given circle
	public void areaOfCircle(double radius) {
		double area = Math.PI * radius * radius;
		System.out.println("Area of circle with radius " + radius + " is: " + area);
	}

	// 22. Find area of triangle
	public void areaOfTriangle(double side1, double side2, double side3) {
		double area = (side1 * side2 * side3) / 2;
		System.out.println("Area of triangle with sides: " + side1 + " " + side2 + "  " + side3 + "  is: " + area);
	}

	// 23. Finding common elements of two arrays
	public void findCommonElementsOfIntArray(int[] a, int[] b) {
		HashSet<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					set.add(a[i]);
				}
			}
		}
		System.out.println("Common elements are: " + set);
	}

	// 24. Finding common elements of two String arrays
	public void findCommonElementsOfStringArray(String[] a, String[] b) {
		HashSet<String> set = new HashSet<String>();
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if ((a[i]).equals(b[j])) {
					set.add(a[i]);
				}
			}
		}
		System.out.println("The common elements of two String arrays are: " + set);
	}

	// 25. printing elements of an array
	public void printArrayElement(int[] a) {
		for (int b : a) {
			System.out.print(b + " ");
		}
		System.out.println();
	}

	// 26. printing Elements of an String array
	public void printStringArrayElements(String[] str) {
		for (String a : str) {
			System.out.print(a + " ");
		}
		System.out.println();
	}

	// 27.Using HashSet finding duplicate elements in an array

	public void findDuplicateByHashSet(int[] a) {
		HashSet<Integer> set = new HashSet<Integer>();
		for (int element : a) {
			if (!set.add(element)) {
				System.out.println("Duplicate elements are: " + element);
			}
		}
	}

	// 28. Using HashSet finding duplicate elements in String array
	public void duplicaeStringElementByHashSet(String[] a) {
		HashSet<String> set = new HashSet<String>();
		for (String ele : a) {
			if (!set.add(ele)) {
				System.out.println("The duplicate elements in a String array are: " + ele);
			}
		}
	}

	// 29. Reversing String using StringBuilder class
	public void reverseStringUsingStringBuilder(String a) {
		StringBuilder sb = new StringBuilder();
		sb.append(a);
		sb = sb.reverse();
		System.out.println(sb + " is the reverse of :" + a);
	}

	// 30. Generating random numbers
	public void generateRandomNumbers() {
		Random ran = new Random();
		for (int i = 0; i <= 5; i++) {
			int number = ran.nextInt(200);
			System.out.print(number + " ");
		}
		System.out.println();
	}

	// 31. Reverse a Number
	public void reverseNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int number = sc.nextInt();
		int reverse = 0;
		while (number != 0) {
			reverse = reverse * 10;
			reverse = reverse + number % 10;
			number = number / 10;
		}
		System.out.println("Reversed number is: " + reverse);
	}

	// 32 Check Perfect number

	void checkPerfectNumber(int a) {
		int temp = 0;
		for (int i = 1; i <= a / 2; i++) {
			if (a % i == 0)
				temp = temp + i;
		}
		if (a == temp)
			System.out.println(a + " is perfect number");
		else
			System.out.println(a + " is not a perfect number");
	}

	// 33. Pattern print the pattern
	public void pattern1(int a) {
		for (int i = 1; i <= a; i++) {
			for (int j = 1; j < i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

	// 33. Pattern print the pattern
	public void pattern2(int a) {
		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}

	// 34. Pattern Example
	public void pattern3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input data: ");
		int num = sc.nextInt();
		for (int i = num; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

	// 35. Pattern Printing
	public void pattern4(int a) {
		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		for (int i = a - 1; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

	// 36. Pattern Example
	public void pattern5() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the data: ");
		int num = sc.nextInt();
		for (int i = 1; i <= num; i++) {
			for (int j = num; j >= i; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

	// 37. Pattern Example
	public void pattern6(int a) {
		for (int i = a; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		for (int i = 2; i <= a; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

	// 38. Pattern Example
	public void pattern7(int a) {
		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			for (int j = i - 1; j >= 1; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

	// 39. Check two maximum values of the array
	public void checkMaximum(int num[]) {
		int max1 = num[0];
		int max2 = num[0];
		for (int i = 0; i < num.length; i++) {
			if (max1 < num[i]) {
				max2 = max1;
				max1 = num[i];
			} else if (max2 < num[i]) {
				max2 = num[i];
			}
		}
		System.out.println("The max1 value is: " + max1);
		System.out.println("The max2 value is: " + max2);

	}

	// 39. Check two maximum values of the array
	public void GetTwoMaxValues(int[] nums) {

		int maxOne = 0;
		int maxTwo = 0;
		for (int n : nums) {
			if (maxOne < n) {
				maxTwo = maxOne;
				maxOne = n;
			} else if (maxTwo < n) {
				maxTwo = n;
			}

		}

		System.out.println("Max1 - " + maxOne);
		System.out.println("Max2 - " + maxTwo);
	}

	// 40. Check two minimum values of the array
	public void checkMin(int[] num) {
		int min1 = num[0];
		int min2 = num[0];
		for (int i = 0; i < num.length; i++) {
			if (min1 > num[i]) {
				min2 = min1;
				min1 = num[i];
			} else if (min2 > num[i]) {
				min2 = num[i];
			}
		}
		System.out.println("Minimum1 value is: " + min1);
		System.out.println("Minimum2 value is: " + min2);
	}

	// 41. converting String to integer
	public void StringToInt(String a, int i) {
		Integer.parseInt(a);
		System.out.println("The value of integer is: " + (Integer.parseInt(a) + i));
	}

	// 42. Converting String to int using ValueOf() method
	public void StringToIntValueOfMethod(String a, int i) {
		Integer.valueOf(a);
		System.out.println("The value of integer is: " + (Integer.valueOf(a) + i));
	}

	// 43. Converting int to String using valueOf() method
	public void IntToString(int a, int i) {
		String.valueOf(a);
		System.out.println("The value of String is: " + i + String.valueOf(a));
	}

	// 44. pattern Example
	public void pattern(int a) {
		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= i * 2; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

	// 45. Odd count pattern in rows
	public void patternOdd(int a) {
		for (int i = 1; i < 6; i++) {
			for (int j = 1; j <= i * 2 - 1; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

}

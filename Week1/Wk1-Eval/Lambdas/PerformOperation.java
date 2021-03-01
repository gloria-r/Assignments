package com.lavenberg;

interface PerformOperation {
	boolean check(int a);
	}

	class Math {
		public static boolean checker(PerformOperation p, int num) {
			return p.check(num);
		}

		public static PerformOperation isOdd() {
			return a -> (a % 2 != 0) ? true : false;
		}

		public static PerformOperation isPrime() {
			return a -> {for (int i = 2; i * i <= a; i++) {
				if (a % i == 0) {
					return false;
				}
			}
			return true;
			};
		}
		
		public static PerformOperation isPalindrome() {
			//last .toString() converts string builder obj to string which makes it available to use the string method .equals() to
			//compare two strings. Last call toString to get String content of StringBuilder object.
			//return a -> a == Integer.parseInt(new StringBuilder(String.valueOf(a)).reverse().toString()) ? true : false;
			return (int a) -> Integer.toString(a).equals(new StringBuilder(Integer.toString(a)).reverse().toString());
		}

}

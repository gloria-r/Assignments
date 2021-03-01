package com.lavenberg;

import java.io.*;
import java.util.*;

public class Solution {
	public static void main(String[] args) throws IOException {
		Math obj = new Math();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		PerformOperation op;
		boolean ret = false;
		String ans = null;

		while (T --> 0) {
			String s = br.readLine().trim();
			StringTokenizer st = new StringTokenizer(s);
			int ch = Integer.parseInt(st.nextToken());
			int num = Integer.parseInt(st.nextToken());

			if (ch == 1) {
				op = obj.isOdd();
				ret = obj.checker(op, num);
				ans = (ret) ? "ODD" : "EVEN";

			} else if (ch == 2) {
				op = obj.isPrime();
				ret = obj.checker(op, num);
				ans = (ret) ? "PRIME" : "COMPOSITE";

			} else if (ch == 3) {
				op = obj.isPalindrome();
				ret = obj.checker(op, num);
				ans = (ret) ? "PALINDROME" : "NOT PALINDROME";
			}
			System.out.println(ans);
			}
		}
		}

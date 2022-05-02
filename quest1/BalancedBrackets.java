package quest1;

import java.util.Stack;

public class BalancedBrackets {

		static void checkBalanceBrackets(String str) {

			boolean ans = hasBalanceBrackets(str);
			if (ans == true) {
				System.out.println("GIven string is having balanced brackets");
			} else {
				System.out.println("Given string is not having balanced brackets");
			}
		}

		private static boolean hasBalanceBrackets(String str) {
		
			return false;
		}

		public static void main(String[] args) {

			String inputString;

			inputString = "([[{}]])";
			checkBalanceBrackets(inputString);

			System.out.println();

			inputString = "([[{}]]))";
			checkBalanceBrackets(inputString);

		
		}

	
	}


	
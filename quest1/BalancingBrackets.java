package quest1;

	import java.util.Stack;
	
	public class BalancingBrackets {

		public static boolean hasBalanceBrackets(String str, Stack<Character> stack) {
		char[] ch = str.toCharArray();
			
			for (int i = 0; i < str.length(); i++) {
				char c = ch[i];
				if (c == '(' || c == '[' || c == '{') {
					stack.push(c);
				} else {

					if (stack.isEmpty()) {
						return false;
					}
					if (c == ')') {
						char temp = stack.pop();
						if (temp != '(') {
							return false;
						}
					} else if (c == ']') {
						char temp = stack.pop();
						if (temp != '[') {
							return false;
						}

					} else if (c == '}') {
						char temp = stack.pop();
						if (temp != '{') {
							return false;
						}

					}
				}
			}
			if (!stack.isEmpty()) {
				return false;
			} else {
				return true;
				
				
		}
			
			}
		
		}

		
	

	
		
					
	
			
					

			
			

		
	
		

			
	
	



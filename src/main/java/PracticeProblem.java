public class PracticeProblem {
	final static int MAXIMUM = 10;
	public static void main(String args[]) {
		calculate(2,3,'*');
		calculate(7,3,'^');
		System.out.println(totalWordsChecker("I like coding"));
		System.out.println(totalWordsChecker("math is so hard I don't know how to solve those questions"));
		System.out.println(minString("a", "b", "c"));

	}

	//q1
	public static int calculate(int num1, int num2, char character) {
		switch (character) {
			case '+':
				int a = num1 + num2;
				System.out.println(a);
				return a;
			
			case '-':
				int b = num1 - num2;
				System.out.println(b);
				return b;
			
			case '*':
				int c = num1 * num2;
				System.out.println(c);
				return c;
			
			case '/':
				int d = num1 / num2;
				System.out.println(d);
				return d;
			
			case '%':
				int e = num1 % num2;
				System.out.println(e);
				return e;
				
			case '^':
				int f = (int) Math.pow(num1, num2);
				System.out.println(f);
				return f;
			
			default:
				return 0;


		}
	}

	//q2
	public static boolean totalWordsChecker(String sentence) {
		char[] arr = sentence.toCharArray();
		int count = 0;
		for (int a = 0; a < arr.length; a++) {
			int ascii = arr[a];
			if (!((ascii >= 65 && ascii <= 90) || (ascii >= 97 && ascii <= 122) || (ascii == 39) || (ascii == 95))) {
				count++;
				if (a < arr.length - 1 && arr[a] == '(' && arr[a + 1] == ')'){
					count--;
					count--;
				}
			}
		}
		return count + 1 <= MAXIMUM;

	}

	
	//q3
	public static String minString(String word11, String word22, String word33) {
		String word1 = word11.toLowerCase();
		String word2 = word22.toLowerCase();
		String word3 = word33.toLowerCase();
		int case1 = word1.compareTo(word2);
		int case2 = word1.compareTo(word3);
		int case3 = word2.compareTo(word3);
		if (case1 < 0 && case2 < 0) {
			return word11;
		} else if (case1 > 0 && case3 < 0) {
			return word22;
		} else {
			return word33;
		}
		
		
	}

}

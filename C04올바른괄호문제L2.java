package C01;

public class C04올바른괄호문제L2 {

	public static void main(String[] args) {
	       	String s = "()()";
	        System.out.println(solution(s)); // true

	        s = "(())()";
	        System.out.println(solution(s)); // true

	        s = "())(";
	        System.out.println(solution(s)); // false

	        s = "(()(";
	        System.out.println(solution(s)); // false

	}
	
	
	static boolean solution(String s) {
		
		
		return false;
	}

}

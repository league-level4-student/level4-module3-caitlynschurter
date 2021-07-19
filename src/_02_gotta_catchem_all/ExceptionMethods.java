package _02_gotta_catchem_all;

public class ExceptionMethods {
	
	public double divide (double x, double y) throws Exception {
		if(y == 0.0) {
			throw new Exception();
		}
		return x/y;
		
	}
	
	public String reverseString(String s) throws Exception {
		String newString = "";
		
		if(s.equals("")) {
			throw new Exception();
		}
		
		for(int i = s.length(); i > 0; i--) {
			char ch = s.charAt(i);
			newString += ch;
		}
		return newString;
		
	}
	
}

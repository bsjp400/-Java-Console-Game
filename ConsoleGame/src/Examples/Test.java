package Examples;

public class Test {
	public static void main(String args[]) {
		String s = "AABCCADDDE";
		String test = "";
		int answer = 0;
		int count = 0;
		String[] result = new String[s.length()];
		result = s.split("");
		for (int i = 0; i < result.length; i++) {
			if (result[i] == result[i+1]) {
				test += result[i];
				count++;
			} else {
				
			}
		}
		int test1 = 5;
		int test2 = mul(test1);
	}
}
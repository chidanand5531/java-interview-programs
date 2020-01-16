package javaprograms2;

public class PrintNonDuplicates {

	public static void main(String[] args) {

		String str = "udaykumar";
		int cnt = 0;

		char[] inp = str.toCharArray();

		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) {
				if ((inp[i] != inp[j])) {
					System.out.print(inp[j]);
					cnt++;
					break;
				}
			}
		}

	}
}

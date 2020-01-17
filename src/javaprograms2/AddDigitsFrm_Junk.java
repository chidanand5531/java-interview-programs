package javaprograms2;

public class AddDigitsFrm_Junk {

	public static void main(String[] args) {
		
		String str="chid56anand12 a34";
		int sum=0;
		
		String[] st1=str.replaceAll("[^0-9]", "").trim().split("");
		
		for (int i = 0; i < st1.length; i++) {
			
			sum=sum+Integer.parseInt(st1[i]);
		}
System.out.println(sum);
		
/*		for (String input : st1) {
			if(input.matches("[0-9]+")) {
				sum=sum+Integer.parseInt(input);
			}
		}
		System.out.println(sum);*/

	}

}

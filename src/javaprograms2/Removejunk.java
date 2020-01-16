package javaprograms2;

public class Removejunk {

	public static void main(String[] args) {
		
/*		String str="[wdsd(340) svdf]";
		//String str1 =str.replace("[","").replace("]", "");
		String str1 =str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(str1);*/
		
		String str="John Smith";
		String[] s=str.split(" ");
		String rev=String.join(" ",s[1],s[0]);
		System.out.println(rev);

	}

}

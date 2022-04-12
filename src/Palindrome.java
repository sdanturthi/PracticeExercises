
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "this is great";
		char[] ch1 = str.toCharArray();
		int charLen = ch1.length;
		String strRev="";

		for(int i =charLen-1; i>0; i--) {
			System.out.print(ch1[i]);
			
			strRev += ch1[i];
		}		
		System.out.println();	
		System.out.println(strRev);
		
	}

}

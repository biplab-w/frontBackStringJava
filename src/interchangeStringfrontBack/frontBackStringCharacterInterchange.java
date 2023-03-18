package interchangeStringfrontBack;

public class frontBackStringCharacterInterchange {
	public static void main(String args[]) {

//Given a string, return a new string 
//where the first and last chars have been exchanged.
//frontBack("code") → "eodc"
//frontBack("a") → "a"
//frontBack("ab") → "ba"
		
		frontBackStringCharacterInterchange fbsc = new frontBackStringCharacterInterchange();
		System.out.println(fbsc.frontBack("code"));
		System.out.println(fbsc.frontBack("a"));
		System.out.println(fbsc.frontBack("ab"));
		
	}
	
	public String frontBack(String str) {
		if(str.length() <= 1) {
			return str;
		}else {
			String last = str.substring(str.length()-1);
			String first = str.substring(0,1);
			String mid = str.substring(1, str.length()-1);
			return last+mid+first;
		}
	}
}

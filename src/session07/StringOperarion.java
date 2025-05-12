package session07;

public class StringOperarion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Hello Smrity";
		System.out.println( s.charAt(2)); // char find
		System.out.println(s.length());   //length 
		System.out.println(s.toLowerCase()); // make it lower case
		System.out.println(s.toUpperCase()); // make it upper case
		System.out.println(s.replace("e","o")); //replace char
		System.out.println(s.replace("Smrity", "Ammu")); //replace word
		System.out.println(s.indexOf("r"));
		System.out.println(s.substring(4)); 
		System.out.println(s.isEmpty()); // check empty or not
		
	}

}

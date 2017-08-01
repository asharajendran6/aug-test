/**
 * 
 */
package string_method;

/**
 * @author RSL
 *
 */
public class strings {

	public static void main(String[] args) {
	String s1 = "The Java Program";
	String s2 = "89";
	//compare two strings 
	//System.out.println(s1.equalsIgnoreCase(s2));
	System.out.println(s1.equals(s2));
	//concatenate two strings 
	System.out.println(s1.concat(s2));
	//9th indexed character
	//System.out.println(s1.charAt(9));
	//length of the string
	System.out.println(s1.length());
	//Index of character a
	System.out.println(s1.indexOf("Program"));
	
	}

}

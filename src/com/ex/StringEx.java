/**
 * 
 */
package com.ex;


/**
 * @author vsuramsetti
 *
 */
public class StringEx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String name = new String ("Venkata ");
		name = name.concat("Ramana");
		System.out.println(name);
		
		StringBuffer sb = new StringBuffer("Venkata ");
		sb.append("Ramana");
		System.out.println(sb);
		
//		String str = "Hello World";
//		System.out.println(str.substring(2));
//		System.out.println(str.substring(6,7));
		
		String Str = new String("Welcome toTutorialspoint.com");

	      System.out.print("Return Value :" );
	      System.out.println(Str.substring(10) );

	      System.out.print("Return Value :" );
	      System.out.println(Str.substring(10, 15) );
	      
	      String message  = "This is a text message";
	      String[] strArr = message.split(" ");
	      System.out.println("String words count::" + strArr.length);
	      
	      int res=count(message);
	      
	      System.out.println("String words count with pgm::" + res);
	      
	      String str = "Hello";
	      str.concat(" World");
	      System.out.println(str);
	      String str1 = "Hello";
	      System.out.println(str1.hashCode());
	      str1 = str1.concat(" World");
	      System.out.println(str1);
	      System.out.println(str1.hashCode());
	      StringBuffer sb1 = new StringBuffer("Hellow");
	      sb1.append(" World");
	      System.out.println("SB!:::"+sb1);
	      
	}
	
	private static int count(String s) {
        int count=0;
        if(s.charAt(0)!=' '){
            count++;
        }
        for(int i=0;i<s.length();i++){
            if((s.charAt(i)==' ')){
                count++;
            }
        }
        return count;
    }

}

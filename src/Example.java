/**
 * 
 */

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author vsuramsetti
 *
 */
public class Example {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Date dt = new Date();
		Calendar c = Calendar.getInstance();
		c.setTime(dt);
		c.add(Calendar.DATE, 1);
		dt = c.getTime();
		System.out.println(dt.getTime());
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("one", "ONE");
		map.put("two", "TWo");
		map.put("one", "THREE");
		
		System.out.println(map.get("one"));
		//System.out.println(map.get("two"));
		
		// 429c4ce2f3c8e45adf626cf253b7bcc4616aa6f6

	}

}

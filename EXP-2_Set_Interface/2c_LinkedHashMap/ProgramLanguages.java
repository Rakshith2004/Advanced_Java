/*
 2. Include the following elements into the LinkedHashMap called programminglanguages and print all
of them.
("Java", 1995);("Python", 1991);(“JavaScript", 1995);("C++", 1985);
 */

package Collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class ProgramLanguages {
	public static void main(String[] arg) {
		LinkedHashMap<String, String> m = new LinkedHashMap<>();
		m.put("Java", "1995");
		m.put("Python", "1991");
		m.put("JavaScript", "1995");

		for (Map.Entry<String, String> entry : m.entrySet()) {
			System.out.println(entry.getKey() + " -> " + entry.getValue());
		}
	}
}

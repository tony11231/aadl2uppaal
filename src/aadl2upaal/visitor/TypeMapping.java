package aadl2upaal.visitor;

import java.util.HashMap;

public class TypeMapping {
	public HashMap<String, String> map = new HashMap<String, String>();

	public TypeMapping() {
		// TODO Auto-generated constructor stub
		map.put("aadlinteger", "int");
		map.put("aadlreal", "double");
		map.put("aadlinteger", "int");
		map.put("aadlinteger", "int");
	}

	public String getMappingType(String str) {
		if (null == map.get(str)) {
			return "double";
		} else {
			return map.get(str);
		}
	}
}
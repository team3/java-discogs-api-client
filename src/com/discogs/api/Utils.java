package com.discogs.api;

import java.lang.reflect.Method;
import java.nio.CharBuffer;

public class Utils {
	
	/**
	 * This method converts all the letters into upper/lower case, 
	 * depending on their position near a space or other special chars.
	 * 
	 * @param string
	 * @return
	 */
	private static String capitalizeString(String string) {
		char[] chars = string.toLowerCase().toCharArray();
		boolean found = false;
		for (int i = 0; i < chars.length; i++) {
			if (!found && Character.isLetter(chars[i])) {
				chars[i] = Character.toUpperCase(chars[i]);
				found = true;
			} else if (Character.isWhitespace(chars[i]) || chars[i] == '.' || chars[i] == '\'') { 
				found = false;
			}
		}
		return String.valueOf(chars);
	}
	
	public static String prepareMethodName(String string) {
		StringBuilder b = new StringBuilder();
		
		String[] parts = string.split("_");
		for (int i = 0; i < parts.length; i ++){
			b.append(capitalizeString(parts[i]));
		}
		
		return b.toString();
	}
	
	/**
	 * Converts specified string into integer.
	 * 
	 * @param val 
	 * 				string value of the integer.
	 * @return
	 */
	public static final int safeInt(String val) {
		return (val == null ? null: Integer.parseInt(val));
	}
	
	/**
	 * Converts specified string into long.
	 * 
	 * @param val 
	 * 				string value of the long.
	 * @return
	 */
	public static final long safeLong(String val) {
		return (val == null ? null: Long.parseLong(val));
	}
	
	/**
	 * Returns the method of the specified class with the specified name if it's declared.
	 * 
	 * @param methodName
	 * 				name of the method.
	 * @param klass
	 * 				class.
	 * @return
	 */
	public static Method findMethod(String methodName, Class<?> klass) {
		Method method = null;
		System.out.println("Search method: " + methodName + " of the class " + klass.getCanonicalName());
		Method[] methods = klass.getMethods();

		for (int i = 0; i < methods.length; i ++) {
			Method m = methods[i];
			if (methodName.equals(m.getName())) method = m;
		}
		
		return method;
	}
}

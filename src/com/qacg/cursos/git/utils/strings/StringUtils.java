package com.qacg.cursos.git.utils.strings;

public class StringUtils {

	public static String toLowerCase(final String toLowerCaseString) {

		if (null != toLowerCaseString && !toLowerCaseString.isEmpty()) {
			return toLowerCaseString.toLowerCase();
		} else {
			return null;
		}
	}

}

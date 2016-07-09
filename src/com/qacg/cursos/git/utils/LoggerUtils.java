package com.qacg.cursos.git.utils;

public class LoggerUtils {

	public static void debug(final Object object, final String message) {
		System.out.println(object.getClass().getName() + " " + message);
	}

}

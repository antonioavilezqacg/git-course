package com.qacg.cursos.git.utils;

public class MailUtils {

	public static boolean send(final String email) {
		if (null != email && !email.isEmpty()) {
			System.out.println("correo enviado");
			return true;
		} else {
			return false;
		}
	}

}
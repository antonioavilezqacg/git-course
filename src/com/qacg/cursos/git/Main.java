package com.qacg.cursos.git;

import com.qacg.cursos.git.utils.StringUtils;
import com.qacg.cursos.git.utils.MailUtils;

public class Main {

	public static void main(String[] args) {

		String sMessage = "Hello world, Git Course";
		System.out.println(StringUtils.toLowerCase(sMessage));
		MailUtils.send("antonio.avilez@gmail.com");
	}

}

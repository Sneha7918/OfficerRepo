package com.cg.nsa;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/******************************************************************************
 * 
 * @author SNEHA V
 * Version: 1.0
 * Description: This is a ServletInitializer class
 * created date: 22-04-2021
 *
 ******************************************************************************/

public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(NationalScholarshipAppApplication.class);
	}

}

package com.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class StudentAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		
		Class [] configFiles = {StudentAppConfig.class};
		
		return configFiles;
	}

	@Override
	protected String[] getServletMappings() {
		
		// method returns string because it returns URL to be handled
		String[] mappings={"/"};
		
		return mappings;
	}

}

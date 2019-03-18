package com.grocklie.merchant.boot;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.grocklie.merchant.javaConfig.WebRootConfig;
import com.grocklie.service.javaConfig.ServiceRootConfig;

public class MerchantDispatcherServletInitiliazer extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class<?>[] {ServiceRootConfig.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class<?>[] {WebRootConfig.class};
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] {"*.web"};
	}

}

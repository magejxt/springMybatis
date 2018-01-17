package com.jxt.webservice.impl;

import javax.jws.WebService;

import com.jxt.webservice.AppService;

@WebService(serviceName="cxfDemo", targetNamespace="http://impl.demo/")
public class AppServiceImpl implements AppService{

	public String test(String name) {
		return "ÐÕÃû:"+name;
	}

}

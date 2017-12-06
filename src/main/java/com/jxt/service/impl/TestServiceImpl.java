package com.jxt.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jxt.dao.TestDao;
import com.jxt.model.Test;
import com.jxt.service.TestService;

@Service
public class TestServiceImpl implements TestService{

	@Autowired
	private TestDao testDao;
	public List<Test> list() {
		return testDao.list();
	}

}

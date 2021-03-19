package com.demo.dao;

import org.apache.log4j.Logger;

import com.demo.service.LogService;

public class LogDAO {
	
	private static Logger log = Logger.getLogger(LogService.class);
	public void helloLogDAO() {
		log.debug("hello from LogDAO");
		//some operation in logdao
		log.info("hello to customer from LogDAO");
		log.debug("bye bye from LogDAO");
	}


}

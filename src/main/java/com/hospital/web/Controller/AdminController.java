package com.hospital.web.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="admin")
public class AdminController {
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
		public String goLogin(){
			logger.info("AdminController() {}","진입");
			return "public:common/loginForm";
			
		}

}

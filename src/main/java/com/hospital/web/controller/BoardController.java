package com.hospital.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/board")
public class BoardController {
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	@RequestMapping("/list")
	public String goList(){
		logger.info("BoardController() {}","진입");
		return "public:board/";
		
	}
	
	@RequestMapping("/find")
	public String find(
			@RequestParam(value="serch",required=false)String serch,
			@RequestParam(value="pageNO",defaultValue="1")String serc){
		logger.info("BoardController() {}","진입");
		return "public:board/boardList";
		
	}


}

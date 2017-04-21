package com.hospital.web.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.hospital.web.domain.Article;
import com.hospital.web.mapper.Mapper;
import com.hospital.web.service.IListService;


@RestController
public class BoardController {
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	@Autowired Mapper mapper;
	@Autowired Article article;
	@RequestMapping("/list/bbs/{pageNo}")
	public @ResponseBody Map<?,?> goList(
			@RequestBody Map<String,Object> paramMap,
			@PathVariable String pageNo) throws Exception{
		logger.info("BoardController() {}","진입");
		Map<String,Object> map =new HashMap<>();
		IListService service=(b)->mapper.articleList(b) ;
		@SuppressWarnings("unchecked")
		List<Article> list= (List<Article>) service.execute(paramMap);
		map.put("list",list);
		return map;
	}
	
	@RequestMapping("/find")
	public String find(
			@RequestParam(value="serch",required=false)String serch,
			@RequestParam(value="pageNO",defaultValue="1")String serc){
		logger.info("BoardController() {}","진입");
		return "public:board/boardList";	
		
	}


}

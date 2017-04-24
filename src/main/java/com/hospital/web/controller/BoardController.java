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
import com.hospital.web.domain.Chart;
import com.hospital.web.mapper.Mapper;
import com.hospital.web.service.BoardService;


@RestController	
public class BoardController {
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	@Autowired Mapper mapper;
	@Autowired Article article;
	@Autowired BoardService boardService;
	@RequestMapping("/list/bbs/{pageNo}")
	public @ResponseBody Map<?,?> goList(
			@PathVariable String pageNo) throws Exception{
		logger.info("BoardController() {}","진입");
		Map<String,Object> map =new HashMap<>();
		map.put("start", "1");
		map.put("end", "5");
		map.put("group","Article");
		System.out.println("★★★★★★"+mapper.count(map));
		List<Chart> list=boardService.boardList(map);
		Integer count=boardService.getTheNumberOfArticles(map);
		map.clear();
		map.put("list",list);
		map.put("count",list.size());
		map.put("prevBlock", 0);
		map.put("blockStart", "1");
		map.put("blockEnd", "5");
		map.put("pageNo", "1");
		map.put("nextBlock",2);
		map.put("pageCount",count/5);
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

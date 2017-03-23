package com.hospital.web.service;
import java.util.List;

import org.springframework.stereotype.Component;


import com.hospital.web.domain.ArticleDTO;
@Component
public interface AdminService {
	// CREATE
		public int addArticle(ArticleDTO param)throws Exception;
		// READ: SELECT
		public ArticleDTO findOne(ArticleDTO param)throws Exception;
		public List<ArticleDTO> findSome(String[] param)throws Exception;
		public List<ArticleDTO> list(int[] pageArr);
		// UPDATE
		public int update(ArticleDTO param)throws Exception;
		// DELETE
		public int delete(ArticleDTO param)throws Exception;
		public int count();

}

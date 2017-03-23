package com.hospital.web.daoImpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import org.springframework.stereotype.Repository;

import com.hospital.web.dao.BoardDAO;
import com.hospital.web.domain.ArticleDTO;
import com.hospital.web.serviceImpl.BoardServiceImpl;

@Repository
public class BoardDAOImpl implements BoardDAO{
	
	@Override
	public int insert(ArticleDTO param) throws Exception {
		return 	0;
	}

	@Override
	public ArticleDTO selectBySeq(ArticleDTO param) throws Exception {
		ArticleDTO article=new ArticleDTO();
		String sql=String.format("SELECT art_seq, id, title, contents, regdate, read_Count FROM Article WHERE art_seq=%d"/*,Integer.parseInt(param.getSeq()) */);
		return article;
		
	}

	@Override
	public List<ArticleDTO> selectByWord(String[] param) throws Exception {
		List<ArticleDTO> list=new ArrayList<ArticleDTO>();
		ArticleDTO article=null;  //bean 이 널인지 아닌지 체크해야 한다.
		String sql="SELECT art_seq, id, title, contents, regdate, read_Count FROM Article WHERE "+param[0]+" LIKE '%"+param[1]+"%'";
		
		Statement stmt = null;
		ResultSet rs=stmt.executeQuery(sql);
		
		while(rs.next()){
			article=new ArticleDTO();
			/*article.setId(rs.getString("id"));
			article.setTitle(rs.getString("title"));
			article.setContents(rs.getString("contents"));
			article.setRegdate(rs.getString("regdate"));
			article.setReadCount(rs.getString("read_Count"));
			article.setSeq(rs.getString("read_Count"));*/
			list.add(article);
		}
		
		return list;
	}

	@Override
	public List<ArticleDTO> selectAll(int[] pageArr)  {
		List<ArticleDTO> list=new ArrayList<ArticleDTO>();
		ArticleDTO article=null;  //bean 이 널인지 아닌지 체크해야 한다.
		String sql=String.format(
				"SELECT t2.* FROM (SELECT ROWNUM seq,t.* FROM (SELECT * FROM Article ORDER BY art_seq DESC)"
				+ " t) t2 WHERE t2.seq BETWEEN '%s' AND '%s'",String.valueOf(pageArr[0]),String.valueOf(pageArr[1]));
		Statement stmt;
		
		return list;
	}

	@Override
	public int update(ArticleDTO param) throws Exception {
		
		String sql=String.format("UPDATE Article SET title='%s' ,contents='%s' ,regdate='%s' WHERE art_seq=%d" ,"");
		Statement stmt = null;
		int rs=stmt.executeUpdate(sql);
		return rs;
	}

	@Override
	public int delete(ArticleDTO param) throws Exception {
		
		String sql=String.format("DELETE FROM Article WHERE art_seq=%d ","");
		Statement stmt = null;
		int rs=stmt.executeUpdate(sql);
		return rs;
	}
	@Override
	public int count()  {
		int count=0;
		Statement stmt = null;
		try {
			
			String sql="SELECT COUNT(*) AS COUNT FROM Article ";
			ResultSet rs=stmt.executeQuery(sql);
			if(rs.next()){
				count=Integer.parseInt(rs.getString("COUNT"));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	
		return count;
	}

}
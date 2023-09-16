package com.web.action;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.ArticleDAO;

public class ArticleListAction extends ExcuteAction{
	
	@Override
	public ActionFront excute(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		
		ArticleDAO adao = new ArticleDAO();
		int totalCnt = adao.getArticleCnt();
		
		// 현재 페이지 넘겨받기
		String temp = req.getParameter("page");
		int page = 0;
		page = temp == null ? 1 : Integer.parseInt(temp);
		
//		if( temp == null ) {
//			page = 1;
//		} else {
//			page = Integer.parseInt(temp);
//		}
		
		int pageSize = 10;
		int endRow = page * 10;		// 1페이지 : 10, 4페이지 : 40
		int startRow = endRow - 9;	// 1페이지 : 1, 4페이지 : 31
		
		// [1][2]...[10] : [1], [11],[12], ...,[20]:[11]
		int startPage = (page -1)/pageSize*pageSize+1;
		// [1][2]...[10] : [10], [11],[12], ...,[20]:[20]		
		int endPage = startPage + pageSize -1;
		int totalPage = (totalCnt -1)/pageSize + 1;
				
		endPage = endPage > totalPage ? totalPage : endPage;
		
		List<Map<String, Object>> bo = adao.getArticleList(startRow, endRow);
		for(Object ob : bo) {
			System.out.println(ob.toString());
		}
		
		req.setAttribute("totalPage", totalPage);
		req.setAttribute("nowPage", page);
		req.setAttribute("startPage", startPage);
		req.setAttribute("endPage", endPage);
		
		req.setAttribute("totalCnt", totalCnt);
		req.setAttribute("articleList", bo); 
		setRedirect(false);		
		setPath("../resource/page/article/article-list.jsp");
		return super.excute(req, resp);
		
	}

}

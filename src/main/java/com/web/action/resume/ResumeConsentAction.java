package com.web.action.resume;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.json.JSONParser;
import org.apache.tomcat.util.json.ParseException;

import com.dao.CompanyMypageDAO;
import com.web.action.ActionFront;
import com.web.action.ExcuteAction;

public class ResumeConsentAction extends ExcuteAction{
	@Override
	public ActionFront excute(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		// json 형식 읽기
		Map<String, Object> map = null;
		PrintWriter out = resp.getWriter();
		
		try {
			BufferedReader reqReader = req.getReader();
			StringBuffer sb = new StringBuffer();
			while(reqReader.ready()) sb.append(reqReader.readLine());
			
			JSONParser jParser = new JSONParser(sb.toString());
			map = jParser.parseObject();
		} catch (ParseException e) {
			e.printStackTrace();
			out.print(e.getMessage());
			return super.excute(req, resp);
		}
		
		// 파라미터 구성
		int sendId = Integer.parseInt( map.get("sendId").toString() );
		System.out.println("승락한 이력서의 ID : " + sendId);
		
		// 응답 메시지
		CompanyMypageDAO mdao = new CompanyMypageDAO();
		String result = mdao.consentResume(sendId) ? "success" : "fail";
		
		out.print(result);
		return super.excute(req, resp);
	}
}

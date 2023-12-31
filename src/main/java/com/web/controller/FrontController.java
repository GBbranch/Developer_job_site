package com.web.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.web.action.*;
import com.web.action.article.*;
import com.web.action.mypage.*;
import com.web.action.resume.*;
import com.web.action.user.*;

@WebServlet(urlPatterns = {
		"/", "/member/idCheck", "/company/idCheck",
		"/member", "/member/submit",
		"/company", "/company/receive",
		"/article/*", "/article/write", "/article/list",
		"/resume/*", "/resume/write", "/resume/consent", "/resume/popup"})
public class FrontController extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	// String ServletPath, ActionFront
	Map<String, Action> getActionMap = new HashMap<String, Action>();
	Map<String, Action> postActionMap = new HashMap<String, Action>();
	Map<String, Action> putActionMap = new HashMap<String, Action>();
	
	@Override
	public void init() throws ServletException {
		super.init();
		// 요청 방식 GET
		getActionMap.put("/", new MainAction());
		
		getActionMap.put("/login", new ExcuteAction("./resource/page/login/login.jsp"));
		getActionMap.put("/signup", new ExcuteAction("./resource/page/login/signup.jsp"));
		getActionMap.put("/logout", new MemberLogoutAction());
		
		getActionMap.put("/member/idCheck", new MemberIdCheckAction(true));
		getActionMap.put("/company/idCheck", new MemberIdCheckAction(false));
		
		getActionMap.put("/resume", new ResumeViewAction());
		getActionMap.put("/resume/write", new ExcuteAction("../resource/page/resume/write.jsp"));
		getActionMap.put("/resume/popup", new ResumePopupAction());
		
		getActionMap.put("/company/login", new ExcuteAction("../resource/page/login/login.jsp"));
		getActionMap.put("/company/signup", new ExcuteAction("../resource/page/login/signup.jsp"));
		
		getActionMap.put("/article", new ArticleAction());
		getActionMap.put("/article/write", new ExcuteAction("../resource/page/article/article-write.jsp"));
		getActionMap.put("/article/list", new ArticleListAction());
		
		getActionMap.put("/member", new MemberMyPageAction());
		getActionMap.put("/member/submit", new SubmitResumeListAction());
		
		getActionMap.put("/company", new CompanyMyPageAction());
		getActionMap.put("/company/receive", new ReceiveResumeListAction());
		
		// 요청 방식 POST
		postActionMap.put("/member/login", new MemberLoginAction(true));
		postActionMap.put("/member/signup", new MemberSingupAction(true));
		
		postActionMap.put("/resume", new ResumeWriteAction());
		postActionMap.put("/resume/popup", new ResumeSendAction());
		
		postActionMap.put("/company/login", new MemberLoginAction(false));
		postActionMap.put("/company/signup", new MemberSingupAction(false));
		
		postActionMap.put("/article", new ArticleInsertAction());
		
		// 요청 방식 PUT
		putActionMap.put("/resume/consent", new ResumeConsentAction());
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String reqURI = req.getRequestURI();
		String contextPath = req.getContextPath();
		String servletPath = req.getServletPath();
		String pathInfo = req.getPathInfo();
		String query = req.getQueryString();
		System.out.println("URI : " + reqURI);
		System.out.println("Context : " + contextPath);
		System.out.println("Servlet : " + servletPath);
		System.out.println("Info : " + pathInfo);
		System.out.println("Query : " + query);
		super.service(req, resp);
		
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println("doGET");
		doProcess(req, resp, getActionMap);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println("doPOST");
		doProcess(req, resp, postActionMap);
	}
	
	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doPUT");
		doProcess(req, resp, putActionMap);
	}
	
	private void doProcess(HttpServletRequest req, HttpServletResponse resp, Map<String, Action> actionMap)
			throws ServletException, IOException{
		ActionFront front = null;
		String servletPath = req.getServletPath();
		
		front = (ActionFront) actionMap.get(servletPath).excute(req, resp);
		if(front == null) return;
		
		String path = front.getPath();
		if(path == null) return;
		
		if(front.isRedirect()) {
			resp.sendRedirect(path);
		} else {
			req.getRequestDispatcher(path).forward(req, resp);
		}
	}
}

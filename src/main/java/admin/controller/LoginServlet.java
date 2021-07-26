package admin.controller;

import java.io.IOException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import admin.model.service.AdminService;
import admin.model.vo.Admin;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login.ad")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//get방식
		//클라이언트의 요청을 받는 메소드
		//인코딩 처리
		request.setCharacterEncoding("utf-8");
		String adminId = request.getParameter("adminId");
		String adminPwd = request.getParameter("adminPwd");
		
		//SHA-512알고리즘 적용 (단방향)
		String cryptoAdminPwd = null;
		
		try {
			//알고리즘 사용
			MessageDigest md = MessageDigest.getInstance("SHA-512");
			//패스워드 문자열 암호문으로 변환 -> byte형
			byte[] pwdValues = adminPwd.getBytes(Charset.forName("UTF-8"));
			//암호문으로 변경
			md.update(pwdValues);
			cryptoAdminPwd = Base64.getEncoder().encodeToString(pwdValues);
			//확인
			System.out.println(cryptoAdminPwd);
			System.out.println(cryptoAdminPwd.length());
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		//비암호화
		Admin admin = new AdminService().selectLogin(adminId, adminPwd);
		//암호화
		//Admin admin = new AdminService.selectLogin(adminId, adminPwd);
		if(admin != null) {
			//로그인 확인용 세션 객체 생성
			HttpSession session = request.getSession();
			session.setMaxInactiveInterval(30*60);//30분
			//세션 아이디 확인용
			System.out.println("생성 세션 id 객체 : " + session.getId());
			//세션 값 보내기
			session.setAttribute("loginAdmin", admin);
			
			response.sendRedirect("index.jsp");
		}else {
			RequestDispatcher view = request.getRequestDispatcher("views/common/error.jsp");
			
			view.forward(request, response);
		
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

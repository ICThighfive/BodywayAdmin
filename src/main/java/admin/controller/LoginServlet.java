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
		//get���
		//Ŭ���̾�Ʈ�� ��û�� �޴� �޼ҵ�
		//���ڵ� ó��
		request.setCharacterEncoding("utf-8");
		String adminId = request.getParameter("adminId");
		String adminPwd = request.getParameter("adminPwd");
		
		//SHA-512�˰��� ���� (�ܹ���)
		String cryptoAdminPwd = null;
		
		try {
			//�˰��� ���
			MessageDigest md = MessageDigest.getInstance("SHA-512");
			//�н����� ���ڿ� ��ȣ������ ��ȯ -> byte��
			byte[] pwdValues = adminPwd.getBytes(Charset.forName("UTF-8"));
			//��ȣ������ ����
			md.update(pwdValues);
			cryptoAdminPwd = Base64.getEncoder().encodeToString(pwdValues);
			//Ȯ��
			System.out.println(cryptoAdminPwd);
			System.out.println(cryptoAdminPwd.length());
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		//���ȣȭ
		Admin admin = new AdminService().selectLogin(adminId, adminPwd);
		//��ȣȭ
		//Admin admin = new AdminService.selectLogin(adminId, adminPwd);
		if(admin != null) {
			//�α��� Ȯ�ο� ���� ��ü ����
			HttpSession session = request.getSession();
			session.setMaxInactiveInterval(30*60);//30��
			//���� ���̵� Ȯ�ο�
			System.out.println("���� ���� id ��ü : " + session.getId());
			//���� �� ������
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

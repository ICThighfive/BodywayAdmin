package community.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import community.model.service.CommunityService;
import community.model.vo.Community;

/**
 * Servlet implementation class CommunityListServlet
 */
@WebServlet("/community.ad")//mapping URI community.ad
public class CommunityListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CommunityListServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Ŀ�´�Ƽ ����Ʈ �� �޾ƿ� ��ü ����
		ArrayList<Community> list = new CommunityService().selectListN();
		
		RequestDispatcher view = null;
		//list�� ũ�Ⱑ 0���� Ŭ��
		if(list.size() > 0) {
			view = request.getRequestDispatcher("views/community/communityListView.jsp");
			request.setAttribute("list",list);//����Ʈ �� request
			view.forward(request, response);
		}else {//����Ʈ ���� ������ ���� ���� ������������
			view = request.getRequestDispatcher("views/common/error.jsp");
			request.setAttribute("message", "servlet ���� �߻�!");
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

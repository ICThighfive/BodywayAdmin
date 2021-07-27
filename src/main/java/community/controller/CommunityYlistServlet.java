package community.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import community.model.service.CommunityService;
import community.model.vo.Community;

/**
 * Servlet implementation class CommunityNlistServlet
 */
@WebServlet(name = "CommunityYlistServlet", urlPatterns = { "/cylist.ad" })
public class CommunityYlistServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CommunityYlistServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//������ ���ε� ��� ��ȸ ó���� ��Ʈ�ѷ�
		
		//Ŀ�´�Ƽ ����Ʈ ����
		ArrayList<Community> list = new CommunityService().selectListY();
		
		//list�� �Ű� ����� JSON �迭 ����
		JSONArray jarr = new JSONArray();
		
		//list���� community ��ü �ϳ��� ������ json �迭�� json��ü�� �� �Ű� ���
		for (Community community : list) {
			//community ����� json ��ü ����
			JSONObject job = new JSONObject();
			
			job.put("community_index", community.getCommunityIndex());
			job.put("community_name", URLEncoder.encode(community.getCommunityName(),"utf-8"));
			job.put("user_id", community.getUserId());
			job.put("approval_yn", community.getApprovalYn());//���ο���
			job.put("application_date", community.getApplicationDate());//��û��
			
			jarr.add(job);
		}
		
		// ���ۿ� json ��ü ����
		JSONObject sendJson = new JSONObject();
		sendJson.put("list", jarr);
		
		//��û�ڿ��� ������
		response.setContentType("application/json; charset=utf-8");
		PrintWriter out = response.getWriter();
		out.write(sendJson.toJSONString());
		out.flush();
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

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
		//모임이 승인된 목록 조회 처리용 컨트롤러
		
		//커뮤니티 리스트 생성
		ArrayList<Community> list = new CommunityService().selectListY();
		
		//list를 옮겨 기록할 JSON 배열 생성
		JSONArray jarr = new JSONArray();
		
		//list에서 community 객체 하나씩 꺼내서 json 배열에 json객체로 값 옮겨 기록
		for (Community community : list) {
			//community 저장용 json 객체 생성
			JSONObject job = new JSONObject();
			
			job.put("community_index", community.getCommunityIndex());
			job.put("community_name", URLEncoder.encode(community.getCommunityName(),"utf-8"));
			job.put("user_id", community.getUserId());
			job.put("approval_yn", community.getApprovalYn());//승인여부
			job.put("application_date", community.getApplicationDate());//신청일
			
			jarr.add(job);
		}
		
		// 전송용 json 객체 생성
		JSONObject sendJson = new JSONObject();
		sendJson.put("list", jarr);
		
		//요청자에게 보내기
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

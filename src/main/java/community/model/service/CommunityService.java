package community.model.service;

import static common.JDBCTemp.*;

import java.sql.Connection;
import java.util.ArrayList;

import community.model.dao.CommunityDao;
import community.model.vo.Community;

public class CommunityService {
	private CommunityDao cdao = new CommunityDao();

	//1. 커뮤니티 미승인 목록 불러오는 Dao
	public ArrayList<Community> selectListN() {
		Connection conn = getConnection();// 커넥션 생성
		ArrayList<Community> list = cdao.selectListN(conn);// 커넥션 전달
		close(conn);

		return list;
	}
	
	//2. 커뮤니티 승인 목록 불러오는 Dao
		public ArrayList<Community> selectListY() {
			Connection conn = getConnection();// 커넥션 생성
			ArrayList<Community> list = cdao.selectListY(conn);// 커넥션 전달
			close(conn);

			return list;
		}

}

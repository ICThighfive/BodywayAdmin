package community.model.service;

import static common.JDBCTemp.*;

import java.sql.Connection;
import java.util.ArrayList;

import community.model.dao.CommunityDao;
import community.model.vo.Community;

public class CommunityService {
	private CommunityDao cdao = new CommunityDao();

	//1. Ŀ�´�Ƽ �̽��� ��� �ҷ����� Dao
	public ArrayList<Community> selectListN() {
		Connection conn = getConnection();// Ŀ�ؼ� ����
		ArrayList<Community> list = cdao.selectListN(conn);// Ŀ�ؼ� ����
		close(conn);

		return list;
	}
	
	//2. Ŀ�´�Ƽ ���� ��� �ҷ����� Dao
		public ArrayList<Community> selectListY() {
			Connection conn = getConnection();// Ŀ�ؼ� ����
			ArrayList<Community> list = cdao.selectListY(conn);// Ŀ�ؼ� ����
			close(conn);

			return list;
		}

}

package admin.model.service;

import static common.JDBCTemp.*;

import java.sql.Connection;

import admin.model.dao.AdminDao;
import admin.model.vo.Admin;

public class AdminService {
	//AdminDao�� ����
	private AdminDao adao = new AdminDao();
	
	//admin �α����ϴ� ���
	public Admin selectLogin(String adminId, String adminPwd) {
		Connection conn = getConnection();
		Admin admin = adao.selectLogin(conn, adminId, adminPwd);
		close(conn);
		return admin;
	}

}

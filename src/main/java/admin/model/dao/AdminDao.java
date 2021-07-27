package admin.model.dao;

import static common.JDBCTemp.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import admin.model.vo.Admin;


public class AdminDao {
	
	//관리자 로그인 부분
	public Admin selectLogin(Connection conn, String adminId, String adminPwd) {
		Admin admin = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String query = "select * from tb_admin_info"
				+ " where admin_id = ? and admin_pwd = ?";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, adminId);
			pstmt.setString(2, adminPwd);
			
			rset = pstmt.executeQuery();
			if(rset.next()) {
				admin = new Admin();
				
				admin.setAdminId(adminId);
				admin.setAdminName(rset.getString("admin_name"));
				admin.setAdminPwd(adminPwd);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
		
		
	
		return admin;
	}
}

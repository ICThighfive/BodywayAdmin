package community.model.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import static common.JDBCTemp.*;

import community.model.vo.Community;

public class CommunityDao {
	
	//�⺻ �Խ��� ��û ����� ���� Dao(���θ�� N �� ��ü ��� ����)
	public ArrayList<Community> selectListN(Connection conn){
		ArrayList<Community> list = new ArrayList<Community>(); //Ŀ�´�Ƽ ������ �޾� �� ����Ʈ
		Statement stmt = null;
		ResultSet rset = null;
		//������ ���� ���� ����� approval_yn='N' �� ���̰� , N ���� ������ �ִ� ��ϸ� ������ش�.
		String query = "select * from tb_community where approval_yn = 'N' order by community_index";
		
		try {
			stmt = conn.createStatement();//Ŀ�ؼ� �����
			rset = stmt.executeQuery(query);//query�� ����
			
			while(rset.next()) {
				Community community = new Community();//Ŀ�´�Ƽ ��ü ����(���� �޾ƿ;���)
				//DB�� �÷���� �����ϰ� �ۼ��� ���־���� �� ������ ������ ���� �ʴ´�.
				community.setCommunityIndex(rset.getInt("community_index"));//���� �ε���
				community.setCommunityId(rset.getString("community_id")); // ���� ���̵�
				community.setApplicationDate(rset.getDate("application_date"));
				community.setUserId(rset.getString("user_id")); // ������ ���̵�
				community.setCommunityName(rset.getString("community_name")); //Ŀ�´�Ƽ �̸�
				community.setCommunityIntro(rset.getString("community_intro")); //Ŀ�´�Ƽ �Ұ���
				community.setCapacityMin(rset.getInt("capacity_min"));//Ŀ�´�Ƽ �ּ� �ο�
				community.setCapacityMax(rset.getInt("capacity_max"));//���� �ִ� �ο�
				community.setInterests(rset.getString("interests"));//���ɻ�
				community.setcOriginalImage(rset.getString("c_original_image"));//���� ��� �̹�����
				community.setcRenameImage(rset.getString("c_rename_image"));//������ �̹��� ��
				community.setApprovalYn(rset.getString("approval_yn"));//���ο��� : Y/N
				community.setAdminId(rset.getString("admin_id"));//������ ������ ���̵� ��(���ι�ư ������ ��� ���� �ɵ�)
				
				list.add(community);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(rset);
			close(stmt);
		}
		
		return list;
		
	}
	
	//������ ���ε� �͵鸸 ��� �ҷ�����
	public ArrayList<Community> selectListY(Connection conn){
		ArrayList<Community> list = new ArrayList<Community>(); //Ŀ�´�Ƽ ������ �޾� �� ����Ʈ
		Statement stmt = null;
		ResultSet rset = null;
		//������ ���� ���� ����� approval_yn='N' �� ���̰� , N ���� ������ �ִ� ��ϸ� ������ش�.
		String query = "select * from tb_community where approval_yn = 'Y' order by community_index";
		
		try {
			stmt = conn.createStatement();//Ŀ�ؼ� �����
			rset = stmt.executeQuery(query);//query�� ����
			
			while(rset.next()) {
				Community community = new Community();//Ŀ�´�Ƽ ��ü ����(���� �޾ƿ;���)
				//DB�� �÷���� �����ϰ� �ۼ��� ���־���� �� ������ ������ ���� �ʴ´�.
				community.setCommunityIndex(rset.getInt("community_index"));//���� �ε���
				community.setCommunityId(rset.getString("community_id")); // ���� ���̵�
				community.setApplicationDate(rset.getDate("application_date"));
				community.setUserId(rset.getString("user_id")); // ������ ���̵�
				community.setCommunityName(rset.getString("community_name")); //Ŀ�´�Ƽ �̸�
				community.setCommunityIntro(rset.getString("community_intro")); //Ŀ�´�Ƽ �Ұ���
				community.setCapacityMin(rset.getInt("capacity_min"));//Ŀ�´�Ƽ �ּ� �ο�
				community.setCapacityMax(rset.getInt("capacity_max"));//���� �ִ� �ο�
				community.setInterests(rset.getString("interests"));//���ɻ�
				community.setcOriginalImage(rset.getString("c_original_image"));//���� ��� �̹�����
				community.setcRenameImage(rset.getString("c_rename_image"));//������ �̹��� ��
				community.setApprovalYn(rset.getString("approval_yn"));//���ο��� : Y/N
				community.setAdminId(rset.getString("admin_id"));//������ ������ ���̵� ��(���ι�ư ������ ��� ���� �ɵ�)
				
				list.add(community);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(rset);
			close(stmt);
		}
		
		return list;
	}
	
	//���� ���� ��ư�� ������ �� ��Ÿ���� ��
	public ArrayList<Community> updateApproval(Connection conn){
		ArrayList<Community> list = new ArrayList<Community>(); //Ŀ�´�Ƽ ������ �޾� �� ����Ʈ
		Statement stmt = null;
		ResultSet rset = null;
		//������ ���� ���� ����� approval_yn='N' �� ���̰� , N ���� ������ �ִ� ��ϸ� ������ش�.
		String query = "select * from tb_community where approval_yn = 'Y' order by community_index";
		
		try {
			stmt = conn.createStatement();//Ŀ�ؼ� �����
			rset = stmt.executeQuery(query);//query�� ����
			
			while(rset.next()) {
				Community community = new Community();//Ŀ�´�Ƽ ��ü ����(���� �޾ƿ;���)
				//DB�� �÷���� �����ϰ� �ۼ��� ���־���� �� ������ ������ ���� �ʴ´�.
				community.setCommunityIndex(rset.getInt("community_index"));//���� �ε���
				community.setCommunityId(rset.getString("community_id")); // ���� ���̵�
				community.setApplicationDate(rset.getDate("application_date"));
				community.setUserId(rset.getString("user_id")); // ������ ���̵�
				community.setCommunityName(rset.getString("community_name")); //Ŀ�´�Ƽ �̸�
				community.setCommunityIntro(rset.getString("community_intro")); //Ŀ�´�Ƽ �Ұ���
				community.setCapacityMin(rset.getInt("capacity_min"));//Ŀ�´�Ƽ �ּ� �ο�
				community.setCapacityMax(rset.getInt("capacity_max"));//���� �ִ� �ο�
				community.setInterests(rset.getString("interests"));//���ɻ�
				community.setcOriginalImage(rset.getString("c_original_image"));//���� ��� �̹�����
				community.setcRenameImage(rset.getString("c_rename_image"));//������ �̹��� ��
				community.setApprovalYn(rset.getString("approval_yn"));//���ο��� : Y/N
				community.setAdminId(rset.getString("admin_id"));//������ ������ ���̵� ��(���ι�ư ������ ��� ���� �ɵ�)
				
				list.add(community);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(rset);
			close(stmt);
		}
		
		return list;
	}
	
}

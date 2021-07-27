package community.model.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import static common.JDBCTemp.*;

import community.model.vo.Community;

public class CommunityDao {
	
	//기본 게시판 신청 목록을 위한 Dao(승인목록 N 인 전체 목록 보기)
	public ArrayList<Community> selectListN(Connection conn){
		ArrayList<Community> list = new ArrayList<Community>(); //커뮤니티 정보를 받아 올 리스트
		Statement stmt = null;
		ResultSet rset = null;
		//승인이 되지 않은 목록은 approval_yn='N' 일 것이고 , N 값을 가지고 있는 목록만 출력해준다.
		String query = "select * from tb_community where approval_yn = 'N' order by community_index";
		
		try {
			stmt = conn.createStatement();//커넥션 만들기
			rset = stmt.executeQuery(query);//query값 적용
			
			while(rset.next()) {
				Community community = new Community();//커뮤니티 객체 생성(값을 받아와야함)
				//DB내 컬럼명과 동일하게 작성을 해주어야지 열 부적합 오류가 나지 않는다.
				community.setCommunityIndex(rset.getInt("community_index"));//모임 인덱스
				community.setCommunityId(rset.getString("community_id")); // 모임 아이디
				community.setApplicationDate(rset.getDate("application_date"));
				community.setUserId(rset.getString("user_id")); // 모임장 아이디
				community.setCommunityName(rset.getString("community_name")); //커뮤니티 이름
				community.setCommunityIntro(rset.getString("community_intro")); //커뮤니티 소개글
				community.setCapacityMin(rset.getInt("capacity_min"));//커뮤니티 최소 인원
				community.setCapacityMax(rset.getInt("capacity_max"));//모임 최대 인원
				community.setInterests(rset.getString("interests"));//관심사
				community.setcOriginalImage(rset.getString("c_original_image"));//최초 등록 이미지명
				community.setcRenameImage(rset.getString("c_rename_image"));//수정된 이미지 명
				community.setApprovalYn(rset.getString("approval_yn"));//승인여부 : Y/N
				community.setAdminId(rset.getString("admin_id"));//승인한 관리자 아이디 값(승인버튼 눌렀을 경우 들어가게 될듯)
				
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
	
	//모임이 승인된 것들만 목록 불러오기
	public ArrayList<Community> selectListY(Connection conn){
		ArrayList<Community> list = new ArrayList<Community>(); //커뮤니티 정보를 받아 올 리스트
		Statement stmt = null;
		ResultSet rset = null;
		//승인이 되지 않은 목록은 approval_yn='N' 일 것이고 , N 값을 가지고 있는 목록만 출력해준다.
		String query = "select * from tb_community where approval_yn = 'Y' order by community_index";
		
		try {
			stmt = conn.createStatement();//커넥션 만들기
			rset = stmt.executeQuery(query);//query값 적용
			
			while(rset.next()) {
				Community community = new Community();//커뮤니티 객체 생성(값을 받아와야함)
				//DB내 컬럼명과 동일하게 작성을 해주어야지 열 부적합 오류가 나지 않는다.
				community.setCommunityIndex(rset.getInt("community_index"));//모임 인덱스
				community.setCommunityId(rset.getString("community_id")); // 모임 아이디
				community.setApplicationDate(rset.getDate("application_date"));
				community.setUserId(rset.getString("user_id")); // 모임장 아이디
				community.setCommunityName(rset.getString("community_name")); //커뮤니티 이름
				community.setCommunityIntro(rset.getString("community_intro")); //커뮤니티 소개글
				community.setCapacityMin(rset.getInt("capacity_min"));//커뮤니티 최소 인원
				community.setCapacityMax(rset.getInt("capacity_max"));//모임 최대 인원
				community.setInterests(rset.getString("interests"));//관심사
				community.setcOriginalImage(rset.getString("c_original_image"));//최초 등록 이미지명
				community.setcRenameImage(rset.getString("c_rename_image"));//수정된 이미지 명
				community.setApprovalYn(rset.getString("approval_yn"));//승인여부 : Y/N
				community.setAdminId(rset.getString("admin_id"));//승인한 관리자 아이디 값(승인버튼 눌렀을 경우 들어가게 될듯)
				
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
	
	//모임 승인 버튼을 눌렀을 때 나타나는 것
	public ArrayList<Community> updateApproval(Connection conn){
		ArrayList<Community> list = new ArrayList<Community>(); //커뮤니티 정보를 받아 올 리스트
		Statement stmt = null;
		ResultSet rset = null;
		//승인이 되지 않은 목록은 approval_yn='N' 일 것이고 , N 값을 가지고 있는 목록만 출력해준다.
		String query = "select * from tb_community where approval_yn = 'Y' order by community_index";
		
		try {
			stmt = conn.createStatement();//커넥션 만들기
			rset = stmt.executeQuery(query);//query값 적용
			
			while(rset.next()) {
				Community community = new Community();//커뮤니티 객체 생성(값을 받아와야함)
				//DB내 컬럼명과 동일하게 작성을 해주어야지 열 부적합 오류가 나지 않는다.
				community.setCommunityIndex(rset.getInt("community_index"));//모임 인덱스
				community.setCommunityId(rset.getString("community_id")); // 모임 아이디
				community.setApplicationDate(rset.getDate("application_date"));
				community.setUserId(rset.getString("user_id")); // 모임장 아이디
				community.setCommunityName(rset.getString("community_name")); //커뮤니티 이름
				community.setCommunityIntro(rset.getString("community_intro")); //커뮤니티 소개글
				community.setCapacityMin(rset.getInt("capacity_min"));//커뮤니티 최소 인원
				community.setCapacityMax(rset.getInt("capacity_max"));//모임 최대 인원
				community.setInterests(rset.getString("interests"));//관심사
				community.setcOriginalImage(rset.getString("c_original_image"));//최초 등록 이미지명
				community.setcRenameImage(rset.getString("c_rename_image"));//수정된 이미지 명
				community.setApprovalYn(rset.getString("approval_yn"));//승인여부 : Y/N
				community.setAdminId(rset.getString("admin_id"));//승인한 관리자 아이디 값(승인버튼 눌렀을 경우 들어가게 될듯)
				
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

package ch13review.web.userinfo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import ch13review.domain.userinfo.UserInfo;
import ch13review.domain.userinfo.dao.UserInfoDao;
import ch13review.domain.userinfo.dao.mysql.UserInfoMySqlDao;
import ch13review.domain.userinfo.dao.oracle.UserInfoOracleDao;

public class UserInfoClient {
	public static void main(String[] args) throws IOException{
		
		// db 불러오기
		FileInputStream fis = new FileInputStream("db.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String dbType = prop.getProperty("DBTYPE");
		
		UserInfo userInfo = new UserInfo();
		userInfo.setUserName("김가영");
		userInfo.setUserId("offbeat1020");
		userInfo.setUserPassword("1234");
		
		// db에 기록된 대로 출력을 하는 부분
		UserInfoDao userInfoDao = null;
		if (dbType.equals("ORACLE")) {
			userInfoDao = new UserInfoOracleDao();
		} else if(dbType.equals("MYSQL")) {
			userInfoDao = new UserInfoMySqlDao();
		} else {
			System.out.println("db error occured");
			return;
		}
		
		userInfoDao.insertUserInfo(userInfo);
		userInfoDao.updateUserInfo(userInfo);
		userInfoDao.deleteUserInfo(userInfo);
	}
}

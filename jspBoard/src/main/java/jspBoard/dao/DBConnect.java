package jspBoard.dao;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class DBConnect {
   public Connection conn = null;	
   private InitialContext initContext;
  
   //Ŀ�ؼ� �ϴ� �޼ҵ�
   public Connection getConnection() throws SQLException, NamingException{
	  if(conn == null || conn.isClosed()) {
  	    initContext = new InitialContext(); //JNDI ���ؽ�Ʈ �ʱ�ȭ
		DataSource ds = (DataSource) initContext.lookup("java:/comp/env/jdbc/javaboard");
		//JNDI���� �̸��� ã�ƿ�. "java:/comp/env/" �̸�ã�� �� ���Ǵ� ���ξ�
		conn = ds.getConnection();
		System.out.println("db���� ����");
	  }
	  return conn;
  }
   
  //Ŀ�ؼ� �ݴ� �޼ҵ� 
  public void closeConnection() {
	  try {
		  if(conn != null && !conn.isClosed()) {
			  conn.close();
			  System.out.println("db�� �ݾҽ��ϴ�.");
		  }
	  }catch(SQLException e) {
		  e.printStackTrace();
	  }finally {
		  conn = null;
	  }
  }
   
}

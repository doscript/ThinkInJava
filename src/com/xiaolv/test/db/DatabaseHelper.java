package com.xiaolv.test.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 * database helper class
 * 目前使用DbConnectionManager来获取，暂时不使用这个自己写的；
 * @author Charlie
 *
 */
public class DatabaseHelper {
	
	private static Logger logger = LoggerFactory.getLogger("DatabaseHelper");
	
	static final String USERDB_URL="jdbc:mysql://101.201.103.236:3306/zlyy?characterEncoding=GBK"; 
	static final String USERDB_ACCOUNT="rayoo"; 
	static final String USERDB_PASSWD="zlyy1qaz!QAZ"; 
	
	 //get database connection
	 public static Connection getConnection() throws Exception {

		    final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	        final String DB_URL = USERDB_URL;
	        //  Database credentials
	        final String USER = USERDB_ACCOUNT;
	        final String PASS = USERDB_PASSWD;
	
	        Class.forName(JDBC_DRIVER).newInstance();
	        Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
	
	        return conn;
	    }
	 
	 //close the connection
	 public static void closeConnection(Connection conn) {

	        try {
	            conn.close();

	        } catch (SQLException e) {
	        	logger.error("error in closeConnection:" + e.getMessage());
	        	e.printStackTrace();
	        }

	    }

}

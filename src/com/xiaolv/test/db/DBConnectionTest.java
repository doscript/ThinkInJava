package com.xiaolv.test.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.sun.org.apache.bcel.internal.generic.ARRAYLENGTH;

/**
 * 
 * @author Charlie
 *
 */
public class DBConnectionTest {
	
	
	private static Connection  dbConn = null;
	
	
	public DBConnectionTest(){};
	
	//法宝号为空时，写入一个值；基础值需要确认和修改；
	private static final String SELECT = "select ppath，guid,last_update,type,size,op,editor,parent,status,srv_fname,etag,oma_attr,oma_modified,pre"
			+ " from eben_history where userid='15944710588' and ppath like \"/理财收支%\" limit 10";
	//private static final String INSERT = "INSERT INTO zl_sale_back_charlie VALUES (?, '033333', ?, '000000', null, null, null, null, null, '0.00', null, null);";
	
	public static void main(String ...args){
		
		
		
		try {
			dbConn = DatabaseHelper.getConnection();
			ResultSet ret;
			PreparedStatement ps = dbConn.prepareStatement(SELECT);
		    ret = ps.executeQuery();
		    while (ret.next()) {
		    	//int n = ret.getInt(1);
		    	String ppath= ret.getString("ppath");
		    	System.out.println("ppath=" + ppath);
		    	System.out.println("ret=" + ret);
			}
		    
//		    PreparedStatement ps2  = dbConn.prepareStatement(INSERT);
//		    ps2.setInt(1, 2006);
//		    ps2.setString(2, "北京市民");
//		    int retInsert = ps2.executeUpdate();
//		    System.out.println("insert result=" + retInsert);
		    
			    
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			DatabaseHelper.closeConnection(dbConn);
		}
		
		
		
	}

}


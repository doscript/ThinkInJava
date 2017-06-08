package com.xiaolv.test.socket;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServerSocket {
	
	
	
	static ServerSocket ss = null;
	
	
	
	
	
	
	
	
	public static void main(String ...args){
		
		try {
			ss = new ServerSocket(9999);
			int curConnection = 0;
			while (curConnection<10) {
				curConnection++;
				System.out.println("curConnection=" + curConnection);
				Socket socket = ss.accept();
				InputStreamReader inputStreamReader = new InputStreamReader(socket.getInputStream());
				while (inputStreamReader.ready()) {
					System.out.println("get:" + inputStreamReader.read());
					
				}
				
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}

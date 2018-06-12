package com.xiaolv.test.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileReadWhileOtherThreadWriting {

	private static final String fileName = "filetest.txt";

	static Thread writingFileThread = new Thread(new Runnable() {

		@Override
		public void run() {
			try {
				File file = new File(fileName);
				if (!file.exists()) {
					file.createNewFile();
				}
				boolean isAppend = true;
				FileOutputStream fos = new FileOutputStream(file,isAppend);
				int n = 0;
				while(n<100){
					n++;
					fos.write(new Byte(String.valueOf(n)));
					fos.flush();
					System.out.println("write..." + n);
					Thread.sleep(1000);
				}
					

			} catch (IOException e) {
				e.printStackTrace();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	});
	
	static Thread readingFileThread = new Thread(new Runnable() {

		@Override
		public void run() {
			try {
				File file = new File(fileName);
				System.out.println("file=" + file.getAbsolutePath() + " canRead=" + file.canRead());
				if (!file.exists()) {
					file.createNewFile();
				}
				FileInputStream fos = new FileInputStream(file);
				StringBuilder sb = new StringBuilder("getFromFile=");
				int get = 0;
				while(get!=-1) {
					get= fos.read();
					System.out.println("get=" + get);
					sb.append(get);
				}
				System.out.println(sb.toString());

			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	});

	public static void main(String... args) {
		
		writingFileThread.start();
		
		readingFileThread.start();
		

	}

}

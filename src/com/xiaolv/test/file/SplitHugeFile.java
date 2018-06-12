package com.xiaolv.test.file;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class SplitHugeFile {
	
    public static void splitFile(File f,int pieceSize) throws IOException {
        int partCounter = 1;//I like to name parts from 001, 002, 003, ...
                            //you can change it to 0 if you want 000, 001, ...

        int sizeOfFiles = pieceSize;
        byte[] buffer = new byte[sizeOfFiles];

        //java 1.7
//        try (BufferedInputStream bis = new BufferedInputStream( new FileInputStream(f))) {//try-with-resources to ensure closing stream
//        	;
//            String name = f.getName();
//
//            int tmp = 0;
//            while ((tmp = bis.read(buffer)) > 0) {
//                //write each chunk of data into separate file with different number in name
//                File newFile = new File(f.getParent(), name + "."
//                        + String.format("%03d", partCounter++));
//                try (FileOutputStream out = new FileOutputStream(newFile)){
//                	;
//                    out.write(buffer, 0, tmp);//tmp is chunk size
//                }
//                
//            }
//        }
    }

    public static void main(String[] args) throws IOException {
//    	if (args.length < 1) {
//			System.err.println("请输入文件路径");
//			return;
//		}
    	int pieceSize =  10*1024 * 1024;// 10MB
        splitFile(new File("D:/IM/svn/doc/项目管理/进度和日报/五月份/170508/tomcat-access.log/access.log"), pieceSize);
    }
}

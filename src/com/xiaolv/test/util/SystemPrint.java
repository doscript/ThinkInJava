package com.xiaolv.test.util;

import java.io.UnsupportedEncodingException;

public class SystemPrint {
	
	
    /**
     * 将指定byte数组以16进制的形式打印到控制台
     * 
     * @param hint
     *            String
     * @param b
     *            byte[]
     * @return void
     * @throws UnsupportedEncodingException 
     */
    public static void printHexString( String hint, String toHex) throws UnsupportedEncodingException
    {
        System.out.print(hint);
        System.out.print("\\x");
        byte [] b = toHex.getBytes();
        for (int i = 0; i < b.length; i++)
        {
            String hex = Integer.toHexString(b[i] & 0xFF);
            if (hex.length() == 1)
            {
                hex = '0' + hex;
            }
            System.out.print(hex.toUpperCase());
        }
        System.out.println("");
    }

}

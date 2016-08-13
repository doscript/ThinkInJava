package com.xiaolv.test;




import java.lang.reflect.Field;

import sun.misc.Unsafe;

public class StringAddress
{
    private static Unsafe unsafe;

    static
    {
        try
        {
            Field field = Unsafe.class.getDeclaredField("theUnsafe");
            field.setAccessible(true);
            unsafe = (Unsafe)field.get(null);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public static long addressOf(Object o) throws Exception
    {
        Object[] array = new Object[] {o};

        long baseOffset = unsafe.arrayBaseOffset(Object[].class);
        int addressSize = unsafe.addressSize();
        long objectAddress;
        switch (addressSize)
        {
            case 4:
                objectAddress = unsafe.getInt(array, baseOffset);
                break;
            case 8:
                objectAddress = unsafe.getLong(array, baseOffset);
                break;
            default:
                throw new Error("unsupported address size: " + addressSize);
        }       

        return(objectAddress);
    }


    public static void main(String... args)
    throws Exception
    {   
        Object mine = "IM".toCharArray();
        long address = addressOf(mine);
        System.out.println("Addess: " + address);
        
        String s1 = "IM";
//        String s2 = new String("IM"); //会产生不同的地址
        String s2 = new String("IM");
        
        
        System.out.println( "address is " + (s1==s2?"equal":"different") );
        System.out.println("s1 address:" + addressOf(s1));
        System.out.println("s2 address:" + addressOf(s2));

        stringAsParams(s1, s2); //调用函数后不会改变，虽然显示地址是同一个；可能和String是immutable有关。

        System.out.println("after func s1 address:" + addressOf(s1) + " s1=" + s1);
        System.out.println("after func s2 address:" + addressOf(s2) + " s2=" + s2);

        //Verify address works - should see the characters in the array in the output
        printBytes(address, 27);

    }

    private static void stringAsParams(String s1, String s2) throws Exception {
        System.out.println("in func s1 address:" + addressOf(s1));
        System.out.println("in func s2 address:" + addressOf(s2));
        s1 = s1.toLowerCase();
    	
	}


	public static void printBytes(long objectAddress, int num)
    {
        for (long i = 0; i < num; i++)
        {
            int cur = unsafe.getByte(objectAddress + i);
            System.out.print((char)cur);
        }
        System.out.println();
    }
}
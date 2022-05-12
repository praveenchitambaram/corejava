package com.chainsys.trychatch;

public class DemoTrace {

        public static void main(String[] args) {
                // TODO Auto-generated method stub
                m1();
                m2();
                m3();
                m4();

        }
        public static void m1()
        {
                try
                {
                        m2();
                        
                }catch(Exception err)
                {
                        System.out.println("getMessage "+err.getMessage());
                        err.printStackTrace();
                //        Throwable t1=err.getCause();
                //        if(null!=t1)
                //        {
                //                Class c1=t1.getClass();
                //                System.out.println("cause "+c1.getName());
                                
                //        }
                //        else
                //                System.out.println("cause is NULL");
                }
                finally
                {
                        System.out.println("Inside m1 Finally");
                }
        }
        public static void m2()
        {
                m3();
        }
        public static void m3()
        {
                m4();
        }
        public static void m4()
        {
                int x=0;
                int y=0;
                int z=0;
                x=100;
                z=x/y;
                System.out.println("Result " +z);
        }

}
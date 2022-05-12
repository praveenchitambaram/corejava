package com.chainsys.oops.abstractclass;

public class TestAbsDemoB {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        testDemoB();

    }
    


public static void testDemoB() {
    // abstract class can not be instantiated
//    AbsDemoB objectDemob=new AbsDemoB();
    AbsDemoB objectDemob=new DemoBChild();
    objectDemob.echo();
}
}
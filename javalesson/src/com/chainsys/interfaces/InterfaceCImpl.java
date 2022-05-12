package com.chainsys.interfaces;

public class InterfaceCImpl implements InterfaceC {
    @Override
    public void m1() {    
    }

    @Override
    public void m2() {
    }

    @Override
    public void print() {
    }

    @Override
    public void m3() {
    }

    @Override
    public void m4() {
    }

    @Override
    public void show() {
    }
}
 class TestInterfaceA {
    public static void main(String[] args) 
    {
        InterfaceA.echo();
        InterfaceA a1=new InterfaceCImpl();
        a1.print();
        a1.print("Hello");
    }
}
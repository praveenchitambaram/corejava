package com.chainsys.interfaces;
public interface InterfaceB {
    void m3();
    void m4();
    void print();
}
    interface InterfaceC extends InterfaceA, InterfaceB {
    void show();

}


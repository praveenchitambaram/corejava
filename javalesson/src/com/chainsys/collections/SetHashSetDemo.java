package com.chainsys.collections;

import java.util.HashSet;
import java.util.Iterator;

public class SetHashSetDemo {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
      demoB();	
	
	}
	public static void demoA()
    {
        HashSet<String>string_hs = new HashSet<String>();
        string_hs.add("Bee");
        string_hs.add("Apple");
        string_hs.add("Doll");
        string_hs.add(null);
        string_hs.add("Egg");
        string_hs.add("Cinema");
        string_hs.add("Fan");
        System.out.println("Size : "+string_hs.size());
        string_hs.add("Fan");        //Ignore
        string_hs.add(null);        //Ignore
        System.out.println("Size : "+string_hs.size());
        
        Iterator <String>set_itr=string_hs.iterator();
        while(set_itr.hasNext())
        {
            System.out.println(set_itr.next()+"-");
        }
    }
public static void demoB() {
	HashSet<Emp>hs=new HashSet<Emp>();
	Emp e1=null;
	for(int i=0;i<10;i++) {
		e1=new Emp(i);
		e1.Name="Emp"+i;
		hs.add(e1);
	}
	System.out.println("count"+hs.size());
	e1=new Emp(9);
	hs.add(e1);
	System.out.println("count"+hs.size());
	Iterator<Emp>itr=hs.iterator();
	while(itr.hasNext()) {
		Emp e2=itr.next();
		System.out.println(e2.getid()+" "+e2.Name);
	}
}
}

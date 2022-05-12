package com.chainsys.collections;

import java.io.Serializable;

public class Emp implements Serializable {

	private final int id;
	public String Name;

	public Emp(int vl, String sName) {
		id = vl;
		Name=sName;
	}

	public int getid() {
		return id;
	}
@Override
	public boolean equals(Object obj) {
		Class cl = obj.getClass();
		boolean flag = false;
		if (cl == this.getClass()) {
			Emp other = (Emp) obj;
			if (this.hashCode() == other.hashCode())
				flag = true;
		}
		return flag;
	}
@Override
public int hashCode() {
	return this.id;
}
}
package com.chainsys.unittest;

import com.chainsys.classandmethod.Hospital;

public class HospitalTester {
	public static void testhospital() {

		Hospital hospital1 = new Hospital();
		hospital1.setDocterName("praveen");
		System.out.println(hospital1.getDocterName());
		hospital1.setHospitalName("24 hours");
		System.out.println(hospital1.getHospitalName());
		hospital1.setHospitalNumber(262627889);
		System.out.println(hospital1.getHospitalNumber());
		hospital1.setPatientName("vimal");
		System.out.println(hospital1.getPatientName());
		hospital1.setWard(10);
		System.out.println(hospital1.getWard());
	}

}

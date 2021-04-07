package com.homework.sorting;

import java.util.Comparator;

public class Method implements Comparator<Phone>{

	@Override
	public int compare(Phone o1, Phone o2) {
		if(o1.getName().compareTo(o2.getName())>0) {
			return 1;
		}else if(o1.getName().compareTo(o2.getName())<0) {
			return -1;
		}
		return 0;
	}


	
}

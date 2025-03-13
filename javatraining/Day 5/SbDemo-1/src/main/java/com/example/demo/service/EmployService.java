package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Employ;


@Service
public class EmployService {
	static List<Employ> employlist;
		static {
			employlist = new ArrayList<Employ>();
			employlist.add(new Employ(1, "Mounika", 7531));
			employlist.add(new Employ(2,"Natu",9860));
			employlist.add(new Employ(3, "Mani", 2783));
			employlist.add(new Employ(4,"Venky",726));
		}
		public List<Employ> showEmploy(){
			return employlist;
		}
		
		public Employ searchEmploy(int empno) {
			Employ employFound =null;
			if(empno==1) {
				employFound= employlist.get(0);	
			}else if(empno==2) {
				employFound=employlist.get(1);
			}else if(empno==2) {
				employFound=employlist.get(2);
			}else if(empno==2) {
				employFound=employlist.get(4);
			}
			return employFound;
		}
	 
}

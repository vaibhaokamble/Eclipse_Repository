package org.techhub.repository;
import java.util.*;
import org.techhub.model.Address;
import org.techhub.model.Voter;

public class VoterRepository {
	ArrayList al = new ArrayList();
	public void wardWiseVoterCount() {
		ArrayList wardNoColl=new ArrayList();
		for(Object obj:al) {
			Voter v =(Voter)obj;
			Address ad=(Address)v.getClass();
			boolean b= wardNoColl.contains(ad.getWardNo());
			if(!b) {
				wardNoColl.add(ad.getWardNo());
			}
		}
		for(Object obj:wardNoColl) {
			 Integer wardNo=(Integer)obj;
			 System.out.println("Ward No "+wardNo+" ");
			 System.out.println("============================================");
			 for(Object obj1:al)
			 {
				 Voter v=(Voter)obj1;
				 Address a=v.getClass();
				 if(a.getWardNo()==wardNo) {
			 System.out.println(v.getName()+"\t"+v.getAge()+"\t"+v.getEmail()+"\t"+v.getContact());
				 }
			 }
			 System.out.println("================================================");
		}
		
	}
}

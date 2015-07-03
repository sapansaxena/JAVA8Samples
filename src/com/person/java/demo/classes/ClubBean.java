package com.person.java.demo.classes;

import java.util.Set;

import com.person.java.demo.interfaces.Club;
import com.person.java.demo.interfaces.Member;

public class ClubBean implements Club {
private Set<Member> members;
	@Override
	public Set<Member> getMembers() {
		return members;
	}
	@Override
	public void setMembers(Set<Member> members) {
		this.members = members;
	}

}

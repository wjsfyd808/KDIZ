package org.comstudy21.model;

public class Member {

	private int no;
	private String name;
	private String email;
	private String Phone;

	public Member(){
		this(0,"","","");
	}
	
	public Member(int i, String string, String string2, String string3) {
		
	}
	
	public static void main(String[] args) {

	}

	public int getNo() {
		return no;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String getPhone() {
		return Phone;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPhone(String phone) {
		Phone = phone;
	}

	@Override
	public String toString() {
		return "Member [no=" + no + ", name=" + name + ", email=" + email + ", Phone=" + Phone + "]";
	}
	

}

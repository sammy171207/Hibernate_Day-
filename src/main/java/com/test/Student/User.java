package com.test.Student;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="u_user")
public class User {
	@Id
	@Column(name = "SEQ", unique = true, nullable = false)
	private int studentid;
	private String sname, sresult;
	public int getStudentid() {
		return studentid;
	}
	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSresult() {
		return sresult;
	}
	public void setSresult(String sresult) {
		this.sresult = sresult;
	}
	@Override
	public String toString() {
		return "User [studentid=" + studentid + ", sname=" + sname + ", sresult=" + sresult + "]";
	}
	

}


package com.hospital.web.domain;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import lombok.Data;

@Component  @Lazy
public class Patient extends Info{
   private String job,jumin,addr,docID,nurID;
   private Doctor doctor;
   private Nurse nurse;
   
   
   public String getJob() {
	return job;
}	

public void setJob(String job) {
	this.job = job;
}

public String getJumin() {
	return jumin;
}

public void setJumin(String jumin) {
	this.jumin = jumin;
}

public String getAddr() {
	return addr;
}

public void setAddr(String addr) {
	this.addr = addr;
}

public String getDocID() {
	return docID;
}

public void setDocID(String docID) {
	this.docID = docID;
}

public String getNurID() {
	return nurID;
}

public void setNurID(String nurID) {
	this.nurID = nurID;
}

public Doctor getDoctor() {
	return doctor;
}

public void setDoctor(Doctor doctor) {
	this.doctor = doctor;
}

public Nurse getNurse() {
	return nurse;
}

public void setNurse(Nurse nurse) {
	this.nurse = nurse;
}

@Override
   public String getGroup() {
      return "Patient";
   }

}
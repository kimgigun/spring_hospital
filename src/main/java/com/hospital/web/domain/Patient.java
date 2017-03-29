package com.hospital.web.domain;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import lombok.Data;

@Component @Data @Lazy
public class Patient extends Info{
   private String job,jumin,addr,docID,nurID;
   private Doctor doctor;
   private Nurse nurse;
   
   @Override
   public String getGroup() {
      return "Patient";
   }
}
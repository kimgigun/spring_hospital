package com.hospital.web.domain;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
@Data @Component
public class Chart {
	private String
	id,
	patientId,
	nurseId,
	doctorId,
	pass,
	name,
	gen,
	jumin,
	major,
	phone,
	email,
	job,
	treatmentId,
	chartContents,
	doctorMajor,
	doctorName,
	doctorPosition,
	nurseName,
	nurPosition,
	treatContents,
	treatDate;
}
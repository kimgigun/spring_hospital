package com.hospital.web.domain;
import org.springframework.stereotype.Component;

import lombok.Data;
@Data @Component
public class Article {
	
	private String seq,
	 				writerId,
	 				name,
	 				title,
	 				content,
	 				regDate,
	 				readCount;

	public String getSeq() {
		return seq;
	}

	public void setSeq(String seq) {
		this.seq = seq;
	}
	
}
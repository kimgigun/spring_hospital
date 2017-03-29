package com.hospital.web.domain;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
@Component @Data
public class Article {
	@Getter @Setter
	private String art_seq,
						id,
						title,
						contents,
						regdate,
						read_Count;

}

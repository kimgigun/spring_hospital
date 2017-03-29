package com.hospital.web.domain;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import lombok.Data;
@Lazy @Component 
public class Person<T extends Info> {
	public T info;
	public Person(T info){ 
        this.info=info;
    }
	public T getInfo() {
		return info;
	}
	public void setInfo(T info) {
		this.info = info;
	}
}
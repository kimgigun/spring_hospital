package com.hospital.web.domain;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
@Component
interface Orderable{
	public Command process(Map<?,?> map);
}
@Component @Lazy
public class Command implements Orderable{ //여러가지 명령어를 처리 해서 커맨트패턴
	Map<?,?> map;
	
	public Command(Map<?,?>map) {
		map=new HashMap<>();
	}
	
	public Integer[] getPageInfo() {
		Paignation pg=new Paignation();
		String pageNo=(String)map.get("pageNo");
		String count=(String)map.get("count");
		System.out.println("핸들러내부 카운트:"+Integer.parseInt(count));
		pg.setBlockSize(5);
		pg.setRowCount(5); 
		pg.setCount(Integer.parseInt(count));
		pg.setPageNo(pageNo);
		pg.setPageStart();
		pg.setPageEnd();
		pg.setPageCount();
		pg.setBlockStart();
		pg.setPrevBlock();
		pg.setNextBlock();
		pg.setBlockEnd(); 
		return pg.getAttribute();
	}
	
	public Person<?extends Info> getPersonInfo(){
		Person<?>person=null;
		switch(map.get("type").toString()){
		case "patient": 
		person=new Person<Info>(new Patient());
		Patient patient=(Patient) person.getInfo();
		patient.setAddr(map.get("addr").toString());	
		patient.setJob(map.get("job").toString());
		patient.setJumin(map.get("Jumin").toString());
		patient.setDocID(map.get("DocID").toString());
		patient.setNurID(map.get("NurID").toString());
		
		break;
		case "nurse":
		person=new Person<Info>(new Patient());
			break;
		case "doctor": 
		person=new Person<Info>(new Patient());
		break;
		}
		return person;
	}


	@Override
	public Command process(Map<?, ?> map) {
		return new Command(map);
	}
	
	class Paignation{
		private int rowCount,pageNo,pageStart,pageEnd,pageCount,
		blockSize,blockStart,blockEnd,prevBlock,nextBlock,count;
		
		public void setRowCount(int rowCount) {
			this.rowCount = rowCount;
		}
		public void setPageNo(String pageNo) {
			this.pageNo = Integer.parseInt(pageNo);
		}
		public void setPageStart() {
			this.pageStart = (pageNo-1)*rowCount+1;
		}
		public void setPageEnd() {
			this.pageEnd = pageNo*rowCount;
		}
		public void setPageCount() {
			this.pageCount = (count%rowCount==0) ? count/rowCount : count/rowCount + 1;
		}
		public void setBlockSize(int blockSize) {
			this.blockSize = blockSize;
		}
		public void setBlockStart() {
			this.blockStart = pageNo-((pageNo-1)%blockSize);
		}
		public void setBlockEnd() {
			this.blockEnd = (blockStart+rowCount-1 < pageCount) ? blockStart+blockSize-1 : pageCount; //삼항연산
		}
		public void setPrevBlock() {
			this.prevBlock = blockStart - blockSize;
		}
		public void setNextBlock() {
			this.nextBlock = blockStart + blockSize;
		}
		public void setCount(int count) {
			this.count = count;
		}
		public Integer[] getAttribute(){
			
			Integer[] arr= { 
					count,pageCount,pageNo,pageStart,pageEnd,
					blockStart,blockEnd,prevBlock,nextBlock};
			return arr;
		}
}
}
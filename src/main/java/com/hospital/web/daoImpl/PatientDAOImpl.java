package com.hospital.web.daoImpl;


import org.springframework.stereotype.Repository;

import com.hospital.web.dao.PatientDAO;
import com.hospital.web.domain.PatientDTO;


@Repository
public class PatientDAOImpl implements PatientDAO {
	final String prop="pat_id, nur_id,doc_id,pat_pass, pat_name, pat_gen, pat_jumin, pat_addr,pat_phone, pat_email, pat_job";
	

		public static PatientDAOImpl getInstance() {			
			return new PatientDAOImpl();
	}
	
	@Override
	public int insert(PatientDTO member) throws Exception {
	/*	Statement stmt = DatabaseFactory.createDatabase(Vendor.ORACLE, Database.USERNAME, Database.PASSWORD).getConnection().createStatement();
		String sql = String.format("INSERT INTO	Member(id,name,ssn,password,profileImg,phone,email,rank)VALUES"
				+ "('%s,' '%s,' '%s,' '%s,' '%s,' '%s,' '%s,' '%s,')",member.getId(),member.getName(),member.getSsn(),member.getPassword(),member.getProfileImg(),member.getPhone(),member.getEmail(),member.getRank());
		int rowCount = stmt.executeUpdate(sql);
		if(rowCount!=0){
			System.out.println("성공");
		}else{
			System.out.println("실패");
		}*/
		return 0;
	}


	@Override
	public PatientDTO selectById(String id) throws Exception {
	
		
		return null;
	}

	/*@Override
	public boolean login(PatientDTO member) throws Exception {
		boolean check=false;
		String sql=String.format("SELECT id,name,ssn,password,profileImg,phone,email,rank \n"
				+ " FORM Member WHERE id= '%s' and password= '%s' ",member.getId(),member.getPassword());
		Statement stmt=DatabaseFactory.createDatabase(Vendor.ORACLE,Database.USERNAME,Database.PASSWORD).getConnection().createStatement();
		ResultSet rs=DatabaseFactory.createDatabase(Vendor.ORACLE,Database.USERNAME,Database.PASSWORD).getConnection().createStatement().executeQuery(sql);
		int count=rs.executeUpdate(sql);
		if(count!=0){
			check=true;
		}
		return check;
	}*/

	@Override
	public int update(PatientDTO member) throws Exception {
		
		return 0;

	}

	@Override
	public int delete(PatientDTO member) throws Exception {
	
		return  0;
	}


}
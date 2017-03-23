package com.hospital.web.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hospital.web.dao.PatientDAO;
import com.hospital.web.domain.PatientDTO;
import com.hospital.web.service.PatientService;

@Service

public class PatientServiceImpl implements PatientService{
	@Autowired PatientDAO dao;
	
	/*private PatientDAO dao;
	private PatientDTO session;
	private static PatientServiceImpl instance=new PatientServiceImpl();
	
	public static PatientServiceImpl getInstance(){
		return instance;
	}
	public PatientDTO getSession(){
		return session;
	}
		private PatientServiceImpl(){
		 dao=PatientDAOImpl.getInstance();
		 session=new PatientDTO();
	}*/
	
	@Override
	public int join(PatientDTO patient)  throws Exception{
		return dao.insert(patient);
	}

	@Override
	public PatientDTO findById(String id) throws Exception {
		return dao.selectById(id);
	}

	@Override
	public PatientDTO login(PatientDTO patient) throws Exception {
		return patient;
	/*	session = this.findById(patient.getPatID()); // member=this.findById(patient.getPatID())
		return session;*/
	}

	@Override
	public int change(PatientDTO patient) throws Exception {
		return dao.update(patient);
	}

	@Override
	public int remove(PatientDTO patient)  throws Exception{
		return dao.delete(patient);
	}

	@Override
	public boolean logout(PatientDTO patient) throws Exception {
		/*session=null;*/
		return true;
	}

	@Override
	public String getBirth(String patJumin) {
	/*			String birth="";
				System.out.println("쎼션이 살아있으면 null아니지!!-->"+session.getPatJumin());
		birth="19"+patJumin.substring(0,2)+"year"+patJumin.substring(2,4)+
				"month"+patJumin.substring(4,6)+"day";*/
		return getBirth(null);
	}

	@Override
	public PatientDTO getSession() {
		// TODO Auto-generated method stub
		return null;
	}

}
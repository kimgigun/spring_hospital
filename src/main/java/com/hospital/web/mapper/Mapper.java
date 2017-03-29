package com.hospital.web.mapper;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.hospital.web.domain.Doctor;
import com.hospital.web.domain.Nurse;
import com.hospital.web.domain.Patient;
@Repository
public interface Mapper {
	public int registPatient(Patient patient)throws Exception;
	public int registDoctor(Doctor doctor)throws Exception;
	public int registNurse(Nurse nuse)throws Exception;
	public Patient findPatient(Map<?,?> Hashmap)throws Exception;
	public Doctor findDoctor(Map<?,?> Hashmap)throws Exception;
	public Nurse findNurse(Map<?,?> Hashmap)throws Exception;
	public List<Patient> findPatients(Map<?,?> Hashmap)throws Exception;
	public List<Doctor> findDoctors(Map<?,?> Hashmap)throws Exception;
	public List<Nurse> findNurses(Map<?,?> Hashmap)throws Exception;
	public int updatePatient(Patient patient)throws Exception;
	public int updateDoctor(Patient patient)throws Exception;
	public int updateNurse(Patient patient)throws Exception;
	public int delete(Patient member)throws Exception;
	public int count(Map<?,?> Hashmap)throws Exception;
	public int exist(Map<?,?> Hashmap)throws Exception;
}


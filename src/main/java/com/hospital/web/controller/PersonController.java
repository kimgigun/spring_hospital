package com.hospital.web.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.hospital.web.domain.Admin;
import com.hospital.web.domain.Command;
import com.hospital.web.domain.Doctor;
import com.hospital.web.domain.Enums;
import com.hospital.web.domain.Info;
import com.hospital.web.domain.Nurse;
import com.hospital.web.domain.Patient;
import com.hospital.web.domain.Person;
import com.hospital.web.mapper.Mapper;
import com.hospital.web.service.PersonService;

@RestController
public class PersonController {
	private static final Logger logger = LoggerFactory.getLogger(PersonController.class);
	@Autowired Mapper mapper;
	@Autowired Patient patient;
	@Autowired Doctor doctor;
	@Autowired Admin admin;
	@Autowired PersonService personService;

	@RequestMapping(value = "/post/patient", method = RequestMethod.POST,consumes="application/json")
	public @ResponseBody Map<?,?> register(
			@RequestBody Patient p)
		/*@RequestParam(value = "pageNo", defaultValue = "1") int pageNo, */
		/*Command command*/
	throws Exception {
		Map<String,String>map =new HashMap<>();
		map.put("name", p.getName());
	
		return map;
	}
	/*	switch(group){
		case "patient" :map=postPatient(target);
			
		break;
		case "doctor" :map=postPatient(target);break;
		case "nurse" :map=postPatient(target);break;
		case "admin" :map=postPatient(target);break;
		default: break;
		}
		return map;
	*/
	@RequestMapping(value="/get/{group}/{target}")
	public @ResponseBody Object get(
			@PathVariable("group") String group,
			@PathVariable("target")String target){
		logger.info("PersonController=detail() {} ||","enter");
		Object o = null;
		switch(group){
		case "patient":
/*			o=getPatients();
*/			
			logger.info("group.equals({})",group);
			patient.setId("hong");
			patient.setName("홍길동");
			patient.setPass("1234");
			o = patient;
			break;
		case "doctor":
			logger.info("group.equals({})",group);
			o=getDoctors();
			break;
		case "nurse":
			logger.info("group.equals({})",group);
			o=getNurses();
			break;
		case "admin":
			logger.info("group.equals({})",group);
			o=getAdmins();
			break;
			default:
			break;
		}
		return o;
	}
	@RequestMapping(value="/login",method=RequestMethod.POST,consumes="application/json")
	public @ResponseBody Map<?,?> login(@RequestBody Map<String,String>paramMap) throws Exception{
		
		Map<String,Object>map=new HashMap<>();
		logger.info("PersonController-login(){}||","enter");
		String id=paramMap.get("id");
		String pass=paramMap.get("pass");
		logger.info("넘오온 아이디: {}",id);
		logger.info("넘오온 비번: {}",pass);
		
		//  <select id="exist" resultType="int" parameterType="hashMap">
	    //  SELECT COUNT(*) FROM ${group} WHERE ${idType}=#{id}
		String []gArr={"patient/pat_id/"+id,"doctor/doc_id/"+id,"nurse/nur_id/"+id,"admin/admin_id/"+id};
		int rs=0;
		String target="";
		for(int i=0;i<gArr.length;i++){
			paramMap.put("group",gArr[i].split("/")[0]);
			paramMap.put("idType",gArr[i].split("/")[1]);
			paramMap.put("id",gArr[i].split("/")[2]);
			rs=personService.exist(paramMap);
			if(rs!=0){
				target=gArr[i];
				break;
			}
		}
		if(target.equals("")){
			map.put("result","fail");
		}else{
			map.put("result", "success");
			String[] arr=target.split("/");
		switch(arr[0]) {
		case "patient":
			paramMap.put("group", arr[0]);
			paramMap.put("key", arr[1]);
			paramMap.put("value", arr[2]);
			Patient patient =personService.getPatient(paramMap);
			map.put("patient", patient);
			break;
		default:
			break;
		}
	/*	int rs=0;
		String group="patient";
		switch(group){
		case "patient":
			paramMap.put("group","Patient");
			paramMap.put("idType","Pat_id");
			rs=personService.exist(paramMap);
			if(rs!=0){
				map.put("group", group);
				map.put("id", id);
				map.put("value", id);
				map.put("pass", pass);
				map.put("key", Enums.PATIENT.val());
				map.put("idType", Enums.PATIENT.val());
				map.put("name",(mapper.findPatient(map).getName()));
			}
			break;
		}
		return map;
		*/
		
		map.put("id", id);
		map.put("pass", pass);
	}
		return map;
	}
	

	@RequestMapping(value="/put/{group}",method=RequestMethod.POST,consumes="application/json")
	public @ResponseBody Map<?,?> put(
			@PathVariable String group,
			@SuppressWarnings("rawtypes")@RequestBody Person target){
		Map<?,?>map=new HashMap<>();
		switch(group){
		case "patient":map=putPatient(target);break;
		case "doctor":map=putDoctor(target);break;
		case "nurse":map=putNurse(target);break;
		case "admin":map=putAdmin(target);break;
		}
		return map;
		}


		@RequestMapping(value="/delete/{group}/{target}",method=RequestMethod.POST)
		public @ResponseBody Map<?,?> delete(
				@PathVariable("group")String group,
				@PathVariable("target")String target,
			    @RequestBody Map<?,?> param){
					Map<?,?>map=new HashMap<>();
					switch(group){
					case "patient": deletePatient(target);break;
					case "doctor": deleteDoctor(target);break;
					case "nurse": deleteNurse(target);break;
					case "admin": deleteArticle(target);break;
					}
					return map;
				}

//delete
	private Map<?,?> deletePatient(Object o){
		Map<?,?>map=new HashMap<>();
		return map;
	}
	private Map<?,?> deleteDoctor(Object o){
		Map<?,?>map=new HashMap<>();
		return map;
	}
	private Map<?,?> deleteNurse(Object o){
		Map<?,?>map=new HashMap<>();
		return map;
	}
	private Map<?,?> deleteArticle(Object o){
		Map<?,?>map=new HashMap<>();
		return map;
	}
	


//update
	private Map<?,?> putPatient(Object o){
		Map<?,?>map=new HashMap<>();
		return map;
		}
	private Map<?,?> putDoctor(Object o){
		Map<?,?>map=new HashMap<>();
		return map;
		}
	private Map<?,?> putNurse(Object o){
		Map<?,?>map=new HashMap<>();
		return map;
		}
	private Map<?,?> putAdmin(Object o){
		Map<?,?>map=new HashMap<>();
		return map;
		}
	
//regist
	private Map<?,?> postPatient(Object o){
		Map<?,?>map=new HashMap<>();
		Person<?> person=new Person<Info>(new Patient());
		Patient patient=(Patient) person.getInfo();
		patient.getId();
		patient.getPass();
		patient.getGen();
		patient.getEmail();
		patient.getJob();
		patient.getJumin();
		patient.getPhone();
		patient.getDocID();
		patient.getNurID();
		patient.getAddr();
		patient.getName();
		logger.info("PersonController() {}", patient + "register진입");
		return map;
		
	}
	
	@SuppressWarnings("unused")
	private Map<?,?> postDoctor(Object o){
		Map<?,?>map=new HashMap<>();
		Person<?> person=new Person<Info>(new Patient());
		Doctor doctor=(Doctor) person.getInfo();
		logger.info("PersonController() {}", patient + "register진입");
		return map;
	}
	
	@SuppressWarnings("unused")
	private Map<?,?> postNurse(Object o){
		Map<?,?>map=new HashMap<>();
		Person<?> person=new Person<Info>(new Patient());
		logger.info("PersonController() {}", patient + "register진입");
		return map;
		
	}
	@SuppressWarnings("unused")
	private Map<?,?> postAdmin(Object o){
		Map<?,?>map=new HashMap<>();
		Person<?> person=new Person<Info>(new Patient());
		logger.info("PersonController() {}", patient + "register진입");
		return map;
		
	}
//find	
	private List<?> getDoctors(){
		List<?> list=new ArrayList<>();
		return list;
	}
	private List<?> getPatients(){
		List<?> list=new ArrayList<>();
		return list;
	}
	private List<?> getNurses(){
		List<?> list=new ArrayList<>();
		return list;
	}
	
	private List<?> getAdmins(){
		List<?> list=new ArrayList<>();
		return list;
	}
	private Doctor getDoctor(){
		Doctor doctor=new Doctor();
		return doctor;
	}
	private Patient getPatient(){
		Patient patient=new Patient();
		return patient;
	}
	private Nurse getNurse(){
		Nurse nurse =new Nurse();
		return nurse;
	}
	
	private Admin getAdmin(){
		Admin admin = new Admin();
		return admin;
	}
	
	
}
	
	
	
	
	/*@RequestMapping("/detail/{docID}")
	public String Detail(@PathVariable String docID) {
		logger.info("PersonController() {}", "진입");
		if (docID.equals("")) {
			return "redirect:/{permission}/login";
		}
		return "public:common/loginForm";

	}

}
*/



/*
 * case "doctor": result=mapper.registDoctor(doctor);break; case
 * "nurse": result=mapper.registNurse(nurse);break; case "admin":
 * 
 * break;
 */

	/*
	 * @RequestMapping(value="update/{type}",method=RequestMethod.POST) public
	 * String update(
	 * 
	 * @PathVariable String type,
	 * 
	 * @RequestBody Map<String,Object>map, Command command) throws Exception{
	 * logger.info("PersonController() {}","update진입");
	 * if(type.equals("")){type="patient";} int result=0; switch(type){ case
	 * "patient": result=mapper.updatePatient(person); break; case "doctor":
	 * result=mapper.updateDoctor(person); break; case "nurse":
	 * result=mapper.updateNurse(person); break; case "admin": break; } return
	 * null; }
	 * 
	 * @RequestMapping(value="delete/{type}",method=RequestMethod.POST) public
	 * String delete(
	 * 
	 * @PathVariable String type){
	 * logger.info("PersonContoller() {}","delete 진입");
	 * if(type.equals("")){type="patient";} switch(type){ case "patient":
	 * result=mapper.delete(person); break; } return ""; }
	 */

	
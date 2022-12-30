package com.orell.lms.alumni.service;

import com.orell.lms.alumni.dto.AlumniDTO;
import com.orell.lms.alumni.entity.Alumni;
import com.orell.lms.alumni.repository.AlumniRepository;


import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class AlumniService {

    @Autowired
    private AlumniRepository alumniRepository;

    public long saveAlumni(Alumni alumni) {

		Alumni entity = alumniRepository.findByAlumniId(alumni.getAlumniId());

		if(alumni.getAlumniId()==0) {
			entity = new Alumni();

			entity.setAlumniId(alumni.getAlumniId());
			entity.setAlumniName(alumni.getAlumniName());
			entity.setVision(alumni.getVision());
			entity.setLogo(alumni.getLogo());
			//entity.setIsDeleted(alumni.getIsDeleted());
		 
		
	
		}
		else {
			entity = new Alumni();

			entity.setAlumniId(alumni.getAlumniId());
			entity.setAlumniName(alumni.getAlumniName());
			entity.setVision(alumni.getVision());
			entity.setLogo(alumni.getLogo());
		}
		Alumni yr = alumniRepository.save(entity);
		return yr.getAlumniId();
	}

	

    public Collection<AlumniDTO> retrieveAlumniList() {
		// TODO Auto-generated method stub
		List<Alumni> yr = alumniRepository.findAll();
		ArrayList<AlumniDTO> dtos = new ArrayList<AlumniDTO>();
		for (Alumni eachdto : yr) {
			AlumniDTO dto = new AlumniDTO();
			dto.setAlumniId(eachdto.getAlumniId());
			dto.setAlumniName(eachdto.getAlumniName());
			dto.setVision(eachdto.getVision());
			
			dto.setLogo(eachdto.getLogo());
			//dto.setIsDeleted(eachdto.getIsDeleted());
			dtos.add(dto);
		}
		return dtos;
	}

    public Alumni findAlumniById(Long alumniId) {
       // log.info("Inside saveAlumni of AlumniService");
         return alumniRepository.findByAlumniId(alumniId);
     }
    public void deleteAlumniById(Long alumniId ) {
		alumniRepository.deleteById(alumniId);
	}
	//public String deletealumni(Long alumniId) {
		
		//log.info("deleteColour" + alumniId);
		
		//Alumni list1  = alumniRepository.deleteAlumnilist(alumniId);

		///if (alumni.getIsDeleted().equals("N")) {
		//	alumni.setIsDeleted("Y");
		///} else {
		//	alumni.setIsDeleted("N");
		//}
	

		//Alumni entity1 = alumniRepository.save(alumni);
	//	log.info("entity1.getIsDeleted()" + entity1.getIsDeleted());
	//	return alumniRepository.findByAlumniName(alumniName);

	}
	
	//}
	
	
//}

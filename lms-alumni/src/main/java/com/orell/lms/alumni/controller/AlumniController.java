package com.orell.lms.alumni.controller;

import com.orell.lms.alumni.entity.Alumni;
import com.orell.lms.alumni.service.AlumniService;
import com.orell.lms.alumni.dto.AlumniDTO;

import lombok.extern.slf4j.*;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/alumni")
@Slf4j
public class AlumniController {

    @Autowired
    private AlumniService alumniService;
   

   

    @PostMapping("/save")
    public long saveAlumni(@RequestBody Alumni alumni) {
        log.info("Inside saveAlumni method of AlumniController");
        return  alumniService.saveAlumni(alumni);
    }

   

    @GetMapping("/{id}")
    public Alumni findAlumniById(@PathVariable("id") Long alumniId) {
        log.info("Inside findAlumniById method of AlumniController");
        return alumniService.findAlumniById(alumniId);
    }
    @GetMapping("/list")
    public Collection<AlumniDTO> retrieveUnitSettingsList() {
        return alumniService.retrieveAlumniList();
    }
    @GetMapping("/delete/{id}")
   	public String deletealumni(@PathVariable("id") Long alumniId) {
   		 alumniService.deleteAlumniById(alumniId);
   		 return "data deleted successfully";
   	}
    
    
}
      
//}

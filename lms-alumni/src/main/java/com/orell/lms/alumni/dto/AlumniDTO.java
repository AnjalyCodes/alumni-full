package com.orell.lms.alumni.dto;

import java.io.Serializable;




import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AlumniDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Long alumniId;
    
    private String alumniName;
    
    private String vision;
    
    private String logo;
   // private String isDeleted;
	
}
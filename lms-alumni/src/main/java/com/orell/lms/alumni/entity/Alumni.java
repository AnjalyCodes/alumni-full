package com.orell.lms.alumni.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "alumnicreate4")
public class Alumni {

	@Id
	@GeneratedValue(generator = "alumniid_seq", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator( name = "alumniid_seq",sequenceName = "alumniid_seq", allocationSize = 1 )
	@Column(name = "alumniid")
    private Long alumniId;
	@Column(name="alumniName")
private String alumniName;
	@Column(name="vision")
    private String vision;
@Column(name="logo")
    private String logo;

//	@Column(length=10, name="isdeleted")
  // private String isDeleted;
}

package com.orell.lms.alumni.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.orell.lms.alumni.entity.Alumni;








@Repository
public interface AlumniRepository extends JpaRepository<Alumni, Long> {
	Alumni findByAlumniId(Long alumniId);
	//Alumni findByAlumniName(String alumniName);
	   
	
	@Query(value = "SELECT a FROM Alumni a WHERE lower(a.alumniName) = :alumniName "
			+ "AND a.alumniId != :alumniId "
		)
	List<Alumni> checkAlumni(@Param("alumniName") String alumniName,@Param("alumniId") Long alumniId);

	@Query(value = "SELECT a FROM Alumni a  WHERE  a.alumniId = :alumniId ")
	List<Alumni> findByAlumnilist(@Param("alumniId") Long alumniId);
	
//List<Alumni> deleteAlumni(@Param("alumniName") String alumniName,@Param("alumniId") Long alumniId);
	//@Query(value = "DELETE a FROM Alumni a  WHERE  a.alumniId = :alumniId ")
	//List<Alumni> deleteAlumnilist(@Param("alumniId") Long alumniId);
	
	
	
}

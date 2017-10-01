package com.universityscreaning.Dao;

import java.util.List;

import com.universityscreaning.model.University;

public interface UniversityDao {
	
	
	public University getUniversity(int id);
	public void createUniversity(University university);
	public void updateUniversity(University university);
	public void deleteUniversity(University university);
    public List<University> getAll();
    public List<University> findUni(String name,String division,String curriculam,int max,int min);
    
    

}

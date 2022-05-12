package com.statusBook.Attendence.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.statusBook.Attendence.Entity.Attendence;

@Repository
public interface AttendenceRepo extends JpaRepository<Attendence,Integer>{

}

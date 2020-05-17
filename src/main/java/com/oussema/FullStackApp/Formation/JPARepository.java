package com.oussema.FullStackApp.Formation;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JPARepository extends JpaRepository<Formation, Integer>{
	
	List<Formation> findByUsername(String username);

}

package com.oussema.FullStackApp.Formation;

import java.util.*;

import org.springframework.stereotype.Service;

@Service
public class ServiceFormation {
	
	private static List<Formation> certifs = new ArrayList<Formation>();
	
	private static int id = 0;
	
	static {
		certifs.add(new Formation(++id,"oussema","Angular&SpringBoot",new Date(),false));
		certifs.add(new Formation(++id,"oussema","Kubernate",new Date(),false));
		certifs.add(new Formation(++id,"oussema","Devops",new Date(),false));
		certifs.add(new Formation(++id,"oussema","Docker",new Date(),false));
	}
	
	public List<Formation> findAll() {
		return certifs;
	}
	
	public void deleteById(int id) {
		
		Formation formation = findById(id);
		
		certifs.remove(formation);
		
	}

	public Formation findById(int id) {
		for(Formation formation : certifs)
			if(formation.getId() == id)
				return formation;
		return null;
	}
	
	public Formation save( Formation formation) {
		if(formation.getId() == -1 || formation.getId() == 0 ) {
			formation.setId(++id);
			certifs.add(formation);
		}
		else {
			deleteById(formation.getId());
			certifs.add(formation);
		}
		return formation;
	}

}

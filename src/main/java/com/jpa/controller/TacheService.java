package com.jpa.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpa.model.Tache;
import com.jpa.repositories.TacheRepository;
@Service
public class TacheService implements TacheDao {

	@Autowired
	TacheRepository tacheRepository;
	
	@Override
	public Tache createTache(Tache tache) {
		// TODO Auto-generated method stub
		return tacheRepository.save(tache);
	}

	@Override
	public List<Tache> getTaches() {
		// TODO Auto-generated method stub
		return tacheRepository.findAll();
	}

	@Override
	public Optional<Tache> findOneTache(long id) {
		// TODO Auto-generated method stub
		return tacheRepository.findById(id);
	}

	@Override
	public List<Tache> findTachesByContent(String tache) {
		// TODO Auto-generated method stub
		return tacheRepository.findByTacheContaining(tache);
	}

	@Override
	public void deleteTache(long id) {
		// TODO Auto-generated method stub
		tacheRepository.deleteById(id);
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		tacheRepository.deleteAll();
	}

}

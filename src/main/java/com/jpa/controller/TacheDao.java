package com.jpa.controller;

import java.util.List;
import java.util.Optional;

import com.jpa.model.Tache;

public interface TacheDao {
public Tache createTache(Tache tache);
public List<Tache> getTaches();
public Optional<Tache> findOneTache(long id);
public List<Tache> findTachesByContent(String tache);
public void deleteTache(long id);
public void deleteAll();
	
	
	
}

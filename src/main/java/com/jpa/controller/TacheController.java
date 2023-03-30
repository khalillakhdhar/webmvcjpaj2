package com.jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.model.Tache;

import jakarta.validation.Valid;

@RestController
@RequestMapping("taches")
public class TacheController {

	@Autowired
	TacheService tacheService;
	@GetMapping
	public List<Tache> findTaches()
	{
		return tacheService.getTaches();
	}
	@PostMapping
	public Tache createOne(@RequestBody @Valid Tache tache)
	{
		return tacheService.createTache(tache);
	}
	@DeleteMapping("/{id}")
	public void deleteOne(@PathVariable long id)
	{
		tacheService.deleteTache(id);
	}
	
}

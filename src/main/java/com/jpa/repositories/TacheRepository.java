package com.jpa.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpa.model.Tache;

public interface TacheRepository extends JpaRepository<Tache, Long> {
List<Tache> findByTacheContaining(String tache);
}

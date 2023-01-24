package com.spt.spring.data.tema.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.spt.spring.data.tema.model.Tutorial;

public interface TutorialRepository extends MongoRepository<Tutorial, String> {
  List<Tutorial> findByPublished(boolean published);
  List<Tutorial> findByTitleContaining(String title);
}
